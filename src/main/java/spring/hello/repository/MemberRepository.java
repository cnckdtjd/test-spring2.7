package spring.hello.repository;

import spring.hello.domain.Member;

import javax.sound.midi.MetaMessage;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
