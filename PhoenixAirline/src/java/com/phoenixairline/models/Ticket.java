package com.phoenixairline.models;

import java.util.UUID;

public class Ticket {

    private UUID userId;
    private UUID fhacId;
    private String passportNumber;
    private String bookingDate;
    private String classType;
    private int numberOfSeats;
    private String totalPrice;

    public Ticket(UUID userId, UUID fhacId, String passportNumber, String bookingDate, String classType, int numberOfSeats, String totalPrice) {
        this.userId = userId;
        this.fhacId = fhacId;
        this.passportNumber = passportNumber;
        this.bookingDate = bookingDate;
        this.classType = classType;
        this.numberOfSeats = numberOfSeats;
        this.totalPrice = totalPrice;
    }

    /**
     * @return the userId
     */
    public UUID getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    /**
     * @return the fhacId
     */
    public UUID getFhacId() {
        return fhacId;
    }

    /**
     * @param fhacId the fhacId to set
     */
    public void setFhacId(UUID fhacId) {
        this.fhacId = fhacId;
    }

    /**
     * @return the passportNumber
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * @param passportNumber the passportNumber to set
     */
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    /**
     * @return the bookingDate
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * @param bookingDate the bookingDate to set
     */
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    /**
     * @return the classType
     */
    public String getClassType() {
        return classType;
    }

    /**
     * @param classType the classType to set
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * @return the numberOfSeats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * @param numberOfSeats the numberOfSeats to set
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * @return the totalPrice
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

}
