package br.com.carlos.CardapioBackend.entity;

import br.com.carlos.CardapioBackend.DTO.FoodRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")//indica que o id é uma reprensentação única dessa entity
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;
    private String image;
    private Integer price;

    public FoodEntity(FoodRequestDTO foodRequestDTO) {
        this.image = foodRequestDTO.image();
        this.price = foodRequestDTO.price();
        this.title = foodRequestDTO.title();
    }
}
