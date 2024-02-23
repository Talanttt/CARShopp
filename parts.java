package org.example;

public class parts {
        private String name;
        private double price;

        public parts() {
        }

        public parts(String name, double price) {
                this.name = name;
                this.price = price;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        @Override
        public String toString() {
                return "Parts{" +
                        "name='" + name + '\'' +
                        ", price=" + price +
                        '}';
        }
}
