package com.jsonplaceholder.models.albumsModel;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseModelAlbums {

    @JsonProperty("userId")
    public Integer userId;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("title")
    public String title;
}
