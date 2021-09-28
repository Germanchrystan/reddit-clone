package com.reddit.reddit.repository;

import com.reddit.reddit.model.Post;
import com.reddit.reddit.model.Subreddit;
import com.reddit.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Post, Long> {

}
