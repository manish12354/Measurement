package com.thoughtworks.bootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VolumeUnitTest {
  @Test
  public void should() {
    VolumeUnit gallon =  VolumeUnit.GALLON;
    gallon.volumeInLiters(2);
    assertEquals (gallon.volumeInLiters(2),7.36,1.0);
  }
}
