package doky.book.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "birth")
    private String birth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "path")
    private String path;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private String status;

    @Builder
    private Member(
            String name,
            String birth,
            String gender,
            String phone,
            String path,
            String email,
            String status) {

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
            String gender,
            String phone,
            String path,
            String email,
            String status) {

        return new Member(name, birth, gender, phone, path, email, status);
    }
}
