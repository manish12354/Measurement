package com.thoughtworks.bootcamp.length;

import static com.thoughtworks.bootcamp.length.MeasurementType.VOLUME;

public enum VolumeUnit {
  LITER(1,VOLUME), GALLON(3.78,VOLUME);

  private final double conversionFactor;
  private MeasurementType type;

  VolumeUnit(double value,MeasurementType type) {
    this.conversionFactor = value;
    this.type = type;
  }
  public double volumeInLiters(double value){
    return (double) Math.round (((conversionFactor * value)*100)/100);
  }
}
