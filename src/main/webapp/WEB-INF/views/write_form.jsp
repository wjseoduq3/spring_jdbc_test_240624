<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
</head>
<body>
	<h2>자유게시판 글쓰기</h2>
	<hr>
	<form action="writeOk">
		<table border="1" cellspacing="0" cellpadding="0" width="600">
			<tr>
				<td>이름</td>
				<td><input type="text" name="bname" size="60"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="btitle" size="60"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="45" name="bcontent"></textarea>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="글입력">
					<input type="button" value="글목록" onclick="javascript:window.location.href='list'">
				</td>				
			</tr>
		</table>
	
	
	
	</form>
	
</body>
</html>