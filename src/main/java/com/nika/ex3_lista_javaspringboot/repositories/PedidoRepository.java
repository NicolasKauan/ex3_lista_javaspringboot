package com.nika.ex3_lista_javaspringboot.repositories;

import com.nika.ex3_lista_javaspringboot.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}