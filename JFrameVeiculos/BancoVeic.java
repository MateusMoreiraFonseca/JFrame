package com.company.lista5;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.company.lista5.Veiculo;


/**
 *
 * @author Mateus Moreira Fonseca RA:1426885
 */

public class BancoVeic {

    private static BancoVeic banco;

    
    private final List<Passeio> bdVeiculosPasseio;
    private final List<Carga> bdVeiculosCarga;

    private BancoVeic() {
        bdVeiculosPasseio = new ArrayList<>();
        bdVeiculosCarga = new ArrayList<>();
    }

    public static BancoVeic getBanco() {
        if (banco == null) {
            banco = new BancoVeic();
        }
        return banco;
    }

    public void addVeiculoPasseio(Passeio passeio) {
        bdVeiculosPasseio.add(passeio);
    }

    public void addVeiculoCarga(Carga carga) {
        bdVeiculosCarga.add(carga);
    }

    public List<Passeio> getBdVeiculosPasseio() {
        return bdVeiculosPasseio;
    }

    public List<Carga> getBdVeiculosCarga() {
        return bdVeiculosCarga;
    }

    void excluirVeiculo(String placa) {
        // Check if the vehicle is a Passeio
        for (Passeio passeio : bdVeiculosPasseio) {
            if (passeio.getPlaca().equals(placa)) {
                bdVeiculosPasseio.remove(passeio);
                return;
            }
        }

        for (Carga carga : bdVeiculosCarga) {
            if (carga.getPlaca().equals(placa)) {
                bdVeiculosCarga.remove(carga);
                return;
            }
        }
    }
    
    void editarVeiculo(String placa) {
        // Check if the vehicle is a Passeio
        for (Passeio passeio : bdVeiculosPasseio) {
            if (passeio.getPlaca().equals(placa)) {
                bdVeiculosPasseio.remove(passeio);
                return;
            }
        }

        for (Carga carga : bdVeiculosCarga) {
            if (carga.getPlaca().equals(placa)) {
                bdVeiculosCarga.remove(carga);
                return;
            }
        }
    }
    
   static Veiculo getVeiculoByPlaca(String placa) {
    BancoVeic banco = BancoVeic.getBanco(); 
    List<Passeio> bdVeiculosPasseio = banco.getBdVeiculosPasseio();
    List<Carga> bdVeiculosCarga = banco.getBdVeiculosCarga(); 

    
    for (Passeio passeio : bdVeiculosPasseio) {
        if (passeio.getPlaca().equals(placa)) {
            return passeio;
        }
    }

   
    for (Carga carga : bdVeiculosCarga) {
        if (carga.getPlaca().equals(placa)) {
            return carga;
        }
    }

    return null; 
}

}
