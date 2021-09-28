package com.reddit.reddit.repository;

import com.reddit.reddit.model.Post;
import com.reddit.reddit.model.Subreddit;
import com.reddit.reddit.model.User;
import com.reddit.reddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubredditRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
