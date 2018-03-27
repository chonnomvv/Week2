<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function work_close(){
		// id의 값을 가져오기
		var zip1 = document.getElementByZip1("zip1").value;
		opener.document.getElementByZip1("zip1").value = zip1;
		self.close();
		opener.document.getElementById("isIdCheck").value = true;
	}
</script>
</head>
<body>

</body>
</html>