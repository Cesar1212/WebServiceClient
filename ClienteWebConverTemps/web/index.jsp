<%-- 
    Document   : index
    Created on : 15/05/2019, 08:03:05 PM
    Author     : cesartu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversión grados C <--> F</title>
</head>
<body>
    <div align="center">
    <!--Invocar al servicio web-->
        <%-- start web service invocation --%><hr/>
    <%
    try {
	jaxws.SWConvertTemps_Service service = new jaxws.SWConvertTemps_Service();
	jaxws.SWConvertTemps port = service.getSWConvertTempsPort();
	 // TODO initialize WS operation arguments here
	double gCent = 0.0d;
	// TODO process result here
	java.lang.Double result = port.convCentAFahr(gCent);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	jaxws.SWConvertTemps_Service service = new jaxws.SWConvertTemps_Service();
	jaxws.SWConvertTemps port = service.getSWConvertTempsPort();
	 // TODO initialize WS operation arguments here
	double gFahr = 0.0d;
	// TODO process result here
	java.lang.Double result = port.convFahrACent(gFahr);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%>
    <hr/>
    <hr/>
    <form style="font-family:arial">
        Grados:<br>
        <input type="text" name="ctGrados" value="${result}" style="text-align:right"/><br><br>
        <input type="submit" value="Convertir" name="btConvertir"/><br><br>
        <input type="radio" name="bgGrados" value="aFahr" checked="true"/>
        Centigrados a Fahrenheit<br>
        <input type="radio" name="bgGrados" value="aCent"/>
        Fahrenheit a Centrigados<br>
    </form>
    <hr/>
    </div>
</body>
</html>
