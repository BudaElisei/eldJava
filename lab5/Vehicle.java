package lab5;

public class Vehicle {

        private String brand;
        private String model;
        private int year;

        // Constructor for the parent class
        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Getter and setter methods for the fields
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }


}
