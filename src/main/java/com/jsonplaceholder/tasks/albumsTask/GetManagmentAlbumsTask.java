package com.jsonplaceholder.tasks.albumsTask;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetManagmentAlbumsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/albums").with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .header("Accept","*/*")
                                .log().all()
                )
        );
    }

    public static GetManagmentAlbumsTask getAlbum(){
        return instrumented(GetManagmentAlbumsTask.class);
    }
}
