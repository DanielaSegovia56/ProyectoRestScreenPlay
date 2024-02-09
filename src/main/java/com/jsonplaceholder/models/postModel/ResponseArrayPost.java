package com.jsonplaceholder.models.postModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ResponseArrayPost {
    @JsonProperty("posts")
    public List<ResponseModelPost> posts;

}
