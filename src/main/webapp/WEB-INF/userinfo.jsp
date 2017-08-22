<%--
  Created by LZHR.
  User: lizhongren1
  Date: 2017/8/21
  Time: 下午4:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
    <script src="js/jquery-3.2.1.min.js"></script>
</head>
<body>

欢迎登录!!!

<a href="/logout">请登出</a>

<a href="#" id="req">发送请求, 测试RequestBody</a>
</body>

<script>

    $("#req").click(reqTest)

    function reqTest() {

        // 向后台发送一个请求, 附带一个json参数

        var dataArray = []
        var data1 = {"id":"222", "name":"zhangsan"}
        var data2 = {"id":"444", "name":"lisi"}
        dataArray.push(data1)
        dataArray.push(data2)
        console.log(JSON.stringify(dataArray))

        $.ajax({
            type:"post",
            url:"/savedata",
            dataType:"json",
            contentType:"application/json",
            data:JSON.stringify(dataArray),
            success:function (res) {
                console.log(res);
            }
        })
    }


</script>

</html>
