<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/22
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎注册|清远自然农场商城</title>
    <%--<script src="${pageContext.request.contextPath}/WEB-INF/js/common.js"/>--%>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="js/common.js"></script>

</head>
<body>
<div class="wrapper" style="width:auto;">

    <div class="header" style="height: 200px; background-color: #9a9afb">
        这个就是头部啊!!!<br/>

        <div class="header-register" style="width:100%;margin:0 auto;">
            Name: <input id="name" type="text" name="name" />
            PassWord: <input id="password" type="password" name="password" />
            Sex: <input id="sex" type="text" name="sex" />
            Tel: <input id="tel" type="tel" name="tel" />
            Homepage: <input id="homepage" type="url" name="user_url" />
            <input type="button" value="注册" onclick="register()">

        </div>

    </div>

    <div class="body" style="height: 1000px; background-color: #52d689">
        我是body!!!

    </div>

    <div class="footer" style="height: 300px;background-color: sandybrown">
        尾部就是我了
    </div>
    <script type="text/javascript">
        function register() {
//            var myemail = $("#email").val();
//            alert(myemail);
            var url = "http://localhost:8080/api/register";
            var name = $("#name").val()
            var password = $("#password").val()
            var sex = $("#sex").val()
            var tel = $("#tel").val()

            var requestParams ={
                name : name,
                password : password,
                sex : sex,
                tel : tel,
            }
            var dataType = "json";
            $.ajax({
                type: 'POST',
                url: url,
                data: JSON.stringify(requestParams),
                dataType: dataType,
                contentType : "application/json",
                success: function (jsonStr) {
                    var status = jsonStr.status;
                    var msg = jsonStr.msg;
                    var data = jsonStr.data;
                    console.log(status);
                    console.log(msg);
                    console.log(data);
                }
            });



        }



    </script>

</div>





</body>
</html>
