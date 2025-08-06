package kr.co.green.greengram.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class UserRole {
    @EmbeddedId
    private UserRoleIds userRoleIds;

    // 관계 설정
    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_Id")
    private User user;
}
