package com.lzz.book.algorithm;

import java.time.Year;
import java.util.Objects;

public class Date {
    private int day;

    private int month;

    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int day(){
        return day;
    }
    public int month(){
        return month;
    }
    public int year(){
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public static void main(String[] args) {
        Date date = new Date(1, 2, 3);
        Date date2 = new Date(1, 2, 3);
        System.out.println(date.equals(date2));
    }
}
