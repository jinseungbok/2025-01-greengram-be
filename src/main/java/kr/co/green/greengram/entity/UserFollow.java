package kr.co.green.greengram.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class UserFollow extends CreatedAt {
    @EmbeddedId
    private UserFollowIds userFollowIds; // 복합키 설정

    // 관계 설정 (Foreign key 설정)
    @ManyToOne
    @MapsId("fromUserId")
    @JoinColumn(name = "from_User_Id")
    private User fromUser;

    @ManyToOne
    @MapsId("toUserId")
    @JoinColumn(name = "to_User_Id")
    private User toUser;
}
