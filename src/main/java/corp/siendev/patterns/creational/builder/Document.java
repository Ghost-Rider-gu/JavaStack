/*
 * Copyright (c) 2018 SienDev company. All rights reserved.
 *
 * This is a free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 */

package corp.siendev.patterns.creational.builder;

/**
 * Simple builder of documents.
 */
public final class Document {

    private String documentName;
    private String documentOwner;
    private int documentNumber;

    private Document() {

    }

    public String getDocumentName() {
        return documentName;
    }

    public String getDocumentOwner() {
        return documentOwner;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public String toString() {
        return "Document number is " + this.documentNumber + " and name is " + this.documentName + " and belongs to " + this.documentOwner;
    }

    // Inner builder class.
    public static class Builder {
        private String documentName;
        private String documentOwner;
        private int documentNumber;

        public Builder(int documentNumber) {
            this.documentNumber = documentNumber;
        }

        public Builder owner(String documentOwner ) {
            this.documentOwner = documentOwner;

            return this;
        }

        public Builder name(String documentName) {
            this.documentName = documentName;

            return this;
        }

        public Document build() {
            Document newDocument = new Document();

            newDocument.documentNumber = this.documentNumber;
            newDocument.documentOwner = this.documentOwner;
            newDocument.documentName = this.documentName;

            return newDocument;
        }
    }

}
