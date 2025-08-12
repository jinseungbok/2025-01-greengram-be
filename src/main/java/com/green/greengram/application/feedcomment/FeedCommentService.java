package com.green.greengram.application.feedcomment;

import com.green.greengram.application.feedcomment.model.FeedCommentPostReq;
import com.green.greengram.config.model.UserPrincipal;
import com.green.greengram.entity.Feed;
import com.green.greengram.entity.FeedComment;
import com.green.greengram.entity.User;
import jakarta.persistence.GeneratedValue;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Collections;

import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeedCommentService {
    private final FeedCommentRepository feedCommentRepository;
    private final RestClient.Builder builder;

    public long postFeedComment(long signedUserId, FeedCommentPostReq req) {
        Feed feed = Feed.builder().feedId(req.getFeedId()).build();
        User user = new User();
        user.setUserId(signedUserId);
        FeedComment feedComment = FeedComment.builder()

                .feed(feed)
                .user(user)
                .comment(req.getComment())
                .build();
        feedCommentRepository.save(feedComment);
        log.info("feedComment: {}", feedComment);
        log.info("signedUserId: {}", signedUserId);
        log.info("req: {}", req);

        return feedComment.getFeedCommentId();
    }
}