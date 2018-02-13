

var map = L.map('map').setView([20.5937, 78.9629], 4.25);
var markerArray = [];
L.tileLayer('https://a.tile.openstreetmap.fr/hot/{z}/{x}/{y}.png ', {
    attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);
var token = "95b4b8c2aa47849f71608990365ec1df5cd0175d";
var city;
var eIcon = L.divIcon({className : 'electric-icon'});
var pIcon = L.divIcon({className : 'petrol-icon'});
$('#search').click(function(){

  searchAQI($('#place').val());
});
$('#locate').click(function(){

  showCustomers(city);
});
function searchAQI(keyword){
  $.getJSON("https://api.waqi.info/search/?token="+token+"&keyword="+keyword,function(response){
    console.log(response);
    var uid;
    $.each(response.data,function(i,data){
      if(data.uid == 8185) {
        uid = 8185;
        return false;
      }
      else uid = response.data[0].uid;
    });
    $.getJSON("https://api.waqi.info/feed/@"+uid+"/?token="+token,function(response){
      console.log(response);
      var lang = response.data.city.geo[1];
      var long = response.data.city.geo[0];
      var loc = response.data.city.name;
      city = loc;
      var aqi = response.data.aqi;
      var last_updated = response.data.time.s;
      $('#last_updated').html('Last Updated on  : '+last_updated);
      //response.data[0].station.geo[0]
      //var popup = $("<div>");
      //popup.append($("<b>")).html(response.data[0].station.name);
      //popup.append($("<i>")).html(response.data[0].aqi);
      //console.log(popup);
      map.setView([lang, long], 13);
      L.marker([lang, long]).addTo(map)
      .bindPopup("<div><b>"+loc+"</b>"+colorizePOPUP(aqi)+"</div>")
      .openPopup();
      
      var names = {
    			pm25: "PM<sub>2.5</sub>",
    			pm10: "PM<sub>10</sub>",
    			o3: "Ozone",
    			no2: "Nitrogen Dioxide",
    			so2: "Sulphur Dioxide",
    			co: "Carbon Monoxyde",
    			t: "Temperature",
    			w: "Wind",
    			r: "Rain (precipitation)",
    			h: "Relative Humidity",
    			d: "Dew",
    			p: "Atmostpheric Pressure"
    		};
        var table = $("#poll_info");
        table.empty();
        for (var specie in response.data.iaqi) {
      			var aqi = response.data.iaqi[specie].v;

            var tr = $("<tr>");
      			tr.append($("<td>").html(names[specie]||specie));
      			tr.append($("<td>").html(colorize(aqi,specie)));
      			table.append(tr);
      		}
          $( "#locate" ).animate({left: 0}, 1000 );
          $( "#poll_info" ).animate({right: 0}, 1000 );
          $( "#last_updated" ).animate({right: 0}, 500 );

    });


  });

  function colorizePOPUP(aqi) {

  var spectrum = [
    {a:0,  b:"#cccccc",f:"#ffffff"},
    {a:50, b:"#009966",f:"#ffffff"},
    {a:100,b:"#ffde33",f:"#000000"},
    {a:150,b:"#ff9933",f:"#000000"},
    {a:200,b:"#cc0033",f:"#ffffff"},
    {a:300,b:"#660099",f:"#ffffff"},
    {a:500,b:"#7e0023",f:"#ffffff"}
    ];


  var i = 0;
  for (i=0;i<spectrum.length-2;i++) {
    if (aqi=="-"||aqi<=spectrum[i].a) break;
  };
  return '<div style="font-size:120%;min-width:30px;text-align:center;background-color:'+spectrum[i].b+';color:'+spectrum[i].f+';">AQI:'+aqi+'</div>';


}

  function colorize(aqi, specie ) {
	specie = specie||"aqi"
	if (["pm25","pm10","no2","so2","co","o3","aqi"].indexOf(specie)<0) return aqi;

	var spectrum = [
		{a:0,  b:"#cccccc",f:"#ffffff"},
		{a:50, b:"#009966",f:"#ffffff"},
		{a:100,b:"#ffde33",f:"#000000"},
		{a:150,b:"#ff9933",f:"#000000"},
		{a:200,b:"#cc0033",f:"#ffffff"},
		{a:300,b:"#660099",f:"#ffffff"},
		{a:500,b:"#7e0023",f:"#ffffff"}
		];


	var i = 0;
	for (i=0;i<spectrum.length-2;i++) {
		if (aqi=="-"||aqi<=spectrum[i].a) break;
	};
  return $("<div/>")
    .html(aqi)
    .css("font-size","120%")
    .css("min-width","30px")
    .css("text-align","center")
    .css("background-color",spectrum[i].b)
    .css("color",spectrum[i].f);
}
}

var customer_data = [{
  "Name"  : "Amar",
  "Policy Number" : "123",
  "Vehicle" : "Audi",
  "Fuel"  : "Petrol",
  "Premium Amount"  : "12000",
  "location" : {
    "city"  : "Chennai",
    "lat" : 13.1422,
    "lon" : 80.2370
  }
},
{
  "Name"  : "Akbar",
  "Policy Number" : "1234",
  "Vehicle" : "BMW",
  "Fuel"  : "Petrol",
  "Premium Amount"  : "10000",
  "location" : {
    "city"  : "Chennai",
    "lat" : 13.0905,
    "lon" : 80.2588
  }
},
{
  "Name"  : "Antony",
  "Policy Number" : "12345",
  "Vehicle" : "Tesla",
  "Fuel"  : "Electric",
  "Premium Amount"  : "6500",
  "location" : {
    "city"  : "Chennai",
    "lat" : 13.0571,
    "lon" : 80.2751
  }
}];
var group = L.featureGroup();
function showCustomers(city){
  group.clearLayers();
  $.each(customer_data,function(i,customer){
    if(city.indexOf(customer.location.city) > -1){
      console.log(customer);
      let marker;
      if(customer.Fuel == 'Electric'){
        
        marker = L.marker([customer.location.lat, customer.location.lon],{icon : eIcon});
      }
      else{
        marker = L.marker([customer.location.lat, customer.location.lon],{icon : pIcon});
      }
      group.addLayer(marker);
      
    }
  }); 
  
  group.addTo(map);
    
  
      map.fitBounds(group.getBounds());
      map.setZoom(map.getZoom() - 1);
}