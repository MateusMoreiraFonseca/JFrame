/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.lista5;

import javax.swing.JOptionPane;


/**
 *
 * @author Mateus Moreira Fonseca RA:1426885
 */

public class EditarCarga extends javax.swing.JFrame {


    public EditarCarga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes, int potencia, String dataCadastro,int tara,int cargaMax) {
        initComponents();

       
        cxPlaca.setText(placa);
        cxPlaca.setEnabled(false);
        cxMarca.setText(marca);
        cxModelo.setText(modelo);
        cxCor.setText(cor);
        cxRodas.setText(String.valueOf(qtdRodas));
        cxVelocidade.setText(String.valueOf(velocMax));
        cxPistoes.setText(String.valueOf(qtdPistoes));
        cxPotencia.setText(String.valueOf(potencia));
        cxData.setText(dataCadastro);
        cxTara.setText(String.valueOf(tara));
        cxCargaMax.setText(String.valueOf(cargaMax));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLimpar = new javax.swing.JButton();
        bSalvarContinuar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        rotMarca = new javax.swing.JLabel();
        cxCor = new javax.swing.JTextField();
        rotCor = new javax.swing.JLabel();
        cxPotencia = new javax.swing.JTextField();
        rotData = new javax.swing.JLabel();
        cxVelocidade = new javax.swing.JTextField();
        rotVelocidade = new javax.swing.JLabel();
        cxPistoes = new javax.swing.JTextField();
        rotPistoes = new javax.swing.JLabel();
        cxData = new javax.swing.JTextField();
        rotPotencia = new javax.swing.JLabel();
        cxRodas = new javax.swing.JTextField();
        rotRodas = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        cxPlaca = new javax.swing.JTextField();
        cxCargaMax = new javax.swing.JTextField();
        rotPlaca = new javax.swing.JLabel();
        cxTara = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        rotTara = new javax.swing.JLabel();
        rotModelo = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLimpar.setText("Limpar");
        bLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLimparMouseClicked(evt);
            }
        });

        bSalvarContinuar.setText("Salvar e Voltar");
        bSalvarContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSalvarContinuarMouseClicked(evt);
            }
        });
        bSalvarContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarContinuarActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        rotMarca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotMarca.setText("Marca(txt)");

        rotCor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotCor.setText("Cor(txt)");

        rotData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotData.setText("Data Cadastro(txt)");

        rotVelocidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotVelocidade.setText("Velocidade Max(int)");

        rotPistoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotPistoes.setText("Qtd. Pistoes(int)");

        cxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDataActionPerformed(evt);
            }
        });

        rotPotencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotPotencia.setText("Potencia Motor(int)");

        rotRodas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotRodas.setText("Qtd. Rodas(int)");

        rotNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotNome.setText("Carga Max(int)");

        cxCargaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCargaMaxActionPerformed(evt);
            }
        });

        rotPlaca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotPlaca.setText("Placa(txt)");

        rotTara.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotTara.setText("Tara(int)");

        rotModelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotModelo.setText("Modelo(txt)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                .addComponent(bSalvarContinuar))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cxPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotCor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotRodas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxRodas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxTara, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotTara, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCargaMax, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(Sair))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sair)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotPotencia)
                            .addComponent(rotPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotMarca)
                            .addComponent(rotVelocidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotModelo)
                            .addComponent(rotPistoes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotCor)
                            .addComponent(rotData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotRodas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotTara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(rotNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxCargaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvarContinuar)
                    .addComponent(bLimpar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalvarContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarContinuarActionPerformed

        String placa = cxPlaca.getText();

        String marca = cxMarca.getText();
        String modelo = cxModelo.getText();
        String cor = cxCor.getText();
        int qtdRodas = Integer.parseInt(cxRodas.getText());
        int velocMax = Integer.parseInt(cxVelocidade.getText());
        int qtdPistoes = Integer.parseInt(cxPistoes.getText());
        int potencia = Integer.parseInt(cxPotencia.getText());
        String dataCadastro = cxData.getText();
        int tara = Integer.parseInt(cxTara.getText());
        int cargaMax = Integer.parseInt(cxCargaMax.getText());

        BancoVeic banco = BancoVeic.getBanco();
        Veiculo veiculo = banco.getVeiculoByPlaca(placa); 

        if (veiculo != null) {
      
            veiculo.setMarca(marca);
            veiculo.setModelo(modelo);
            veiculo.setCor(cor);
            veiculo.setQtdRodas(qtdRodas);
            veiculo.setVelocMax(velocMax);
            veiculo.setQtdPistoes(qtdPistoes);
            veiculo.setPotencia(potencia);
            veiculo.setDataCadastro(dataCadastro);
            veiculo.setTara(tara);
            veiculo.setCargaMax(cargaMax);

            ConsultaCarga consultaCarga  = new ConsultaCarga ();
            consultaCarga .setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Veículo não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bSalvarContinuarActionPerformed

    private void bSalvarContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarContinuarMouseClicked


    }//GEN-LAST:event_bSalvarContinuarMouseClicked

    private void bLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLimparMouseClicked
        limpar();
    }//GEN-LAST:event_bLimparMouseClicked

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
        Principal principal = Principal.getInstance();
        principal.setVisible(true);
    }//GEN-LAST:event_SairActionPerformed

    private void cxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDataActionPerformed

    private void cxCargaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCargaMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCargaMaxActionPerformed

    public void limpar() {
        
        cxModelo.setText("");
        cxMarca.setText("");
        cxCor.setText("");
        cxRodas.setText("");
        cxVelocidade.setText("");
        cxPistoes.setText("");
        cxPotencia.setText("");
        cxData.setText("");
        cxTara.setText("");
        cxCargaMax.setText("");
        cxPlaca.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bSalvarContinuar;
    private javax.swing.JTextField cxCargaMax;
    private javax.swing.JTextField cxCor;
    private javax.swing.JTextField cxData;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPistoes;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JTextField cxPotencia;
    private javax.swing.JTextField cxRodas;
    private javax.swing.JTextField cxTara;
    private javax.swing.JTextField cxVelocidade;
    private javax.swing.JLabel rotCor;
    private javax.swing.JLabel rotData;
    private javax.swing.JLabel rotMarca;
    private javax.swing.JLabel rotModelo;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotPistoes;
    private javax.swing.JLabel rotPlaca;
    private javax.swing.JLabel rotPotencia;
    private javax.swing.JLabel rotRodas;
    private javax.swing.JLabel rotTara;
    private javax.swing.JLabel rotVelocidade;
    // End of variables declaration//GEN-END:variables

}
