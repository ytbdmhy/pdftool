package com.ytbdmhy.pdftool.controller;

//import com.itextpdf.text.*;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.Rectangle;
//import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Base64;
import java.util.stream.Collectors;

@RestController
public class Test2Controller {

//    @GetMapping("/image2pdf")
//    public String image2pdf() {
//        try {
//            String exportPath = "C:\\Users\\Administrator\\Desktop\\荷花.pdf";
//            String imagePath = "C:\\Users\\Administrator\\Desktop\\荷花.jpg";
//            File file = new File(imagePath);
//            BufferedImage bufferedImage = ImageIO.read(file);
//            FileOutputStream outputStream = new FileOutputStream(exportPath);
//            Document document = new Document(PageSize.A4, 0, 0, 0, 0);
////            document.setPageSize(new Rectangle(image.getWidth(), image.getHeight()));
//            document.setPageSize(new Rectangle(595.0F, 842.0F));
//            PdfWriter.getInstance(document, outputStream);
//            Image img = Image.getInstance(imagePath);
//            document.open();
//            document.add(img);
//            document.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (BadElementException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//        return "over";
//    }

//    @PostMapping("/image2pdf")
//    public String image2pdf(@RequestParam String image, HttpServletResponse response) {
//        System.out.println("image2pdf");
//        try {
//            OutputStream output = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\245626.jpg"));
//            output.write(image.substring(22).getBytes());
//            output.flush();
//            String exportPath = "C:\\Users\\Administrator\\Desktop\\image2pdf" + System.currentTimeMillis() + ".pdf";
//            FileOutputStream outputStream = new FileOutputStream(exportPath);
//            Document document = new Document(PageSize.A4, 0, 0, 0, 0);
//            document.setPageSize(new Rectangle(595.0F, 842.0F));
//            PdfWriter.getInstance(document, outputStream);
//            Image img = Image.getInstance(Base64.getDecoder().decode(image.substring(22))); // 22 = "data:image/jpeg;base64".length()
//            document.open();
//            document.add(img);
//            document.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (BadElementException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//        return "over";
//    }

    private static String getString() {
        InputStream inputStream = Test2Controller.class.getResourceAsStream("/templates/xichong_insured_registration_pdf.ftl");
        String result = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining(System.lineSeparator()));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getString());
    }
}
