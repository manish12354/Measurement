package com.thoughtworks.bootcamp.length;

public class ArithmeticMeasurement extends Measurement {

  private ArithmeticMeasurement(double value , MeasurementUnit unit) {
    super ( value , unit );
  }
  public static ArithmeticMeasurement inKg(double value) {
    return new ArithmeticMeasurement (  value,MeasurementUnit.KG);
  }

  public static ArithmeticMeasurement inMm(double value) {
    return new ArithmeticMeasurement ( value, MeasurementUnit.MM);
  }

  public static ArithmeticMeasurement inFeet(double value){
    return new ArithmeticMeasurement ( value, MeasurementUnit.FEET);
  }

  public static ArithmeticMeasurement inInch(double value){
    return new ArithmeticMeasurement ( value, MeasurementUnit.INCH);
  }

  public static ArithmeticMeasurement inCm(double value) {
    return new ArithmeticMeasurement ( value, MeasurementUnit.CM);
  }

  public static ArithmeticMeasurement inLiter(double volume) {
    return new ArithmeticMeasurement (  volume, MeasurementUnit.LITER);
  }
  public static ArithmeticMeasurement inGallon(double volume) {
    return new ArithmeticMeasurement (  volume, MeasurementUnit.GALLON);
  }

  public static ArithmeticMeasurement inGM(double value) {
    return new ArithmeticMeasurement (  value,MeasurementUnit.GM);
  }

  public static ArithmeticMeasurement inTon(double value) {
    return new ArithmeticMeasurement (  value,MeasurementUnit.TON);
  }

  public ArithmeticMeasurement add(ArithmeticMeasurement other,MeasurementUnit expectedUnit) throws IncompatibleUnitTypeException {
    if (!unit.isSameType(other.unit)) throw new IncompatibleUnitTypeException();
    double firstResult = toUnit(this,expectedUnit);
    double secondResult = toUnit(other,expectedUnit);
    double result = (double) Math.round ((firstResult+secondResult)*100)/100;
    return new ArithmeticMeasurement (result,expectedUnit);
  }

  private double toUnit(ArithmeticMeasurement measurement , MeasurementUnit standardUnit) {
    return super.toUnit(measurement , standardUnit );
  }
}
