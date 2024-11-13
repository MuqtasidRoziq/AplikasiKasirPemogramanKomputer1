
package logging;
import java.util.logging.*;
import java.io.*;

public class logging {
    public class ActivityLogger {

    private static final Logger logger = Logger.getLogger(ActivityLogger.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("activity.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("Error setting up file handler for logging: " + e.getMessage());
        }
    }

    // Log untuk aktivitas login
    public static void logLogin(String username) {
        logger.info(username + " berhasil melakukan login.");
    }
    
    public static void logLogout(String username){
        logger.info(username + " telah melakukan loggout.");
    }

    // Log untuk aktivitas insert user
    public static void logInsertUser(String username, String id) {
        logger.info(username + " menambahkan id: " + id);
    }

    // Log untuk aktivitas edit user
    public static void logEditUser(String username, String idUser) {
        logger.info(username + " telah mengedit data di dalam id user: " + idUser);
    }

    // Log untuk aktivitas delete user
    public static void logDeleteUser(String username, String id) {
        logger.info(username + " telah menghapus id: " + id);
    }
    
//    log utntuk pencarian user
    public static void logSearching(String username, String id){
        logger.info(username + " telah mencari id " + id);
    }

    
//  log untuk input user 
    public static void logInsertProduk(String username, String idProduk){
        logger.info(username + "telah menambahkan produk dengan id: " + idProduk);
    }
    
    // log untuk aktivitas edit produk
    public static void logEditProduk(String username, String idProduk){
        logger.info(username + "telah mengedit data di dalam id produk: " + idProduk);
    }
    
    //log aktivitas hapus produk
    public static void logDeleteProduk(String username, String idProduk){
        logger.info(username + "telah menghapus produk dengan id: " + idProduk);
    } 
    
    // log aktivitas cari produk
    public static void logSearchProduk(String username, String idProduk){
        logger.info(username + " mencari produk dengan id produk: " + idProduk);
    }

    // Log untuk mencatat error
    public static void logError(String errorMessage) {
        logger.severe("Error: " + errorMessage);
    }
}
    
}
