En la clase Persona se definieron los atributos comunes (documento, nombre y correo) ya que son compartidos por todos los tipos de usuarios. Además, se implementaron validaciones básicas como campos no vacíos y formato de correo.

Las subclases Docente y Administrativo heredan de Persona usando super(...), lo que permite reutilizar código. Cada una agrega su propio atributo (área o cargo) y su método de impresión de ficha.

Esta estructura permite organizar mejor el sistema, evitar duplicación de código y aplicar correctamente el concepto de herencia en programación orientada a objetos.