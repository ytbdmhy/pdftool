<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>pdfTool</title>
    <link rel="stylesheet" href="/css/jquery-ui.css">
    <script type="text/javascript" src="/js/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="/js/jquery-ui.js"></script>
    <script type="text/javascript" src="/js/html2canvas.js"></script>
    <script type="text/javascript" src="/js/canvas2image.js"></script>
</head>
<body>
    <div id="all" style="height: 297mm;width: 210mm;margin: 0 auto">
        <h1>${msg}</h1>
        <div class="pdf_hide">
            <button onclick="downloadPdf()">点击下载pdf</button>
        </div>
        <div style="height: 100%;width: 100%">
            <img id="image1" src="/image/test.jpg">
        </div>
    </div>
    <div>
        <img id="screenShot">
        <span id="ctx" text="${ctx}" hidden="hidden"></span>
    </div>
</body>
<script type="text/javascript">
    var ctx = $("#ctx").text();
    $("#image1").draggable({
        containment: "parent"
    });

    function downloadPdf() {
        $(".pdf_hide").hide();

        // var cntElem = $("#all")[0];
        //
        // var shareContent = cntElem;
        // var width = shareContent.offsetWidth;
        // var height = shareContent.offsetHeight;
        // var canvas = document.createElement("canvas");
        // var scale = 2;
        // canvas.width = width * scale;
        // canvas.height = height * scale;
        // canvas.getContext("2d").scale(scale, scale);
        // var opts = {
        //     scale:scale,
        //     canvas:canvas,
        //     logging:false,
        //     width:width,
        //     height:height,
        //     useCORS:true
        // };
        //
        // html2canvas(shareContent, opts).then(function (canvas) {
        //     var img = Canvas2Image.convertToPNG(canvas, canvas.width, canvas.height);
        //     $(img).css({
        //         "width": canvas.width / 2 + "px",
        //         "height": canvas.height / 2 + "px",
        //     }).addClass("f-full");
        //
        //     document.body.appendChild(img);
        //
        //     console.log(img.getAttribute("src"));
        //
        //     $.ajax({
        //         type: "POST",
        //         url: ctx + "/image2pdf",
        //         data: {image:img.getAttribute("src")},
        //         success: function (result) {
        //             console.log(result);
        //         }
        //     });
        // });



        html2canvas(document.querySelector("#all"), {scale:0.75,dpi:300,logging:false}).then(function (canvas) {
            //获取截取图片路径
            var base64Url = canvas.toDataURL('image/png');
            //存入页面指定位置
            document.getElementById("screenShot").src = base64Url;
            //
            $.ajax({
                type: "POST",
                url: ctx + "/image2pdf",
                data: {image: base64Url},
                success: function (result) {
                    console.log(result);
                }
            })
        });
        $(".pdf_hide").show();

        // window.print()
    }
</script>
</html>