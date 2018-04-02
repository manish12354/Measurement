package com.thoughtworks.bootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VolumeTest {
  @Test
  public void shouldGiveOneGallonEqualToThreePointSevenEightLiters() {
    Volume threePointSevenEightLiters = Volume.inLiter ( 3.78 );
    Volume oneGallon = Volume.inGallon ( 1 );
    assertEquals(oneGallon, threePointSevenEightLiters);
  }

  @Test
  public void shouldGiveTwoGallonNotEqualToThreePointSevenEightLiters() {
    Volume threePointSevenEightLiters = Volume.inLiter ( 3.78 );
    Volume oneGallon = Volume.inGallon ( 2 );
    assertNotEquals (oneGallon, threePointSevenEightLiters);
  }
}
