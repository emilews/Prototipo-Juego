
package prototipo.juego;

import javax.swing.JOptionPane;



public class ventana extends javax.swing.JFrame {


    public ventana() {
        initComponents();
    }
    Data datos= new Data();
    int num1;
    int num2;
    int resultado;
    int i = 0;
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Entrada = new javax.swing.JTextField();
        BotonResponder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextPane();
        Operaciones = new javax.swing.JLabel();
        Comenzar = new javax.swing.JToggleButton();
        Puntaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir(evt);
            }
        });

        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        BotonResponder.setText("Responder");
        BotonResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResponderActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Salida);

        Operaciones.setText("OPERACIONES");

        Comenzar.setText("COMENZAR");
        Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarActionPerformed(evt);
            }
        });

        Puntaje.setText("Puntaje 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(Entrada, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(Comenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Operaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(BotonResponder)))
                .addGap(0, 163, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(Puntaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Comenzar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Puntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonResponder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir
      System.exit(0);
    }//GEN-LAST:event_Salir

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
       
    }//GEN-LAST:event_EntradaActionPerformed

    private void BotonResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResponderActionPerformed
     //Primer if para que solo comience cuando el boton comenzar este seleccionado
        if(Comenzar.isSelected()){
       datos.capturaDatos();
       //Segundo if valida que lo que se introduce en el campo de respuesta sea un numero
        if (datos.validarInt(datos.respuestaStr)) {
          datos.respuestaInt = Integer.parseInt(datos.respuestaStr);
            
                  resultado= num1*num2;
       
        if (datos.respuestaInt==resultado){
         
        //JOptionPane.showMessageDialog(null, "Buena bola", "Correcto", JOptionPane.PLAIN_MESSAGE);
        i++;
        Puntaje.setText("Puntaje "+ i);
        
       num1= datos.numeroAleatorio();
       num2= datos.numeroAleatorio();
         Salida.setText(datos.Operacion(num1, num2));
        }
          
          
        }
        //De lo contrario manda un mensaje de error
        else{
            JOptionPane.showMessageDialog(null, "Intente con un valor valido", "Error", JOptionPane.ERROR_MESSAGE);
        } 
       
       

        }
    }//GEN-LAST:event_BotonResponderActionPerformed
    
    private void ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarActionPerformed
        boolean acceso = true;
        if (acceso==true){
        num1= datos.numeroAleatorio();
         num2= datos.numeroAleatorio();
         acceso=false;
        }
        Salida.setText(datos.Operacion(num1, num2)); System.out.println(datos.respuestaInt+" "+ resultado);
         
    }//GEN-LAST:event_ComenzarActionPerformed

 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonResponder;
    private javax.swing.JToggleButton Comenzar;
    public static javax.swing.JTextField Entrada;
    private javax.swing.JLabel Operaciones;
    private javax.swing.JLabel Puntaje;
    private javax.swing.JTextPane Salida;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
