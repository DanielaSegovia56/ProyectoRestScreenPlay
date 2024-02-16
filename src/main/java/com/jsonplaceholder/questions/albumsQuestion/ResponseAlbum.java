package com.jsonplaceholder.questions.albumsQuestion;


import com.jsonplaceholder.models.albumsModel.ResponseModelAlbums;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;

public class ResponseAlbum implements Question<List<ResponseModelAlbums>> {
    @Override
    public List<ResponseModelAlbums> answeredBy(Actor actor) {
        return Arrays.asList(SerenityRest.lastResponse().as(ResponseModelAlbums[].class));
    }

    public static ResponseAlbum was(){
        return new ResponseAlbum();
    }
}
