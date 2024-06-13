package doky.book.payload.request;


import io.swagger.v3.oas.annotations.media.Schema;

public record NaverSearchRequest(

        @Schema(name = "keyword", description = "키워드 ex) 제목, ISBN, 저자명 ,,, ", example = "클린코드")
        String keyword,

        @Schema(name = "display", description = "한 번에 표시할 검색 결과 개수(기본값: 10, 최댓값: 100)", example = "10")
        int display,

        @Schema(name = "start", description = "검색 시작 위치(기본값: 1, 최댓값: 1000)", example = "1")
        int start) {
}
