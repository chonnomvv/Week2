<%@page import="kr.co.bit.day4.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ID checking page</title>
<script type="text/javascript">
	function work_close(){
		// id의 값을 가져오기
		var userid = document.getElementById("id").value;
		opener.document.getElementById("userid").value = userid;
		self.close();
		opener.document.getElementById("isIdCheck").value = true;
	}
</script>

</head>
<body>
<%
	String id = request.getParameter("id");
	String match_check = request.getParameter("match");

	if (match_check == null) {
		match_check = "";
	} else {
		if (match_check.equals("f")) {
			out.print("already used");
		} else {
			out.print("cong");
		}
	}
%>
	<form action="search_id.jsp" method="post">
		ID<input type="text" name="id" id="id" value= "<%=id%>"> 
		  <input type="submit" value="ID check">
		<!-- search_id.jsp로 연결하여 user만 사용가능하고 admin 은 사용 불가능하도록 결정한 후 사용여부를 id_check.jsp에 전달하여 참고하도록 한다. -->
		<button onclick="work_close()">Use this Id</button>

	</form>
	ID check

</body>
</html>