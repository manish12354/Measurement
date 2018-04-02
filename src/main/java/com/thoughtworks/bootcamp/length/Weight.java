package com.thoughtworks.bootcamp.length;

import java.util.Objects;

public class Weight {
  private double value;
  private WeightUnit unit;

  public Weight(double value, WeightUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Weight inGM(double value) {
    return new Weight ( value,WeightUnit.GM );
  }

  public static Weight inKg(double value) {
    return new Weight ( value,WeightUnit.KG);
  }

  @Override
  public String toString() {
    return "Weight{" +
            "value=" + value +
            ", unit=" + unit +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Weight)) return false;
    Weight weight = (Weight) o;
    return Double.compare ( weight.unit.valueInGms(weight.value ),unit.valueInGms(value)) == 0;
  }

  @Override
  public int hashCode() {

    return Objects.hash ( value);
  }

  public static Weight inTon(double value) {
    return new Weight ( value,WeightUnit.TON );
  }
}
