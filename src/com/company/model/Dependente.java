package com.company.model;

import java.util.Objects;

public class Dependente implements Comparable{
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    public Dependente() {
    }

    public Dependente(int id, String nome, String sobrenome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    public Dependente(int id, String nome) {

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependente that = (Dependente) o;
        return id == that.id &&
                nome.equals(that.nome) &&
                sobrenome.equals(that.sobrenome) &&
                email.equals(that.email) &&
                telefone.equals(that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sobrenome, email, telefone);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
