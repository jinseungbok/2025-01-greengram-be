package com.green.greengram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class FeedPicIds implements Serializable {
    public long feedId;

    @Column(length = 50, nullable = false)
    private String pic;
}
