package blog.storage;

import blog.exception.PostNotFoundException;
import blog.model.Post;

public interface PostStorage {

    void add(Post post);

    Post getPostsByTitle(String title) throws PostNotFoundException;

    void searchPostsByKeyword(String keyword);

    void printAllPosts();

    void printPostsByCategory(String category);



}
