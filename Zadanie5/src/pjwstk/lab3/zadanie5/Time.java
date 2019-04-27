/*
    Zadanie 5: Stworzenie klasy Time używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie5;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String time = "";

        if(getHour() < 10) {
            time = time + "0" + getHour() + ":";
        } else {
            time = time + getHour() + ":";
        }

        if(getMinute() < 10) {
            time = time + "0" + getMinute() + ":";
        } else {
            time = time + getMinute() + ":";
        }

        if(getSecond() < 10) {
            time = time + "0" + getSecond();
        } else {
            time = time + getSecond();
        }

        return time;
    }
}
