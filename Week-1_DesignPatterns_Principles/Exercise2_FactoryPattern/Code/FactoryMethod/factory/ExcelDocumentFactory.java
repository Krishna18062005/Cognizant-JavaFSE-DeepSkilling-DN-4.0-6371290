package FactoryMethod.factory;

import FactoryMethod.documents.Document;
import FactoryMethod.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}