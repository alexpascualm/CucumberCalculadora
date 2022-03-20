Feature: FactPrueba
  Probaremos la detección de números primos usando cucumber

  Scenario Outline: 
    Given Tengo Calculadora
    When Ordeno dividir a=<a> y b=<b>
    Then Division debe salir c=<c>
    
    
 Examples:
    | a | b | c |
    | 2 | 1 | 2 |
    | 20 | 5 | 4 |
    | 1 | 1 | 1 |
    | 15 | 5 | 3 |

