package doky.book.application;

import doky.book.payload.request.NaverSearchRequest;
import doky.book.payload.response.NaverBookResponse;
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

    public Mono<NaverBookResponse> search(
            NaverSearchRequest request ) {

//            String keyword,
//            int display,
//            int start) {



        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/v1/search/book.json")
                        .queryParam("query", request.keyword())
                        .queryParam("display", request.display())
                        .queryParam("start", request.display())
                        .build())
                .header("X-Naver-Client-Id", clientId)
                .header("X-Naver-Client-Secret", clientSecret)
                .retrieve()
                .bodyToMono(NaverBookResponse.class);
    }
}
