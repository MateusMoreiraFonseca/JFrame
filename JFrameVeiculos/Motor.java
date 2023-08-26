package com.company.lista5;

/**
 *
 * @author Mateus Moreira Fonseca RA:1426885
 */
public class Motor {
        private int qtdPistoes;
        private int potencia;
        
        public Motor(int qtdPistoes, int potencia) {
            this.qtdPistoes = qtdPistoes;
            this.potencia = potencia;
        }
        
       
        public int getQtdPistoes() {
            return qtdPistoes;
        }
        public void setQtdPistoes(int qtdPistoes) {
            this.qtdPistoes = qtdPistoes;
        }
        public int getPotencia() {
            return potencia;
        }
        public void setPotencia(int potencia) {
            this.potencia = potencia;
        }
    }
