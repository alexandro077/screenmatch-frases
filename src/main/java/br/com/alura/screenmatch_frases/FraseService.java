package br.com.alura.screenmatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria(){
        Frase frase = repositorio.buscarFraseAleatoria();
        return new FraseDTO(frase.getFrase(), frase.getPoster(), frase.getPersonagem(), frase.getTitulo());
    }
}
