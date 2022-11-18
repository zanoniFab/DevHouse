package tech.devinhouse.m01s09springdata.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.m01s09springdata.models.Pessoa;
import tech.devinhouse.m01s09springdata.models.Tutor;
import tech.devinhouse.m01s09springdata.repositories.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {
    @Autowired private PessoaRepository pessoaRepository;
    @Autowired private TutorService tutorService;
    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    public Pessoa save(Pessoa pessoa){
        Tutor tutor;
        if (pessoa.getId() != null){
            //editando o tutor
            tutor = pessoaRepository.findByIdAndTutorIsNotNull(pessoa.getId()).getTutor();
        } else {
            //criando o tutor
            tutor = new Tutor();
        }
        tutor.setNome(pessoa.getNome());
        pessoa.setTutor(tutorService.save(tutor));
        return pessoaRepository.save(pessoa);
    }
}
