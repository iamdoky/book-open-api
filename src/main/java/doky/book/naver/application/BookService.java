package doky.book.naver.application;

import doky.book.naver.dto.BookResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BookService {

    @Value("${naver.api.client-id}") private String clientId;
    @Value("${naver.api.client-secret}") private String clientSecret;
    private final WebClient webClient;

    public Mono<BookResponse> search(String keyword) {
        System.out.println("Aaaa");

        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/v1/search/book.json")
                        .queryParam("query", keyword)
                        .build())
                .header("X-Naver-Client-Id", clientId)
                .header("X-Naver-Client-Secret", clientSecret)
                .retrieve()
                .bodyToMono(BookResponse.class);
    }
}
