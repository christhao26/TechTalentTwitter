package com.tts.TechTalentTwitter.services;



import com.tts.TechTalentTwitter.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TweetService {


    private Long id;
    private User user;


    private String message;
    private Date createdAt;

}
