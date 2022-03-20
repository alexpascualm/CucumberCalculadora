package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	private Calculadora c;
	private double a,b,resultado;
	private boolean bool;
	 @Given("Tengo Calculadora")
	    public void Tengo_Calculadora() {
	        c=new Calculadora();
	    }

	 @When("Ordeno sumar a={int} y b={int}")
	 public void ordeno_sumar_a_y_b(Integer int1, Integer int2) {
	     // Write code here that turns the phrase above into concrete actions
		 this.a=int1;
		 this.b=int2;
		 this.resultado=c.suma(a,b);
	     
	 }


	    @Then("Suma debe salir c={double}")
	    public void Suma_debe_salir_c(double result) {
	    	assertEquals(result,resultado);
	        
	    }
	    @When("Ordeno resta a={int} y b={int}")
		 public void ordeno_resta_a_y_b(Integer int1, Integer int2) {
		     // Write code here that turns the phrase above into concrete actions
			 this.a=int1;
			 this.b=int2;
			 this.resultado=c.resta(a,b);
		     
		 }
	    @Then("Resta debe salir c={double}")
	    public void Resta_debe_salir_c(double result) {
	    	assertEquals(result,resultado);
	        
	    }
	    @When("Ordeno multiplicar a={int} y b={int}")
		 public void ordeno_multiplicar_a_y_b(Integer int1, Integer int2) {
		     // Write code here that turns the phrase above into concrete actions
			 this.a=int1;
			 this.b=int2;
			 this.resultado=c.mult(a,b);
		     
		 }
	    @Then("Multiplicacion debe salir c={double}")
	    public void multiplicacion_debe_salir_c(double result) {
	    	assertEquals(result,resultado);
	    }
	    @When("Ordeno dividir a={int} y b={int}")
		 public void ordeno_dividir_a_y_b(Integer int1, Integer int2) {
		     // Write code here that turns the phrase above into concrete actions
			 this.a=int1;
			 this.b=int2;
			 this.resultado=c.divide(a,b);
		     
		 }
	    @Then("Division debe salir c={double}")
	    public void divison_debe_salir_c(double result) {
	    	assertEquals(result,resultado);
	    }
	    @When("Ordeno encontrar el factorial de a={int}")
		 public void ordeno_encontrar_el_factorial_de_a(Integer int1) {
		     // Write code here that turns the phrase above into concrete actions
			  this.resultado=c.fact(int1);
		     
		 }
	    @Then("Factorial debe salir c={double}")
	    public void factorial_debe_salir_c(double result) {
	    	assertEquals(result,resultado);
	    }
	    @When("Pregunto si el numero a={int} es primo")
		 public void pregunto_si_el_numero_a_es_primo(Integer int1) {
		     // Write code here that turns the phrase above into concrete actions
			  this.bool=c.esPrimo(int1);
		     
		 }
	    @Then("El resultado debe ser c={int}")
	    public void el_resultado_debe_ser_c(double result) {
	    	if(result==0) {
	    		assertFalse(bool);
	    	}if(result==1) {
	    		assertTrue(bool);
	    	}
	    }


}
