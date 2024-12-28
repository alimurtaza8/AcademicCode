; 2. First Name Last Name after swapping Last Name First Name

dosseg
.model small
.stack 100h
.data
    firstName db 'Ali$'
    lastName  db 'Murtaza$'
.code
MAIN proc
         mov  ax, @data
         mov  ds, ax
    ; For firstName
         mov  dx, offset firstName
         mov  ah, 9
         int  21h
         mov  dl, ' '
         mov  ah, 2
         int  21h
    ; For lastName
         mov  dx, offset lastName
         mov  ah, 9
         int  21h

         mov  dl, 0Dh
         mov  ah, 2
         int  21h
         mov  dl, 0Ah
         mov  ah, 2
         int  21h
    
    ; Swap and display lastName
         push ds
         mov  dx, offset lastName
         mov  ah, 9
         int  21h
         mov  dl, ' '
         mov  ah, 2
         int  21h
         pop  ds
         mov  dx, offset firstName
         mov  ah, 9
         int  21h
 
         mov  ah, 4Ch
         int  21h
MAIN endp
end MAIN