.model small
.stack 100h
.data
   welcome_msg db "Welcome to the Memory Game!$"
   instruction_msg db "You will see 4 numbers for a second. Remember them!$"
   ready_msg db "Press Enter when ready...$"
   input_msg db "Enter the 4 numbers you saw: $"
   correct_msg db "Correct! Good job! Let's try another one!$"
   incorrect_msg db "Sorry that's incorrect. The numbers was: $"
   numbers_msg db "The numbers are: $"
   numbers db 4 dup(?)
   user_input db 4 dup(?)
   seed dw ?
   
.code
main proc
   mov ax, @data
   mov ds, ax

   ; show welcome message to welcome the users
   mov dx, offset welcome_msg
   mov ah, 9
   int 21h

   call print_newline

   ; show instruction message to the user
   mov dx, offset instruction_msg
   mov ah, 9
   int 21h

   call print_newline

   ; give prompt for user to enter a key to start the game
   mov dx, offset ready_msg
   mov ah, 9
   int 21h
   mov ah, 1
   int 21h

   ; initialize the seed with system time
   mov ah, 2ch
   int 21h
   mov seed, dx

   game_loop:
      call generate_numbers
      call display_numbers
      call delay
      call clear_screen
      call get_user_input
      call compare_numbers

      ; check the result of comparison
      cmp al, 1
      jne wrong_answer ; if not correct, jump to wrong answer

      ; display correct message
      mov dx, offset correct_msg
      mov ah, 9
      int 21h
      call print_newline
      call delay
      jmp game_loop

      wrong_answer:
         mov dx, offset incorrect_msg
         mov ah, 9
         int 21h
         
         call display_numbers
      
   mov ah, 4ch
   int 21h
main endp

; procedure to generate numbers
generate_numbers proc
   mov cx, 4
   mov si, offset numbers
   generate_loop:
      call random_number ; get random number
      add al, '0' ; convert to ASCII (e.g., 1 becomes '1')
      ; '0' is ASCII 48, so 1 + 48 = 49 ('1')
      mov [si], al
      inc si
      loop generate_loop
   ret
generate_numbers endp

; procedure to generate single random number
random_number proc
   push dx ; save dx on stack

   mov ax, seed ; get current seed value
   mov dx, 8405h ; load multiplier
   mul dx ; multiply ax by dx
   ; result is 32 bits, dx gets the high 16 bits and ax gets the low 16 bits

   add dx, 12345 ; add constant to make the sequence less predictable
   mov seed, ax ; save new seed for next random number

   mov dx, 0
   mov bx, 9 ; divisor = 9
   div bx ; ax / bx
   mov al, dl ; move remainder to al (0-8)
   inc al ; make it (1-9)

   pop dx ; restore original dx
   ret
random_number endp

; procedure to display the numbers
display_numbers proc
   mov dx, offset numbers_msg
   mov ah, 9
   int 21h

   mov cx, 4
   mov si, offset numbers
   display_loop:
      mov dl, [si]
      mov ah, 2
      int 21h
      inc si
      loop display_loop
      call print_newline
   ret
display_numbers endp

; procedure to add delay
delay proc
   push ax         ; Save registers
   push bx
   push cx
   push dx
    
   mov cx, 7       ; Outer loop count - adjust for longer/shorter delay
   outer_delay:
      push cx
      mov cx, 0FFFFh   ; Inner loop maximum value
      inner_delay:
         nop          ; Waste some cycles (no operation)
         nop
         nop
         nop
         loop inner_delay
      pop cx
      loop outer_delay
   
   pop dx
   pop cx
   pop bx
   pop ax
   ret
delay endp

; procedure to clear the screen
clear_screen proc
   push ax
   push bx
   push cx
   push dx
    
   mov ah, 06h     ; scroll up function
   mov al, 0       ; clear entire screen
   mov bh, 07h     ; normal attribute - white on black
   mov ch, 0       ; upper left row
   mov cl, 0       ; upper left column
   mov dh, 24      ; lower right row
   mov dl, 79      ; lower right column
   int 10h
    
   ; reset cursor to top-left corner
   mov ah, 02h     ; set cursor position
   mov bh, 0       ; page 0
   mov dh, 0       ; row 0
   mov dl, 0       ; col 0
   int 10h
    
   pop dx
   pop cx
   pop bx
   pop ax
   ret
clear_screen endp

; procedure to get user input
get_user_input proc
   ; show input message
   mov dx, offset input_msg
   mov ah, 9
   int 21h

   mov cx, 4
   mov si, offset user_input
   input_loop:
      mov ah, 1
      int 21h
      mov [si], al
      inc si
      loop input_loop
   
   call print_newline
   ret
get_user_input endp

; procedure to compare numbers
compare_numbers proc
   mov cx, 4
   mov si, offset numbers ; randomly generated numbers
   mov di, offset user_input ; user guess
   compare_loop:
      mov al, [si]
      cmp al, [di]
      jne incorrect

      inc si
      inc di
      loop compare_loop

      mov al, 1 ; set return value to 1 (correct)
      ret
   incorrect:
      mov al, 0 ; set return value to 0 (incorrect)
      ret
compare_numbers endp

; procedure to print a new line
print_newline proc
   mov dl, 13
   mov ah, 2
   int 21h

   mov dl, 10
   mov ah, 2
   int 21h

   ret
print_newline endp

end main