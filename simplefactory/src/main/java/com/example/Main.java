package com.example;

public class Main {
    public static void main(String[] args) {
        FactoryOfSource factoryOfSource = new FactoryOfSource();
        IngestionService ingestionService = new IngestionService(factoryOfSource);
        ingestionService.ingestDataToDatabase("API");
    }
}