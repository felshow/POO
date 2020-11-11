package CRUD.Crud02.interfaces;

import CRUD.Crud02.entidades.Aluno;

public interface AlunoContract {
    Aluno criarAluno(Aluno aluno);          //CREATE
    String recuperarAluno();                //READ
    Aluno atualizarAluno(Aluno aluno);      //UPDATE
    boolean deletarAluno();                 //DELETE
}