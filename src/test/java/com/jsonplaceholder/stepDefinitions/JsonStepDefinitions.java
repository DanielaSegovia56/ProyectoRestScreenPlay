package com.jsonplaceholder.stepDefinitions;

import com.jsonplaceholder.questions.postsQuestion.ResponsePost;
import com.jsonplaceholder.tasks.postsTask.GetManagmentPostsTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class JsonStepDefinitions {

    Actor admin = Actor.named("admin")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));


    @When("I consume the publications endpoint")
    public void iConsumeThePublicationsEndpoint() {
        admin.attemptsTo(
                GetManagmentPostsTask.GetPost()
        );
    }
    @Then("I will be able to see the available posts")
    public void iWillBeAbleToSeeTheAvailablePosts() {
        admin.should(
                seeThat(
                        "The title is",
                        res -> new ResponsePost().answeredBy(admin).get(0).getTitle(),
                        equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")
                )
        );


    }



}
