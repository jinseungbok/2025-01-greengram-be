package kr.co.green.greengram.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class UserFollowIds implements Serializable {
    private Long fromUserId;
    private Long toUserId;
}
