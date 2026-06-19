# CU01 - Registrar Miembro

## Objetivo

Permitir que el administrador registre nuevos miembros en el Club de Programación.

## Actor Principal

Administrador

## Precondiciones

* El administrador debe haber iniciado sesión.
* El sistema debe estar disponible.

## Flujo Principal

1. El administrador selecciona la opción "Registrar Miembro".
2. El sistema muestra el formulario de registro.
3. El administrador ingresa los datos del miembro.
4. El sistema valida la información.
5. El sistema registra al miembro.
6. El sistema genera una confirmación de registro.

## Flujo Alternativo

### A1. Datos inválidos

1. El sistema detecta datos incorrectos.
2. Muestra un mensaje de error.
3. Solicita corregir la información.

## Postcondiciones

* El miembro queda registrado en el sistema.
* Se almacena el registro de auditoría.
