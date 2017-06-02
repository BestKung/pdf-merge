/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.kittiphorn.pdf.merger;

import java.io.IOException;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.util.PDFMergerUtility;

/**
 *
 * @author apple
 */
public class Test {
    public static void main(String[] args) throws IOException, COSVisitorException {
        PDFMergerUtility pm = new PDFMergerUtility();
        pm.addSource("/Users/apple/Desktop/a.pdf");
        pm.addSource("/Users/apple/Desktop/re249553.pdf");
        pm.setDestinationFileName("/Users/apple/Desktop/mergesuccess.pdf");
        pm.mergeDocuments();
    }
}
