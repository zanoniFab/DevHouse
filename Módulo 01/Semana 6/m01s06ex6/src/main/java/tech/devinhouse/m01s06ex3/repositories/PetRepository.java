package tech.devinhouse.m01s06ex3.repositories;

import org.springframework.stereotype.Repository;
import tech.devinhouse.m01s06ex3.models.Pet;


import java.util.ArrayList;
import java.util.List;

@Repository
public class PetRepository {
    private static int sequencia = 0;
    private static List<Pet> pets = new ArrayList();

    public Pet save(Pet pet) {
        if (pet.getId() == null) {
            pet.setId(generateId());
            pets.add(pet);
            return pet;
        }
        Pet petEdicao = findById(pet.getId());
        petEdicao.setNome(pet.getNome());
        petEdicao.setIdade(pet.getIdade());
        petEdicao.setTipo(pet.getTipo());
        petEdicao.setRaca(pet.getRaca());
        petEdicao.setAlimentoPreferido(pet.getAlimentoPreferido());
        petEdicao.setTutor(pet.getTutor());
        return petEdicao;
    }

    public List<Pet> findAll() {
        return pets;
    }
    public boolean delete(Integer id){
        try{
            Pet pet = findById(id);
            pets.remove(pet);
        } catch (Exception e){
            return false;
        }
        return true;
    }
    public Pet findById(Integer id) {
        for (Pet pet : pets) {
            if (id == pet.getId()) {
                return pet;
            }
        }
        return null;
    }

    private Integer generateId() {
        return ++sequencia;
    }


}
