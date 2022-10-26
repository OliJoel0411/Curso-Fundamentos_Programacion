# Tipos Primitivos de Datos

Todo programa requiere la creación de variables las cuales permitirán
el almacenamiento de información temporal en memoria dinámica. Cada una de las variables creadas, deben tener características definidas por tipos de datos para poder almacenar información, como se aprecia en la tabla siguiente:

| Tipo | Descripción | Tamaño | Posibles valores |
|-|-|-|-|
| _byte_ | Número entero con signo | 1 _byte_ | - 128 hasta 127 |
| _short_ | Número entero con signo | 2 _bytes_ | - 32768 hasta 32767 |
| _int_ | Númeor entero con signo | 4 _bytes_ | - 2,147,483,648 hasta 2,147,483,647 |
| _long_ | Número entero con signo | 8 _bytes_ | - 9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807 |
| _float_ | Número flotante con signo, con precisión simple | 4 _bytes_ | - 3,402823E38 hasta - 1,401298E45 y 1,401298E45 hasta 3,402823E38 |
| _double_ | Número flotante con signo, con precisión doble | 8 _bytes_ | -1.79769313486232E308 hasta - 4.94065645841247E324 y 4.94065645841247E324 hasta 1.79769313486232E308 |
| _char_ | Caractér de código ASCII | 2 _bytes_ | Símbolo UNICODE |
| _boolean_ | Cantidad booleana | 1 _byte_ | truel, false |

## _Conversión_ de tipo de datos primitivos

La conversión entre tipos primitivos se realiza de modo automático en conversiones implícitas de un tipo a otro de más precisión, por ejemplo, de int a long o float a double.Estas conversiones se hacen necesarias en el momento de involucrar variables de diferentes tipos en expresiones matemáticas. Así mismo, en el momento en que se requiere ejecutar sentencias de asignación en las que el término izquierdo tiene un tipo diferente al resultado de evaluación en el termino derecho. Ejemplo:

```java 
int dato1 = 1000;
int dato2 = 10000;
long resultado;
resultado = dato1 * dato2;
```

Nótese en el ejemplo anterior, que dato1 y dato2 son tipo int, entonces su resultado es tipo int. Sin embargo, el tipo long tiene mayor capacidad que el tipo int, entonces, de forma implícita se realiza la conversión de tipo.

Las conversiones de un tipo de mayor precisión a otro de menor precisión requieren una sentencia explícita, debido a que estas conversiones pueden generar pérdida de información. A estas
conversiones explícitas de tipo se les llama _“cast”_ o _“casting”_. El _“cast”_ se hace colocando el tipo al que se desea transformar entre paréntesis, previo a la expresión a la que va a realizarse la conversión. Ejemplo:

```java
long dato1 = 1000;
long dato2 = 10000;
int resultado;
resultado = (int)(dato1*dato2);
```
Nótese en el ejemplo anterior, que dato1 y dato2 son tipo long, entonces su resultado es tipo long. Entonces como el tipo long tiene mayor capacidad que el tipo int, es necesario realizar la conversión de tipo de forma explícita para que no se presenten errores en la compilación de la aplicación.