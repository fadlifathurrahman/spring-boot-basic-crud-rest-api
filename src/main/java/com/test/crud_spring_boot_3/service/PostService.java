package com.test.crud_spring_boot_3.service;

import com.test.crud_spring_boot_3.model.Post;
import java.util.List;

/**
 * Interface ini mendefinisikan metode untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada entitas Post.
 * 
 */
public interface PostService {

    /**
     * Mengambil daftar semua entitas Post.
     * 
     * @return daftar entitas Post
     */
    List<Post> findAll();

    /**
     * Membuat entitas Post baru.
     * 
     * @param post entitas Post yang akan dibuat
     * @return entitas Post yang telah dibuat
     */
    Post createPost(Post post);

    /**
     * Mengupdate entitas Post yang telah ada.
     * 
     * @param post entitas Post yang akan diupdate
     * @return entitas Post yang telah diupdate
     */
    Post updatePost(Post post);

    /**
     * Menghapus entitas Post berdasarkan ID.
     * 
     * @param id ID entitas Post yang akan dihapus
     */
    void deletePostById(Long id);
}


