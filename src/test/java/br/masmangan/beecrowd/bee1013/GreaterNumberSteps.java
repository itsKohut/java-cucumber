package br.masmangan.beecrowd.bee1013;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class GreaterNumberSteps {

    private final GreaterNumber greaterNumber = new GreaterNumber();
    private int actual;

    @Given("first number is {int}")
    public void first_number_is(int a) {
        greaterNumber.setA(a);
    }
    @Given("second number is {int}")
    public void second_number_is(int b) {
        greaterNumber.setB(b);
    }
    @Given("third number is {int}")
    public void third_number_is(int c) {
        greaterNumber.setC(c);
    }
    @When("GreaterNumber is calculated")
    public void greater_is_calculated() {
        actual = greaterNumber.getGreater();
    }
    @Then("result should be {int}")
    public void result_should_be(int expected) {
        assertEquals(expected, actual);
    }
}
