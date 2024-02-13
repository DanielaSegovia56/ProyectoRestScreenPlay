package com.jsonplaceholder.questions.postsQuestion;

import com.jsonplaceholder.models.postModel.ResponseArrayPost;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ResponsePost implements Question<ResponseArrayPost> {

    @Override
    public ResponseArrayPost answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponseArrayPost.class);
    }

    public static ResponsePost was(){
        return new ResponsePost();
    }
}
