package com.phoenixairline.models;

public class Flight {
 
   private int flight_id;
   private String gate;
   private String takeoff_airport;
   private String takeoff_time;
   private String takeoff_date;
   private String landing_airport;
   private String landing_time;
   private String landing_date;

  

    public Flight(int flight_id, String gate, String takeoff_airport, String takeoff_time, String takeoff_date, String landing_airport, String landing_time, String landing_date) {
         super();
        this.flight_id = flight_id;
        this.gate = gate;
        this.takeoff_airport = takeoff_airport;
        this.takeoff_time = takeoff_time;
        this.takeoff_date = takeoff_date;
        this.landing_airport = landing_airport;
        this.landing_time = landing_time;
        this.landing_date = landing_date;
    }
    
     public Flight() {
         super();
    }
   
  
    /**
     * @return the flight_id
     */
    public int getFlight_id() {
        return flight_id;
    }

    /**
     * @param flight_id the flight_id to set
     */
    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    /**
     * @return the gate
     */
    public String getGate() {
        return gate;
    }

    /**
     * @param gate the gate to set
     */
    public void setGate(String gate) {
        this.gate = gate;
    }

    /**
     * @return the takeoff_airport
     */
    public String getTakeoff_airport() {
        return takeoff_airport;
    }

    /**
     * @param takeoff_airport the takeoff_airport to set
     */
    public void setTakeoff_airport(String takeoff_airport) {
        this.takeoff_airport = takeoff_airport;
    }

    /**
     * @return the takeoff_time
     */
    public String getTakeoff_time() {
        return takeoff_time;
    }

    /**
     * @param takeoff_time the takeoff_time to set
     */
    public void setTakeoff_time(String takeoff_time) {
        this.takeoff_time = takeoff_time;
    }

    /**
     * @return the takeoff_date
     */
    public String getTakeoff_date() {
        return takeoff_date;
    }

    /**
     * @param takeoff_date the takeoff_date to set
     */
    public void setTakeoff_date(String takeoff_date) {
        this.takeoff_date = takeoff_date;
    }

    /**
     * @return the landing_airport
     */
    public String getLanding_airport() {
        return landing_airport;
    }

    /**
     * @param landing_airport the landing_airport to set
     */
    public void setLanding_airport(String landing_airport) {
        this.landing_airport = landing_airport;
    }

    /**
     * @return the landing_time
     */
    public String getLanding_time() {
        return landing_time;
    }

    /**
     * @param landing_time the landing_time to set
     */
    public void setLanding_time(String landing_time) {
        this.landing_time = landing_time;
    }

    /**
     * @return the landing_date
     */
    public String getLanding_date() {
        return landing_date;
    }

    /**
     * @param landing_date the landing_date to set
     */
    public void setLanding_date(String landing_date) {
        this.landing_date = landing_date;
    }
    

}
