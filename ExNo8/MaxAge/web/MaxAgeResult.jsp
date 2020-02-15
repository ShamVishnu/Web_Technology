<%-- 
    Document   : MaxAgeResult
    Created on : 13 Feb, 2020, 10:23:49 PM
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
        <%
            String numbers[]=(request.getParameter("ages")).split(",");
            int numarray[]={0,0,0,0,0,0,0,0,0,0,0};
            for(int i=0;i<10;i++){
                numarray[i]=Integer.parseInt(numbers[i]);
            }
            int max=numarray[0];
            for(int j=0;j<10;j++){
                if(numarray[j]>max){
                    max=numarray[j];
                }
            }
            out.println("<h1>Maximum Age of the Group is : </h1><h3>"+max+"</h3>");
        %>
    </body>
</html>
