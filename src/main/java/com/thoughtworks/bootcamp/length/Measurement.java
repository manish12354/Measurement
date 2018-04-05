package com.thoughtworks.bootcamp.length;

public class Measurement {
  protected final double value;
  protected final MeasurementUnit unit;
  protected Measurement(double value , MeasurementUnit unit){
    this.unit = unit;
    this.value = value;
  }

  public static Measurement inFahrenheit(double value) {
    return new Measurement ( value, MeasurementUnit.FAHRENHEIT );
  }

  public static Measurement inCelsius(double value) {
    return new Measurement ( value,MeasurementUnit.CELSIUS );
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Measurement length = (Measurement) other;
    if (!length.unit.isSameType(unit))
      return false;
    double secondBaseValue = (double) Math.round ((toUnit(length ,unit)*100)/100);
    return length.unit.isSameType(unit)
            && Double.compare( value , secondBaseValue ) == 0;
  }

  protected double toUnit(Measurement measurement , MeasurementUnit standardUnit) {
    return measurement.unit.toUnit (measurement.value,standardUnit);
  }

  @Override
  public int hashCode() {
    return unit.hash(value);
  }

  @Override
  public String toString() {
    return "Measurement{" +
            "value=" + value +
            ", unit=" + unit +
            '}';
  }
}
