package com.jsonplaceholder.tasks.postsTask;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetManagmentPostsTask implements Task {
    //desde la task se consume el servicio

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/posts").with(
                        req -> req
                                .contentType(ContentType.JSON)
                                .header("Accept","*/*")
                                .log().all()
                )
        );

    }

    public static GetManagmentPostsTask GetPost(){
        return instrumented(GetManagmentPostsTask.class);
    }
}
