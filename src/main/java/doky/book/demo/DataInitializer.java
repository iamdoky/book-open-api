package doky.book.demo;

import doky.book.domain.Member;
import doky.book.domain.enums.Gender;
import doky.book.domain.enums.JoinType;
import doky.book.domain.enums.MemberStatus;
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
                                Gender.MALE,
                                "123-456-7890",
                                JoinType.NORMAL,
                                "john.doe@example.com",
                                MemberStatus.ACTIVE),
                        Member.of(
                                "Jane Smith",
                                "1985-05-15",
                                Gender.FEMALE,
                                "234-567-8901",
                                JoinType.NORMAL,
                                "jane.smith@example.com",
                                MemberStatus.INACTIVE),
                        Member.of(
                                "Alice Johnson",
                                "1992-07-23",
                                Gender.FEMALE,
                                "345-678-9012",
                                JoinType.KAKAO,
                                "alice.johnson@example.com",
                                MemberStatus.ACTIVE),
                        Member.of(
                                "Bob Brown",
                                "1988-03-12",
                                Gender.MALE,
                                "456-789-0123",
                                JoinType.NAVER,
                                "bob.brown@example.com",
                                MemberStatus.ACTIVE),
                        Member.of(
                                "Charlie Davis",
                                "1995-11-30",
                                Gender.UNDEFINED,
                                "567-890-1234",
                                JoinType.UNDEFINED,
                                "charlie.davis@example.com",
                                MemberStatus.WITHDRAW)));
    }
}
