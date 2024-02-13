package com.jsonplaceholder.questions.albumsQuestion;

import com.jsonplaceholder.models.albumsModel.ResponseArrayAlbum;
import com.jsonplaceholder.models.postModel.ResponseArrayPost;
import com.jsonplaceholder.questions.postsQuestion.ResponsePost;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponseAlbum implements Question<ResponseArrayAlbum> {
    @Override
    public ResponseArrayAlbum answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponseArrayAlbum.class);
    }

    public static ResponseAlbum was(){
        return new ResponseAlbum();
    }
}
