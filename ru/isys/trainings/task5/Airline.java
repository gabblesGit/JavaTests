package ru.isys.trainings.task5;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {

    public enum AirlineType {
          REGULAR ("Регулярный")
        , CHARTER ("Чартерный");

        private String russTitle;

        AirlineType(String russTitle){
            this.russTitle = russTitle;
        }

        public String getRussTitle() {
            return russTitle;
        }

    };

    public String      Destination;
    public int         NumReis;
    public LocalTime   FlightTime;
    public DayOfWeek   dayOfWeek;
    public AirlineType airlineType;

    public String getDestination() {
        return Destination;
    }

    public int getNumReis() {
        return NumReis;
    }

    public LocalTime getFlightTime() {
        return FlightTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public void setNumReis(int numReis) {
        NumReis = numReis;
    }

    public void setFlightTime(LocalTime flightTime) {
        FlightTime = flightTime;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public AirlineType getAirlineType() {
        return airlineType;
    }

    public void setAirlineType(AirlineType airlineType) {
        this.airlineType = airlineType;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "Destination='" + Destination +
                ", NumReis="    + NumReis +
                ", FlightTime=" + FlightTime +
                ", dayOfWeek="  + dayOfWeek +
                ", AirlineType " + this.airlineType.russTitle +
                '}';
    }


    public static void main(String[] args) {

        Airline airline = new Airline();

        airline.setDayOfWeek(DayOfWeek.MONDAY);
        airline.setDestination("TestDestination");
        airline.setFlightTime(LocalTime.NOON);
        airline.setNumReis(7574);
        airline.setAirlineType(AirlineType.CHARTER);

        System.out.println(airline.toString());



    }

}
