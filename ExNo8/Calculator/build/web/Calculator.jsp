<%-- 
    Document   : Calculator.jsp
    Created on : 13 Feb, 2020, 10:53:09 PM
    Author     : shamv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculator Result</h1>
        <%
        int flag=0;
        String Num1=request.getParameter("First_Number");
        String Num2=request.getParameter("Second_Number");
        String Operation=request.getParameter("Operator");
        int num1=Integer.parseInt(Num1);
        int num2=Integer.parseInt(Num2);
        int operationval=Integer.parseInt(Operation);
        int Result=0;
        switch (operationval){
        case 1:
            Result=num1+num2;
            break;
        case 2:
            Result=num1-num2;
            break;
        case 3:
            Result=num1*num2;
            break;
        case 4:
            Result=num1/num2;
            break;
        case 5:
            Result=num1%num2;
            break;
        default:
            flag=1;
            out.println("Illegal Operation");
        }
        if(flag==0){
            out.println("<h1>The Result is : </h1><h3>"+Result+"</h3>");
        }
        else{
            out.println("<h1>Enter a Valid Operator");
        }
        %>
    </body>
</html>
