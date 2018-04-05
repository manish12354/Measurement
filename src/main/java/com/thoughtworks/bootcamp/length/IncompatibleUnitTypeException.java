package com.thoughtworks.bootcamp.length;

public class IncompatibleUnitTypeException extends Throwable {
  public IncompatibleUnitTypeException() {
    super("Can not add units of different types!");
  }
}

