package com.foundjob.joblisting.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "JobPost")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];

}
