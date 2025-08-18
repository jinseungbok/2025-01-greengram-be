package com.green.greengram.application.feed;

import com.green.greengram.application.feed.model.FeedGetDto;
import com.green.greengram.application.feed.model.FeedGetRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FeedMapper {
    List<FeedGetRes> findAllLimitedTo(FeedGetDto dto);
    List<String> findAllPicByFeedId(long feedId);
}