package com.helje;

import java.util.ArrayList;

public class User
{
    // Instance variables
    private String userName;
    private String name;
    private String surname;
    private ArrayList<TimeRecord> records = new ArrayList<>();

    // -------------------------------------------------------------------------
    // CONSTRUCTORS
    // -------------------------------------------------------------------------

    /**
     * Main constructor for creating a new user
     *
     * @param name     the name of the user
     * @param surname  the surname of the user
     * @param userName alias
     */
    public User(String userName, String name, String surname)
    {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
    }

    // -------------------------------------------------------------------------
    // PRIVATE METHODS
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // PUBLIC METHODS
    // -------------------------------------------------------------------------

    /**
     * Add a record to the user
     *
     * @param record an time record
     */
    public void addRecord(TimeRecord record)
    {
        records.add(record);
    }

    /**
     * Get all records
     *
     * @return a collection of all records connected to the user in string format
     */
    public String getAllRecords()
    {
        String s = "";
        for (TimeRecord record : records)
        {
            s += record.toString() + "\n";
        }
        return s;
    }

    // -------------------------------------------------------------------------
    // SETTERS
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // GETTERS
    // -------------------------------------------------------------------------


    public ArrayList<TimeRecord> getRecords()
    {
        return records;
    }

    /**
     * @return all user parameters.
     */
    @Override
    public String toString()
    {
        return "User{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", records=" + records +
                '}' + "\n" +
                "RECORDS: \n" + getAllRecords();
    }
}
