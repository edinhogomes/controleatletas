package controleatleta;

import java.util.ArrayList;

public class JogadorVolei extends Atleta {

    private CategoriaJogadorVolei categoria; // A=Amador P=Profissional
    private ArrayList<Premiacao> premiacoes;
    private String nacionalidade; // País de nascimento
    private String apelido;
    private Double alturaAtaque; // Em m
    private Double alturaBloqueio;// Em m
    private String lateralidade;// Canhoto ou Destro
    private String posicao;
    
    

    public JogadorVolei(String nome) {
        super(nome);
    }

    public CategoriaJogadorVolei getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaJogadorVolei categoria) {
        this.categoria = categoria;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String pais) {
        this.nacionalidade = pais;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Double getAlturaAtaque() {
        return alturaAtaque;
    }

    public void setAlturaAtaque(Double altura) {
        this.alturaAtaque = altura;
    }

    public Double getAlturaBloqueio() {
        return alturaBloqueio;
    }

    public void setAlturaBloqueio(Double altura) {
        this.alturaBloqueio = altura;
    }

    public String getLateralidade() {
        return lateralidade;
    }

    public void setLateralidade(String lateralidade) {
        this.lateralidade = lateralidade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

 }