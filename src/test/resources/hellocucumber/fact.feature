Feature: FactPrueba
  Probaremos el cálculo de factorial usando cucumber

  Scenario Outline: 
    Given Tengo Calculadora
    When Ordeno encontrar el factorial de a=<a>
    Then Factorial debe salir c=<c>
    
    
 Examples:
    | a | c |
    | 2 | 2 |
    | 3 | 6 |
    | 4 | 24 |
    | 5 | 120 |
