
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
        Operaciones = new javax.swing.JLabel();
        Comenzar = new javax.swing.JToggleButton();
        Puntaje = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        Dificultades = new javax.swing.JComboBox<>();
        EtiquetaDificultad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(20, 20));

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

        Operaciones.setText("OPERACIONES");

        Comenzar.setText("COMENZAR");
        Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarActionPerformed(evt);
            }
        });

        Puntaje.setText("Puntaje 0");

        Salida.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        Salida.setText("             ");

        Dificultades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Media", "Dificil" }));
        Dificultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificultadesActionPerformed(evt);
            }
        });

        EtiquetaDificultad.setText("Dificultad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(Puntaje)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(BotonResponder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(Comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(Operaciones))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dificultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDificultad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EtiquetaDificultad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dificultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Puntaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonResponder)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
       //Entra aqui si la respuesta es correcta y le suma un punto
        if (datos.respuestaInt==resultado){
         
        
        i++;
        Puntaje.setText("Puntaje "+ i);
        
               switch (Dificultades.getSelectedItem().toString()) {
 
        case "Facil":
        num1= datos.numeroAleatorioFacil();
        num2= datos.numeroAleatorioFacil();
        break;
 
        case "Media":
        num1= datos.numeroAleatorioMedio();
        num2= datos.numeroAleatorioMedio();
        break;
        
        case "Dificil":
            num1= datos.numeroAleatorioDificil();
            num2= datos.numeroAleatorioDificil();
            break;
       
        
        default:
      
        break;
 
 }
         Salida.setText(datos.Operacion(num1, num2));
         //termina if de la respuesta incorrecta
        }
        //Si la respuesta es incorrecta entra aqui y le baja un punto
        else{
            i--;
         Puntaje.setText("Puntaje "+ i);
         //Switch para elegir dificultades
               switch (Dificultades.getSelectedItem().toString()) {
 
        case "Facil":
        num1= datos.numeroAleatorioFacil();
        num2= datos.numeroAleatorioFacil();
        break;
 
        case "Media":
        num1= datos.numeroAleatorioMedio();
        num2= datos.numeroAleatorioMedio();
        break;
        
        case "Dificil":
            num1= datos.numeroAleatorioDificil();
            num2= datos.numeroAleatorioDificil();
            break;
       
        
        default:
      
        break;
 
 }
       Salida.setText(datos.Operacion(num1, num2));
        
        }
          
        }
        //Entra aqui cuando la respuesta NO es un numero
        else{
            JOptionPane.showMessageDialog(null, "Intente con un valor valido", "Error", JOptionPane.ERROR_MESSAGE);
           
        } 
       
        Entrada.setText("");
        Entrada.requestFocus();
       

        }
    }//GEN-LAST:event_BotonResponderActionPerformed
    
    private void ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarActionPerformed
        //Switch para elegir dificultades
        switch (Dificultades.getSelectedItem().toString()) {
 
        case "Facil":
        num1= datos.numeroAleatorioFacil();
        num2= datos.numeroAleatorioFacil();
        break;
 
        case "Media":
        num1= datos.numeroAleatorioMedio();
        num2= datos.numeroAleatorioMedio();
        break;
        
        case "Dificil":
            num1= datos.numeroAleatorioDificil();
            num2= datos.numeroAleatorioDificil();
            break;
       
        
        default:
      
        break;
 
 }
        
       
        Salida.setText(datos.Operacion(num1, num2)); System.out.println(datos.respuestaInt+" "+ resultado);
        Entrada.requestFocus();
        
        
         
    }//GEN-LAST:event_ComenzarActionPerformed

    private void DificultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificultadesActionPerformed
      //Si dificultades es cambiado pone el puntaje en 0
        if(Dificultades.isFocusOwner()){
        Puntaje.setText("Puntaje "+ 0);
        //Y si es cambiado mientras esta presionado selecciona dos veces a comenzar para cambiar la tabla que se muestra
        if (Comenzar.isSelected()){
        Comenzar.doClick();
        Comenzar.doClick();
        }
        
        }
       
    }//GEN-LAST:event_DificultadesActionPerformed

 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonResponder;
    private javax.swing.JToggleButton Comenzar;
    private javax.swing.JComboBox<String> Dificultades;
    public static javax.swing.JTextField Entrada;
    private javax.swing.JLabel EtiquetaDificultad;
    private javax.swing.JLabel Operaciones;
    private javax.swing.JLabel Puntaje;
    private javax.swing.JLabel Salida;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
