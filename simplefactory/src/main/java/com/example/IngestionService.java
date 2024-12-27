package com.example;

public class IngestionService {
    private FactoryOfSource factoryOfSource = null;

    public IngestionService(FactoryOfSource factoryOfSource){
        this.factoryOfSource = factoryOfSource;
    }

    public void ingestDataToDatabase(String source){
        IngestToDatabase sourceObject = factoryOfSource.getInstanceOfSource(source);
        sourceObject.ingestData();
    }
}
