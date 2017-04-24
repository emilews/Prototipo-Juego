
package prototipo.juego;

import javax.swing.JOptionPane;



public class ventana extends javax.swing.JFrame {


    public ventana() {
        initComponents();
    }
    Data datos= new Data();
    //Num1 y num2 son usados a lo largo del juego como los numeros a multiplicar
    int num1;
    int num2;
    int resultado;
    // i es el puntaje
    int i = 0;
    //Variables para el tiempo, se usan en el objeto comenzar
    long startTime = 0;  
    long estimatedTime=0;
    String reloj;
   

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonResponder)
                                .addGap(123, 123, 123)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dificultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaDificultad))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(Puntaje)))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(Operaciones)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(EtiquetaDificultad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dificultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Puntaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonResponder)))
                .addGap(6, 6, 6))
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
          //Guarda los datos de la entrada en la variable respuestaStr
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
   //if para iniciar el conteo del tiempo
        if(Comenzar.isSelected()){
      startTime=  System.nanoTime();
      Comenzar.setText("TERMINAR");
    }
   
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
       
//if para terminar el conteo del tiempo y regresar puntaje/tiempo RESETEA EL PUNTAJE
if(!Comenzar.isSelected()){
    Comenzar.setText("COMENZAR");
    estimatedTime=(System.nanoTime() - startTime)/1000000000;
System.out.println(estimatedTime);
reloj= String.valueOf(estimatedTime)+" segundos";
JOptionPane.showMessageDialog(null, "Obtuviste "+i+" puntos en "+reloj, "Game over", JOptionPane.PLAIN_MESSAGE);
    System.out.println(reloj);
    i=0;
}
        
    
         
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
