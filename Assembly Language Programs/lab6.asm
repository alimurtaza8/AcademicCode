dosseg
.model small
.stack 100h
.data
    prompt1   db 'Enter a string: $'
    prompt2   db 'Enter first name: $'
    prompt3   db 'Enter last name: $'
    prompt4   db 'Strings are equal.$'
    prompt5   db 'Strings are not equal.$'
    newline   db 0Dh, 0Ah, '$'
    string1   db 20 dup(?)
    string2   db 20 dup(?)
    firstname db 20 dup(?)
    lastname  db 20 dup(?)
    temp      db 20 dup(?)
.code

main proc
    ; Initialize data segment
                 mov   ax, @data
                 mov   ds, ax

    ; Task 1: Reverse a string
                 mov   dx, offset prompt1
                 mov   ah, 9
                 int   21h

    ; Input string
                 lea   dx, string1
                 mov   ah, 0Ah
                 int   21h

    ; Reverse the string
                 mov   si, offset string1 + 1
                 mov   bx, si
                 add   bx, [si]
                 dec   bx

    ReverseLoop: 
                 cmp   si, bx
                 jge   ReversedDone
                 mov   al, [si]
                 mov   bl, [bx]
                 mov   [si], bl
                 mov   [bx], al
                 inc   si
                 dec   bx
                 jmp   ReverseLoop

    ReversedDone:
    ; Display reversed string
                 mov   dx, offset newline
                 mov   ah, 9
                 int   21h
                 lea   dx, string1 + 2
                 mov   ah, 9
                 int   21h

    ; Task 2: Swap first name and last name
                 mov   dx, offset newline
                 mov   ah, 9
                 int   21h

                 mov   dx, offset prompt2
                 mov   ah, 9
                 int   21h

    ; Input first name
                 lea   dx, firstname
                 mov   ah, 0Ah
                 int   21h

                 mov   dx, offset prompt3
                 mov   ah, 9
                 int   21h

    ; Input last name
                 lea   dx, lastname
                 mov   ah, 0Ah
                 int   21h

    ; Display swapped names (Last Name First Name)
                 mov   dx, offset lastname + 2
                 mov   ah, 9
                 int   21h

                 mov   dx, offset firstname + 2
                 mov   ah, 9
                 int   21h

    ; Task 3: Compare two strings
                 mov   dx, offset newline
                 mov   ah, 9
                 int   21h

    ; Input string1 for comparison
                 lea   dx, string1
                 mov   ah, 0Ah
                 int   21h

    ; Input string2 for comparison
                 lea   dx, string2
                 mov   ah, 0Ah
                 int   21h

    ; Compare the strings
                 lea   si, string1 + 2
                 lea   di, string2 + 2

    CompareLoop: 
                 lodsb
                 scasb
                 jne   NotEqual
                 cmp   al, 0
                 je    StringsEqual
                 jmp   CompareLoop

    NotEqual:    
                 mov   dx, offset prompt5
                 mov   ah, 9
                 int   21h
                 jmp   End

    StringsEqual:
                 mov   dx, offset prompt4
                 mov   ah, 9
                 int   21h

    End:         
    ; Exit program
                 mov   ah, 4ch
                 int   21h

main endp
end main
