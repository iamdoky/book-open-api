package doky.book.naver.api;

import doky.book.naver.dto.BookResponse;
import doky.book.naver.application.BookService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Tag(name = "네이버 책 검색하기")
@RequestMapping("/naver/book")
@RestController
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping(value = "")
    public ResponseEntity<Mono<BookResponse>> search(
            @RequestParam(value = "keyword") String keyword) {
        return ResponseEntity.ok(bookService.search(keyword));
    }
}
