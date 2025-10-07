/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: main class for program entry point
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.*;
import java.util.List;


/**
 * The {@code Main} class serves as the program’s entry point, demonstrating
 * the observer pattern by simulating a food delivery system involving
 * {@code Shop}, {@code Driver}, {@code Consumer}, and {@code Order} objects.
 */
public class Main {

  /**
   * Initializes the {@code Shop}, {@code Driver}s, and {@code Consumer},
   * places an {@code Order}, and prints notifications sent to all {@code Driver}s.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    Shop myshop = new ShopConcrete("Crazy Wok", "Common Wealth Avanue 888");
    Driver[] drivers = new Driver[5];
    drivers[0] = new HumanDriver();
    drivers[1] = new HumanDriver();
    drivers[2] = new RobotDriver();
    drivers[3] = new RobotDriver();
    drivers[4] = new RobotDriver();
    // add the drivers

    for (Driver driver : drivers) {
      myshop.addObserver(driver);
    }

    Consumer brian = new Consumer("Brian", "Port 45");
    Burger burger = new Burger();
    brian.placeOrder(myshop, burger);
    // to confirm all the drivers received the notification.
    for (Driver driver : drivers) {
      List<DeliveryRequest> requests = driver.getRequests();
      DeliveryRequest latest = requests.get(requests.size() - 1);
      Order order = latest.getOrder();
      Shop shop = order.getShop();
      Consumer consumer = order.getConsumer();
      Food food = order.getFood();
      System.out.println(
          consumer.getName()
              + " ordered "
              + food.getName()
              + " from "
              + shop.getName()
              + "; Delivery Address: "
              + consumer.getAddress()
              + ". Notified Driver: "
              + driver.getIdNumber());
    }
  }
}
