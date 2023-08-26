//Nome: Mateus Moreira Fonseca - RA: 1426885

import java.util.Scanner;

public class Leitura {
    private Scanner sc;

    public Leitura() {
        sc = new Scanner(System.in);
    }

    public Veiculo entDados(String tipo) {
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        
        System.out.print("Cor: ");
        String cor = sc.nextLine();
        
        System.out.print("Quantidade de rodas: ");
        int qtdRodas = sc.nextInt();
        
        System.out.print("Velocidade máxima em Km/h: ");
        int velocMax = sc.nextInt();      
        if (velocMax < 10 || velocMax > 250) {
        System.out.println("A velocidade está fora dos limites brasileiros. Velocidade máxima será ajustada para 100 km/h.");
        velocMax = 100;       
     }
        
        System.out.print("Quantidade de pistões: ");
        int qtdPistoes = sc.nextInt();
        
        System.out.print("Potência do motor: ");
        int potencia = sc.nextInt();
        
        System.out.print("Data de cadastro: ");
        String dataCadastro = sc.next();
        
        if (tipo.equals("Passeio")) {
            System.out.print("Número de passageiros: ");
            int qtdPassageiro = sc.nextInt();            
            return new Passeio(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes,potencia, dataCadastro,qtdPassageiro);            
        } else if (tipo.equals("Carga")) {
            System.out.print("Tara: ");
            int tara = sc.nextInt();
            System.out.print("Carga máxima: ");
            int cargaMax = sc.nextInt();            
            return new Carga(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes,potencia,dataCadastro, cargaMax, tara );
        } else {
            return null;
        }

        
    }
}
