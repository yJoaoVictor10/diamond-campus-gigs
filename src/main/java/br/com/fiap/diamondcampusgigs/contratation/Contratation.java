package br.com.fiap.diamondcampusgigs.contratation;

import br.com.fiap.diamondcampusgigs.service.Services;
import br.com.fiap.diamondcampusgigs.user.Users;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contratation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "contratante_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Services service;
}