//Nome: Mateus Moreira Fonseca - RA: 1426885

public class Carga extends Veiculo implements Calc {

    private int cargaMax;
    private int tara;

    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,int potencia,
     String dataCadastro, int tara,int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes,potencia, dataCadastro);
        this.cargaMax = cargaMax;
        this.tara=tara;
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
    
    @Override
    public int calcVel() {
        int velocMaxCmh = (getVelocMax() * 100) / 36;         
        System.out.printf("\nVelocidade máxima em cm/h: "+ velocMaxCmh);   
        return velocMaxCmh;      
    }

    @Override
    public int calcular() {
        int sum = 0;
        sum += this.qtdRodas;
        sum += this.velocMax;
        sum += this.qtdPistoes;
        sum += this.cargaMax;
        sum += this.tara;
        System.out.print("Soma dos valores: " + sum);
        return sum;
    }
}
