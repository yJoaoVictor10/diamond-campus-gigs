package br.com.fiap.diamondcampusgigs.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ServiceRepository extends JpaRepository<Services, Long> {
    List<Services> findByUserUsername(String username);
}
