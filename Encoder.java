import java.security.MessageDigest;

public class Encoder {

 public static String getSha256(String value) {
    try{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(value.getBytes());
        return bytesToHex(md.digest());
    } catch(Exception ex){
        throw new RuntimeException(ex);
    }
 }
 private static String bytesToHex(byte[] bytes) {
    StringBuffer result = new StringBuffer();
    for (byte b : bytes) result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
    return result.toString();
 }


public static void main(String[] args) {
    System.out.println("wokring");
    long magic = 0;
    String ex = "hello";
    ex = getSha256(ex);
    ex = getSha256(ex+magic);

    while(!ex.matches("^0000*")){
        magic++;
    }
    System.out.println(ex);
}

}
