package com.clone.springredditclone.repository;

import com.clone.springredditclone.model.Post;
import com.clone.springredditclone.model.User;
import com.clone.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentuser);
}
