package doky.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean(name = "naverWebClient")
    public WebClient naverWebClient() {

        return WebClient.builder()
                .baseUrl("https://openapi.naver.com")
                .build();
    }

    @Bean(name = "aladinWebClient")
    public WebClient aladinWebClient() {

        return WebClient.builder()
                .baseUrl("http://www.aladin.co.kr")
                .build();
    }
}