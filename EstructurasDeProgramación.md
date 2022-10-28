# Estructuras de Programación

Las estructuras de programación o también llamadas estructuras de control permiten implementar procesos, tomar decisiones y realizar procesos con varias repeticiones.

## Sentencias

Una expresión es un conjunto de variables unidas por operadores. Equivalen a instrucciones que el computador interpreta para realizar un proceso determinado. Una sentencia es una expresión que tiene al final _punto y coma ";"_. Es posible incluir varias sentencias en una línea, sin embargo, se considera una buena práctica utilizar una línea para cada sentencia. Ejemplo:

```java
int a;
long b;
short c;
a = 3;
b = 5;
c = -1;
```

## Comentarios

Existen dos formas diferentes de introducir comentarios entre el código de la aplicación. Los comentarios son útiles para documentar el código implementado.

Los comentarios se realizan de dos formas. La primera consiste en colocar el símbolo “//” en una línea de código y en seguida el texto del comentario. La segunda consiste en incluir el _símbolo “/*” al inicio del comentario y el símbolo “*/"_ al final del comentario. Esta segunda forma permite hacer comentarios en varias líneas. 

```java
//  Este es un comentario de una linea 

/*
    Este es un comentario
    de varias lineas 
*/
```

## Estructura de control _if_

La estructura de condición “if” se compone de una condición la cual siempre debe arrojar un valor booleano, es decir, verdadero o falso. Esta condición debe encontrarse entre paréntesis. Esta permite ejecutar un conjunto de instrucciones si se cumple la condición establecida. Este conjunto de instrucciones debe estar incluido entre los símbolos “{” y “}”. Sin embargo, si solo se desea ejecutar una instrucción no es necesario incluir los símbolos “{” y “}”. La sintaxis de esta sentencia es:

```java
// Con varias lineas de instrucciones 
if(condición){
    instrucción 1;
    instrucción 2;
    ..
    instrucción n;
}

// Con una sola instrucción
if(condición)
    instrucción;
```

Ejemplo de implementación:

```java
/* Imprime en consola el mensaje entre paréntesis en la
instrucción System.out.println() */
int n = 5;

if(n==5){ // la condición se ejecuta como verdadera
    System.out.println(“El valor de n es cinco”);
}
```

## Estructura de condición _if else_

La estructura de condición “if” “else” se compone de una condición, la cual siempre debe arrojar un valor booleano, es decir, verdadero o falso. Esta condición debe encontrarse entre paréntesis. Esta permite ejecutar un conjunto de instrucciones si se cumple la condición establecida y permite ejecutar otro conjunto de instrucciones diferentes si no se cumple la condición establecida. Este conjunto de instrucciones debe estar incluido entre los símbolos “{” y “}”. La sintaxis de esta sentencia es:

```java
if(condición){
    instrucción 1.1;
    instrucción 1.2;
    ..
    instrucción 1.n;
}else{
    instrucción 2.1;
    instrucción 2.2;
    ..
    instrucción 2.n;
}
```

Ejemplo de implementación:

```java
int n = 4;

// Se ejecutara la condición ELSE
if(n==5){
    System.out.println(“El valor de n es cinco”);
}else{
    System.out.println(“El valor de n es diferente de cinco”);
}
```

## Estructura de condición _if else if_

La estructura de condición “if” “else if” se compone de múltiples condiciones, las cuales siempre deben arrojar un valor booleano, es decir, verdadero o falso. Estas condiciones deben encontrarse entre paréntesis. Esta permite ejecutar un conjunto de instrucciones si se cumple la condición establecida y permite ejecutar otro conjunto de instrucciones diferentes, si se cumple la otra condición establecida y así sucesivamente. Este conjunto de instrucciones debe estar incluido entre los símbolos “{” y “}”. Esta estructura permite tener opcionalmente, al final una estructura _else_, la cual se ejecuta si ninguna de las condiciones fueron verdaderas. Si una condición es verdadera se ejecutan las instrucciones correspondientes y no consulta las siguientes condiciones. La sintaxis de esta sentencia es:

```java 
if(condición 1){
    instrucción 1.1;
    instrucción 1.2;
    ..
    instrucción 1.n;
}else if(condición 2){
    instrucción 2.1;
    instrucción 2.2;
    ..
    instrucción 2.n;
}else if(condición 3){
    instrucción 3.1;
    instrucción 3.2;
    ..
    instrucción 3.n;
}
```

Ejemplo de implementación:

```java
if(n==1){
    System.out.println(“El valor de n es uno”);
}else if(n==2){
    System.out.println(“El valor de n es dos”);
}else if(n==3){
    System.out.println(“El valor de n es tres”);
}else{
    System.out.println(“El valor de n es mayor que tres”);
}
```

## Estructura de condición _switch case_

La estructura de condición “switch” “case” se compone de múltiples condiciones sobre una misma variable, las cuales siempre deben arrojar un valor booleano, es decir, verdadero o falso. La variable sujeto de la condición debe encontrarse entre paréntesis, posterior a la sentencia “swich”. Los valores de la variable deben estar posterior a la sentencia “case” seguida de “:”. Posterior a cada “case” se implementan las instrucciones del proceso correspondiente. Al finalizar las instrucciones se debe colocar la sentencia _"break"_ con el fin de salir del proceso. En el caso de que no se coloque la sentencia _break_ en un proceso, se ejecutara el _"case"_ siguiente, hasta que se encuentre la sentencia _break_. 
Opcionalmente, el último caso puede contener la sentencia “default”, la cual ejecutaría el correspondiente conjunto de instrucciones si ninguno de los anteriores es verdadero. Por otro lado, la variable de la sentencia “switch” solo puede ser de tipo int o tipo char. La sintaxis de esta sentencia es:

```java
int n = 2;

switch(n){
        case 1:
        instrucción 1.1;
        instrucción 1.2;
        ..
        instrucción 1.n;
        break;
        case valor 2:
        instrucción 2.1;
        instrucción 2.2;
        ..
        instrucción 2.n;
        break;
        default:
        instrucción 3.1;
        instrucción 3.2;
        ..
        instrucción 3.n;
        break;
}
```

Ejemplo de implementación:

```java
int variable; 

switch(variable){
        case 1:
        System.out.println(“El valor de n es uno”);
        break;
        case 2:
        System.out.println(“El valor de n es dos”);
        break;
        case 3:
        System.out.println(“El valor de n es tres”);
        break;
        default:
        System.out.println(“El valor de n es mayor que tres”);
        break;
}
```

## Estructura de repetición _while_

La estructura de repetición “while" define un proceso iterativo decir, un proceso que se repetirá mientras que una condición tenga el valor verdadero. La sintaxis de esta sentencia es:

```java
while(condición) {
        instrucción 1;
        instrucción 2;
        ..
        instrucción n;
}
```

Ejemplo de implementación:

```java
int i=1;
while(i<=5) {
    System.out.println(i); //imprime los números del 1 al 5.
    i++;
}
```
Nota: es posible abortar el proceso iterativo mediante la sentencia “break”;

## Estructura de repetición _for_

Define un proceso interativo. Se compone de inicialización, condición y avance. La inicialización debe incluir al menos una variable y un valor, la condición debe involucrar la variable de inicialización con el fin de tener un mecanismo de terminar el proceso iterativo y el avance debe incluir la variable de inicialización. La sintaxis es la siguiente:

```java
for(inicialización; condición; incremento) {
    instrucción 1;
    instrucción 2;
    ..
    instrucción n;
}
```

Ejemplo de implementación:


```java
// 
for(int i=1; i<=5; i++) {
    System.out.println(i); //imprime los números del 1 al 5.
}
```

Nota: es posible abortar el proceso iterativo mediante la sentencia “break”;

## Estructura de repetición do _while_

Contiene una diferencia con respecto a la estructura “while” que consiste en que el “do” “while” primero ejecuta y luego consulta, mientras que el “while” primero consulta y luego ejecuta. La sintaxis de esta sentencia es:

```java
do{
    instrucción 1;
    instrucción 2;
    ..  
    instrucción n;
}while(condición);
```

Ejemplo de implementación_

```java
int i=1
do {
    System.out.println(i); //imprime los números del 1 al 5.
    i++;
}while(i<=5);
```

### Secuencia de escape

Una secuencia de escape es una sentencia que sirve para representar caracteres especiales. Estos caracteres inician con el símbolo “\” lo que indica que, a continuación se representa un carácter especial.

| Secuencia | Descripción |
|-|-|
| \b | BackSpace |
| \t | Tabulación |
| \n | Salto de Línea |
| \" | Comillas dobles |
| \' | Comillas Sencillas |
| \\\ | BackSlach |