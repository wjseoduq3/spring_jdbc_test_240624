<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h3>글 내용 보기</h3>
	<hr>
	<tr>
			<td width="100">글번호</td>
			<td>${boardDto.bnum}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${boardDto.bhit}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${boardDto.bname}</td>
		</tr>
		<tr>
			<td>글제목</td>
			<td>${boardDto.btitle}</td>
		</tr>
		<tr>
			<td height="300" valign="top">글내용</td>
			<td valign="top">${boardDto.bcontent}</td>
		</tr>
		<tr>
			<td>등록일</td>
			<td>${boardDto.bdate}</td>
		</tr>
	</table>	
</body>
</html>