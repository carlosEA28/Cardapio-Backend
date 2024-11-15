package br.com.carlos.CardapioBackend.controller;

import br.com.carlos.CardapioBackend.DTO.FoodRequestDTO;
import br.com.carlos.CardapioBackend.DTO.FoodResponseDTO;
import br.com.carlos.CardapioBackend.entity.FoodEntity;
import br.com.carlos.CardapioBackend.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {

        //Usando streams para fazer a query e transformar a entity e devolver o DTO
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO foodRequestDTO) {

        FoodEntity foodData = new FoodEntity(foodRequestDTO);
        foodRepository.save(foodData);
        return;
    }
}
