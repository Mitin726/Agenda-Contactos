## Mini reto — Agenda de Contactos

En este mini reto desarrollé una aplicación de consola en Java para gestionar una agenda de contactos durante la ejecución del programa.

Construí el proyecto aplicando conceptos de **Programación Orientada a Objetos**, utilizando una clase `Contacto` para representar cada registro y una clase `AgendaContactos` para gestionar las operaciones de la aplicación. Los contactos se almacenan temporalmente mediante un `ArrayList<Contacto>`.

### Funcionalidades implementadas

* Desarrollé la funcionalidad para agregar contactos con nombre, teléfono y correo.
* Implementé la validación para evitar que el nombre del contacto esté vacío.
* Implementé la visualización de todos los contactos ordenados alfabéticamente por nombre, ignorando mayúsculas y minúsculas.
* Desarrollé una búsqueda de contactos mediante coincidencias parciales en el nombre.
* Implementé la eliminación de contactos mediante coincidencia exacta del nombre.
* Implementé el manejo de opciones inválidas en el menú.
* Mantuve el menú en ejecución hasta que el usuario selecciona la opción de salida.

### Buenas prácticas aplicadas

Durante el desarrollo no me limité a cumplir las funcionalidades solicitadas, sino que también busqué mejorar la calidad y mantenibilidad del código. Entre las prácticas que apliqué se encuentran:

* **Encapsulamiento:** definí los atributos de `Contacto` como privados y utilicé getters y setters para acceder a ellos.
* **Separación de responsabilidades:** utilicé `Main` como punto de entrada, `Contacto` para representar los datos de un contacto y `AgendaContactos` para administrar la lógica de la aplicación.
* **Métodos con responsabilidades específicas:** separé cada funcionalidad principal en su propio método.
* **Nombres descriptivos:** utilicé nombres como `agregarContacto()`, `mostrarContactos()`, `buscarContacto()` y `eliminarContacto()`.
* **Validación de entradas:** implementé controles para valores vacíos y opciones inválidas.
* **Manejo de excepciones:** utilicé `try-catch` para evitar que una entrada no numérica en el menú termine inesperadamente el programa.
* **Uso de la API estándar de Java:** utilicé únicamente herramientas permitidas por el taller, como `ArrayList`, `Scanner` y `Comparator`.

### Estructura del proyecto

```text
AgendaContactos/
├── Main.java
├── AgendaContactos.java
└── Contacto.java
```

Desarrollé el proyecto de forma incremental: primero construí el modelo `Contacto`, posteriormente la estructura de la agenda y el menú, y finalmente implementé y revisé las funcionalidades de agregar, mostrar, buscar y eliminar contactos.

---
Made with ❤️ by Mitin726