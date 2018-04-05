package com.thoughtworks.bootcamp.length;


import java.util.Objects;

import static com.thoughtworks.bootcamp.length.MeasurementType.*;

public enum MeasurementUnit {
  FEET(12,LENGTH),INCH(1,LENGTH), CM (0.4,LENGTH) ,
  MM(0.04,LENGTH),LITER(1,VOLUME), GALLON(3.78,VOLUME),
  GM(1,WEIGHT),KG(1000,WEIGHT),TON(1000000,WEIGHT),
  FAHRENHEIT (5.0/9.0,TEMPERATURE,32),CELSIUS (1,TEMPERATURE);

  private final double conversionFactor;
  private MeasurementType type;
  private final int constValue;

  MeasurementUnit(double conversationRatio , MeasurementType type) {
    this.conversionFactor = conversationRatio;
    this.type = type;
    this.constValue = 0;
  }

  MeasurementUnit(double conversionRatio , MeasurementType type , int constant) {
    this.conversionFactor = conversionRatio;
    this.type = type;
    this.constValue = constant;
  }


  public boolean isSameType(MeasurementUnit unit){
    return type == unit.type;
  }

  public double toUnit(double value, MeasurementUnit unit) {
    return toBaseUnit(value)/unit.conversionFactor + unit.constValue;
  }

  private double toBaseUnit(double value) {
    return (double) Math.round ( (value - constValue) * conversionFactor *100)/100 ;
  }

  public int hash(double value) {
    return Objects.hash(toBaseUnit(value),type);
  }
}
