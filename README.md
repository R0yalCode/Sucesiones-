#  Sucesiones 

Se implemento la interfaz Successionable, para agregar la sucecion de Serie de primos elevados al cubo  hasta un limite (S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ... + N^3), si se requiere agregar una nueva sucecion, se debe crear una nueva clase que implemente Seccessionable y agregar la opcion en el main.java

---

## Tabla de contenidos

- [Características](#características)
- [Uso](#uso)
- [Ejemplo de salida](#ejemplo-de-salida)
- [Experiencia y desafíos](#experiencia-y-desafíos)
- [Integrantes](#integrantes)

---

## Características

- Menú interactivo para elegir el tipo de sucesión.
- Implementa la interfaz `Successionable` para agregar nuevas sucesiones.

---

## Uso

Al iniciar el programa, verás un menú como este:

```

Integrantes
* GYNA MAYERLY YUPANQUI ROMERO
* ROYEL IVÁN JIMA PARDO
* DAVID ALEJANDRO RUIZ SANCHEZ
* GALO MILTON BENITEZ CABRERA
* DARWIN JOSE CORREA SARITAMA
Elija la opción de la serie que desea calcular:
1. Serie de numeros pares hasta un limite (S = 2 + 4 + 6 + 8 + ... N): 
2. Serie de primos elevados al cubo  hasta un limite (S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ... + N^3): 
3. Serie de primos elevados al cubo  hasta N términos (S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ...): 
4. Serie de primos elevados por pares hasta un limite (S = 1^2 + 3^4 + 5^6 + 7^8 + 11^10 + 13^(12) ... + N): 
5. Serie de primos elevados a impares hasta n térmimos (S = S = 1^1 + 3^3 + 5^5 + 7^7 + 11^9 + 13^11 ..): 
6. Serie de primos elevados a la raiz de numeros pares hasta un limite (S = 1^(1/2) + 3^(1/4) + 5^(1/6) + 7^(1/8) + 11^(1/10) + 13^(1/12) ... + N): 
7. Serie de primos elevados a la raiz de numeros impares hasta un n términos (S = 1^(1/1) + 3^(1/3) + 5^(1/5) + 7^(1/7) + 11^(1/9) + 13^(1/11)): 
8. Serie de primos elevados a la raiz cúbica hasta un n términos (S = 1^(1/3) + 3^(1/3) + 5^(1/3) + 7^(1/3) + 11^(1/3) + 13^(1/3)): 
9. Serie de primos elevados a la raiz cuadrada hasta un limite (S = 1^(1/2) + 3^(1/2) + 5^(1/2) + 7^(1/2) + 11^(1/2) + 13^(1/2)+ .. + N^(1/2): 
 
Ingrese la opción: 2
Ingrese el límite N: 13
S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3
Resultado: 4024
```

- Elige la opción deseada (por ejemplo, 1 o 2).
- Ingresa el límite solicitado.
- El programa mostrará la sucesión calculada y su resultado.

---

## Ejemplo de salida

**Opción 2: Primos elevados al cubo hasta 20**
```

Integrantes
* GYNA MAYERLY YUPANQUI ROMERO
* ROYEL IVÁN JIMA PARDO
* DAVID ALEJANDRO RUIZ SANCHEZ
* GALO MILTON BENITEZ CABRERA
* DARWIN JOSE CORREA SARITAMA
Elija la opción de la serie que desea calcular:
1. Serie de numeros pares hasta un limite (S = 2 + 4 + 6 + 8 + ... N): 
2. Serie de primos elevados al cubo  hasta un limite (S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ... + N^3): 
3. Serie de primos elevados al cubo  hasta N términos (S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ...): 
4. Serie de primos elevados por pares hasta un limite (S = 1^2 + 3^4 + 5^6 + 7^8 + 11^10 + 13^(12) ... + N): 
5. Serie de primos elevados a impares hasta n térmimos (S = S = 1^1 + 3^3 + 5^5 + 7^7 + 11^9 + 13^11 ..): 
6. Serie de primos elevados a la raiz de numeros pares hasta un limite (S = 1^(1/2) + 3^(1/4) + 5^(1/6) + 7^(1/8) + 11^(1/10) + 13^(1/12) ... + N): 
7. Serie de primos elevados a la raiz de numeros impares hasta un n términos (S = 1^(1/1) + 3^(1/3) + 5^(1/5) + 7^(1/7) + 11^(1/9) + 13^(1/11)): 
8. Serie de primos elevados a la raiz cúbica hasta un n términos (S = 1^(1/3) + 3^(1/3) + 5^(1/3) + 7^(1/3) + 11^(1/3) + 13^(1/3)): 
9. Serie de primos elevados a la raiz cuadrada hasta un limite (S = 1^(1/2) + 3^(1/2) + 5^(1/2) + 7^(1/2) + 11^(1/2) + 13^(1/2)+ .. + N^(1/2): 
 
Ingrese la opción: 2
Ingrese el limite N: 20
S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 + 17^3 + 19^3
Resultado: 15796
```
![image](https://github.com/user-attachments/assets/41555f39-cdae-4460-8cc5-438179991691)
 > Ejemplo de ejecucion
---

## Experiencia y desafíos

En cuanto a la gestión de herramientas y el entorno de desarrollo, tuvimos retos como la versión de Java Development Kit (JDK), el cual dentro del grupo no contábamos con la versión correspondiente para ejecutar el proyecto el cual estaba en una versión superior debido a la configuración del archivo pom.xml, el cual nos pedía compilar el proyecto con una versión JDK 21.

Sobre la interfaz, la cual nos permite tratar de forma uniforme a las diferentes clases, las cuales van a tener comportamientos distintos. con esto tenemos polimorfismo, pudiendo tratar todas las sucesiones igual en el main, pudiendo así mismo tener extensibilidad, por si se quiere agregar una nueva sucesión, sólo se debe de crear una nueva clase que implemente “Successionable”.

---

## Extensión 

Para agregar nuevas sucesiones, basta con crear una nueva clase que implemente la interfaz `Successionable` y agregar la opción correspondiente en el menú de `Main.java`.

---

## Integrantes

### GYNA MAYERLY YUPANQUI ROMERO
### ROYEL IVÁN JIMA PARDO
### DAVID ALEJANDRO RUIZ SANCHEZ
### GALO MILTON BENITEZ CABRERA
### DARWIN JOSE CORREA SARITAMA

---
