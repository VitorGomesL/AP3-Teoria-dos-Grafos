
package arvorebinaria;

import static arvorebinaria.dijkstra.calcularCaminho;
import static arvorebinaria.dijkstra.getMenorCaminho;
import java.time.Clock;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private static MenuPrincipal uniqueInstance;
           
    public MenuPrincipal() {
        initComponents();
    }
    
    public static synchronized MenuPrincipal getInstance(){
        if (uniqueInstance == null) 
            uniqueInstance = new MenuPrincipal();
        
        return uniqueInstance;
    }

    public void setTextArea(String texto){
        textResultado.setText(textResultado.getText() + texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMontarArvore = new javax.swing.JButton();
        btnImprimirEmOrdem = new javax.swing.JButton();
        btnNivel = new javax.swing.JButton();
        btnProfundidade = new javax.swing.JButton();
        btnImprimirPreOrdem = new javax.swing.JButton();
        btnImprimirPosOrdem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textResultado = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        textProfundidade = new javax.swing.JTextField();
        textNivel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnMontarArvore.setText("Montar Árvore Aleatoriamente");
        btnMontarArvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontarArvoreActionPerformed(evt);
            }
        });

        btnImprimirEmOrdem.setText("Imprimir em Ordem");
        btnImprimirEmOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirEmOrdemActionPerformed(evt);
            }
        });

        btnNivel.setText("Buscar Por Nível");
        btnNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelActionPerformed(evt);
            }
        });

        btnProfundidade.setText("Buscar Por Profundidade");
        btnProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfundidadeActionPerformed(evt);
            }
        });

        btnImprimirPreOrdem.setText("Imprimir Pré-Ordem");
        btnImprimirPreOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPreOrdemActionPerformed(evt);
            }
        });

        btnImprimirPosOrdem.setText("Imprimir Pós-Ordem");
        btnImprimirPosOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPosOrdemActionPerformed(evt);
            }
        });

        textResultado.setColumns(20);
        textResultado.setRows(5);
        jScrollPane2.setViewportView(textResultado);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        textProfundidade.setToolTipText("Insira o valor a ser buscado em Profundidade");

        textNivel.setToolTipText("Insira o valor a ser buscado em Nível");

        jButton1.setText("Dijkstra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProfundidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnMontarArvore, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(btnImprimirPreOrdem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImprimirEmOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimirPosOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMontarArvore)
                    .addComponent(btnImprimirEmOrdem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirPreOrdem)
                    .addComponent(btnImprimirPosOrdem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfundidade)
                    .addComponent(textProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNivel)
                    .addComponent(textNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMontarArvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarArvoreActionPerformed
        Arvore.raiz = null;
        
        //Preparação do Random para gerar 7 números que não sejam iguais.
        int numero;
        int[] num = new int[7];
        Random random = new Random();
        
        for(int i=0; i<num.length; i++){
             numero = random.nextInt(100) + 1;
             for(int j=0; j<num.length; j++){
                   if(numero == num[j] && j != i){
                         numero = random.nextInt(100) + 1;
                   }else{
                        num[i] = numero;
                   }
             }
        }
        
        for(int i=0; i<num.length; i++){
             Arvore.inserir(num[i]);             
        }     
        
        setTextArea("\n");
    }//GEN-LAST:event_btnMontarArvoreActionPerformed

    private void btnImprimirEmOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirEmOrdemActionPerformed
        if (Arvore.raiz != null) {    
            setTextArea("Impressão da Árvore em Ordem:\n");        
            Arvore.imprimirEmOrdem(Arvore.raiz);
            Arvore.contador = 0;
            setTextArea("\n\n");
        } else {
            JOptionPane.showMessageDialog(this, "A árvore ainda não foi criada clique no botão \"Montar Árvore Aleatoriamente\"");
        }
    }//GEN-LAST:event_btnImprimirEmOrdemActionPerformed

    private void btnImprimirPreOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPreOrdemActionPerformed
        if (Arvore.raiz != null) {    
            setTextArea("Impressão da Árvore em Pré-Ordem:\n");        
            Arvore.imprimirPreOrdem(Arvore.raiz);
            Arvore.contador = 0;
            setTextArea("\n\n");
        } else {
            JOptionPane.showMessageDialog(this, "A árvore ainda não foi criada clique no botão \"Montar Árvore Aleatoriamente\"");
        }
    }//GEN-LAST:event_btnImprimirPreOrdemActionPerformed

    private void btnImprimirPosOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPosOrdemActionPerformed
        if (Arvore.raiz != null) {
            setTextArea("Impressão da Árvore em Pós-Ordem:\n");
            Arvore.imprimirPosOrdem(Arvore.raiz);
            Arvore.contador = 0;
            setTextArea("\n\n");
        } else {
            JOptionPane.showMessageDialog(this, "A árvore ainda não foi criada clique no botão \"Montar Árvore Aleatoriamente\"");
        }
    }//GEN-LAST:event_btnImprimirPosOrdemActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        textResultado.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfundidadeActionPerformed
        if (Arvore.raiz != null) {
            try {
                if (!textProfundidade.getText().isEmpty()) {
                    if (Arvore.procurarNoProfundidade(Arvore.raiz, Integer.parseInt(textProfundidade.getText()))) {
                        setTextArea("O valor \""+Integer.parseInt(textProfundidade.getText())+"\" foi encontrado com "+Integer.toString(Arvore.contador)+" Iterações.\n\n");
                    } else {
                        setTextArea("O valor \""+Integer.parseInt(textProfundidade.getText())+"\" não foi encontrado.\n\n");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insira um valor válido no campo ao lado esquerdo");
                }                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insira um valor válido no campo ao lado esquerdo");   
            }
        } else {
            JOptionPane.showMessageDialog(this, "A árvore ainda não foi criada clique no botão \"Montar Árvore Aleatoriamente\"");
        }
        
        Arvore.contador = 0;
    }//GEN-LAST:event_btnProfundidadeActionPerformed

    private void btnNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelActionPerformed
        if (Arvore.raiz != null) {
            try {
                if (!textNivel.getText().isEmpty()) {                                                                               
                    Arvore.buscarNivel(Integer.parseInt(textNivel.getText()));                    
                } else {
                    JOptionPane.showMessageDialog(this, "Insira um valor válido no campo ao lado esquerdo");
                }                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insira um valor válido no campo ao lado esquerdo");   
            }
        } else {
            JOptionPane.showMessageDialog(this, "A árvore ainda não foi criada clique no botão \"Montar Árvore Aleatoriamente\"");
        }
        
        Arvore.contador = 0;
    }//GEN-LAST:event_btnNivelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vertice arad = new Vertice("Arad");
        Vertice bucharest = new Vertice("Bucharest");
        Vertice craiova = new Vertice("Craiova");
        Vertice dobreta = new Vertice("Dobreta");
        Vertice eforie = new Vertice("Eforie");
        Vertice fagaras = new Vertice("Fagaras");
        Vertice giurgiu = new Vertice("Giurgiu");
        Vertice hirsova = new Vertice("Hirsova");
        Vertice iasi = new Vertice("Iasi");
        Vertice lugoj = new Vertice("Lugoj");
        Vertice mehadia = new Vertice("Mehadia");
        Vertice neamt = new Vertice("Neamt");
        Vertice oradea = new Vertice("Oradea");
        Vertice pitesti = new Vertice("Pitesti");
        Vertice rimnicuVilcea = new Vertice("Rimnicu Vilcea");
        Vertice sibiu = new Vertice("Sibiu");
        Vertice timisoara = new Vertice("Timisoara");
        Vertice urziceni = new Vertice("Urziceni");
        Vertice vaslui = new Vertice("Vaslui");
        Vertice zerind = new Vertice("Zerind");

        arad.adjacencias = new Aresta[]{ new Aresta(zerind, 75), new Aresta(timisoara, 118), new Aresta(sibiu, 140)};
        bucharest.adjacencias = new Aresta[]{ new Aresta(pitesti, 101), new Aresta(urziceni, 85), new Aresta(giurgiu, 90), new Aresta(fagaras, 211)};
        craiova.adjacencias = new Aresta[]{ new Aresta(dobreta, 120), new Aresta(rimnicuVilcea, 146), new Aresta(pitesti, 138)};
        dobreta.adjacencias = new Aresta[]{ new Aresta(craiova, 120), new Aresta(mehadia, 75)};
        eforie.adjacencias = new Aresta[]{ new Aresta(hirsova, 86)};
        fagaras.adjacencias = new Aresta[]{ new Aresta(sibiu, 99), new Aresta(bucharest, 211)};
        giurgiu.adjacencias = new Aresta[]{ new Aresta(bucharest, 90)};
        hirsova.adjacencias = new Aresta[]{ new Aresta(urziceni, 98), new Aresta(eforie, 86)};
        iasi.adjacencias = new Aresta[]{ new Aresta(neamt, 87), new Aresta(vaslui, 92)};
        lugoj.adjacencias = new Aresta[]{ new Aresta(timisoara, 111), new Aresta(mehadia, 70)};
        mehadia.adjacencias = new Aresta[]{ new Aresta(lugoj, 70), new Aresta(dobreta, 75)};
        neamt.adjacencias = new Aresta[]{ new Aresta(iasi, 87)};
        oradea.adjacencias = new Aresta[]{ new Aresta(zerind, 71), new Aresta(sibiu, 151)};
        pitesti.adjacencias = new Aresta[]{ new Aresta(bucharest, 101), new Aresta(rimnicuVilcea, 97), new Aresta(craiova, 138)};
        rimnicuVilcea.adjacencias = new Aresta[]{ new Aresta(sibiu, 80), new Aresta(pitesti, 97), new Aresta(craiova, 146)};
        sibiu.adjacencias = new Aresta[]{ new Aresta(fagaras, 99), new Aresta(rimnicuVilcea, 80), new Aresta(arad, 140), new Aresta(oradea, 151)};
        timisoara.adjacencias = new Aresta[]{ new Aresta(arad, 118), new Aresta(lugoj, 111)};
        urziceni.adjacencias = new Aresta[]{ new Aresta(hirsova, 98), new Aresta(vaslui, 142), new Aresta(bucharest, 85)};
        vaslui.adjacencias = new Aresta[]{ new Aresta(iasi, 92), new Aresta(urziceni, 142)};
        zerind.adjacencias = new Aresta[]{ new Aresta(oradea, 71), new Aresta(arad, 75)};
        
        calcularCaminho(arad);
        
        setTextArea("Distância para " + bucharest + ": " + bucharest.distanciaMin);
        setTextArea("\n");
	    List<Vertice> caminho = getMenorCaminho(bucharest);
	    setTextArea("Caminho: " + caminho);
            setTextArea("\n");
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal telaInicial = MenuPrincipal.getInstance(); 
                telaInicial.setLocationRelativeTo(null);
                telaInicial.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirEmOrdem;
    private javax.swing.JButton btnImprimirPosOrdem;
    private javax.swing.JButton btnImprimirPreOrdem;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMontarArvore;
    private javax.swing.JButton btnNivel;
    private javax.swing.JButton btnProfundidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField textNivel;
    private javax.swing.JTextField textProfundidade;
    private javax.swing.JTextArea textResultado;
    // End of variables declaration//GEN-END:variables
}
