package edu.bu.met.cs665.example1;

public class Burger implements Food {

        private String name;
        private double price;

        public Burger(){
            this.name = "Burger";
            this.price = 5.00;
        }
        @Override
        public String getName(){
            return this.name;
        }

        @Override
        public Double getPrice(){
            return this.price;
        }
}