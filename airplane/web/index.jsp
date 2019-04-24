<%--
  Created by IntelliJ IDEA.
  User: 余奎
  Date: 2019/4/16
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      table{
        text-align: center;
      }

      th,td{
        font-weight: normal;
        width: 130px;
        height: 40px;
      }
    </style>


  </head>
  <body>
  <form method="get" action="show">
  <label for="takePortList">起飞机场：</label>
  <select name="takeid" id="takePortList" style="width: 150px;height: 30px">
    <option value="" selected="selected">-请选择-</option>
    <c:forEach items="${requestScope.takePortList}" var="takePort">
      <option value="${takePort.id}">${takePort.portName}</option>
    </c:forEach>
  </select>

  <label for="landPortList">降落机场：</label>
  <select name="landid" id="landPortList" style="width: 150px;height: 30px">
    <option value="" selected="selected">-请选择-</option>
    <c:forEach items="${requestScope.landPortList}" var="landPort">
      <option value="${landPort.id}">${landPort.portName}</option>
    </c:forEach>
  </select>
  <input type="submit" value="查询" style="text-align: center; width: 80px"></input>
  </form>

  <table border="1px" cellspacing="0px">
    <tr>
      <th>飞机编号</th>
      <th>起飞机场</th>
      <th>起飞城市</th>
      <th>降落机场</th>
      <th>降落城市</th>
      <th>航行时间</th>
      <th>票价(元)</th>
    </tr>
    <c:forEach items="${airplaneList}" var="airplane">
      <tr>
        <td>${airplane.airNo}</td>
        <td>${airplane.takePort.portName}</td>
        <td>${airplane.takePort.cityName}</td>
        <td>${airplane.landPort.portName}</td>
        <td>${airplane.landPort.cityName}</td>
        <td>
          <%--直接除不会和java一样向下取整，弱类型弱的一批--%>
          <c:if test="${airplane.time/60 > 0}">
            <fmt:formatNumber value="${airplane.time/60}" pattern="0"/>小时
          </c:if>
          <c:if test="${airplane.time%60 > 0}">
            ${airplane.time%60}分钟
          </c:if>
        </td>
        <td>${airplane.price}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
