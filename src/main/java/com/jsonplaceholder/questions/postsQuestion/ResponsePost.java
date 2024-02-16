package com.jsonplaceholder.questions.postsQuestion;

import com.jsonplaceholder.models.postModel.ResponseModelPost;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;


public class ResponsePost implements Question<List<ResponseModelPost>> {

    @Override
    public List<ResponseModelPost> answeredBy(Actor actor) {
        return Arrays.asList(SerenityRest.lastResponse().as(ResponseModelPost[].class));
    }

    public static ResponsePost was(){
        return new ResponsePost();
    }
}
