package doky.book.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "알라딘")
@RequestMapping("/api/aladin")
@RestController
@RequiredArgsConstructor
@Slf4j
public class AladinController {

}
