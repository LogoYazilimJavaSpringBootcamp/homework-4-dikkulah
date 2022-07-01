package org.dikkulah.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class EmailDto implements Serializable {
    @JsonProperty("to")
    private String to;
    @JsonProperty("title")
    private String title;
    @JsonProperty("email")
    private String email;


}
