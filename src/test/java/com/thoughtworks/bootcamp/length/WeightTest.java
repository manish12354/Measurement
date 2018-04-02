package com.thoughtworks.bootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeightTest {
  @Test
  public void shouldGiveOneKgEqualsToOneThousandGram() {
    Weight oneThousandGm = Weight.inGM ( 1000 );
    Weight oneKg = Weight.inKg ( 1 );
    assertEquals(oneThousandGm,oneKg);
  }

  @Test
  public void shouldGiveOneTonEqualsToOneThousandKg() {
    Weight oneThousandKg = Weight.inKg ( 1000 );
    Weight inTon = Weight.inTon ( 1 );
    assertEquals(oneThousandKg,inTon);
  }
}
