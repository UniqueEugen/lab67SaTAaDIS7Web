<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.lab67sataadis7web.data.main.GetAnimalsImpl" %>
<%@ page import="com.example.lab67sataadis7web.data.main.animalsXML.Entity" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%! private List<Entity> animals;%>
<table border="4" cellspacing="2">
<tr><td>Вид</td><td>Подвид</td><td>Семейство</td><td>Цена</td><td>Описание</td></tr>
<%
    animals =  GetAnimalsImpl.getInstance().getAnimals();
    for (Entity animal : animals) {
        out.println("<a href='animal-move?id="+animal.getId()+"'><tr onclick='window.location.href=`animal-move?id="+animal.getId()+"`'><td>" + animal.getKind() + "</td><td>" + animal.getSubspecies() + "</td><td>" + animal.getType() +
                "</td><td>" + animal.getPrice() + "</td><td>" + animal.getDescription() + "</td></tr></a>");
    }
%>
</table>
<br/>
<div>Вы владеете <%= animals.size()%> животными стоимостью <%= animals.stream().mapToDouble(Entity::getPrice).sum() %></div>
<dialog>
    <p><button id="closeDialog">X</button></p>
    <p id="move">${moveType}</p>
</dialog>
<script>
    var dialog = document.querySelector('dialog');
    document.querySelector('#closeDialog').onclick = function() {
        dialog.close(); // Прячем диалоговое окно
    }
</script>
<p>${message}</p>
</body>
</html>