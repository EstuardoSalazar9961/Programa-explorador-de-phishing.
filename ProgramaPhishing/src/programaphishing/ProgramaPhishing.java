/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaphishing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CompuStore
 */
public class ProgramaPhishing {

    public static void main(String[] args) {
        
        Map<String, Integer> keywords = new HashMap<>();
        keywords.put("actualización de seguridad", 2);
        keywords.put("verificación de cuenta", 3);
        keywords.put("su cuenta ha sido comprometida", 3);
        keywords.put("gane dinero fácil y rápido", 3);
        keywords.put("restablecimiento de contraseña urgente", 2);
        keywords.put("gane un premio increíble", 3);
        keywords.put("gestión de la cuenta", 2);
        keywords.put("inicie sesión para evitar la suspensión", 3);
        keywords.put("oferta exclusiva", 2);
        keywords.put("problemas con su cuenta", 2);
        keywords.put("¡felicidades, usted ha ganado!", 3);
        keywords.put("confirme su información", 3);
        keywords.put("importante mensaje de seguridad", 2);
        keywords.put("promoción especial", 2);
        keywords.put("gane un iPhone gratis", 3);
        keywords.put("cierre de cuenta inminente", 3);
        keywords.put("actualización de la política de privacidad", 2);
        keywords.put("oferta limitada", 2);
        keywords.put("inicio de sesión desde una ubicación no reconocida", 3);
        keywords.put("gratis", 2);
        keywords.put("su cuenta será suspendida", 3);
        keywords.put("acceda a su cuenta ahora", 3);
        keywords.put("¡solo por hoy!", 2);
        keywords.put("urgente: su cuenta está en riesgo", 3);
        keywords.put("revise su cuenta", 2);
        keywords.put("increíble oportunidad de inversión", 3);
        keywords.put("gane dinero desde casa", 3);
        keywords.put("verificación de identidad", 3);
        keywords.put("oferta de trabajo desde casa", 3);
        keywords.put("su cuenta será cerrada", 3);
        
        
         String fileName = "C:\\prueba\\archivo.txt";

        // Inicializar variables para el total de puntos y ocurrencias
         int totalPoints = 0;

       try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

           String line;

           while ((line = reader.readLine()) != null) {

               for (String keyword : keywords.keySet()) {

                   int count = countOccurrences(line, keyword);

                   if (count > 0) {

                       int points = count * keywords.get(keyword);

                       System.out.println(keyword + ": " + count + " ocurrencias (" + points + " puntos)");

                       totalPoints += points;

                   }

               }

           }

           System.out.println("Total de puntos acumulados: " + totalPoints);
           
       } catch (IOException e) {

       }
    }
    
    private static int countOccurrences(String line, String word) {

       return line.split(word, -1).length - 1;

   }
    
}
