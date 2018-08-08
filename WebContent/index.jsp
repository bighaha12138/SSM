<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}/static/"></base>
<meta charset="utf-8" />
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
 
<script type="text/javascript">
    $(document).ready(function() {
        onSave();
    });
 
    function onSave() {
        $.ajax({
            type : "post",
            url : "${pageContext.request.contextPath}/user/onSave",
            async : false,
            timeout : 30000,
            data : {
                "sex":"男",
                "name":"张三"
            },
            dataType : 'json',
            beforeSend : function(XMLHttpRequest) {
                 
            },
            success : function(result) {
                alert(result.message)
            },
            error : function() {
            }
        });
    }
     
     
     
</script>
</head>
 
<body>
    欢迎您！！！！！！！！！！！！！！！！
</body>
 
</html>