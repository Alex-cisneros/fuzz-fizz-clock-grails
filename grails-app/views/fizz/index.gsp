<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>fizz-buzz-clock</title>
    </head>
    <body>
        <h1>Ingresa la hora:</h1>
        <g:form name="myForm" url="[controller:'fizz']">
            <g:textField name="hora" />
            
            <g:actionSubmit value="fizz-buzz clock" action='check'/>
        </g:form>    
        
        <p>
            <%= resultado %>
        </p>
    </body>
</html>
