package com.yosuke.jenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yosuke.jenkins.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
