package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 24.10.2016.
 */
public class PointTests {

  @Test
  public void testDistance() {
    Point p = new Point (2, -9, 2, 13);
    Assert.assertEquals(p.distance(), 22.0);
  }

  @Test
  public void testDistance2() {
    Point p = new Point (-2.3, 4, 8.5, 0.7);
    Assert.assertEquals(p.distance(), 11.292918134831227);
  }

  @Test
  public void testDistance3() {
    Point p = new Point (-3, 3, -3, 3);
    Assert.assertEquals(p.distance(), 0.0);
  }

}
