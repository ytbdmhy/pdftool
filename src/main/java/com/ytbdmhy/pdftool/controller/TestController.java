package com.ytbdmhy.pdftool.controller;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.canvas.draw.ILineDrawer;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.LineSeparator;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.tool.xml.Pipeline;
//import com.itextpdf.tool.xml.XMLWorker;
//import com.itextpdf.tool.xml.XMLWorkerHelper;
//import com.itextpdf.tool.xml.html.CssAppliers;
//import com.itextpdf.tool.xml.html.CssAppliersImpl;
//import com.itextpdf.tool.xml.html.Tags;
//import com.itextpdf.tool.xml.html.head.XML;
//import com.itextpdf.tool.xml.parser.XMLParser;
//import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
//import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
//import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
//import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
//import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import com.ytbdmhy.pdftool.dao.EndowmentInsuranceDao;
import com.ytbdmhy.pdftool.entity.EndowmentInsurance;
//import com.ytbdmhy.pdftool.util.FontProvider;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private EndowmentInsuranceDao endowmentInsuranceDao;

    @RequestMapping("")
    public ModelAndView testFreemarker(ModelMap modelMap, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("ctx", request.getContextPath());
        modelMap.addAttribute("msg", "Hello , this is freemarker");
        modelAndView.addAllObjects(modelMap);
        return modelAndView;
    }

    @GetMapping("/table1")
    public ModelAndView table1(@RequestParam String id, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("xichong_county_table_pdf");
        modelAndView.addObject("ctx", request.getContextPath());
        if (!StringUtils.isEmpty(id)) {
            EndowmentInsurance endowmentInsurance = endowmentInsuranceDao.selectByPrimaryKey(Integer.valueOf(id));
            if (endowmentInsurance != null)
                modelAndView.addObject(endowmentInsurance);
        }
        return modelAndView;
    }

//    @GetMapping("/getPdf")
//    public String getPdf(HttpServletResponse response) {
//        String url = "D:\\WorkJavaProject\\pdftool\\src\\main\\resources\\templates\\";
//        String ftl = "xichong_county_table1_pdf.ftl";
//        String htmlPre = "xichong.html";
//        Writer out = null;
//        HashMap<String, Object> needReplaceMapData = new HashMap<String, Object>();
//        EndowmentInsurance endowmentInsurance = new EndowmentInsurance();
//        endowmentInsurance.setId(1);
//        endowmentInsurance.setName("缪颢云");
//        endowmentInsurance.setGender(1);
//        endowmentInsurance.setIdentityNumber("320623199005275293");
//        endowmentInsurance.setIsVillageSignature(1);
//        endowmentInsurance.setIsTownSignature(0);
//        endowmentInsurance.setPaymentStandard("200");
//        endowmentInsurance.setPhone("13818748004");
//        endowmentInsurance.setNation("汉族");
//        needReplaceMapData.put("endowmentInsurance", endowmentInsurance);
//        try {
//            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(url + htmlPre), "UTF-8"));
//            Configuration configuration = new Configuration();
//            configuration.setClassicCompatible(true);
//            TemplateLoader templateLoader = new FileTemplateLoader(new File(url));
//            configuration.setTemplateLoader(templateLoader);
//            Template template = configuration.getTemplate(ftl);
//            template.setEncoding("UTF-8");
//            template.process(needReplaceMapData, out);
//            out.flush();
//            out.close();
//
//            String html = url + htmlPre;
////            String html = "./src/main/resources/templates/hello.ftl";
//            String exportPath = "C:\\Users\\Administrator\\Desktop/test.pdf";
//            String fontPath = "./src/main/resources/static/font/NotoSansCJKsc-Regular.otf";
//            ConverterProperties converterProperties = new ConverterProperties();
//            // 字体
//            DefaultFontProvider fontProvider = new DefaultFontProvider(false, false, false);
//            // 添加字体
//            fontProvider.addFont(fontPath);
//            // 设置字体
//            converterProperties.setFontProvider(fontProvider);
//            // 生成test.pdf
//            PdfWriter writer = new PdfWriter(exportPath);
//            PdfDocument pdfDocument = new PdfDocument(writer);
//            pdfDocument.setDefaultPageSize(PageSize.A4);
//            FileInputStream fileInputStream = new FileInputStream(html);
//            // Document
//            Document document = HtmlConverter.convertToDocument(fileInputStream, pdfDocument, converterProperties);
//            EndPosition endPosition = new EndPosition();
//            LineSeparator separator = new LineSeparator(endPosition);
//            document.add(separator);
//            document.getRenderer().close();
//            PdfPage page = pdfDocument.getPage(1);
//            page.setMediaBox(new Rectangle(0, 0, 595.0F, 842.0F));
//            document.close();
//            pdfDocument.close();
//            writer.close();
//            fileInputStream.close();
//
//            File pdfFile = new File(exportPath);
//            FileInputStream pdfInputS = new FileInputStream(exportPath);
//            InputStream inputStream = new BufferedInputStream(pdfInputS);
//            int count = 0;
//            byte[] bytes = new byte[inputStream.available()];
//            response.setContentType("application/force-download");
//            response.setCharacterEncoding("UTF-8");
//            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("test.pdf", "UTF-8"));
//            OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
//            outputStream.write(bytes);
//
//            pdfInputS.close();
//            outputStream.flush();
//            outputStream.close();
//
////            File file = new File(html);
////            file.delete();
//            return "pdf导出成功";
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "pdf导出失败";
//        } catch (TemplateException e) {
//            e.printStackTrace();
//            return "pdf导出失败";
//        } finally {
//
//        }
//    }
//
//    private class EndPosition implements ILineDrawer {
//
//        /** A Y-position. */
//        protected float y;
//
//        /**
//         * Gets the Y-position.
//         *
//         * @return the Y-position
//         */
//        public float getY() {
//            return y;
//        }
//
//        @Override
//        public void draw(PdfCanvas pdfCanvas, Rectangle rectangle) {
//            this.y = rectangle.getY();
//        }
//
//        @Override
//        public float getLineWidth() {
//            return 0;
//        }
//
//        @Override
//        public void setLineWidth(float v) {
//
//        }
//
//        @Override
//        public Color getColor() {
//            return null;
//        }
//
//        @Override
//        public void setColor(Color color) {
//
//        }
//    }

//    public static void main(String[] args) {
//        String url = "D:\\WorkJavaProject\\pdftool\\src\\main\\resources\\templates\\";
//        String ftl = "xichong_county_table1_pdf.ftl";
//        String html = "xichong.html";
//        Writer out = null;
//        HashMap<String, Object> needReplaceMapData = new HashMap<String, Object>();
//        EndowmentInsurance endowmentInsurance = new EndowmentInsurance();
//        endowmentInsurance.setId(1);
//        endowmentInsurance.setName("缪颢云");
//        endowmentInsurance.setGender(1);
//        endowmentInsurance.setIdentityNumber("320623199005275293");
//        endowmentInsurance.setIsVillageSignature(1);
//        endowmentInsurance.setIsTownSignature(0);
//        endowmentInsurance.setPaymentStandard("200");
//        endowmentInsurance.setPhone("13818748004");
//        endowmentInsurance.setNation("汉族");
//        needReplaceMapData.put("endowmentInsurance", endowmentInsurance);
//        try {
//            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(url + html), "UTF-8"));
//            Configuration configuration = new Configuration();
//            configuration.setClassicCompatible(true);
//            TemplateLoader templateLoader = new FileTemplateLoader(new File(url));
//            configuration.setTemplateLoader(templateLoader);
//            Template template = configuration.getTemplate(ftl);
//            template.setEncoding("UTF-8");
//            template.process(needReplaceMapData, out);
//
//            Document document = new Document();
//            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(url + "xichong.pdf"));
//            document.open();
//            FontProvider fontProvider = new FontProvider();
//            fontProvider.addFontSubstitute("lowagie", "garamond");
//            fontProvider.setUseUnicode(true);
//            // 使用我们的字体提供器，并将其设置为unicode字体样式
//            CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);
//            HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers);
//            htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
//            CSSResolver cssResolver = XMLWorkerHelper.getInstance().getDefaultCssResolver(true);
//            Pipeline<?> pipeline = new CssResolverPipeline(cssResolver, new HtmlPipeline(htmlContext, new PdfWriterPipeline(document, pdfWriter)));
//            XMLWorker worker = new XMLWorker(pipeline, true);
//            XMLParser parser = new XMLParser(worker);
//            File input = new File(url + html);
//            parser.parse(new InputStreamReader(new FileInputStream(input), "UTF-8"));
//            document.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (TemplateException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//
//    }
}

