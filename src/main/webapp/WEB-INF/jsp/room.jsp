<%--
  Created by IntelliJ IDEA.
  User: xh
  Date: 2019/9/12
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Title</title>
</head>
<body>
<form action="add" method="post">
    <tr>
        <td>房型</td>
        <td ><input type="radio"  name="type" value="1" /> 标准间
        <td ><input type="radio"  name="type" value="2" />豪华间
        <td ><input type="radio"  name="type" value="2" />总统套房
        </td>
    </tr>
    <tr>
        <td>价格</td>
        <td>
        <input type="text" name="price" value="">
    </td>
    </tr>
    <tr>
        <td>所属酒店</td>
        <td >
            <select name="hotel.hid">
                <option value="-1">请选择</option>
                <c:forEach items="${hotellist}" var="h">
                    <option value="${h.hid}">${h.name}</option>
                </c:forEach>
            </select>
        </td>
    </tr>
    <tr>
        <td>
            描述
        </td>
        <td>
            <textarea rows="4" cols="20" name="info"></textarea>
        </td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"/>
        <td><input type="reset" value="重置"/>
        </td>
    </tr>
</form>
</body>
</html>
