<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/05/2020
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Bài tập hiển thị danh sách khách hàng</title>
  </head>
  <body>
  <table>
    <tbody>
    <tr>
      <th>Name</th>
      <th>Date</th>
      <th>Address</th>
    </tr>
    <tr>
    <c:forEach items="${list}" var="customer">
      <tr>
        <td>
          <c:out value="${customer.getName()}"/>
        </td>
        <td>
          <c:out value="${customer.getDate()}"/>
        </td>
        <td>
          <c:out value="${customer.getAddress()}"/>
        </td>
      </tr>
    </c:forEach>
    </tr>
    </tbody>
  </table>
  <form method="post" action="/show-list">
    <input type="submit" value="Show list">
  </form>
  </body>
</html>
