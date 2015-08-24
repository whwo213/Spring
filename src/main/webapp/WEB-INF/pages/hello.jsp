<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2015-08-08
  Time: 오후 4:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title></title>
</head>
<body>

<input type="button" onclick="location.href='aaaa'" value="목록보기">
<c:set value="${test}" var="a" />
<%
  String test = (String) pageContext.getAttribute("a");

  if(test == null){
    test = "";
  }
%>

<%if(test.equals("")){%>

<%}else{%>
<table>
  <tr align="center">
    <th>test_UUID</th>
  </tr>
  <c:choose>
    <c:when test="${fn:length(list) > 0}">
      <c:forEach items="${list }" var="row" varStatus="status">
        <tr align="center">
          <td>${row.id }</td>
        </tr>
      </c:forEach>
    </c:when>
    <c:otherwise>
      <tr>
        <td colspan="4">조회된 결과가 없습니다.</td>
      </tr>
    </c:otherwise>
  </c:choose>
</table>
<%}%>
</body>
</html>
