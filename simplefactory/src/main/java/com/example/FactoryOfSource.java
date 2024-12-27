package com.example;

public class FactoryOfSource {
    IngestToDatabase sourceSystemObject = null;

    public IngestToDatabase getInstanceOfSource(String source){
        if(source == "API") sourceSystemObject = new SourceFromDataAPI();
        else if (source == "Database") sourceSystemObject = new SourceFromDatabase();
        else if (source == "Datalake") sourceSystemObject = new SourceFromDatalake();
        return sourceSystemObject;
    }
}
