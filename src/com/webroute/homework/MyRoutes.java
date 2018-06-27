package com.webroute.homework;

import com.webroute.homework.framework.WebRoute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyRoutes {
    private static Random chance = new Random();

    @WebRoute("/magic_answer")
    public static String path1() {

        if (chance.nextInt(100) <= 45) {
            return "Your magic answer says: Yes, let's do it!";
        } else if (chance.nextInt(100) < 75 || chance.nextInt(100) > 45) {
            return "Your magic answer says: No, maybe you should not.";
        } else if (chance.nextInt(100) > 75) {
            return "Your magic answer says: Maybe...who knows?";
        }
        return "Out of magic today.";
    }

    @WebRoute("/get_superhero")
    public static String path2() {
        List<String> superheroList = new ArrayList<>(
            Arrays.asList("Thor", "Iron Man", "Hulk", "Scarlet Witch", "Captain America", "Gwenpool", "Magneto", "America Chavez", "Black Panther", "Thanos", "Spiderman", "Star-Lord", "Doctor Strange", "Wolverine", "Mantis"));

        return "If the world would come to the end your specific hero would be " + superheroList.get(chance.nextInt(15)) + " who would save your cute face. You are lucky, see?";
    }
}
