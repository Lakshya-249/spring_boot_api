package application.web_app2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class postorder {
    @JsonProperty("c-name")
    private String customer;
    @JsonProperty("p-name")
    private String product;
    @JsonProperty("q-amt")
    private Integer cost;
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "postorder{" +
                "customer='" + customer + '\'' +
                ", product='" + product + '\'' +
                ", cost=" + cost +
                '}';
    }
}
