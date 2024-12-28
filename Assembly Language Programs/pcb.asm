.model small
.stack 100h
.data
str1 db "Enter No. of process: $"
str2 db "Enter Execution time of process: $"
str3 db "Process Execution $"
count db 1
quantum db 2
completed db 0
no_of_process db ?
arraylength dw ?
queue dw no_of_process (0)
process_array dw arraylength (0)


.code
main PROC
       mov ax,@data
       mov ds,ax

       ;print Enter no. of process
       mov dx,offset str1
       mov ah , 9
       Int 21h
       ;function calling for next line 
       call EnterKey
       ;input for no. of process
       mov ah,1
       int 21h 
       sub al,'0'
       mov no_of_process,al
       ;multiplying to find array length
       mov al,no_of_process
       mov bl,5
       mul bl
       ;assigning the value to array length
       mov arraylength,ax


       ;loop for initialize all zero in the array 
       mov cx,arraylength
       mov si,offset process_array
       loopin:
       mov [si],0
       inc si
       loop loopin
      


       ;loop for asssigning id at index 1 and entry time at index 3
       mov cx,arraylength
       mov si,offset process_array
       mov al,1
       loopforprocess:
       mov [si],al
       mov [si+2],al
       add si ,5
       inc al
       loop loopforprocess

      ;loop for assigning execution time at index 2 and remaining time at index 4 after input 
       mov cl,no_of_process
       mov si,offset process_array
       loopforexecutiontime:
       call EnterKey
       mov dx,offset str2
       mov ah,9
       int 21h
       mov ah, 1
       int 21h
       sub al,'0'
       mov [si+1],al
       mov [si+3],al
       inc dl
       add si ,5
       loop loopforexecutiontime



      ;Processing Control Block 
      
       mov cl,9
       mov si,offset process_array
       ProcessingControlBlock:
      ;  cmp [si+4],0
      ;  je AssigningStartTime
       cmp [si+3],1
       jge Executequantum
       inc completed
      ;  add si,5
       
      jmp ProcessingControlBlock

      ;  jmp print 
      ;  cmp completed,no_of_process
      ;  jne 
      loop ProcessingControlBlock


      Executequantum:
      call EnterKey
      mov dx,offset str3
        mov ah,9
        int 21h
      
       sub [si+3],1
       mov dl,[si+3]
       add dl, 48 
       mov ah , 2
       int 21h
    
       
       add si, 5
       add count,1
       mov al, no_of_process
       cmp [si],al
       jg assigning
       jmp ProcessingControlBlock
       loop Executequantum

      assigning:
      mov si , offset process_array
      jmp ProcessingControlBlock
      loop assigning


      AssigningStartTime:
    mov al, [count]
      mov [si+4],al
      jmp Executequantum
      loop AssigningStartTime

      mov cl,5
      print:
      mov dl,[si+4]
      add dl,48
      ; mov ah,2 
      ; int 21h  
      loop print

       mov cx,arraylength
       mov si,offset process_array
       loopout:
       call EnterKey
       mov dl,[si]
       add dl,48
       mov ah , 2
       int 21h
       inc si 
       loop loopout

       

       mov ah,4Ch
       int 21h
    
main ENDP
EnterKey proc
mov dx ,10
    mov ah,2
    Int 21h
      mov dx ,13
      mov ah,2
    Int 21h
    ret
EnterKey endp
end main