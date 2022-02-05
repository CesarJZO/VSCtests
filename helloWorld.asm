.text
.glob __start

__start:
        la $a0, str
        li $v0, 4
        syscall

        li $v0, 10
        syscall

        .data
str:    .aciiz "Hello world!\n"