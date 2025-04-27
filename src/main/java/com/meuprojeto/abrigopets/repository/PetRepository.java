    package com.meuprojeto.abrigopets.repository;

    import com.meuprojeto.abrigopets.model.Pet;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface PetRepository extends JpaRepository<Pet, Long> {

    }
