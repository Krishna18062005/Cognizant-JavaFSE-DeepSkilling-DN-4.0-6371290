package FactoryMethod.factory;

import FactoryMethod.documents.Document;
import FactoryMethod.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}