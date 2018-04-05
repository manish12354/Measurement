package com.thoughtworks.bootcamp.length;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class MeasurementUnitTest {

  private MeasurementUnit oneLiter;
  private MeasurementUnit oneGallon;
  private MeasurementUnit oneKilogram;
  private MeasurementUnit oneTonne;

  @Before
  public void setUp() {
    oneLiter = MeasurementUnit.LITER;
    oneGallon = MeasurementUnit.GALLON;
    oneKilogram = MeasurementUnit.KG;
    oneTonne = MeasurementUnit.TON;
  }

  @Test
  public void shouldGiveOneFeetInInchEqualToTwelveFeet() {
    MeasurementUnit feet = MeasurementUnit.FEET;
    assertEquals(feet.toUnit ( 1 ,MeasurementUnit.INCH ),12,0.0);
  }

  @Test
  public void should() {
    MeasurementUnit gallon =  MeasurementUnit.GALLON;
    assertEquals (gallon.toUnit(2,MeasurementUnit.LITER),7.36,1.0);
  }

  @Test
  public void shouldGiveOneKgEqualToOneThousandGm() {
    MeasurementUnit kg = MeasurementUnit.KG;
    assertEquals ( kg.toUnit ( 1 ,MeasurementUnit.GM),1000,0.0 );
  }

  /////////////

  @Test
  public void shouldGiveTwelveInchesForOneFoot() {
    MeasurementUnit oneFoot = MeasurementUnit.FEET;
    assertEquals(oneFoot.toUnit (1d,MeasurementUnit.INCH), 12d, 0);
  }

  @Test
  public void shouldGiveOneInchForInch() {
    MeasurementUnit oneInch = MeasurementUnit.INCH;
    assertEquals(oneInch.toUnit(1d,MeasurementUnit.INCH), 1d, 0);
  }

  @Test
  public void shouldGiveTwoInchesForFiveCentimeter() {
    MeasurementUnit fiveCM = MeasurementUnit.CM;
    assertEquals(fiveCM.toUnit(5d,MeasurementUnit.INCH), 2d, 0.3);
  }

  @Test
  public void shouldGiveOneInchForThirtyMillimeter() {
    MeasurementUnit thirtyMM = MeasurementUnit.MM;
    assertEquals(thirtyMM.toUnit(25d,MeasurementUnit.INCH), 1d, 0.2);
  }

  @Test
  public void shouldGiveThreePointSevenEightLitersForOneGallon() {
    assertEquals(oneGallon.toUnit(1d,MeasurementUnit.INCH), 3.78d, 0.78);
  }

  @Test
  public void shouldGiveOneLiterForOneLiter() {
    assertEquals(oneLiter.toUnit(1d,MeasurementUnit.INCH), 1d, 0);
  }

  @Test
  public void shouldNotGiveOneLiterForOneGallon() {
    assertNotEquals(oneGallon.toUnit(1d,MeasurementUnit.INCH), 1d, 0);
  }

  @Test
  public void shouldGiveOneKilogramForOneKilogram() {
    assertEquals(oneKilogram.toUnit(1d,MeasurementUnit.KG), 1d, 0);
  }

  @Test
  public void shouldGiveOneKilogramForOneTonne() {
    assertEquals(oneTonne.toUnit(1d,MeasurementUnit.INCH), 1000000d, 0);
  }

  @Test
  public void shouldNotGiveOneKilogramForOneTonne() {
    assertNotEquals(oneTonne.toUnit(1d,MeasurementUnit.INCH), 1d, 0);
  }
  @Test
  public void shouldGiveValueInGivenUnit() {
    double twoPointFiveCm = MeasurementUnit.INCH.toUnit ( 1 , MeasurementUnit.CM );
    assertThat(twoPointFiveCm,is(2.5));
  }

  @Test
  public void shouldGive212FahrenheitEqualsTo100Celsius() {
    double hundredCelsius = MeasurementUnit.FAHRENHEIT.toUnit ( 212 , MeasurementUnit.CELSIUS );
    assertThat ( hundredCelsius,is (100d) );
  }

  @Test
  public void shouldGive100CelsiusEqualsTo212Fahrenheit() {
    double twoHundredTwelveFahrenheit = MeasurementUnit.CELSIUS.toUnit ( 100 , MeasurementUnit.FAHRENHEIT );
    assertThat (twoHundredTwelveFahrenheit,is (212d));
  }
}
