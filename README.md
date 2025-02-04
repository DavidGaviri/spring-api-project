# Spring API Project

Este es un proyecto desarrollado utilizando **Spring Boot** que implementa una **API RESTful** para la gestión de productos. El proyecto sigue buenas prácticas de programación y arquitectura en capas, implementando características modernas, como **Lombok**, **Programación Funcional**, **API Streams**, **Lambdas**, **Referencias a Métodos**, **Java Optional**. Además, la capa de **persistencia de datos** está simulada utilizando una **lista en memoria**, sin conexión real a una base de datos.

### Tecnologías utilizadas
- **Java**
- **Spring Boot**: Para la creación y gestión de la API.
- **Lombok**: Para reducir el código repetitivo como getters, setters y constructores.
- **Postman**: Herramienta para probar la API.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.

### Arquitectura del Proyecto

Este proyecto está estructurado utilizando **una arquitectura en capas** que mejora la mantenibilidad y escalabilidad:

1. **Capa de Controladores (Controller)**: Maneja las solicitudes HTTP y las respuestas. Asegura que las peticiones lleguen correctamente a la capa de servicio.
2. **Capa de Servicio (Service)**: Contiene la lógica de negocio.
3. **Capa de Repositorio Simulado**: La persistencia de los productos está simulada utilizando una **lista en memoria** que actúa como almacenamiento temporal.
4. **Modelo de Datos (Entity)**: Representa los datos que se gestionan en la API.

### Capa de Repositorio Simulado

En lugar de una base de datos real, los datos de los productos se almacenan en una **lista en memoria**. Esta lista actúa como el "repositorio" que mantiene los objetos de productos durante la ejecución de la aplicación.


### Características del proyecto

- **Operaciones CRUD completas**: La API permite realizar operaciones completas con los productos, como crear, leer, actualizar y eliminar productos.
  - **POST**: Crear un nuevo producto.
  - **GET**: Obtener productos por ID y obtener todos los productos.
  - **PUT**: Actualizar los datos de un producto existente.
  - **DELETE**: Eliminar un producto por ID.

- **Inyección de Dependencias**: El proyecto utiliza la inyección de dependencias proporcionada por Spring para una mayor modularidad y prueba.

- **Manejo de errores**: La API responde adecuadamente a las solicitudes incorrectas o a los errores internos con un manejo adecuado de excepciones y códigos HTTP correspondientes.

- **Uso de Lombok**: Reduce el código repetitivo para crear getters, setters, constructores y métodos `toString()`.

- **Uso de `Optional`**: En lugar de devolver valores nulos, se utilizan `Optional` para indicar que un valor podría no estar presente.

- **Uso de `ResponseEntity`**: Para personalizar las respuestas HTTP y proporcionar códigos de estado adecuados en todas las respuestas.

### Maneo de Endpoints



### Uso de Postman

Para probar esta API, puedes utilizar **Postman**. Los endpoints mencionados anteriormente están listos para ser probados en Postman. Asegúrate de configurar los métodos HTTP correspondientes (POST, GET, PUT, DELETE) para realizar las operaciones.

### Buenas prácticas

- **Versionado de API**: La API está versionada, lo que permite futuras mejoras sin afectar a los consumidores existentes de la API.
- **Manejo de excepciones**: Las excepciones se manejan de manera adecuada con mensajes de error claros y respuestas HTTP apropiadas.
