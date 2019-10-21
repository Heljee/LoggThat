package com.helje;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeRecord
{
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    /**
     * Constructors
     */

    public TimeRecord()
    {

    }

    public TimeRecord(LocalDateTime startTime)
    {
        this.startTime = startTime;
    }

    public TimeRecord(LocalDateTime startTime, LocalDateTime endTime)
    {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * get start time
     *
     * @return startTime
     */
    public LocalDateTime getStartTime()
    {
        return startTime;
    }

    /**
     * set startTime
     *
     * @param startTime is the startTime instance
     */
    public void setStartTime(LocalDateTime startTime)
    {
        this.startTime = startTime;
    }

    /**
     * Get endTime
     *
     * @return
     */
    public LocalDateTime getEndTime()
    {
        return endTime;
    }

    /**
     * Set endTime
     *
     * @param endTime
     */
    public void setEndTime(LocalDateTime endTime)
    {
        this.endTime = endTime;
    }

    /**
     * To string
     *
     * @return string with all parameter values
     */
    @Override
    public String toString()
    {
        return "TimeRecord{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
