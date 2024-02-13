package com.jsonplaceholder.stepDefinitions;

import com.jsonplaceholder.models.albumsModel.ResponseModelAlbums;
import com.jsonplaceholder.questions.ResponseServerCode;
import com.jsonplaceholder.questions.albumsQuestion.ResponseAlbum;
import com.jsonplaceholder.tasks.albumsTask.GetManagmentAlbumsTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

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
        List<ResponseModelAlbums> albumnes = new ResponseAlbum().answeredBy(manage).getAlbums();
        manage.should(
                seeThat(
                        "The response complete is",
                        res ->  new ResponseAlbum().answeredBy(manage).getAlbums().get(0).getTitle(),
                        equalTo("quidem molestiae enim")
                )
        );
    }
}
