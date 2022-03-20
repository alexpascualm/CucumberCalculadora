Feature: esPrimoPrueba
  Probaremos la detección de números primos usando cucumber

  Scenario Outline: 
    Given Tengo Calculadora
    When Pregunto si el numero a=<a> es primo
    Then El resultado debe ser c=<c>
    
    
 Examples:
    | a | c |
    | 4 | 0 |
    | 3 | 1 |
    | 0 | 0 |
    | 17 | 1 |
