package com.test.crud_spring_boot_3.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

import lombok.Data;

import java.util.Date;

/**
 * Class untuk merepresentasikan entitas "posts" dalam database.
 */
@Data // Lombok annotation untuk mengenerate getters dan setters
@Entity // JPA annotation untuk menandai bahwa kelas ini adalah entitas
@Table(name = "posts") // JPA annotation untuk menentukan nama tabel dalam database
public class Post {
    
    /**
     * Id unik dari post.
     */
    @Id // JPA annotation untuk menandai bahwa field ini adalah primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA annotation untuk mengenerate primary key secara otomatis
    private Long id;

    /**
     * Teks dari post.
     */
    @Column // JPA annotation untuk menandai bahwa field ini adalah kolom dalam tabel
    private String text;

    /**
     * Waktu saat post dibuat.
     */
    @Column // JPA annotation untuk menandai bahwa field ini adalah kolom dalam tabel
    private Date createdAt;

    /**
     * Waktu saat post terakhir diperbarui.
     */
    @Column // JPA annotation untuk menandai bahwa field ini adalah kolom dalam tabel
    private Date updatedAt;
}

