# Proyecto final: Administracion Parqueadero

Se desea desarrollar una aplicación para la administración eficiente de un parqueadero. El
parqueadero cuenta con un número n de puestos, cada uno identificado por una posición
única (i, j). Cada puesto puede estar ocupado por un vehículo, que puede ser de tipo moto
(clásica o híbrida) o carro, y debe tener una placa, un modelo y un propietario registrado en el
sistema.
Para las motos, se debe registrar también su velocidad máxima, ya que el parqueadero es
frecuentado por compradores de motos usadas interesados en conocer este dato. Un vehículo
solo puede ocupar un puesto a la vez, por lo que se debe verificar la disponibilidad del puesto
antes de ubicar un vehículo en él.
El sistema debe llevar un registro completo de todos los vehículos que han parqueado en el
establecimiento, incluyendo información sobre el puesto ocupado y el momento de ingreso.
Además, debe permitir la identificación del propietario de un vehículo ubicado en un puesto
dado y llevar un registro de todos los ingresos al parqueadero, registrando el puesto ocupado
y el vehículo ubicado en el mismo.
La implementación del parqueadero debe hacer uso de herencia para una mejor organización
y reutilización del código.

# Autores

- Santiago Carvajal
- Derek Rodriguez
- Sara Vergara

# Herramientas

- [java 17](https://adoptium.net/es)
- [junit 5.10.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- [maven](https://maven.apache.org)


# Construcción y pruebas

Para compilar el proyecto puede usar el comando:

```shell
mvn clean compile
```

Para ejecutar las pruebas puede usar el comando: 

```shell
 mvn clean test
```

Para generar el jar puede usar el comando: 

```shell
 mvn clean package
```

y para ejecutar el jar

```shell
 java -jar target/trabajo_final-1.0.jar
```
