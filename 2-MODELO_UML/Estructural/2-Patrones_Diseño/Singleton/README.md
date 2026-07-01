# Patrón de Diseño Singleton

## Objetivo

Garantizar que la clase `ConfiguracionClub` tenga una única instancia durante toda la ejecución del sistema.

## Problema

El sistema necesita acceder a una configuración global del Club de Programación (nombre del club, correo institucional y cantidad máxima de miembros) sin crear múltiples objetos con la misma información.

## Solución

Se implementó el patrón Singleton mediante un constructor privado y un método estático `getInstance()`, que asegura la creación de una única instancia de la clase.

## Beneficios

- Existe una sola instancia de la configuración.
- Se evita la duplicación de datos.
- Se centraliza la información global.
- Facilita el mantenimiento del sistema.

## Aplicación en el proyecto

La clase `ConfiguracionClub` almacena la configuración general utilizada por todo el sistema.

## Archivos

- Singleton.puml
- ConfiguracionClub.java
- singleton.png