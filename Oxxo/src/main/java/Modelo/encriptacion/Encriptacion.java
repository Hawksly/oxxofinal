package Modelo.encriptacion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptacion {
    public static String encriptar(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] passwordBytes = password.getBytes();
            byte[] hashBytes = md.digest(passwordBytes);
            StringBuilder sb = new StringBuilder();
            for (byte hashByte : hashBytes) {
                sb.append(Integer.toString((hashByte & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error en Encriptar: "+e);
            return null;
        }
    }
}
