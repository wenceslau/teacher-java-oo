package br.com.letscode.tv.view;

import br.com.letscode.tv.enuns.Acao;
import br.com.letscode.tv.model.ControleRemoto;

import javax.swing.*;

public class Janela extends JFrame {

    private ControleRemoto controleRemoto;

    public Janela(ControleRemoto controleRemoto) {
        this.controleRemoto = controleRemoto;
        initComponents();
        imprimirVolume();
        imprimirCanal();
    }

    private void alterarVolume(Acao acao){
        controleRemoto.alterarVolume(acao);
        imprimirVolume();
    }

    private void alterarCanal(Acao acao){
        controleRemoto.alterarCanal(acao);
        imprimirCanal();
    }
    private void alterarCanal(int canal){
        try {
            controleRemoto.alterarCanal(canal);
            imprimirCanal();
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, ">>>>> Canal Invalido");
        }
    }

    private void imprimirVolume() {
        String volume = "";
        for (int i = 0; i < controleRemoto.volume(); i++) {
            volume += "|";
        }
        jtfVolume.setText("Volume: " + controleRemoto.volume() + " " + volume);
    }

    private void imprimirCanal(){
        jtfCanal.setText("Canal : " + controleRemoto.canal());
    }

    // <editor-fold defaultstate="collapsed" desc="Codigo Janela">
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbConsCanal;
    private javax.swing.JButton jbConsVol;
    private javax.swing.JButton jbMaisCh;
    private javax.swing.JButton jbMaisVol;
    private javax.swing.JButton jbMenosCh;
    private javax.swing.JButton jbMenosVol;
    private javax.swing.JLabel jlName;
    private javax.swing.JTextField jtfCanal;
    private javax.swing.JTextField jtfVolume;


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbMaisVol = new javax.swing.JButton();
        jbMenosVol = new javax.swing.JButton();
        jtfVolume = new javax.swing.JTextField();
        jtfCanal = new javax.swing.JTextField();
        jbMaisCh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbMenosCh = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jlName = new javax.swing.JLabel();
        jbConsCanal = new javax.swing.JButton();
        jbConsVol = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TV");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VOL");

        jbMaisVol.setText("+");
        jbMaisVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMaisVolActionPerformed(evt);
            }
        });

        jbMenosVol.setText("-");
        jbMenosVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenosVolActionPerformed(evt);
            }
        });

        jtfVolume.setBackground(new java.awt.Color(0, 0, 0));
        jtfVolume.setForeground(new java.awt.Color(255, 255, 255));

        jtfCanal.setBackground(new java.awt.Color(0, 0, 0));
        jtfCanal.setForeground(new java.awt.Color(255, 255, 255));

        jbMaisCh.setText("+");
        jbMaisCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMaisChActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CH");

        jbMenosCh.setText("-");
        jbMenosCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenosChActionPerformed(evt);
            }
        });

        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jlName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlName.setText("TV");

        jbConsCanal.setText("Consultar Canal");
        jbConsCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsCanalActionPerformed(evt);
            }
        });

        jbConsVol.setText("Consultar Volume");
        jbConsVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsVolActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jtfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jtfCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jbMaisVol)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jbMenosVol, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jbMaisCh)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jbMenosCh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jb4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jb5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jb6))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jb7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jb0)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jb8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jb9))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jb1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jb2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jb3)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbConsCanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbConsVol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb1)
                                        .addComponent(jb2)
                                        .addComponent(jb3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb4)
                                        .addComponent(jb5)
                                        .addComponent(jb6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb7)
                                        .addComponent(jb9)
                                        .addComponent(jb8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb0)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbMaisVol)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbMenosVol))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbMaisCh)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbMenosCh)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbConsCanal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbConsVol)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }
    private void jbMaisVolActionPerformed(java.awt.event.ActionEvent evt) {
        alterarVolume(Acao.AUMENTAR);
    }

    private void jbMenosVolActionPerformed(java.awt.event.ActionEvent evt) {
        alterarVolume(Acao.DIMINUIR);
    }

    private void jbMaisChActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(Acao.AUMENTAR);
    }

    private void jbMenosChActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(Acao.DIMINUIR);
    }

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(1);
    }

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(2);
    }

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(3);
    }

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(4);
    }

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(5);
    }

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(6);
    }

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(7);
    }

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(8);
    }

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(9);
    }

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {
        alterarCanal(0);
    }

    private void jbConsCanalActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel2.setText("Canal: "+ controleRemoto.canal());
    }

    private void jbConsVolActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel2.setText("Volume: "+ controleRemoto.volume());
    }
// </editor-fold>
}

