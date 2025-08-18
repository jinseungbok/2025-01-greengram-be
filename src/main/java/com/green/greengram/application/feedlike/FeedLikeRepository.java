package com.green.greengram.application.feedlike;

import com.green.greengram.entity.Feed;
import com.green.greengram.entity.FeedLike;
import com.green.greengram.entity.FeedLikeIds;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedLikeRepository extends JpaRepository<FeedLike, FeedLikeIds> {
    void deleteByIdFeedId(long feedId);

    List<FeedLike> findFeedLikesByFeed(Feed feed);
}