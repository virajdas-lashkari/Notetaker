<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Note Taker</title>
<%@include file="style.jsp"%>
</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<div class="card shadow bg-white py-5">
			<img alt="" class="img-fluid mx-auto" style="max-width: 400px;"
				src="images/note_card.png">
			<h1 class="text-primary text-uppercase text-center mt-4">Start
				Taking Your Notes !</h1>
			<div class="container text-center">
				<a href="add_notes.jsp"
					class="btn btn-outline-primary btn-lg text-center">Start Here</a>
			</div>
		</div>
	</div>

</body>
</html>
