var map = L.map('map').setView([13.067439, 80.237617], 20);

L.tileLayer('https://a.tile.openstreetmap.fr/hot/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);
var token = "95b4b8c2aa47849f71608990365ec1df5cd0175d";
$('#search').click(function(){

  searchAQI($('#place').val());
});
function searchAQI(keyword){
  $.getJSON("https://api.waqi.info/search/?token="+token+"&keyword="+keyword,function(response){
    console.log(response);
    var lang = response.data[0].station.geo[0];
    var long = response.data[0].station.geo[1];
    var loc = response.data[0].station.name;
    var aqi = response.data[0].aqi;
    //response.data[0].station.geo[0]
    //var popup = $("<div>");
    //popup.append($("<b>")).html(response.data[0].station.name);
    //popup.append($("<i>")).html(response.data[0].aqi);
    //console.log(popup);
    map.setView([lang, long], 20);
    L.marker([lang, long]).addTo(map)
    .bindPopup("<div><b>"+loc+" :</b><i>"+aqi+"</i></div>")
    .openPopup();
  });
}
