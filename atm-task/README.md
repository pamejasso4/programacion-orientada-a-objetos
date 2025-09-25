# 📌 Práctica de Github Classroom

## 👤 Student Info

¡Modifica el README con tus datos!

- Nombre:
- Matrícula:
- Fecha:

## 📝 Description

En esta actividad debes crear un programa en Java que simule un cajero automático. Para ello, implementarás las clases Account y ATM siguiendo la funcionalidad que se describe a continuación y que será validada por una serie de tests unitarios.

### Clase Account

- Representa una cuenta bancaria con los siguientes atributos y métodos:
- Atributos:
  - accountNo: String - número de cuenta.
  - ownerName: String - nombre del dueño.
  - amount: double - saldo disponible.
  - accountType: String - tipo de cuenta ("ahorro" o "transacción").
- Métodos:
  - deposit(double value): Aumenta el saldo de la cuenta.
  - withdraw(double value): Disminuye el saldo de la cuenta.

### Clase ATM

- Simula las operaciones de un cajero automático.
- Métodos:
  - deposit(Account cuenta, double value): Ingresa dinero en una cuenta.
  - withdraw(Account cuenta, double value): Retira dinero de una cuenta, validando que haya saldo suficiente.
  - transfer(Account origen, Account destino, double value): Transfiere dinero entre dos cuentas.
  - verCantidad(Account cuenta): Consulta el saldo y la información completa de la cuenta.

> Los métodos deben cumplir la lógica esperada: validar saldo antes de retirar o transferir, actualizar correctamente el saldo y mostrar la información correcta en verCantidad.

## 🎯 Objectives

- Practicar la implementación de clases en java.
- Manejar operaciones básicas de un cajero automático (depositar, retirar, transferir, consultar saldo).
- Validar las operaciones con condiciones lógicas.

## 🛠️ Instructions

- Clonar el repositorio.
- Implementar la clase Account con los atributos y métodos descritos.
- Implementar la clase ATM con los métodos withdraw, deposit, transfer y verCantidad.
- No modificar los tests unitarios incluidos en el proyecto.
- Ejecutar los tests para verificar que tu implementación es correcta.

## 🧪 Testing Instructions

Para correr las pruebas automáticas incluidas en el proyecto:

```cmd
./gradlew test
```

## Ejecutar el programa con Gradle

```cmd
./gradlew run

```

Esto ejecutará el método main de la clase App y permitirá interactuar con el usuario por consola.

## ¡Recuerda

```cmd
git add -A
git commit -m "<descripcion-del-commit>"
git push -u origin <rama>
```

## ✅ Resultado

(Añadir captura de pantalla del resultado de la ejecución)
