package com.webroute.homework.framework;

import java.util.Random;

public class MyRoutes {

    @WebRoute("/magic_answer")
    public static String path1() {
        Random chance = new Random();

        if (chance.nextInt(100) <= 45) {
            return "Your magic answer says: Yes, let's do it!";
        } else if (chance.nextInt(100) < 75 || chance.nextInt(100) > 45) {
            return "Your magic answer says: No, maybe you should not.";
        } else if (chance.nextInt(100) > 75) {
            return "Your magic answer says: Maybe...who knows?";
        }
        return "Out of magic today.";
    }
}

