; 1. Input a string from the user and reverse it.

dosseg
.model small
.stack 100h
.data
    buffer db 6
.code
main proc
         mov  ax, @data
         mov  ds, ax
         mov  dx, offset buffer
         mov  ah, 0Ah
         int  21h
         mov  si, offset buffer+1
         mov  cl, [buffer]
    l1:  
         mov  al, [si]
         push ax
         inc  si
         loop l1
         mov  cl, [buffer]
    l2:  
         pop  dx
         mov  ah, 2
         int  21h
         loop l2
         mov  ah, 4Ch
         int  21h
main endp
end Main