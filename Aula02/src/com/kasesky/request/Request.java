package com.kasesky.request;

import java.time.LocalDate;

public class Request {
    private Integer number;
    private LocalDate date;
    private Double value;
    private Integer quantity;
    private Double total;

    public Request(Integer number, LocalDate date, Double value, Integer quantity) {
        this.number = number;
        this.date = date;
        this.value = value;
        this.quantity = quantity;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return this.value * this.quantity;
    }
}
