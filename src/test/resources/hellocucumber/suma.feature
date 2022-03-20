
Feature: SumaPrueba
  Probaremos la suma usando cucumber

  Scenario Outline: 
    Given Tengo Calculadora
    When Ordeno sumar a=<a> y b=<b>
    Then Suma debe salir c=<c>
    
    
 Examples:
    | a | b | c |
    | 1 | 2 | 3 |
    | 4 | 5 | 9 |
    | 1 | 1 | 2 |
    | 3 | 5 | 8 |