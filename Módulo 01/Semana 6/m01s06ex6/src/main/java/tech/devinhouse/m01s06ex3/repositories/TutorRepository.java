package tech.devinhouse.m01s06ex3.repositories;

import org.springframework.stereotype.Repository;
import tech.devinhouse.m01s06ex3.models.Tutor;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TutorRepository {
    private static int sequencia = 0;
    private static List<Tutor> tutores = new ArrayList<>();

    public Tutor save(Tutor tutor){
        if (tutor.getId()==null){
            tutor.setId(generateId());
            tutores.add(tutor);
            return tutor;
        }
        Tutor tutorEdicao = findById(tutor.getId());
        tutorEdicao.setNome(tutor.getNome());
        tutorEdicao.setIdade(tutor.getIdade());
        return tutorEdicao;
    }

    public Tutor findById(Integer id){
        for (Tutor tutor : tutores){
            if(id == tutor.getId()){
                return tutor;
            }
        }
        return null;
    }
    public List<Tutor> findAll(){
        return tutores;
    }

    public boolean delete(Integer id){
        try{
            Tutor tutor = findById(id);
            tutores.remove(tutor);
        } catch (Exception e){
            return false;
        }
        return true;
    }
    private Integer generateId(){
        return ++sequencia;
    }
}
