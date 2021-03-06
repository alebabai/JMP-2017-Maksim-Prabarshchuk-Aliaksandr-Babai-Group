package com.github.alebabai.jmp2k17.mvc.repository;

import com.github.alebabai.jmp2k17.mvc.domain.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Integer> {
    List<Comment> findAllByUser_Username_Containing(String filterQuery);

}
