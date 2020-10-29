<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.hnjd.news.dao.NewsDao" %>
<%@ page import="com.hnjd.news.dao.NewsDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hnjd.news.entity.News" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	${username}
	
	<%
		NewsDao newsDao = new NewsDaoImpl();
		List<News> newsList = newsDao.getAllNews();
	%>
		<!-- for(int news = 0;i<items.length;news++) -->
	<table>
		<tr>
			<th>新闻标题</th>
			<th>新闻作者</th>
			<th>创建时间</th>
			<th>修改时间</th>
		</tr>
		<c:forEach var="news" items="<%=newsList%>">
			<tr>
				<td>${news.ntitle}</td>
				<td>${news.nauthor}</td>
				<td>${news.ncreateDate}</td>
				<td>${news.nmodifyDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>