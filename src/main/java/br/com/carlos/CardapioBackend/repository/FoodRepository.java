package br.com.carlos.CardapioBackend.repository;

import br.com.carlos.CardapioBackend.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<FoodEntity, UUID> {
}
