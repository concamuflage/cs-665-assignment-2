package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Driver {
    private int idNumber;
    private List<DeliveryRequest> requests;

    public Driver (){
        this.idNumber = generateID();
        this.requests = new ArrayList<>();
    }
    public void update(DeliveryRequest request)
       {requests.add(request);}

    public int getIDNumber(){
        return this.idNumber;
    }

    public List<DeliveryRequest> getRequests(){
        return this.requests;
    }

    public int generateID(){
        Random rand = new Random();
        return rand.nextInt(800_000 - 100_000 + 1) + 100_000;
    }
}
