package edu.bu.met.cs665.example1;

public class Pizza implements Food {

        private String name;
        private Double price;
        public Pizza(){
            this.name = "Pizza";
            this.price = 10.00;
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
