
dosseg
.model small
.stack 100h
.data
.code

main proc

    mov dl, 10
    add dl,48
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

    mov dl,2
    add dl, '0'
    mov ah,2
    int 21h

    mov dl , 4
    add dl,'0'
    mov ah, 2
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





main endp
end main




dosseg
.model small
.stack 100h
.data
.code

main proc

    mov bl, 1
    mov cl , 1

    add bl,cl
    mov dl,bl
    add dl,'0'
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

    mov bl, 10
    mov cl , 2

    sub bl,cl
    mov dl,bl
    add dl,'0'
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

   mov ah,1
   int 21h

   mov dl,al
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
    mov ah,1
    int 21h
    mov bl,al
    sub bl,'0'

    mov ah,1
    int 21h
    mov cl,al
    sub cl, '0'

    add bl,cl
    add bl,'0'

    mov dl,bl
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
    mov ah, 1
    int 21h
    sub al,'0'
    mov bl, al

     mov ah, 1
    int 21h
    sub al,'0'
    mov cl, al

    sub bl,cl
    add bl, '0'

    mov dl,bl
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

    mov ah,1
    Int 21h
    sub al,'0'
    mov bl,al

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h



    mov ah,1
    Int 21h
    sub al,'0'
    mov cl,al

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    add bl,cl
    add bl, '0'

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








dosseg
.model small
.stack 100h
.data
.code

main proc
    mov ah,1
    int 21h
    sub al, '0'
    mov bl, al

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h


    mov ah,1
    int 21h
    sub al, '0'
    mov cl, al

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    sub bl, cl
    add bl,'0'

    mov dl, bl
    mov ah, 2
    int 21h

     mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl, 0Ah
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

    mov dl,0Ah
    mov ah,2
    int 21h

    add bl,32
    mov dl,bl
    mov ah,2
    int 21h

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl,0Ah
    mov ah,2
    int 21h

    mov ah,4ch
    int 21h







main endp
end main



Program to convert a to A (91 -32) 

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

    mov dl,0Ah
    mov ah,2
    int 21h

    sub bl,32
    mov dl,bl
    mov ah,2
    int 21h

    mov dl, 0Dh
    mov ah,2
    int 21h

    mov dl,0Ah
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

         lea dx , var3
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




dosseg
.model small
.stack 100h
.data
    var1 db 'A'
    var2 db ?
    var3 db '12345$'
    var4 db ?
    var5 db 'ALiMurtaza$'
.code

main proc

    mov ax, @data
    mov ds,ax

    mov dl, var1
    mov ah, 2
    int 21h

    mov dl, 0Dh
    mov ah, 2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    mov var2, 2
    add var2, '0'
    mov dl, var2
    mov ah,2
    int 21h

    mov dl, 0Dh
    mov ah, 2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h


    lea dx, var3
    mov ah,9
    int 21h

    mov dl, 0Dh
    mov ah, 2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h

    mov var4,5
    add var4, '0'
    mov dl, var4
    mov ah,2
    int 21h


     mov dl, 0Dh
    mov ah, 2
    int 21h

    mov dl, 0Ah
    mov ah,2
    int 21h


    mov dx, offSet var5
    mov ah,9
    int 21h


    mov ah,4ch
    int 21h



main endp
end main



