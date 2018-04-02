package com.thoughtworks.bootcamp.length;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit unit;
  private Length(double value,LengthUnit unit){
    this.unit = unit;
    this.value = value;
  }

  public static Length inMm(double value) {
    return new Length(value,LengthUnit.MM);
  }

  public static Length inFeet(double value){
    return new Length(value,LengthUnit.FEET);
  }

  public static Length inInch(double value){
    return new Length(value,LengthUnit.INCH);
  }

  public static Length inCm(double value) {
    return new Length(value,LengthUnit.CM);
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Length length = (Length) other;
    return length.unit.isSameType(unit)&& Double.compare(length.unit.toBaseValue (length.value), unit.toBaseValue (value)) == 0;
  }



  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return "Length{" +
            "inches=" + value +
            ", unit=" + unit +
            '}';
  }

}
