package com.techprudent.springbootrestcrud.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_teste")
public class Teste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "O campo 'nome' é obrigatório")
    @ApiModelProperty(value = "campo nome", required = true)
    @Column(name = "name",length = 100)
    private String nome;

    @Column(name = "email",length = 80)
    private String email;

    @Column(name = "phone",nullable = false,length =100)
    private String telefone;

    public Teste(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Teste() {

    }
}
