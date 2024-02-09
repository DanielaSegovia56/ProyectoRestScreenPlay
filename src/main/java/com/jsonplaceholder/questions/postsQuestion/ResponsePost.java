package com.jsonplaceholder.questions.postsQuestion;

import com.jsonplaceholder.models.postModel.ResponseArrayPost;
import com.jsonplaceholder.models.postModel.ResponseModelPost;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;

public class ResponsePost implements Question<Object> {

    @Override
    public Object answeredBy(Actor actor) {
       return SerenityRest.lastResponse().as(ResponseArrayPost.class);
    }

    public static ResponsePost was(){
        return new ResponsePost();
    }
}
