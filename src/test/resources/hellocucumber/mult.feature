
Feature: MultPrueba
  Probaremos la multiplicación usando cucumber

  Scenario Outline: 
    Given Tengo Calculadora
    When Ordeno multiplicar a=<a> y b=<b>
    Then Multiplicacion debe salir c=<c>
    
    
 Examples:
    | a | b | c |
    | 1 | 2 | 2 |
    | 4 | 5 | 20 |
    | 1 | 1 | 1 |
    | 3 | 5 | 15 |
