package controllers;
 
import models.*;
 
public class Security extends Secure.Security {
	
    static boolean authenticate(String username, String password) {
        return User.connect(username, password) != null;
    }

    static void onDisconnected() {
        Page.index();
    }

    static void onAuthenticated() {
        Admin.index();
    }

    // static boolean check(String profile) {
    //     if("admin".equals(profile)) {
    //         return User.find("byEmail", connected()).<User>first().isAdmin;
    //     }
    //     return false;
    // }
    
    static boolean check(String profile) {
        if ("admin".equals(profile)) {
            return User.find("byEmail", connected()).<User>first().isAdmin;
        } else if ("apotek".equals(profile)) {
            return User.find("byEmail", connected()).<User>first().isApotek;
        } else if ("keuangan".equals(profile)) {
            return User.find("byEmail", connected()).<User>first().isKeuangan;
        } else if ("pendaftaran".equals(profile)) {
            return User.find("byEmail", connected()).<User>first().isPendaftaran;
        } else if ("perawat".equals(profile)) {
            return User.find("byEmail", connected()).<User>first().isPerawat;
        }
        return false;
    }
    
}