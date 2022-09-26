package com.spring.backend.utils.validations;

import com.spring.backend.utils.exceptions.RequestException;
import org.springframework.http.HttpStatus;

public class Validation_tiporol {
    public Validation_tiporol(){

    }

    public void existe(Boolean ban){
        if(!ban){
            throw new RequestException("No existes el tipo", "p-1001", HttpStatus.BAD_REQUEST);
        }
    }

    public void ValidacionCadena(String cadena) {

        if(cadena.length()==0){
            throw new RequestException("Campo nombre vacio", "p-1", HttpStatus.BAD_REQUEST);
        }

        if(!(cadena.length()>5 && cadena.length()<17)){
            throw new RequestException("Campo nombre debe contener entre 6 a 16 caracteres", "p-2", HttpStatus.BAD_REQUEST);
        }



    }
}
