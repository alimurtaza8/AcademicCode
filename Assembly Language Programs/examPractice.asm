
Printing a single character on screen

dosseg
.model small
.stack 100h
.data
.code
Main proc

    mov dl, 'A'
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

main endp
End Main


Printing a number from input and in a new line

dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov ah, 1
    int 21h

    mov dl,13
    mov ah, 2
    int 21h

    mov dl,10
    mov ah, 2
    int 21h

    mov dl, al
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

Main endp
end Main


Structure of code 

dosseg
.model small
.stack 100h
.data
.code

Main proc

Main endp
end Main


Printing a numbers

dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov ah, 1
    int 21h

    mov dl, al

    mov ah,2
    int 21h

    mov ah, 4ch
    int 21h


Main endp
end Main


 Add Two Numbers

dosseg
.model small
.stack 100h
.data
.code

Main proc

   mov bl, 2
   add bl,'0'

   mov cl, 2
   add cl, '0'

   add bl,cl
   sub bl, '0'

   mov dl, bl
   mov ah,2
   int 21h


    mov ah,4ch
    int 21h

Main endp
end Main


SUB Two numbers



dosseg
.model small
.stack 100h
.data
.code

Main proc

   mov bl, 3
   add bl,'0'

   mov cl, 2
   add cl, '0'

   sub bl,cl
   add bl, '0'

   mov dl, bl
   mov ah,2
   int 21h


    mov ah,4ch
    int 21h

Main endp
end Main



Add Two Numbers from input


dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov ah,1
    int 21h

    mov bl,al
    sub bl,'0'

    mov dl,13
    mov ah,2
    int 21h

    mov dl, 10
    mov ah,2
    int 21h

    mov ah,1
    int 21h

    mov cl,al
    sub cl,'0'

    mov dl,13
    mov ah,2
    int 21h

    mov dl, 10
    mov ah,2
    int 21h

    add bl, cl
    add bl ,'0'
    

    mov dl,bl
   
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h



Main endp
end Main


Taking input from users and sub

dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov ah,1
    int 21h
    sub al,'0'
    mov bl,al

    mov dl,13
    mov ah,2
    int 21h

    mov dl,10
    mov ah,2
    int 21h

    mov ah,1
    int 21h
    sub al,'0'
    mov cl,al

    mov dl,13
    mov ah,2
    int 21h

    mov dl,10
    mov ah,2
    int 21h

    sub bl,cl
    add bl,'0'

    mov dl, bl
    mov ah,2
    int 21h


    mov ah,4ch
    int 21h


Main endp
end Main





Program to convert A to a


dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov ah,1
    int 21h

    mov dl, al
    add dl, 32

    mov ah,2
    int 21h

    mov ah, 4ch
    int 21h

Main endp
end Main


Now using Data variables

dosseg
.model small
.stack 100h
.data
    var1 db '1'
    var2 db 'abcd$'
    var db ?
.code

Main proc
    mov ax,@data
    mov ds,ax

    mov bl,var1
    mov dl,bl
    mov ah,2
    int 21h

    mov dl,13
    mov ah,2
    int 21h

    mov dl,10
    mov ah,2
    int 21h

    mov var,5
    mov dl, var
    add dl, 48
    mov ah,2
    int 21h

    mov dl,13
    mov ah,2
    int 21h

    mov dl,10
    mov ah,2
    int 21h

    mov dx, offSet var2
    mov ah,9
    int 21h

    mov ah,4ch
    int 21h


Main endp
end Main



First loop printing 0 to 9



dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov cx,10
    mov dx,48
    

    l1:
        mov ah,2
        int 21h
        
        inc dx
       
    loop l1

    mov ah, 4ch 
    int 21h

Main endp
end Main



Program to print A to Z

dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov cx,26
    mov dx,65
    

    l1:
        mov ah,2
        int 21h
        
        inc dx
       
    loop l1

    mov ah, 4ch 
    int 21h

Main endp
end Main



Structure of code 

dosseg
.model small
.stack 100h
.data
.code

Main proc

Main endp
end Main


Program using AND GATE


dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov bl, 110B
    AND bl, 100B

    add bl, '0'
    mov dl,bl
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

Main endp
end Main


Program using OR GATE


dosseg
.model small
.stack 100h
.data
.code

Main proc

    mov bl, 110B
    OR bl, 100B

    add bl, '0'
    mov dl,bl
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h

Main endp
end Main


Using Jump
Conditional jump and unconditional jump


Program Using unconditional jump (also a Infinite)


dosseg
.model small
.stack 100h
.data
.code

Main proc

    l1:
        mov dl,'a'
        mov ah,2
        int 21h

    jmp l1

    mov ah,4ch
    int 21h

Main endp
end Main




Program Using conditional jump 


dosseg
.model small
.stack 100h
.data
.code

Main proc

   check_equal:

    mov ah,1
    int 21h
    
    mov dl, '5'

    cmp al,dl

    je check_equal

    mov ah,4ch
    int 21h

Main endp
end Main



Program to print equall and unequall msg using jump condition


dosseg
.model small
.stack 100h
.data
    var1 db 'equal$'
    var2 db 'un_equal$'
.code

Main proc
   
    mov ax, @data
    mov ds , ax

    mov dl, '5'
    mov ah,1
    int 21h

   
    cmp al,dl

    je equall

        mov dx, offSet var2
        mov ah,9
        int 21h

        mov ah,4ch
        int 21h

    equall:
        mov dx, offSet var1
        mov ah,9
        int 21h

        mov ah,4ch 
        int 21h

Main endp
end Main



; Program to print an array of num

dosseg
.model small
.stack 100h
.data
    array db '1','2','3','4','5'
.code

Main proc
    mov ax,@data
    mov ds, ax

    mov cx , 5
    mov si, offSet array

    l1:
    mov dx,[si]
    mov ah,2
    int 21h
    inc si
    loop l1

    mov ah,4ch
    int 21h

Main endp
End Main
