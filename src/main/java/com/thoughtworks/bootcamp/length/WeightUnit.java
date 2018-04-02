package com.thoughtworks.bootcamp.length;

public enum WeightUnit {
  GM(1),KG(1000),TON(1000000);

  private double conversionFactor;

  WeightUnit(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  public double valueInGms(double value) {
    return value*conversionFactor;
  }
}
