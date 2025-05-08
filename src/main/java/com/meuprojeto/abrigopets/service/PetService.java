package com.meuprojeto.abrigopets.service;

import com.meuprojeto.abrigopets.exceptions.RecursoNaoEncontradoException;
import com.meuprojeto.abrigopets.model.Pet;
import com.meuprojeto.abrigopets.repository.PetRepository;
import org.springframework.stereotype.Service;
import com.meuprojeto.abrigopets.exceptions.RecursoNaoEncontradoException;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> listarPets() {
        return petRepository.findAll();
    }

    public Pet buscarPorId(Long id) {
        return petRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Pet com ID " + id + " não encontrado"));
    }

    public Pet salvarPet(Pet pet) {
        return petRepository.save(pet);
    }

    public void deletarPet(Long id) {
        if (petRepository.existsById(id)){
            petRepository.deleteById(id);
        }
        else{
            throw new RecursoNaoEncontradoException("Pet com ID " + id + " não encontrado");
        }
    }

    public Pet updatePet(Long id, Pet petDetails){
        Optional<Pet> petOptional = petRepository.findById(id);
        if(petOptional.isPresent()) {
            Pet pet = petOptional.get();

        pet.setNome(petDetails.getNome());
        pet.setIdade(petDetails.getIdade());
        pet.setRaca(petDetails.getRaca());

        return  petRepository.save(pet);
        } else {
            throw new RecursoNaoEncontradoException("Pet com ID: " + id + " não encontrado");
        }
    }
}
