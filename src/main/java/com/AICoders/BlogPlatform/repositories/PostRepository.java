package com.AICoders.BlogPlatform.repositories;

import com.AICoders.BlogPlatform.domain.PostStatus;
import com.AICoders.BlogPlatform.domain.entities.Category;
import com.AICoders.BlogPlatform.domain.entities.Post;
import com.AICoders.BlogPlatform.domain.entities.Tag;
import com.AICoders.BlogPlatform.domain.entities.User;
import com.AICoders.BlogPlatform.services.PostService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);
    List<Post> findAllByStatusAndCategory(PostStatus status, Category category);
    List<Post> findAllByStatusAndTagsContaining(PostStatus status, Tag tag);
    List<Post> findAllByStatus(PostStatus status);
    List<Post> findAllByAuthorAndStatus(User author, PostStatus status);
}