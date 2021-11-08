package com.shop.model;

public class Offer {
    public int offerId;
    public double offerAmount;
    // status of offer is false if pending and true if accepted
    public boolean status;
    public int item_id;
    public int customer_id;
    public int quantity;

    public int getOfferId() {
        return offerId;
    }


    public double getOfferAmount() {
        return offerAmount;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getItem_id() {
        return item_id;
    }


    public int getCustomer_id() {
        return customer_id;
    }


    public int getQuantity() {
        return quantity;
    }


    public Offer(double offerAmount, int quantity, int item_id, int customer_id) {
        this.offerAmount=offerAmount;
        this.item_id = item_id;
        this.customer_id = customer_id;
        this.quantity = quantity;
    }

    public Offer() {
    }

    @Override
    public String toString() {
        return "Offer{" +
                "offerId=" + offerId +
                ", offerAmount=" + offerAmount +
                ", status=" + status +
                ", item_id=" + item_id +
                ", customer_id=" + customer_id +
                ", quantity=" + quantity +
                '}';
    }
}
