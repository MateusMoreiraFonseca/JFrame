//Nome: Mateus Moreira Fonseca - RA: 1426885

import java.util.Scanner;

public class TstVeic {
    public static void main(String[] args) {

        Leitura leitura = new Leitura();

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o tipo de veículo:");
        System.out.println("1 - Passeio");
        System.out.println("2 - Carga");

        int tipoInt = sc.nextInt();
        String tipo;

        if (tipoInt == 1) {
            tipo = "Passeio";
        } else if (tipoInt == 2) {
            tipo = "Carga";
        } else {
            System.out.println("Tipo de veículo inválido.");
            sc.close();
            return;
        }

        Veiculo veiculo = leitura.entDados(tipo);

        if (veiculo != null) {
            
            System.out.println("\nVeículo criado: ");
            System.out.print("\nO motor possui: "+ veiculo.getQtdPistoes()+" pistoes e "+ veiculo.potencia+" HP's de potencia\n");
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("Qtd de Rodas: " + veiculo.getQtdRodas());
            System.out.println("Data de cadastro: " + veiculo.getDataCadastro());
            veiculo.calcVel();    
            
            
  
                           
           
            
            if(veiculo instanceof Passeio){
                System.out.println("\nQtd de Passageiros: " + ( ((Passeio) veiculo).getQtdePassageiro()));
            } else if(veiculo instanceof Carga){
                System.out.println("\nCapacidade: " + ((Carga) veiculo).getCargaMax());
                System.out.println("Tara: " + ((Carga) veiculo).getTara());               
            }
            
            
        } else {    
            System.out.println("Tipo de veículo inválido.");

        }       

        

        veiculo.calcular();
        sc.close();

    }
}
