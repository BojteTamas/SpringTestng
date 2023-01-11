package com.example.demo;

import java.util.Random;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

@SpringBootTest(classes = {SpringConfig.class, DemoApplication.class})
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class BaseTest extends AbstractTestNGSpringContextTests {

  @BeforeClass(alwaysRun = true)
  protected final void springTestContextPrepareTestInstance() throws Exception {
    super.springTestContextPrepareTestInstance();
  }

  @BeforeMethod(alwaysRun = true)
  public void tearDown() {
    System.out.println(new Random().nextInt(10000));
  }
}
