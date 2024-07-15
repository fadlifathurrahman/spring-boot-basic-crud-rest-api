package com.test.crud_spring_boot_3.repository;

import com.test.crud_spring_boot_3.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface ini digunakan untuk mengelola repositori data entitas Post.
 * Meng-extends JpaRepository untuk menggunakan metode CRUD yang sudah
 * terdiri secara otomatis.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    
}

