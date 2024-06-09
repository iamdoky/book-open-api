package doky.book.domain;

import doky.book.domain.enums.Gender;
import doky.book.domain.enums.JoinType;
import doky.book.domain.enums.MemberStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
@ToString
public class Member extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "birth")
    private String birth;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "path")
    @Enumerated(EnumType.STRING)
    private JoinType path;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @Builder
    private Member(
            String name,
            String birth,
            Gender gender,
            String phone,
            JoinType path,
            String email,
            MemberStatus status) {

        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
        this.path = path;
        this.email = email;
        this.status = status;
    }

    public static Member of(
            String name,
            String birth,
            Gender gender,
            String phone,
            JoinType path,
            String email,
            MemberStatus status) {

        return new Member(name, birth, gender, phone, path, email, status);
    }
}
