package com.thoughtworks.bootcamp.length;

import org.junit.Test;
import static org.junit.Assert.*;
public class LengthTest {
  @Test
  public void shouldGiveTrueFor1FeetWith1Feet() {
    Length oneFoot = Length.inFeet(1);
    Length oneAnotherFoot = Length.inFeet(1);
    assertTrue(oneFoot.equals(oneAnotherFoot));
  }

  @Test
  public void shouldGiveFalseFor1FeetWith2Feet() {
    Length oneFoot = Length.inFeet(2);
    Length oneAnotherFoot = Length.inFeet(1);
    assertFalse (oneFoot.equals(oneAnotherFoot));
  }

  @Test
  public void shouldGiveTrueForOneFeetAndTwelveInch() {
    Length feet = Length.inFeet(1);
    Length inch = Length.inInch(12);
    assertEquals(feet,inch);
  }

  @Test
  public void shouldGiveFalseForTwoFeetAndTwelveInch() {
    Length twoFeet = Length.inFeet(2);
    Length twelveInch = Length.inInch(12);
    assertNotEquals(twoFeet,twelveInch);
  }

  @Test
  public void shouldGiveTwoInchEqualToFiveCm() {
    Length fiveCM = Length.inCm ( 5 );
    Length twoInch = Length.inInch (2);
    assertEquals ( twoInch,fiveCM);
  }

  @Test
  public void shouldNotEqualToOneInchAndOneCm () {
    Length oneCM = Length.inCm ( 1 );
    Length oneInch = Length.inInch (1);
    assertNotEquals ( oneInch,oneCM);
  }

  @Test
  public void shouldEqualToOneCmAndTenMm() {
    Length tenMM = Length.inMm ( 10 );
    Length oneCM = Length.inCm ( 1 );
    assertEquals ( tenMM,oneCM );
  }

  @Test()
  public void shouldThrowExceptionForComparisonOfDifferentTypes() {
    Length tenMM = Length.inMm ( 10 );
    Weight inTon = Weight.inTon ( 1 );
    assertNotEquals( tenMM, inTon);
  }
}