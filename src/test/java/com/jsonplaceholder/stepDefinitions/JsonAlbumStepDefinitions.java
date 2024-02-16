package com.jsonplaceholder.stepDefinitions;

import com.jsonplaceholder.questions.albumsQuestion.ResponseAlbum;
import com.jsonplaceholder.questions.postsQuestion.ResponsePost;
import com.jsonplaceholder.tasks.albumsTask.GetManagmentAlbumsTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class JsonAlbumStepDefinitions {

    Actor manage = Actor.named("manage")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));

    @When("I consume the albums endpoint")
    public void iConsumeTheAlbumsEndpoint() {
        manage.attemptsTo(
                GetManagmentAlbumsTask.getAlbum()
        );
    }

    @Then("I will be able to see the available albums")
    public void iWillBeAbleToSeeTheAvailableAlbums() {
        manage.should(
                seeThat(
                        "The title is",
                        res -> new ResponsePost().answeredBy(manage).get(0).getTitle(),
                        equalTo("quidem molestiae enim")
                )
        );
    }
}
