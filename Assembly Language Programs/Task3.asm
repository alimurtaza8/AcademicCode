; 3. Compare Two strings of your choice and the output is up to your choice

dosseg
.model small
.stack 100h
.data
    str1        db 'WORLD', 0
    str2        db 'WORLD', 0
    equalMsg    db 'Strings are equal$', 0
    notEqualMsg db 'Strings are not equal$', 0
.code
main proc
                 mov ax, @data
                 mov ds, ax
                 mov si, offset str1
                 mov di, offset str2
    compare_loop:
                 mov al, [si]
                 mov bl, [di]
                 cmp al, bl
                 jne not_equal
                 cmp al, 0
                 je  equal
                 inc si
                 inc di
                 jmp compare_loop
    equal:       
                 mov dx, offset equalMsg
                 jmp display
    not_equal:   
                 mov dx, offset notEqualMsg
    display:     
                 mov ah, 9
                 int 21h
                 mov ah, 4Ch
                 int 21h
main endp
end main