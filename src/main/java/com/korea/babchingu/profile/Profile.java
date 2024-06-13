package com.korea.babchingu.profile;

import com.korea.babchingu.member.Member;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profile_id;

    // 연관 관계 설정
    @OneToOne(mappedBy = "profile")
    private Member member;

    private String nickname;

    private byte[] image;

    private String sex;

    private String phone;

    private String email;

}

