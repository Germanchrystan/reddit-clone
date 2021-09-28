package com.reddit.reddit.repository;

import com.reddit.reddit.model.Post;
import com.reddit.reddit.model.Subreddit;
import com.reddit.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
