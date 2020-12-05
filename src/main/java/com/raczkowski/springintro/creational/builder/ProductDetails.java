package com.raczkowski.springintro.creational.builder;

import java.util.Date;
import java.util.List;

public class ProductDetails {
    private final int id;
    private final String name;
    private final String description;
    private final Date expirationDate;
    private final int weight;
    private final int price;
    private final String producer;
    private final String restrictions;
    private final List<String> categories;

    private ProductDetails(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.expirationDate = builder.expirationDate;
        this.weight = builder.weight;
        this.price = builder.price;
        this.producer = builder.producer;
        this.restrictions = builder.restrictions;
        this.categories = builder.categories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String name;
        private String description;
        private Date expirationDate;
        private int weight;
        private int price;
        private String producer;
        private String restrictions;
        private List<String> categories;

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder withProducer(String producer) {
            this.producer = producer;
            return this;
        }

        public Builder withRestrictions(String restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder withCategories(List<String> categories) {
            this.categories = categories;
            return this;
        }

        public ProductDetails build() {
            return new ProductDetails(this);
        }
    }
}
