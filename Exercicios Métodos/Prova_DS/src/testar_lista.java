/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import java.util.LinkedList;
import java.util.List;
public class testar_lista {
    public static void main(String[] args) {
        List a = new LinkedList ();
        a.add ( "um");
           a.add ( "dois");
              a.add ( "tres");
                 a.add ( "quatro");
                    a.add ( "um");
        List b = new LinkedList ();
        a.add ( "um");
           a.add ( "um");
              a.add ( "tres");
        a.retainAll (b);
    }
    
}