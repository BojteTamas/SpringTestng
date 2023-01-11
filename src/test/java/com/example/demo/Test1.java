package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {
@Autowired FirstComponent firstComponent;

  @Test
  public void test1() {
    System.out.println("**************");
    System.out.println(firstComponent);
  }
  @Test
  public void test2() {
    System.out.println("**************");
    System.out.println(firstComponent);

  }
}
