package com.meuprojeto.abrigopets.controller;

import com.meuprojeto.abrigopets.model.Pet;
import com.meuprojeto.abrigopets.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> listarPets(){
       return this.petService.listarPets();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPet(@PathVariable Long id){
        Pet pet = petService.buscarPorId(id);
        return ResponseEntity.ok(pet);
    }

    @PostMapping
    public Pet criarPet (@RequestBody Pet pet){
        return petService.salvarPet(pet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPet (@PathVariable Long id) {
        petService.deletarPet(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pet> updatePet(@PathVariable Long id, @RequestBody Pet pet){
        Pet updatedPet = petService.updatePet(id, pet);
        if(updatedPet != null){
            return ResponseEntity.ok(updatedPet);
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
