package com.thefallenbrain.stayfithub.services.repository;

import com.thefallenbrain.stayfithub.services.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

}
