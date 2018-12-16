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
 * Simple test for builder pattern.
 * It's not usual test.
 */
public class DocumentBuilderTest {

    public static void main(String[] args) {
        Document testDocument = new Document.Builder(20).name("test document").owner("Garry Garrison").build();

        System.out.println(testDocument);
        System.out.printf("Document number is %s \nDocument name is %s \nDocument owner is %s",
                          testDocument.getDocumentNumber(), testDocument.getDocumentName(), testDocument.getDocumentOwner());
    }

}
