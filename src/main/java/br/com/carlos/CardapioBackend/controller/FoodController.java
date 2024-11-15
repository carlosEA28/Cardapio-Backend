package br.com.carlos.CardapioBackend.controller;

import br.com.carlos.CardapioBackend.DTO.FoodResponseDTO;
import br.com.carlos.CardapioBackend.entity.FoodEntity;
import br.com.carlos.CardapioBackend.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<FoodResponseDTO> getAll() {

        //Usando streams para fazer a query e transformar a entity e devolver o DTO
        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
