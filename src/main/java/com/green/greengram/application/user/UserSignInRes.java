package com.green.greengram.application.user;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserSignInRes {
    private long userId;
    private String nickName;
    private String pic;
}