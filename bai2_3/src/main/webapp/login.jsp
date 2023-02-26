<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Processing</title>
</head>
<body>
	<% //Code java ở đây 
	//Lấy dữ liệu
	String tenDangNhap;
	String matKhau;
	tenDangNhap = request.getParameter("LoginName");
	matKhau = request.getParameter("LoginPass");
	//In thử xem dữ liệu có đúng hay không
	out.append(tenDangNhap+"<br>");
	out.append(matKhau+"<br>");
	if ( tenDangNhap.equals("ABC") &&  matKhau.equals("MNK") )
	{
		//chuyển đến trang userprofile
		response.sendRedirect("/bai2_3/UserProfile.html");
	}
		else
	{
		//chuyển đến trang userprofile
		response.sendRedirect("/bai2_3/login.html");
	}
	
	%>
</body>
</html>