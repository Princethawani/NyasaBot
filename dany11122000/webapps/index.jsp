<html>
	<head>
	
	<!-- header - edit "Data/yourHtmlHeader" to customize -->
	<!-- contents - edit "EventHandlers/Html file/onCreate" to customize -->
	<meta name="generator" content="ModelWorks IDE">
	
	<title>DANY 2.01 by Jon Baer</title>

	</head>
	<body bgcolor="#ffffff" onload="document.forms[0].text.focus()">
		
		<table border="0" cellpadding="20"><tr><td>
					
					<img src="images/Dany.gif"><br><br>
		
		<font size="3" face="verdana,arial">
		Dany Version 2.01<br>
						Personal Artificial Intelligent Bot
			
			<% if (request.getParameter("virtual") == null) {
				out.println("<br><br><b>Hi there! What's your name?</b>");
			} else {
				
		String output = "Sorry, still working on this.  Be done soon.";
				
		try {
		
		output = org.dany.core.Classifier.multiline_response(request.getParameter("text"), request.getRemoteAddr(), new org.dany.core.HTMLResponder());
		
		}
				catch (Exception e) {
					out.println("<br><br><b>There was an error:</b> " + e + "<br><br>");
				}
				
				out.println(output + "<br><br>");
			}
						
						%>
			
			<form method="get" action="/">
				
							<input type="hidden" name="virtual" value="<%= request.getRemoteAddr() %>">
						<input type="text" size="30" name="text"> &nbsp; <input name="submit" type="submit" value="Reply">
				
			</form>
			
			&copy Copyright 2000 - Jon Baer
			
		</font>
					
				</td></tr></table>

	</body>
</html>

