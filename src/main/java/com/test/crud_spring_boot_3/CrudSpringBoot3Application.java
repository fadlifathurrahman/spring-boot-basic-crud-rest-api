package com.test.crud_spring_boot_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Kelas ini adalah titik masuk aplikasi.
 * Ia dipenuhi dengan anotasi @SpringBootApplication untuk mengaktifkan auto-configuration dan pencarian komponen.
 * Metode utama digunakan untuk memulai aplikasi Spring Boot.
 */
@SpringBootApplication
public class CrudSpringBoot3Application {

    /**
     * Metode utama adalah titik masuk aplikasi.
     * Ia digunakan untuk memulai aplikasi Spring Boot.
     * @param args parameter argument baris perintah
     */
    public static void main(String[] args) {
        SpringApplication.run(CrudSpringBoot3Application.class, args);
    }
}

