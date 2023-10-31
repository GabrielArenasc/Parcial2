/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelview;

import view.InicioSesion;
import view.inicio;


/**
 *
 * @author FLIA ARENAS CARMONA
 */
public class Inicial {
    static InicioSesion registrarse = new InicioSesion();
    static inicio base = new inicio();
    
    public static void main(String[] args) {
        
        registrarse.setBounds(500, 200, 350, 400);
        registrarse.setVisible(true);

    }
    
    public static void pantalla2() {
        
        base.setBounds(500, 200, 350, 400);
        base.setVisible(true);

    }
}
