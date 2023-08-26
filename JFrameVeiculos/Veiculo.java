package com.company.lista5;

//Nome: Mateus Moreira Fonseca - RA: 1426885

public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String cor;

    protected int qtdRodas;
    protected int velocMax;
    protected int qtdPistoes;
    protected int potencia;

    protected String dataCadastro;

    protected int qtdePassageiro;
    protected int cargaMax;
    protected int tara;

    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,int potencia, String dataCadastro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;

        this.velocMax = velocMax;

        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
        this.dataCadastro = dataCadastro;

    }

    public String getPlaca() {
        return placa;
    }

    public final void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public final void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdPistoes() {
        return qtdPistoes;
    }

    public final void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }

    public int getPotencia() {
        return potencia;
    }

    public final void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public final void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getQtdPassageiro() {
        return qtdePassageiro;
    }

    public void setQtdPassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public abstract int calcVel();

    public int calcular() {
        return 0;
    }

    Object getAno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
