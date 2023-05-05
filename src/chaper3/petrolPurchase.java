package chaper3;

public class petrolPurchase {
        private String stationLocation;
        private String typeOfPetrol;
        private int quantity;
        private double pricePerLiter;
        private double percentageDiscount;

    public petrolPurchase(String stationLocation, String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPurchase(){
        return (quantity * pricePerLiter) - (quantity * pricePerLiter * (percentageDiscount/100));
    }

}
class Petrol {
    public static void main(String[] args) {
        petrolPurchase purchase = new petrolPurchase("New York", "Regular", 20, 2.5, 10);
        double netAmount = purchase.getPurchase();
        System.out.println("Net amount: " + netAmount);
        String station = purchase.getStationLocation();
        System.out.println("The fuel station is located at " + station );
    }
}
