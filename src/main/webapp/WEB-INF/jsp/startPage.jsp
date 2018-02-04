<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <link rel="stylesheet" href="resources/resources/leaflet/leaflet.css"/>
  <script src="resources/resources/leaflet/leaflet.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="resources/styles/style.CSS"/>

</head>
<body>
  <div class="container">
    <div id="ui">
      <div class="icon">
        <img src="resources/resources/images/rect4191.png" alt="">
      </div>
      <div class="form">
        <input type="text" id="place" class="textinput" name="place" placeholder="Type a place">

         <input type="submit" id="search" class="button" name="search" value="SEARCH"/>

      </div>
    </div>
    <div id="map"></div>
  </div>

  <script src="resources/scripts/main.js"></script>
</body>
</html>
