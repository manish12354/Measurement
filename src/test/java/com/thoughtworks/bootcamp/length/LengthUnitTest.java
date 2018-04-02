package com.thoughtworks.bootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthUnitTest {
  @Test
  public void shouldGiveOneFeetInInchEqualToTwelveFeet() {
    LengthUnit feet = LengthUnit.FEET;
    assertEquals(feet.toBaseValue ( 1 ),12,0.0);
  }
}
