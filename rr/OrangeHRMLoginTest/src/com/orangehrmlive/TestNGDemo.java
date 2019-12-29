package com.orangehrmlive;

import org.testng.annotations.Test;

public class TestNGDemo {
  @Test(priority =1)
  public void f() {
	  System.out.println("Ayush");
  }
  @Test(priority =2)
  public void a() {
	  System.out.println("Ayush");
  }
}
