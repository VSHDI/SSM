<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/2/2020
  Time: 下午 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.css">
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div align="center">
    <div class="m-container-small m-padded-tb-massive" style="max-width: 30em !important">
        <div class="ui container">
            <div class="ui middle aligned center aligned grid">
                <div class="column">
                    <h2 class="ui teal image header">
                        <div class="content">
                            管理后台
                        </div>
                    </h2>
                    <form class="ui large form" method="post" action="/login" th:action="@{/login}">
                        <div class="ui segment">
                            <div class="field">
                                <div class="ui left icon input">
                                    <i class="user icon"></i>
                                    <input type="text" name="username" placeholder="用户名">
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui left icon input">
                                    <i class="lock icon"></i>
                                    <input type="password" name="password" placeholder="密码">
                                </div>
                            </div>
                            <button class="ui fluid large teal submit button">Login</button>
                        </div>


                        <div class="ui error mini message"></div>


                    </form>


                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
