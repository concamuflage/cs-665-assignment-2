package edu.bu.met.cs665;

import static org.junit.Assert.assertSame;

import edu.bu.met.cs665.example1.*;
import java.util.List;
import org.junit.Test;

public class TestConsumer {
  public TestConsumer() {}

  // test that all the drivers received the correct request.

  @Test
  public void testPlaceOrder() {
    Consumer mark = new Consumer("Mark","Street A, 55");
    Shop shop = new ShopConcrete("McDonald", "Street B, 65");
    Pizza pizza = new Pizza();

    Order newOrder = mark.placeOrder(shop, pizza);
    assertSame(newOrder.getConsumer(),mark);
    assertSame(newOrder.getFood(),pizza);
    assertSame(newOrder.getShop(),shop);
  }
  


}
