package com.thoughtworks.bootcamp.length;

import sun.tools.jconsole.Plotter;

import static com.thoughtworks.bootcamp.length.MeasurementType.LENGTH;

public enum LengthUnit {
  FEET(12,LENGTH),INCH(1,LENGTH), CM (0.393,LENGTH) ,MM(0.0393,LENGTH);

  private final double conversionFactor;
  public MeasurementType type;

  LengthUnit(double conversionRatio,MeasurementType type){
    conversionFactor = conversionRatio;
    this.type = type;
  }
  public boolean isSameType(LengthUnit unit){
    return type == unit.type;
  }
  public double toBaseValue(double value){
    return (double) Math.round (((conversionFactor * value)*100)/100);
  }
}
