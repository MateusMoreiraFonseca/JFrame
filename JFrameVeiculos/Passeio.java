package com.company.lista5;

//Nome: Mateus Moreira Fonseca - RA: 1426885

public final class Passeio extends Veiculo implements Calc {
    private int qtdePassageiro;
   
    
    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,int potencia, String dataCadastro, int qtdePassageiro) {        
        super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes,potencia, dataCadastro);
        this.qtdePassageiro = qtdePassageiro;                
    } 

    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }   

  
    
    @Override
public int calcVel() {
    int velocMaxMh = (getVelocMax() * 100) / 36;    
    System.out.printf("\nVelocidade máxima em cm/h: "+ velocMaxMh);    
    return velocMaxMh;      
}
@Override
    public int calcular() {
        int count = 0;
        count += this.placa.length();
        count += this.marca.length();
        count += this.modelo.length();
        count += this.cor.length();
        count += this.dataCadastro.length();

        count += String.valueOf(getQtdRodas()).length();
        count += String.valueOf(getVelocMax()).length();
        count += String.valueOf(getQtdPistoes()).length();
        count += String.valueOf(getPotencia()).length();

        count += String.valueOf(getQtdePassageiro()).length();        
       
        System.out.print("\nSoma das letras: " + count);
        

        return count;
    }
}


