package com.javaspringsuite.javaspringsuite.repository;

import com.javaspringsuite.javaspringsuite.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllByUserId(Integer Id) throws Exception;
}
