# Conversor de Monedas Alura Exchange

**Bienvenido al Conversor de Monedas Alura Exchange**, una aplicación desarrollada en Java utilizando IntelliJ IDEA y Maven, que hace uso de la API Exchange Rate API para obtener tasas de cambio en tiempo real.

---

## Descripción del proyecto
Este proyecto es una herramienta que permite convertir valores entre diferentes monedas de manera rápida y eficiente. Es especialmente útil para usuarios que necesiten realizar conversiones frecuentes entre monedas de América Latina y el dólar estadounidense.

La aplicación presenta un menú interactivo en la consola, donde los usuarios pueden seleccionar la conversión deseada o salir del programa.

---

## Funcionalidades
El programa cuenta con las siguientes opciones:

```text
                ***************************************************
                                CONVERSOR DE MONEDAS
                ***************************************************
                               BIENVENIDOS ELIJA UNA OPCIÓN:                
                1. Dolar ==> Peso argentino                
                2. Peso argentino ==> Dolar
                3. Dolar ==> Real brasileño
                4. Real brasileño ==> Dolar
                5. Dolar ==> Peso colombiano
                6. Peso colombiano ==> Dólar 
                7. Dolar ==> Peso argentino                
                8. Peso argentino ==> Dolar
                9. Salir
                ***************************************************           
```

### Características principales:
- Conversiones en tiempo real gracias al uso de la API **Exchange Rate API**.
- Interfaz intuitiva basada en texto para una experiencia de usuario simple.
- Cálculos precisos según las tasas de cambio más recientes.

---

## Requisitos previos

### Herramientas necesarias:
- **Java JDK 8 o superior**
- **IntelliJ IDEA**
- **Maven**

### Dependencias utilizadas:
- [Gson](https://github.com/google/gson): Para el manejo de JSON.
- **API Exchange Rate API**: Proveedor de las tasas de cambio.

---

##configuración


### Configurar el proyecto
1. Abre el proyecto en **IntelliJ IDEA**.
2. Asegúrate de que las dependencias de Maven estén correctamente configuradas en el archivo `pom.xml`.
3. Obtén una **clave API** de [Exchange Rate API](https://www.exchangerate-api.com/).
4. Configura tu clave API en el archivo de configuración del proyecto o en el código donde se realiza la consulta.

### Ejecutar el programa
Ejecuta el método `main` de la clase principal. Se cargará el menú interactivo en la consola.

---

## Uso

1. Selecciona una opción del menú ingresando el número correspondiente.
2. Ingresa la cantidad que deseas convertir cuando se te solicite.
3. El programa calculará y mostrará el valor convertido según las tasas de cambio actuales.
4. Puedes realizar más conversiones o salir seleccionando la opción **9. Salir**.

---

## Ejemplo de ejecución
```text
                ***************************************************
                                CONVERSOR DE MONEDAS
                ***************************************************
                               BIENVENIDOS ELIJA UNA OPCIÓN:                
                1. Dolar ==> Peso argentino                
                2. Peso argentino ==> Dolar
                3. Dolar ==> Real brasileño
                4. Real brasileño ==> Dolar
                5. Dolar ==> Peso colombiano
                6. Peso colombiano ==> Dólar 
                7. Dolar ==> Peso argentino                
                8. Peso argentino ==> Dolar
                9. Salir
                ***************************************************  
Opción: 1
Ingrese la cantidad en Dólares: 100
Resultado: 100 USD equivalen a 1,881.22 MXN.
```
Opción: 7
Ingrese la cantidad en Dólares: 100
Resultado: 100 USD equivalen a 129,000.00 ARS.

---

## Autor
Desarrollado por [Diego-Castellanos].

---

## Recursos adicionales
- [Documentación de Exchange Rate API](https://www.exchangerate-api.com/docs)
- [Gson en GitHub](https://github.com/google/gson)
