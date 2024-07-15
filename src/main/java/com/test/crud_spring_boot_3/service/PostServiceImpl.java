package com.test.crud_spring_boot_3.service;

import com.test.crud_spring_boot_3.model.Post;
import com.test.crud_spring_boot_3.repository.PostRepository;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

/**
 * Kelas ini adalah implementasi dari antarmuka PostService.
 * Ini menyediakan implementasi untuk operasi CRUD untuk entitas Post.
 */
@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {
    
    /**
     * Instansi PostRepository disuntikkan melalui konstruktor.
     * Ini digunakan untuk berinteraksi dengan entitas Post di database.
     */
    private PostRepository postRepository;

    /**
     * Mengambil daftar semua entitas Post.
     * 
     * @return daftar entitas Post
     */
    @Override
    public List<Post> findAll() {

        return postRepository.findAll();
    }

    /**
     * Membuat entitas Post baru.
     * Bidang createdAt diatur ke tanggal dan waktu saat ini.
     * Kemudian posting disimpan ke database.
     * 
     * @param post entitas Post yang akan dibuat
     * @return entitas Post yang dibuat
     */
    @Override
    public Post createPost(Post post) {

        post.setCreatedAt(new Date());
        return postRepository.save(post);
    }

    /**
     * Memperbarui entitas Post yang ada.
     * Bidang updatedAt diatur ke tanggal dan waktu saat ini.
     * Kemudian posting disimpan ke database.
     * 
     * @param post entitas Post yang akan diperbarui
     * @return entitas Post yang diperbarui
     */
    @Override
    public Post updatePost(Post post) {

        Post existingPost = postRepository.findById(post.getId()).get();
        existingPost.setText(post.getText());
        existingPost.setUpdatedAt(new Date());
        return postRepository.save(existingPost);
    }

    /**
     * Menghapus entitas Post berdasarkan ID-nya.
     * 
     * @param id ID dari entitas Post yang akan dihapus
     */
    @Override
    public void deletePostById(Long id){

        postRepository.deleteById(id);
    }
}
