package com.jsonplaceholder.models.albumsModel;

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
public class ResponseArrayAlbum {

    @JsonProperty("albums")
    public List<ResponseModelAlbums> albums;
}
