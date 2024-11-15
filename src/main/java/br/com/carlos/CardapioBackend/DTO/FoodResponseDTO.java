package br.com.carlos.CardapioBackend.DTO;

import br.com.carlos.CardapioBackend.entity.FoodEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;


public record FoodResponseDTO(UUID id, String title, String image, Integer price) {

    //para fazer a converção de entity para dto, usando streams, temos que criar um construtor no dto
    public FoodResponseDTO(FoodEntity foodEntity){
        this(foodEntity.getId(), foodEntity.getTitle(), foodEntity.getImage(), foodEntity.getPrice());
    }


}
