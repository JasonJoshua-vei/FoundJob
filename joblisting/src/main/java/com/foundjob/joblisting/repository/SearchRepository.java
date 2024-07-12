package com.foundjob.joblisting.repository;

import com.foundjob.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
