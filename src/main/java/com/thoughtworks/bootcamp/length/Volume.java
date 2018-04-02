package com.thoughtworks.bootcamp.length;

import java.util.Objects;

public class Volume {
  private final double volume;
  private final VolumeUnit unit;

  private Volume(double volume, VolumeUnit unit) {
    this.volume = volume;
    this.unit = unit;
  }

  public static Volume inLiter(double volume) {
    return new Volume ( volume, VolumeUnit.LITER );
  }
  public static Volume inGallon(double volume) {
    return new Volume ( volume, VolumeUnit.GALLON );
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Volume volume = (Volume) other;
    return Double.compare(volume.unit.volumeInLiters (volume.volume), unit.volumeInLiters (this.volume)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.volume);
  }
}
