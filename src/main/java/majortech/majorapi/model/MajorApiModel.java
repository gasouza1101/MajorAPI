package majortech.majorapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Major")
public class MajorApiModel {
    @Id
    public int id;

    @Column(nullable = false, length = 50)
    public String nome;

    @Column(nullable = false, length = 50)
    public long fundos;

    @Column(nullable = false, length = 50)
    public String cidade;

    public MajorApiModel(String nome){
        setNome(this.nome);
        setId(this.id++);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getFundos() {
        return fundos;
    }

    public void setFundos(long fundos) {
        this.fundos = fundos;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
