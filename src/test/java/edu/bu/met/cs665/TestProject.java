package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.bu.met.cs665.example1.*;


public class TestProject {
    public TestProject() {
    }

    // test that all the drivers received the correct request.

    @Test
    public void testNotification() {
        Shop myshop = new ShopConcrete("Crazy Wok","Common Wealth Avanue 888");
        Driver[] drivers = new Driver[5];
        drivers[0] = new HumanDriver();
        drivers[1] = new HumanDriver();
        drivers[2] =new RobotDriver();
        drivers[3] =new RobotDriver();
        drivers[4] =new RobotDriver();
        // add the drivers

        for (Driver driver : drivers) {
            myshop.addObserver(driver);
        }

        Consumer brian = new Consumer("Brian","Port 45");
        Burger burger = new Burger();
        brian.placeOrder(myshop, burger);
        // to confirm all the drivers received the notification.
        for (Driver driver : drivers) {
            List<DeliveryRequest> requests = driver.getRequests();
            DeliveryRequest latest = requests.get(requests.size()-1);
            Order order = latest.getOrder();
            Shop shop = order.getShop();
            Consumer consumer = order.getConsumer();
            Food food = order.getFood();
            assertEquals(shop.getName(),"Crazy Wok");
            assertEquals(consumer.getName(),"Brian");
            assertEquals(food.getName(),"Burger");
        }

    }



}

