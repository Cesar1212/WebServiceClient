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
            String sctGrados = request.getParameter("ctGrados");
            if (sctGrados != null && !sctGrados.isEmpty()) {
                double nGrados = 0.0;
                jaxws.SWConvertTemps_Service service;
                jaxws.SWConvertTemps port;

                try {
                    // Crear un objeto de la clase que implementa el servicio
                    service = new jaxws.SWConvertTemps_Service();
                    port = service.getSWConvertTempsPort();
                    // Obtener el valor numerico escrito en la caja de texto
                    nGrados = Double.parseDouble(sctGrados);
                    // Realizar la conversión invocando al método correspondiente
                    // del objeto port de tipo SWConverTemps
                    String convertir = request.getParameter("bgGrados");
                    if (convertir.compareTo("aFahr")== 0){
                        nGrados = port.convCentAFahr(nGrados);
                    }
                    if (convertir.compareTo("aCent")== 0){
                        nGrados = port.convFahrACent(nGrados);
                    }
                    //mostrar el resultado en la caja de texto
                    Double objGrados = nGrados;
                    session.setAttribute("result", objGrados);
                } catch (NumberFormatException ex){
                    System.out.println("Dato grados incorrecto\n");
                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
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
