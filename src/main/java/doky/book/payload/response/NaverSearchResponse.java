package doky.book.payload.response;


public record NaverSearchResponse(
        String title,
        String link,
        String image,
        String author,
        String discount,
        String publisher,
        String pubdate,
        String isbn,
        String description) {
}
