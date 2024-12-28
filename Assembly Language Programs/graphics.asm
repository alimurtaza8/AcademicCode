1. Print shapes of Square, Rectangle, and Parallelogram.

square code

dosseg
.model small
.stack 100h
.data
.code

Main proc
    mov ah, 6
    mov al, 10

    mov bh, 0010000b
    mov ch,0
    mov cl,0

    mov dh, 25
    mov dl, 25    
    
    int 10h
    mov ah,4ch
    int 21h

Main endp
end Main



RECTANGLE code

dosseg
.model small
.stack 100h
.data
.code
main proc

mov ah, 06h
mov al, 15
mov bh,00100001b
mov ch,10
mov cl,10
mov dh,30
mov dl,30
int 10h

mov ah,02h
mov bh,0
mov dh,18
mov dl,15
int 10h

mov ah,4ch
int 21h

main endp
end main




Print a parallelogram
dosseg
.model small
.stack 100h
.data
.code

Main proc
    mov ah, 6
    mov al, 10                 
    mov bh, 00100000b         
    mov ch, 0
    mov cl, 0
    mov dh, 15                 
    mov dl, 39               
    int 10h                    
    mov ah, 4Ch                
    int 21h

Main endp
end Main


2. Print the above-mentioned shapes with their names.

square shape with name
dosseg
.model small
.stack 100h
.data
 var db " Square$"
.code

Main proc
    mov ax, @data
    mov ds,ax

    mov ah, 6
    mov al, 10

    mov bh, 0010000b
    mov ch,0
    mov cl,0

    mov dh, 25
    mov dl, 25    
    
    int 10h

    mov dx,offSet var
    mov ah,9
    int 21h
    
    mov ah,4ch
    int 21h

Main endp
end Main


Rectangle Shape with name
dosseg
.model small
.stack 100h
.data
var db "rectangle$"
.code
main proc
mov ax,@data
mov ds,ax

mov ah, 06h
mov al, 15
mov bh,00100001b
mov ch,10
mov cl,10
mov dh,30
mov dl,30
int 10h

mov ah,02h
mov bh,0
mov dh,18
mov dl,15
int 10h

mov dx,offset var
mov ah,9
int 21h

mov ah,4ch
int 21h

main endp
end main


parallelogram shape with name
dosseg
.model small
.stack 100h
.data
 var db "parallelogram$"
.code

Main proc
    mov ax, @data
    mov ds, ax
   
    mov ah, 6
    mov al, 10                 
    mov bh, 00100000b         
    mov ch, 0
    mov cl, 0
    mov dh, 50               
    mov dl, 39               
    int 10h

    mov dx, offSet var
    mov ah,9
    int 21h
           
    mov ah, 4Ch                
    int 21h

Main endp
end Main



3. Draw any pattern of your choice using Shapes.
Trying To draw a cube shape

dosseg
.model small
.stack 100h
.data
 cube db "Cube$"
.code

Main proc
    mov ax,@data
    mov ds,ax

    mov ah, 6
    mov al, 10                
    mov bh, 00100000b          
    mov ch, 0
    mov cl, 0
    mov dh, 15                 
    mov dl, 15                 
    int 10h                    

    mov ah, 6
    mov al, 10                
    mov bh, 00100000b         
    mov ch, 0
    mov cl, 0
    mov dh, 25                 
    mov dl, 25                 
    int 10h                    

    mov ah, 6
    mov al, 10                 
    mov bh, 00100000b          
    mov ch, 15                 
    mov cl, 15                 
    mov dh, 25                 
    mov dl, 25                 
    int 10h                    

    mov ah, 6
    mov al, 10
    mov bh, 00100000b
    mov ch, 15                 
    mov cl, 25                 
    mov dh, 25                 
    mov dl, 35                 
    int 10h                    

    mov ah, 6
    mov al, 10
    mov bh, 00100000b
    mov ch, 25                 
    mov cl, 15                 
    mov dh, 35                 
    mov dl, 25                
    int 10h                    

    mov ah, 6
    mov al, 10
    mov bh, 00100000b
    mov ch, 25                 
    mov cl, 25                 
    mov dh, 35                 
    mov dl, 35                 
    int 10h  

    mov dx, offSet cube                  
    mov ah,9
    int 21h

    mov ah, 4Ch
    int 21h

Main endp
end Main





; 4. Bonus part: Draw a triangle and any other shape of your choice.
; Printing a Triangle

dosseg
.model small
.stack 100h
.data
.code

Main proc
    mov ah, 6
    mov al, '*'
    mov bh, 00000000b
    mov dh, 10
    mov dl, 25
    int 10h

    mov ah, 6
    mov al, '*'
    mov bh, 00000000b
    mov dh, 11
    mov dl, 24
    int 10h

    mov dl, 26
    int 10h

    mov ah, 6
    mov al, '*'
    mov bh, 00000000b
    mov dh, 12
    mov dl, 23
    int 10h

    mov dl, 25
    int 10h

    mov dl, 27
    int 10h

    mov ah, 6
    mov al, '*'
    mov bh, 00000000b
    mov dh, 13
    mov dl, 22
    int 10h

    mov dl, 24
    int 10h

    mov dl, 26
    int 10h

    mov dl, 28
    int 10h

    mov ah, 6
    mov al, '*'
    mov bh, 00000000b
    mov dh, 14
    mov dl, 21
    int 10h

    mov dl, 23
    int 10h

    mov dl, 25
    int 10h

    mov dl, 27
    int 10h

    mov dl, 29
    int 10h

    mov ah, 4Ch
    int 21h

Main endp
end Main
