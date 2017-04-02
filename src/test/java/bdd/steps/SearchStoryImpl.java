package bdd.steps;

import com.jayway.restassured.path.json.JsonPath;
import jnr.ffi.annotations.In;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by bthum on 3/26/17.
 */
public class SearchStoryImpl {

    @Steps
    PersonServiceSteps personService;

    Long personId;
    JsonPath person;


    @Given("a person id $id")
    public void givenPersonId(Long id){
        this.personId =id;
    }

    @When("i make find call for for give id")
    public void makeServiceCall(){
        this.person = personService.find(this.personId);
    }

    @Then("service should return person object for given id")
    public void validateResponse(){
        Assert.assertNotNull(this.person);
        Integer id = this.person.<Integer>get("id");
        Assert.assertEquals(id.intValue(),1);
    }
}
