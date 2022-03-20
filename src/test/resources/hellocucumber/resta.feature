Feature: RestaPrueba
  Probaremos la resta usando cucumber

  Scenario Outline: 
    Given Tengo Calculadora
    When Ordeno resta a=<a> y b=<b>
    Then Resta debe salir c=<c>
    
    
 Examples:
    | a | b | c |
    | 2 | 1 | 1 |
    | 6 | 3 | 3 |
    | 1 | 1 | 0 |
    | 3 | 5 | -2 |
