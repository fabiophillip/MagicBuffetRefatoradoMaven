/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import InterfaceDAO.DAOComBuscaMultiplaInterface;
import InterfaceDAO.InterfacePacoteDAO;
import controler.Item;
import controler.Pacote;
import entidadesDAO.FabricaDeDAO;

import java.rmi.server.UID;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Josiel
 */
public class TelaCadastrarpacote extends javax.swing.JFrame 
{

    /**
     * Creates new form TelaCadastrarpacote
     */
	
	private DAOComBuscaMultiplaInterface DAOItens;
	private InterfacePacoteDAO DAOPacotes;
	
    public TelaCadastrarpacote() 
    {
        initComponents();
        
        DAOItens = FabricaDeDAO.criarItemDAO();
        DAOPacotes = FabricaDeDAO.criarPacoteDAO();
        
        precoFoiCalculado = false; //o usuario so poderah cadastrar o pacote se verificar o preco antes
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nomePacote = new javax.swing.JLabel();
        textoNomePacote = new javax.swing.JTextField();
        precoPacote = new javax.swing.JLabel();
        textoPreco = new javax.swing.JTextField();
        CANCELAR = new javax.swing.JButton();
        SALVAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        setTabela(new javax.swing.JTable());
        calcularPreco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        desconto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cadastrar Novo Pacote");

        nomePacote.setText("Nome do Pacote");

        textoNomePacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomePacoteActionPerformed(evt);
            }
        });
        
        desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoFoiCalculado = false;
            }
        });

        precoPacote.setText("Preço do Pacote");

        textoPreco.setEditable(false);

        CANCELAR.setText("CANCELAR");
        CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARActionPerformed(evt);
            }
        });

        SALVAR.setText("SALVAR");
        SALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALVARActionPerformed(evt);
            }
        });

        getTabela().setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(getTabela());

        calcularPreco.setText("Calcular Preço");
        calcularPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPrecoActionPerformed(evt);
            }
        });

        jLabel1.setText("Desconto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calcularPreco))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomePacote, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoNomePacote, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(precoPacote))
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(CANCELAR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textoPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(desconto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoNomePacote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomePacote))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precoPacote))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addComponent(calcularPreco)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANCELAR)
                    .addComponent(SALVAR))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomePacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomePacoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomePacoteActionPerformed
    
    
    private void CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARActionPerformed
        this.dispose();
        TelaInicial telaInicial = TelaInicial.getInstance();
        telaInicial.setVisible(true);
    }//GEN-LAST:event_CANCELARActionPerformed
    
    private void SALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALVARActionPerformed
        
        Pacote pacote = new Pacote();
        String nome = textoNomePacote.getText();
        String precoEmString = textoPreco.getText();
        
        if(DAOPacotes.buscarPorNome(nome).getPacoteNome() != null){
            JOptionPane.showMessageDialog(this, "Nome de pacote já cadastrado");            
        }
        else if(nome.length() == 0)
        {
        	JOptionPane.showMessageDialog(this, "por favor, informe um nome para o pacote");   
        }
        else 
        {
        	if(this.precoFoiCalculado == true)
        	{
        		 pacote.setPacoteNome(textoNomePacote.getText());        
        	        Float preco = Float.parseFloat(precoEmString);
        	        pacote.setPrecoPacote(preco);
        	        textoPreco.setText(String.valueOf(pacote.getPrecoPacote()));
        	        
        	        int[] linhaSelecionadas;
        	        linhaSelecionadas = getTabela().getSelectedRows();        
        	        int linha;
        	        float valor = 0;
        	        ArrayList<String> itens = new ArrayList();
        	        for (int i = 0; i < getTabela().getSelectedRowCount(); i++) {
        	            linha = linhaSelecionadas[i];            
        	            String idItem = getTabela().getValueAt(linha, 1).toString();            
        	            itens.add(idItem);            
        	        }
        	        
        	          pacote.setItensPacote(itens);
        	        
        	        for (String item : pacote.getItensPacote()) {
        	            System.out.println(item + " ");
        	        }
        	        
        	        UID id = new UID();
        	      
        	        pacote.setIdPacote(String.valueOf(id));        
        	        DAOPacotes.criar(pacote);
        	        TelaInicial telaInicial = TelaInicial.getInstance();
        	        this.dispose();
        	        telaInicial.setVisible(true);
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(this, "calcule o pre�o do pacote antes de salvar");
        	}
        
        }
    }//GEN-LAST:event_SALVARActionPerformed
    
    private void calcularPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPrecoActionPerformed
        Item item;
        if (getTabela().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione algum item");
        } 
        else 
        {            
            int[] linhaSelecionadas;
            linhaSelecionadas = getTabela().getSelectedRows();            
            int linha;
            float valor = 0;
            ArrayList<Item> itens = new ArrayList();
            for (int i = 0; i < getTabela().getSelectedRowCount(); i++) {
                linha = linhaSelecionadas[i];                
                String valueAt = getTabela().getValueAt(linha, 1).toString();
                item = (Item) DAOItens.buscar(valueAt);
                System.out.println(item.getPrecoUnidade());
                valor = valor + item.getPrecoUnidade();                
            }
            
            if(desconto.getText().equals("") == true)
            {
            	textoPreco.setText(String.valueOf(valor));
                
                this.precoFoiCalculado = true;
            }
            else if (VerificadorCamposFormulario.stringEhNumerica(desconto.getText()) == true && Double.valueOf(desconto.getText()) > 0) 
            {
                valor = (float) (valor - Double.valueOf(desconto.getText()));
                textoPreco.setText(String.valueOf(valor));
                
                this.precoFoiCalculado = true;
            }
            else
            {
            	JOptionPane.showMessageDialog(this, "valor para desconto inv�lido. Por favor insira um valor v�lido");
            	this.precoFoiCalculado = false; //o desconto foi invalido? entao o preco nao pode ser calculado
            }
        }
    }//GEN-LAST:event_calcularPrecoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCadastrarpacote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarpacote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarpacote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarpacote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarpacote().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCELAR;
    private javax.swing.JButton SALVAR;
    private javax.swing.JButton calcularPreco;
    private javax.swing.JTextField desconto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nomePacote;
    private javax.swing.JLabel precoPacote;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textoNomePacote;
    private volatile javax.swing.JTextField textoPreco;
    private boolean precoFoiCalculado;
    // End of variables declaration//GEN-END:variables

	public synchronized javax.swing.JTextField getTextoPreco() {
		return textoPreco;
	}

	public synchronized void setTextoPreco(javax.swing.JTextField textoPreco) {
		this.textoPreco = textoPreco;
	}

	public javax.swing.JTable getTabela() {
		return tabela;
	}

	public void setTabela(javax.swing.JTable tabela) {
		this.tabela = tabela;
	}
    
}
