# Operadores

Existen diferentes tipos de operadores que permiten realizar diferentes procesos. Estos operadores se clasifican en _Aritméticos, de Asignación, Lógicos, y de comparación._

## _Operadores Aritméticos_

Estos resuelven operaciones básicas de _suma, resta, multiplicación, división y/o modulo_ el cual entrega el residuo de la división.

Estos operadores se pueden aplicar a variables numéricas. Sin embargo, el operador suma se puede aplicar a variables que contengan cadenas de carácteres generando concatenación de la información.

Existen operadores especiales, _incremento y decrementeo_, que permiten sumas y restar el valor "1" respectivamente a la variable.

TABLA DE SÍMBOLOS:

| OPERADOR | SÍMBOLO | IMPLEMENTACIÓN |
|----------|---------|----------------|
| Suma | + | A __+__ B |
| Resta | - | A __-__ B |
| Multiplicación | * | A __*__ B |
| División | / | A __/__ B |
| Módulo | % | A __%__ B |
| Incremento | ++ | A __++__ |
| Decremento | -- | A __--__ |

## Operadores de _Asignación_

Los operadores de Asiganación permiten depositar un valor en una variable. En muchos casos es necesario realizar una operación aritmética de dos variables, cuyo resultado debe depositarse en una de esas variables. Para estos casos, también se puede aplicar un operador especial. Los símbolos de los operadores son los siguientes:

| Operador | Símbolo | Implementación |
|----------|---------|----------------|
| Asignación | = | A __=__ 10 |
| Asignación con Suma | + = | A __+=__ B  es igual a:  A=A+B |
| Asignación con Resta | - = | A __-=__ B es igual a: A=A-B |
| Asignación con Multiplicación | * = | A __*=__ B es igual a: A=A*B |
| Asignación con División | / = | A __/=__ B es igual a: A=A/B |
| Asignación con Módulo | %= | A __%=__ B es igual a: A=A%B |

## Operadores _Lógicos_

Estos resuelven operaciones booleanas. El resultado de estas operaciones será siempre verdadero _"true"_ o falso _"false"_. Las operaciones booleanas básicas son: __AND, OR y NOT__.

La operación __NOT__, se aplica siempre sobre una premisa, que en un lenguaje de programación Estará descrita en una variable booleana. Esta operación consiste en cambiar el valor de la premisa de falso a verdadero o viceversa. El comportamiento de esta operación lógica se define asi:

| Entrada | NOT |
|-|-|
|Falso | verdadero |
|verdadero | falso |

La operación lógica _AND_, indica que la salida será verdadera si y solo si, todas sus entradas son verdaderas. El comportamiento de esta operación lógica se define asi:

| Entrada 1 | Entrada 2 | AND |
|-|-|-|
| Falso | Falso | Falso |
| Falso | Verdadero | Falso |
| Verdadero | Falso | Falso |
| Verdadero | Verdadero | Verdadero |

La operación lógica OR, indica que la salida será falsa si y solo si, todas sus entradas son falsas. El comportamiento de esta operación lógica se defina asi:

| Entrada 1 | Entrada 2 | NOT |
|-|-|-|
| Falso | Falso | Falso |
| Falso | Verdadero | Verdadero |
| Verdadero | Falso | Verdadero |
| Verdadero | Verdadero | Verdadero |

La operación lógica XOR, indica que la salida será verdadera si el número de entradas verdaderas es impar. El comportamiento de esta operación lógica se define asi:

| Entrada 1 | Entrada 2 | NOT |
|-|-|-|
| Falso | Falso | Falso |
| Falso | Verdadero | Verdadero |
| Verdadero | Falso | Verdadero |
| Verdadero | Verdadero | Falso |

Los símbolos de las operaciones lógicas son:
| Operador | Símbolo | Implementación | Descripción |
|-|-|-|-|
| NOT | ! | !A | Negación |
| AND | && | A && B | Si __A__ es falso, no se evalúa __B__ |
| OR | / / | A __/ /__ B | Si __A__ es verdadero, no se evalúa __B__ |

## Operadores de _Comparación_

Permiten la verificación de dos variables, determinando si una de ellas es mayor, igual, menor o diferente de la otra. El resultado de estas operaciones será siempre verdadero "true" o falso "false". Los símbolos de las operaciones de son los siguientes:

| Operador | Símbolo | Implementación |
|-|-|-|
| Igual | == | A == B |
| Diferente | != | A != B |
| Mayor | > | A > B |
| Menor | < | A < B |
| Mayor-Igual | >= | A >= B |
| Menor-Igual | <= | A <= B |
  