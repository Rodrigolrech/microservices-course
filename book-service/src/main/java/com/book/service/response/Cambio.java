package com.book.service.response;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Cambio implements Serializable {

    private long id;
    private String from;
    private String to;
    private BigDecimal conversionFactor;
    private double convertedValue;
    private String environment;

    public Cambio() {
    }

    public Cambio(long id, String from, String to, BigDecimal conversionFactor, double convertedValue, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.convertedValue = convertedValue;
        this.environment = environment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cambio cambio = (Cambio) o;
        return id == cambio.id && Double.compare(cambio.convertedValue, convertedValue) == 0 && Objects.equals(from, cambio.from) && Objects.equals(to, cambio.to) && Objects.equals(conversionFactor, cambio.conversionFactor) && Objects.equals(environment, cambio.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, conversionFactor, convertedValue, environment);
    }
}
