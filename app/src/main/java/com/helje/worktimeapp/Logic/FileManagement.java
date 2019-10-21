package com.helje;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManagement
{
    public FileManagement()
    {

    }

    public static boolean saveJSON(User user, String fileName) throws IOException
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gsonString = gson.toJson(user);

        try
        {
            FileWriter file = new FileWriter(fileName);
            file.write(gsonString);
            file.close();
            return true;
        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public static User loadJSON(String fileName)
    {
        try
        {
            Gson gson = new Gson();
            User user = gson.fromJson(new FileReader(fileName), User.class);
            return user;

        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }


//    // Open json
//        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
//    User[] users1 = gson.fromJson(new FileReader("user.json"), User[].class);
//        for(
//    User user4 :users1)
//
//    {
//        System.out.println(user4);
//    }
}
