package com.tts.TechTalentTwitter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.apache.bcel.generic.Tag;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Tweet {


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    public class TweetService {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "tweet_id")
        private Long id;


        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "user_id")
        @OnDelete(action = OnDeleteAction.CASCADE)
        private User user;

        private List<Tag> tags;


        private String message;
        private Date createdAt;


    }
}
