package com.green.greengram.application.feed.model;

import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FeedGetReq {
    @Positive
    private int page;
    @Positive
    private int rowPerPage;
}