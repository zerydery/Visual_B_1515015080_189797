/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulkedua;

/**
 *
 * @author Spitzery
 */
public class Kalkulator extends javax.swing.JFrame {

   
   double input1,input2,tmbh=0,krng=0,bg=0,kl=0,hsl=0;
    public void parsing () {
        try {
       input1=Integer.parseInt(agk1.getText().toString());
       input2=Integer.parseInt(agk2.getText().toString());
       } catch (NumberFormatException e) {
           agk1.setText("0");
           agk2.setText("0");
            }
    }
    public Kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        agk2 = new javax.swing.JTextField();
        t = new javax.swing.JRadioButton();
        k = new javax.swing.JRadioButton();
        x = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        opr = new javax.swing.JTextField();
        agk1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Kalkulator");

        agk2.setBackground(new java.awt.Color(102, 102, 102));
        agk2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        agk2.setText("...............");
        agk2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                agk2ComponentAdded(evt);
            }
        });
        agk2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agk2MouseClicked(evt);
            }
        });

        buttonGroup1.add(t);
        t.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t.setText("+");
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });

        buttonGroup1.add(k);
        k.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        k.setText("-");
        k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kMouseClicked(evt);
            }
        });

        buttonGroup1.add(x);
        x.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        x.setText("x");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });

        buttonGroup1.add(b);
        b.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b.setText("/");
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });

        agk1.setBackground(new java.awt.Color(102, 102, 102));
        agk1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        agk1.setText("...............");
        agk1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                agk1ComponentAdded(evt);
            }
        });
        agk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agk1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agk1MouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        jLabel4.setText("Andre P.R.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(hasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t)
                    .addComponent(k)
                    .addComponent(x)
                    .addComponent(b))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(opr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(agk2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(agk1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(k)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(x)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(opr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agk2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(agk1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agk1MouseClicked
   
    agk1.setText("");
    
    }//GEN-LAST:event_agk1MouseClicked

    private void agk2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agk2MouseClicked

        agk2.setText("");
        
       
    }//GEN-LAST:event_agk2MouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
        // TODO add your handling code here:
        this.parsing();
        if (t.isSelected()==true){
        opr.setText("+");
        hsl = input1 + input2;
        hasil.setText(""+hsl);
        }
    }//GEN-LAST:event_tMouseClicked

    private void kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMouseClicked
        // TODO add your handling code here:
        this.parsing();
        if (k.isSelected()==true){
        opr.setText("-");
        hsl = input1 - input2;
        hasil.setText(""+hsl);
        }
    }//GEN-LAST:event_kMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        // TODO add your handling code here:
        this.parsing();
        if (x.isSelected()==true){
        opr.setText("x");
        hsl = input1 * input2;
        hasil.setText(""+hsl);
        }
    }//GEN-LAST:event_xMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        // TODO add your handling code here:
        this.parsing();
        if (b.isSelected()==true){
        opr.setText("/");
        try{
         hsl = input1 / input2;
         hasil.setText(""+hsl);
        }catch(ArithmeticException e){
            hasil.setText("Infinity");
        }
        
        }
    }//GEN-LAST:event_bMouseClicked

    private void agk1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agk1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_agk1MouseEntered

    private void agk1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_agk1ComponentAdded
        // TODO add your handling code here:
        if (t.isSelected()==true && input1 !=0 && input2 !=0){
        hsl = input1 + input2;
        hasil.setText(""+hsl);
    }
    if (k.isSelected()==true && input1 !=0 && input2 !=0){
        hsl = input1 - input2;
        hasil.setText(""+hsl);
    }
    if (x.isSelected()==true && input1 !=0 && input2 !=0){
        hsl = input1 * input2;
        hasil.setText(""+hsl);
    }
    if (b.isSelected()==true && input1 !=0 && input2 !=0){
        hsl = input1 / input2;
        hasil.setText(""+hsl);
    }
    }//GEN-LAST:event_agk1ComponentAdded

    private void agk2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_agk2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_agk2ComponentAdded

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agk1;
    private javax.swing.JTextField agk2;
    private javax.swing.JRadioButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton k;
    private javax.swing.JTextField opr;
    private javax.swing.JRadioButton t;
    private javax.swing.JRadioButton x;
    // End of variables declaration//GEN-END:variables
}
