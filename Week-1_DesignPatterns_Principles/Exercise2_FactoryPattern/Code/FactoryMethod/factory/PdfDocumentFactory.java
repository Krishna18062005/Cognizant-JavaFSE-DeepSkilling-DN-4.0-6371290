package FactoryMethod.factory;

import FactoryMethod.documents.Document;
import FactoryMethod.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}