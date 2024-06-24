<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 목록</title>
</head>
<body>
	<h3>자유게시판 글 목록</h3>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="800">
		<tr>
			<td>번호</td>
			<td width="400">제목</td>
			<td>작성자</td>
			<td>등록일</td>
			<td>조회수</td>
		</tr>
		<c:forEach items="${boardList}" var="bDto">
		<tr>
			<td>${bDto.bnum}</td>
			<td>${bDto.btitle}</td>
			<td>${bDto.bname}</td>
			<td>${bDto.bdate}</td>
			<td>${bDto.bhit}</td>
		</tr>
		</c:forEach>
	</table>	

</body>
</html>