package com.thoughtworks.bootcamp.length;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
public class ArithmeticMeasurementTest {
  private ArithmeticMeasurement oneFoot;
  private ArithmeticMeasurement twoInches;
  private ArithmeticMeasurement fourInches;
  private ArithmeticMeasurement twelveInches;
  private ArithmeticMeasurement twentyFourInches;
  private ArithmeticMeasurement oneKilogram;

  @Before
  public void setUp() {
    oneFoot = ArithmeticMeasurement.inFeet(1d);
    twoInches = ArithmeticMeasurement.inInch(2d);
    fourInches = ArithmeticMeasurement.inInch(4d);
    twelveInches = ArithmeticMeasurement.inInch(12d);
    twentyFourInches = ArithmeticMeasurement.inInch(24d);
    oneKilogram = ArithmeticMeasurement.inKg (1d);
  }

  @Test
  public void shouldGiveTrueFor1FeetWith1Feet() {
    ArithmeticMeasurement oneFoot = ArithmeticMeasurement.inFeet(1);
    ArithmeticMeasurement oneAnotherFoot = ArithmeticMeasurement.inFeet(1);
    assertTrue(oneFoot.equals(oneAnotherFoot));
  }

  @Test
  public void shouldGiveFalseFor1FeetWith2Feet() {
    ArithmeticMeasurement oneFoot = ArithmeticMeasurement.inFeet(2);
    ArithmeticMeasurement oneAnotherFoot = ArithmeticMeasurement.inFeet(1);
    assertFalse (oneFoot.equals(oneAnotherFoot));
  }

  @Test
  public void shouldGiveTrueForOneFeetAndTwelveInch() {
    ArithmeticMeasurement feet = ArithmeticMeasurement.inFeet(1);
    ArithmeticMeasurement inch = ArithmeticMeasurement.inInch(12);
    assertEquals(feet,inch);
  }

  @Test
  public void shouldGiveFalseForTwoFeetAndTwelveInch() {
    ArithmeticMeasurement twoFeet = ArithmeticMeasurement.inFeet(2);
    ArithmeticMeasurement twelveInch = ArithmeticMeasurement.inInch(12);
    assertNotEquals(twoFeet,twelveInch);
  }

  @Test
  public void shouldGiveTwoInchEqualToFiveCm() {
    ArithmeticMeasurement fiveCM = ArithmeticMeasurement.inCm ( 5 );
    ArithmeticMeasurement twoInch = ArithmeticMeasurement.inInch (2);
    assertEquals ( twoInch,fiveCM);
  }

  @Test
  public void shouldNotEqualToOneInchAndOneCm () {
    ArithmeticMeasurement oneCM = ArithmeticMeasurement.inCm ( 1 );
    ArithmeticMeasurement oneInch = ArithmeticMeasurement.inInch (1);
    assertNotEquals ( oneInch,oneCM);
  }

  @Test
  public void shouldEqualToOneCmAndTenMm() {
    ArithmeticMeasurement tenMM = ArithmeticMeasurement.inMm ( 10 );
    ArithmeticMeasurement oneCM = ArithmeticMeasurement.inCm ( 1 );
    assertEquals ( tenMM,oneCM );
  }

  @Test()
  public void shouldThrowExceptionForComparisonOfDifferentTypes() {
    ArithmeticMeasurement tenMM = ArithmeticMeasurement.inMm ( 10 );
    ArithmeticMeasurement inTon = ArithmeticMeasurement.inTon ( 1 );
    assertNotEquals( tenMM, inTon);
  }

  @Test
  public void shouldGiveOneGallonEqualToThreePointSevenEightLiters() {
    ArithmeticMeasurement threePointSevenEightLiters = ArithmeticMeasurement.inLiter ( 3.78 );
    ArithmeticMeasurement oneGallon = ArithmeticMeasurement.inGallon ( 1 );
    assertEquals(oneGallon, threePointSevenEightLiters);
  }

  @Test
  public void shouldGiveTwoGallonNotEqualToThreePointSevenEightLiters() {
    ArithmeticMeasurement threePointSevenEightLiters = ArithmeticMeasurement.inLiter ( 3.78 );
    ArithmeticMeasurement oneGallon = ArithmeticMeasurement.inGallon ( 2 );
    assertNotEquals (oneGallon, threePointSevenEightLiters);
  }

  @Test
  public void shouldGiveOneKgEqualsToOneThousandGram() {
    ArithmeticMeasurement oneThousandGm = ArithmeticMeasurement.inGM ( 1000 );
    ArithmeticMeasurement oneKg = ArithmeticMeasurement.inKg ( 1 );
    assertEquals(oneThousandGm,oneKg);
  }

  @Test
  public void shouldGiveOneTonEqualsToOneThousandKg() {
    ArithmeticMeasurement oneThousandKg = ArithmeticMeasurement.inKg ( 1000 );
    ArithmeticMeasurement inTon = ArithmeticMeasurement.inTon ( 1 );
    assertEquals(oneThousandKg,inTon);
  }

  @Test
  public void shouldNotCompareDifferentMeasurementTypes() {
    ArithmeticMeasurement oneThousandKg = ArithmeticMeasurement.inKg ( 1000 );
    ArithmeticMeasurement oneGallon = ArithmeticMeasurement.inGallon ( 1 );
    assertNotEquals ( oneGallon,oneThousandKg );
  }


  @Test
  public void shouldGiveFourInchesForAddingTwoInchAndTwoInch() throws IncompatibleUnitTypeException {
    ArithmeticMeasurement anotherTwoInches = ArithmeticMeasurement.inInch (2d);
    assertEquals(twoInches.add(anotherTwoInches, MeasurementUnit.INCH), fourInches);
  }

  @Test
  public void shouldNotGiveFourInchesForAddingTwoInchAndFourInch() throws IncompatibleUnitTypeException {
    ArithmeticMeasurement anotherFourInches = ArithmeticMeasurement.inInch (4d);
    ArithmeticMeasurement unexpectedAddition = twoInches.add(fourInches,MeasurementUnit.INCH);
    assertNotEquals(unexpectedAddition.hashCode(), anotherFourInches.hashCode());
    assertNotEquals(unexpectedAddition,anotherFourInches);
  }

  @Test
  public void shouldGiveTwoFeetForAddingOneFeetAndTwelveInches() throws IncompatibleUnitTypeException {
    ArithmeticMeasurement twoFeet = ArithmeticMeasurement.inFeet(2d);
    ArithmeticMeasurement expectedAddition = oneFoot.add(twelveInches,MeasurementUnit.INCH);
    assertEquals(expectedAddition.hashCode(), twentyFourInches.hashCode());
    assertEquals(expectedAddition,twoFeet);
  }

  @Test
  public void shouldGiveTwentyFourInchesForAddingTwelveInchesAndOneFeet() throws IncompatibleUnitTypeException {
    ArithmeticMeasurement expectedAddition = twelveInches.add(oneFoot,MeasurementUnit.INCH);
    assertEquals(expectedAddition.hashCode(), twentyFourInches.hashCode());
    assertEquals(expectedAddition.toString (),twentyFourInches.toString ());
  }

  @Test(expected = IncompatibleUnitTypeException.class)
  public void shouldThrowExceptionForAddingDifferentMeasurementUnit() throws IncompatibleUnitTypeException {
    twoInches.add(oneKilogram,MeasurementUnit.INCH);
  }

  @Test
  public void shouldCheckOneGallonAndOneLitreEqualToFourPointSevenEightLitres() throws IncompatibleUnitTypeException {
    ArithmeticMeasurement oneGallon = ArithmeticMeasurement.inGallon ( 1 );
    ArithmeticMeasurement oneLitre = ArithmeticMeasurement.inLiter ( 1 );
    ArithmeticMeasurement expectedLitre = ArithmeticMeasurement.inLiter ( 4.78 );
    assertEquals (oneGallon.add(oneLitre,MeasurementUnit.LITER).toString(),expectedLitre.toString () );
  }
}