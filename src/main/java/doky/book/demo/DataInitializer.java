package doky.book.demo;

import doky.book.domain.Member;
import doky.book.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {

        memberRepository.saveAll(
                List.of(
                        Member.of(
                                "John Doe",
                                "1990-01-01",
                                "Male",
                                "123-456-7890",
                                "/path/to/resource",
                                "john.doe@example.com",
                                "active"),
                        Member.of(
                                "Jane Smith",
                                "1985-05-15",
                                "Female",
                                "234-567-8901",
                                "/path/to/another",
                                "jane.smith@example.com",
                                "inactive"),
                        Member.of(
                                "Alice Johnson",
                                "1992-07-23",
                                "Female",
                                "345-678-9012",
                                "/path/to/something",
                                "alice.johnson@example.com",
                                "active"),
                        Member.of(
                                "Bob Brown",
                                "1988-03-12",
                                "Male",
                                "456-789-0123",
                                "/path/to/somewhere",
                                "bob.brown@example.com",
                                "pending"),
                        Member.of(
                                "Charlie Davis",
                                "1995-11-30",
                                "Male",
                                "567-890-1234",
                                "/path/to/unknown",
                                "charlie.davis@example.com",
                                "active")));
    }
}
