/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Fany
 * Version 1.0
 */
public class FormularioC extends JFrame implements ActionListener {

    
    JTextField NombreUsuario, ApellidoP, ApellidoM, Escuela, Grupo;
    JLabel Usuario, Paterno, Materno, Bienvenida,EscuelaL, TituloL, GrupoL;
    
    JButton Aceptar; 
    
    
    public FormularioC(){
        InicializarVentana();
        InicializarComponentes();
    }
    
    public void InicializarVentana(){
        setTitle("FORMULARIO");
        setSize(200, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(0,0,0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    
    public void InicializarComponentes(){
       
        //JTextField
        NombreUsuario = new JTextField();
        ApellidoP = new JTextField();
        ApellidoM = new JTextField();
        Escuela = new JTextField();
        //JLabel
        Bienvenida = new JLabel("Ingresa tus datos");
        Usuario = new JLabel("Escribe tu nombre");
        Paterno = new JLabel("Apellido paterno");
        Materno = new JLabel("Apellido materno");
        EscuelaL = new JLabel("Escuela");
        //Botones
        Aceptar = new JButton("Aceptar");
        
        setLayout(new BorderLayout());
        add(Bienvenida, BorderLayout.NORTH);
        add(Ubicacion(), BorderLayout.CENTER);
        add(Aceptar, BorderLayout.SOUTH);
   
        
    }
    
    private JPanel Ubicacion(){
        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.add(Usuario);
        centro.add(NombreUsuario);
        centro.add(Paterno);
        centro.add(ApellidoP);
        centro.add(Materno);
        centro.add(ApellidoM);
        centro.add(EscuelaL);
        centro.add(Escuela);
        return centro;
    }  

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
