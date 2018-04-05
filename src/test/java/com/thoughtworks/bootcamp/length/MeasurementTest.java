package com.thoughtworks.bootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MeasurementTest {

  @Test
  public void shouldGive212FahrenheitEqualsTo100Celsius() {
    Measurement hundredCelsius = Measurement.inCelsius(100);
    Measurement twoHundredTwelveFahrenheit = Measurement.inFahrenheit ( 212 );
    assertEquals ( hundredCelsius,twoHundredTwelveFahrenheit);
    assertEquals ( hundredCelsius.hashCode (),twoHundredTwelveFahrenheit.hashCode ());
  }
}