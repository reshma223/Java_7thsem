<%@ page import="com.innovator.user.LoginBean" %>  <!-- Corrected import -->
<p>You have successfully logged in!</p>
<%
    LoginBean bean = (LoginBean) request.getAttribute("bean");
    out.print("Welcome, " + bean.getName());
%>
