package doky.book.domain;

import doky.book.domain.enums.JoinType;
import doky.book.payload.response.NaverSearchResponse;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
@ToString
public class Book extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "link")
    private String link;

    @Column(name = "image")
    private String image;

    @Column(name = "author")
    private String author;

    @Column(name = "discount")
    private String discount;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "pubdate")
    private String pubdate;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "description")
    private String description;

    @Column(name = "source")
    @Enumerated(EnumType.STRING)
    private JoinType source;

    @Builder
    private Book(
            String title,
            String link,
            String image,
            String author,
            String discount,
            String publisher,
            String pubdate,
            String isbn,
            String description,
            JoinType source) {

        this.title = title;
        this.link = link;
        this.image = image;
        this.author = author;
        this.discount = discount;
        this.publisher = publisher;
        this.pubdate = pubdate;
        this.isbn = isbn;
        this.description = description;
        this.source = source;
    }

    @Builder
    private Book(
            NaverSearchResponse response,
            JoinType source) {

        this.title = response.title();
        this.link = response.link();
        this.image = response.image();
        this.author = response.author();
        this.discount = response.discount();
        this.publisher = response.publisher();
        this.pubdate = response.pubdate();
        this.isbn = response.isbn();
        this.description = response.description();
        this.source = source;
    }

    public static Book of(String title,
                          String link,
                          String image,
                          String author,
                          String discount,
                          String publisher,
                          String pubdate,
                          String isbn,
                          String description,
                          JoinType source) {

        return new Book(
                title,
                link,
                image,
                author,
                discount,
                publisher,
                pubdate,
                isbn,
                description,
                source);
    }

    public static Book of(NaverSearchResponse response, JoinType source) {
        return new Book(response, source);
    }
}
