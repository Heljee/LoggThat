package com.helje;

import java.time.LocalDateTime;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;

public class AppLogic
{
    /**
     * Constructors
     */
    public AppLogic()
    {

    }

    /**
     * Search for records of specific year
     *
     * @param year
     * @param records
     * @return an array with all records of specified year
     */
    public ArrayList<TimeRecord> yearlyData(int year, ArrayList<TimeRecord> records)
    {
        var recordsOfYear = new ArrayList<TimeRecord>();
        for (TimeRecord record : records)
        {
            if (record.getStartTime().getYear() == year)
            {
                recordsOfYear.add(record);
            }
        }
        return recordsOfYear;
    }

    /**
     * Search for all records in month entered by the user
     *
     * @param year
     * @param month
     * @param records
     * @return an array with records of specific month
     */
    public ArrayList<TimeRecord> monthlyData(int year, int month, ArrayList<TimeRecord> records)
    {
        var monthlyRecords = new ArrayList<TimeRecord>();

        for (TimeRecord record : records)
        {
            if (record.getStartTime().getMonthValue() == month && record.getStartTime().getYear() == year)
            {
                monthlyRecords.add(record);
            }
        }

        return monthlyRecords;
    }

    /**
     * Search for a specific day
     *
     * @param year
     * @param month
     * @param day
     * @param records array with records to analyse
     * @return an array with records of specific day
     */
    public ArrayList<TimeRecord> dailyData(int year, int month, int day, ArrayList<TimeRecord> records)
    {
        var dailyRecords = new ArrayList<TimeRecord>();

        for (TimeRecord record : records)
        {
            if (record.getStartTime().getDayOfMonth() == day && record.getStartTime().getMonthValue() == month && record.getStartTime().getYear() == year)
            {
                dailyRecords.add(record);
            }
        }
        return dailyRecords;
    }

    /**
     * Search for specific week
     *
     * @param year
     * @param week
     * @param records
     * @return an array with records of specific week
     */
    public ArrayList<TimeRecord> weeklyData(int year, int week, ArrayList<TimeRecord> records)
    {
        var recordsOfWeek = new ArrayList<TimeRecord>();
        for (TimeRecord record : records)
        {
            if (getWeekOfYear(record.getStartTime()) == week && record.getStartTime().getYear() == year)
            {
                recordsOfWeek.add(record);
            }
        }
        return recordsOfWeek;
    }

    /**
     * Get the week of a LocalDateTime
     *
     * @param dateTime LocalDateTime
     * @return the week (int)
     */
    private int getWeekOfYear(LocalDateTime dateTime)
    {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int week = dateTime.get(weekFields.weekOfWeekBasedYear());
        return week;
    }

}
