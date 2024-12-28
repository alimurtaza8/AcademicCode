dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov dl, 55
    mov ah, 2
    INT 21h

    mov dl, 10
    mov ah, 2
    INT 21h

    mov dl, 13
    mov ah,2
    int 21h

    mov dl, 65
    mov ah, 2
    INT 21h

    mov ah,4Ch
    INT 21h

Main endp
End Main


dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov dl, 'A'
    mov ah, 2
    INT 21h

    mov dl, 'l'
    mov ah, 2
    INT 21h

    mov dl, 'i'
    mov ah, 2
    INT 21h

    mov ah,4Ch
    INT 21h

Main endp
End Main


Character From input Program

dosseg
.model small
.stack 100h
.data
.code

Main proc

   mov ah,1
   Int 21h
   
   mov dl,al
   mov ah,2
   Int 21h

    mov ah,4Ch
    INT 21h

Main endp
End Main



dosseg
.model small
.stack 100h
.data
.code

main proc

    mov dl,50
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

    
main endp
end main


dosseg
.model small
.stack 100h
.data
.code

main proc

    mov bl,2
    mov cl,5
    
    sub cl,bl
    mov dl,cl
    add dl,48

    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

    
main endp
end main


Taking Input

dosseg
.model small
.stack 100h
.data
.code

main proc

    mov ah,1
    int 21h

    mov dl,al
    mov ah,2
    int 21h

    
    mov ah,4ch
    int 21h


main endp
end main


 Taking Input and add numbers and Substraction

dosseg
.model small
.stack 100h
.data
.code

main proc
    mov ah,1
    int 21h
    sub al,'0'
    mov bl,al

    mov ah,1
    int 21h

    sub al,'0'
    mov cl,al
    
    add bl,cl
    add bl,'0'

    mov dl,bl

    mov ah,2
    int 21h

    mov ah, 4ch
    int 21h

main endp
end main


dosseg
.model small
.stack 100h
.data
.code

main proc
    mov ah,1
    int 21h

    mov bl,al

    mov ah,1
    int 21h

    mov cl,al

    add bl,cl
    
    mov dl, bl
    sub dl, 48
    mov ah,2
    int 21h

    mov ah, 4ch
    int 21h

main endp
end main



Taking Input and sub Two Numbers

dosseg
.model small
.stack 100h
.data
.code

main proc
    mov ah,1
    int 21h
    mov bl, al
    sub bl, '0'

    mov ah,1
    int 21h
    mov cl, al
    sub cl, '0'

    sub bl,cl
    add bl,'0'

    mov dl,bl

    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

main endp
end main



; Add Two numbers with new line

dosseg
.model small
.stack 100h
.data
.code

main proc
    mov ah,1
    int 21h
    sub al,'0'
    mov bl,al

    mov dl, 10
    mov ah,2
    int 21h

    mov dl,13
    mov ah,2
    int 21h

    mov ah,1
    int 21h
    sub al,'0'
    mov cl,al

    mov dl,10
    mov ah,2
    int 21h

    mov dl,13
    mov ah,2
    int 21h
    
    add bl,cl
    add bl,'0'

    mov dl,bl
    mov ah,2
    int 21h



    mov ah, 4ch
    int 21h

main endp
end main



Sub Two numbers with new line

dosseg
.model small
.stack 100h
.data
.code

main proc
    mov ah,1
    int 21h
    mov bl,al
    sub bl, '0'

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    mov ah,1
    int 21h
    mov cl,al
    sub cl, '0'

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    sub bl,cl
    add bl,'0'

    mov dl,bl
    mov ah,2
    int 21h

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h


main endp
end main


Program to convert A to a

dosseg
.model small
.stack 100h
.data
.code

main proc

    mov ah,1
    int 21h
    mov bl,al

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    add bl,32
    mov dl,bl
    mov ah,2
    int 21h

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

main endp
end main



Using data variables  

dosseg
.model small
.stack 100h
.data
    var1 db '1'
    var2 db ?
    var3 db '12345$'
.code
main proc
         mov ax, @data
         mov ds, ax

         mov dl, var1
         mov ah,2
         int 21h

         mov dl, 0Dh
         mov ah,2
         int 21h

         mov dl, 0Ah
         mov ah,2
         int 21h

         mov var2,2
         mov dl,var2
         add dl,48
         mov ah,2
         int 21h

         mov dl, 0Dh
         mov ah,2
         int 21h

         mov dl, 0Ah
         mov ah,2
         int 21h

         lea dx , var3  ;mov dx, offSet var3
         mov ah,9
         int 21h

         mov dl, 0Dh
         mov ah,2
         int 21h

         mov dl, 0Ah
         mov ah,2
         int 21h

         mov ah,4ch
         int 21h

main endp
end main



Practice with first loop


dosseg
.model small
.stack 100h
.data
.code
main proc

    mov cx,10
    mov dx, 48

    l1:
        mov ah,2
        int 21h

        inc dx
    loop l1

    mov ah,4ch
    int 21h

main endp
end main



code to print Letters A to Z

dosseg
.model small
.stack 100h
.data
.code

main proc

    mov cx,26
    mov dx, 65

    l1:
        mov ah,2
        int 21h

        add dx, 1
    loop l1

    mov ah,4ch
    int 21h

main endp
end main



Program using AND 

dosseg
.model small
.stack 100h
.data
.code

main proc
 
    mov bl, 110B ; 110
                   ;111
                ;AND 110
    AND bl ,111B

    add bl, '0'
    mov dl, bl
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h





main endp
end main





Program using OR

dosseg
.model small
.stack 100h
.data
.code

main proc

    mov bl, 110B ;110
                ; 111
            ; OR  001
    OR bl ,111B

    add bl, '0'
    mov dl, bl
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h


main endp
end main





Using Jump
Conditional jump and unconditional jump


Program Using unconditional jump (also a Infinite)

dosseg
.model small
.stack 100h
.data
.code

main proc

    l1:
        mov dl, 'a'
        mov ah,2
        int 21h

    jmp l1

    
main endp
end main


Program Using conditional jump

dosseg
.model small
.stack 100h
.data
.code

main proc

    l1:
        mov ah,1
        int 21h

        mov dl, '5'
 
        cmp al,dl
    JE l1

    mov ah,4ch
    int 21h

    
main endp
end main




Take input from user and check the number is equall or not

dosseg
.model small
.stack 100h
.data
    var1 db 'equal$'
    var2 db 'not equal$'
.code

main proc
    mov ax,@data
    mov ds, ax

    mov dl, '5'
    mov ah,1
    int 21h

    cmp al, dl

    JE l1
        lea dx , var2
        mov ah,9
        int 21h

        mov ah,4ch
        int 21h
l1:
    lea dx, var1
    mov ah,9
    int 21h

    mov ah,4ch
    int 21h

main endp
end main


Again Code For Understanding Program to check wheather a Number is equall or not 

dosseg
.model small
.stack 100h
.data
    var1 db 'equal$'
    var2 db 'not equal$'
.code

Main proc
    mov ax, @data
    mov ds, ax

    mov al,1
    int 21h

    mov dl, '5'

    cmp al,dl

    JE l1
    mov  dx, offSet var2
       mov ah,9
       Int 21h

       mov ah,4ch
       int 21h



    l1:
        mov dx, offSet var1
        mov ah,9
        Int 21h

            mov ah,4Ch
            int 21h


Main endp
end Main


; Program to print an array of num

dosseg
.model small
.stack 100h
.data
    arr1 db '1','2','3','4'
.code

main proc
    mov ax,@data
    mov ds,ax

    mov si,offSet arr1

    mov cx, 4

    l1:
        mov dx, [si]
        mov ah,2
        int 21h

        inc si


    loop l1

    mov ah,4ch
    int 21h

    
main endp
end main



Program to take input string and print it


Program to print an array of num

dosseg
.model small
.stack 100h
.data
    arr1 db 10 dup('$')
.code

main proc

    mov ax, @data
    mov ds , ax

    mov si, offSet arr1

    l1:
    mov ah,1
    int 21h

    cmp al,13
    JE programend

    mov [si],al
    inc si
    jmp l1


    programend:
        mov dx, offSet arr1
        mov ah,9
        int 21h
        
        mov ah,4ch
        int 21h



    
main endp
end main





Program to push and pop num in stack


dosseg
.model small
.stack 100h
.data
.code

main proc
    
    mov ax, '5'
    PUSH ax

    mov ax, '9'
    PUSH ax
    POP ax

    mov dx,ax
    mov ah,2
    int 21h

    POP ax
     mov dx,ax
    mov ah,2
    int 21h



    mov ah,4ch
    int 21h
    
main endp
end main


Program to swap two numbers using stack



dosseg
.model small
.stack 100h
.data
.code

main proc
    
    mov ax, '3'
    PUSH ax

    mov bx, '4'
    PUSH bx

    POP ax
    mov dx, ax
    mov ah,2
    int 21h


    POP bx
    mov dx, bx
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

main endp
end main





dosseg
.model small
.stack 100h
.data
.code

main proc
    
    mov ax, '3'
    PUSH ax

    mov bx, '4'
    PUSH bx

    POP ax
    mov dx, ax
    mov ah,2
    int 21h


    POP bx
    mov dx, bx
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

main endp
end main




Program to print a reverse string with the help of stack


dosseg
.model small
.stack 100h
.data
str db 'abc$'
.code

main proc
    mov ax,@data
    mov ds,ax

    mov si, offSet str

    mov cx , 3

    l1:
        mov dx, [si]
        PUSH dx
        inc si

    loop l1

    mov cx, 3
    l2:

     pop ax
     mov dx, ax
     mov ah,2
     int 21h

    loop l2

    mov ah,4ch
    int 21h

main endp
end main




; Program to Perform Division

; dosseg
; .model small
; .stack 100h
; .data
;     q db ?
;     r db ?
; .code

; Main proc



;     mov ax, 26
;     mov bl, 5

;     DIV bl

;     mov q,al
;     mov r,ah

;     add q,'0'
;     mov dl,q
;     mov ah,2
;     int 21h
    
;     mov dl, 10
;     mov ah,2
;     int 21h

;     mov dl, 13
;     mov al,2
;     int 21h

;     add r,'0'
;     mov dl,r
;     mov ah,2
;     int 21h
    
;     mov dl, 10
;     mov ah,2
;     int 21h

;     mov dl, 13
;     mov al,2
;     int 21h

;     mov ah, 4ch
;     int 21h


; main endp
; end main


; Program to Perform Multiplication

; dosseg
; .model small
; .stack 100h
; .data
; .code

; Main proc

;     mov al,3
;     mov bl,2

;     MUL bl

;     mov dx,ax
;     add dx,'0'
;     mov ah,2
;     int 21h


;     mov ah, 4ch
;     int 21h


; main endp
; end main



; Program to Perform Multiplication like  5 * 5

dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov al,5
    mov bl, 5

    MUL bl
    AAM

    mov ch, ah
    mov cl, al

    mov dl, ch
    add dl, '0'
    mov ah, 2
    int 21h

    mov dl,cl
    add dl,'0'
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

main endp
end main



Nested Loop
Program to print pyramid

dosseg
.model small
.stack 100h
.data
.code
Main proc

    mov bx,1

    mov cx,5

    l1:
    PUSH cx

    mov cx,bx
    l2:
        mov dl,'*'
        mov ah,2
        int 21h

    loop l2

    mov dx,10
    mov ah,2
    int 21h

    mov dx,13
    mov ah,2
    int 21h

    inc bx
    POP cx
    loop l1

    mov ah,4ch
    int 21h



main endp
end Main



Program to use Procedure (same as functions in high level programming languages)

dosseg
.model small
.stack 100h
.data
    var1 db 'Hello$'
    var2 db 'How_are_you$'
    var3 db 'Whats_up$'
.code

Main proc

    mov ax,@data
    mov ds,ax

    ; print var1
    mov dx, offSet var1
    mov ah,9
    int 21h

    CALL enterkey

    ; print var2
    mov dx, offSet var2
    mov ah,9
    int 21h

    CALL enterkey

    ; print var3
    mov dx, offSet var3
    mov ah,9
    int 21h

    mov ah,4ch
    int 21h

Main endp

enterkey proc
    mov dx,10
    mov ah,2
    int 21h

    mov dx,13
    mov ah,2
    int 21h

    ret
enterkey endp

end Main



Program using macro



print macro p1

    mov dx, offset p1
    mov ah,9
    int 21h
endm

dosseg
.model small
.stack 100h
.data
    var1 db 'Hello$'
    var2 db 'How_are_you$'
    var3 db 'Whats_up$'
.code

Main proc

    mov ax,@data
    mov ds,ax

    print var1
    CALL enterkey

    print var2
    CALL enterkey

    print var3
    CALL enterkey

    ; mov dx,offSet var1
    ; mov ah,9
    ; int 21h


    mov ah,4ch
    int 21h


Main endp

enterkey proc
    mov dx,10
    mov ah,2
    int 21h

    mov dx,13
    mov ah,2
    int 21h

    ret


enterkey endp

end Main



; Program to Print Graphics Simple program

dosseg
.model small
.stack 100h
.data
.code

main proc

    mov ah,6
    mov al, 10
    mov bh, 00010000b
    mov ch,0
    mov cl,0
    mov dh,25
    mov dl,25
    int 10h


main endp
end main