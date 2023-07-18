package Modelo.encriptacion;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class encriptacion {
    
    public SecretKeySpec CrearClave(String llave){
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena,"AES");
            return secretKeySpec;
        } catch (Exception e) {
            System.out.println("Error en CrearClave: "+e);
            return null;
        }
    }
    
    public String Encriptar(String encriptar, String llave){
        try {
            SecretKeySpec secretKeySpec = CrearClave(llave);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = Base64.encode(encriptada);
            return cadena_encriptada;
        } catch (Exception e) {
            System.out.println("Error en Encriptar: "+e);
            return "";
        }
    }
    
    public String Desencriptar(String desencriptar, String llave){
        try {
            SecretKeySpec secretKeySpec = CrearClave(llave);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] cadena = Base64.decode(desencriptar);
            byte[] desencriptacion = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencriptacion);
            return cadena_desencriptada;
        } catch (Exception e) {
            System.out.println("Error en Desencriptar: "+e);
            return "";
        }
    }
}
