package com.shop.model;

public class Offer {
    public int offerId;
    public double offerAmount;
    public String status;
    public int item_id;
    public int customer_id;
    public int quantity;

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public double getOfferAmount() {
        return offerAmount;
    }

    public void setOfferAmount(double offerAmount) {
        this.offerAmount = offerAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
