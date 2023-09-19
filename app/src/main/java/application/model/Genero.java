package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="generos")
public class Genero{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private int id;
    private String nome;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNome(){
return nome;
    }
    public void (String nome){
        this.nome=nome;
    }
    }