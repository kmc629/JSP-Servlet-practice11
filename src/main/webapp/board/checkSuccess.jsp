<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<script type="text/javascript">
	if(window.name == "update"){
		window.opener.parent.location.href = "BoardServlet?command=board_update_form&num=${paran.num}";
	}else if(window.name == "delete"){
		window.opener.parent.location.href = "BoardServlet?command=board_delete&num=${paran.num}";
	}
	window.close();
</script>
</body>
</html>