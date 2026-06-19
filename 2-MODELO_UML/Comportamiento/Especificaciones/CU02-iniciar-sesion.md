# CU02 - Iniciar Sesión

## Objetivo

Permitir que los usuarios accedan al sistema.

## Actores

* Administrador
* Instructor
* Miembro

## Precondiciones

* El usuario debe estar registrado.

## Flujo Principal

1. El usuario ingresa correo y contraseña.
2. El sistema valida las credenciales.
3. El sistema genera un token de acceso.
4. El sistema permite el ingreso.

## Flujo Alternativo

### A1. Credenciales incorrectas

1. El sistema rechaza el acceso.
2. Muestra mensaje de error.

## Postcondiciones

* Usuario autenticado correctamente.
