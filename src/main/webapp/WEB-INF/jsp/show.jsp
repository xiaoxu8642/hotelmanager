<%--
  Created by IntelliJ IDEA.
  User: xh
  Date: 2019/9/12
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>酒店管理系统</title>
</head>
<body>
<h1>酒店管理系统</h1><center/>
<div style="float: right">
    当前位置：首页>房间查询
</div>
<hr>
 <form action="rooms" method="post" >
   名称  <input type="text"  name="name" value="${name}"/>
     <input type="submit" value="查询" />
 </form>

<a href="room" >添加</a>

<table border="1">
    <tr>
        <td>ID</td>
        <td>名称</td>
        <td>房间类型</td>
        <td>价格</td>
        <td>地址</td>
        <td>电话</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="r">
        <tr>
            <td>${r.rid}</td>
            <td>${r.hotel.name}</td>
            <td>${r.type }</td>
            <td>${r.price }</td>
            <td>${r.hotel.address }</td>
            <td>${r.hotel.mobile }</td>
            <td><a href="delete?rid=${r.rid}">删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
