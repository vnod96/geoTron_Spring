$('#resultDIV').hide();

var map = L.map('map').setView([20.5937, 78.9629], 4.25);
var markerArray = [];
var loc_group = L.featureGroup();
L.tileLayer('https://a.tile.openstreetmap.fr/hot/{z}/{x}/{y}.png ', {
    attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);
var token = "95b4b8c2aa47849f71608990365ec1df5cd0175d";
var city;
var eIcon = L.divIcon({className : 'electric-icon',iconSize:[25,25]});
var pIcon = L.divIcon({className : 'petrol-icon'});
var cities = {"chennai":"3757","bangalore":"3758","los angeles":"243"};
var spectrum = [
{a:0,  b:"#cccccc",f:"#ffffff"},
{a:50, b:"#009966",f:"#ffffff"},
{a:100,b:"#ffde33",f:"#000000"},
{a:150,b:"#ff9933",f:"#000000"},
{a:200,b:"#cc0033",f:"#ffffff"},
{a:300,b:"#660099",f:"#ffffff"},
{a:500,b:"#7e0023",f:"#ffffff"}
];
var group = L.featureGroup();


$('#search').click(function(){
  loc_group.clearLayers();
  city = $('#place').val();
  searchAQI(city.toLowerCase());
});
$('#locate').click(function(){
  showCustomers(city);
});

function searchAQI(city){
  if(cities[city]){
    getCityBoundsAQI(city);
  }
}

function getCityBoundsAQI(city){
  $.getJSON("https://nominatim.openstreetmap.org/search?q="+city+"&format=json&polygon=1&addressdetails=1",function(response){
    console.log(response);
    var latlngs = response[0].polygonpoints;
    var center = [response[0].lat,response[0].lon];
    $.each(latlngs,function(i,latlon){
      let temp = latlon[0];
      latlon[0] = latlon[1];
      latlon[1] = temp;
    });
    feedUIDtoAPI(cities[city], latlngs, center);
  });
}

function feedUIDtoAPI(uid, latlngs, center){
  $.getJSON("https://api.waqi.info/feed/@"+uid+"/?token="+token,function(response){
    console.log(response);
    var lang = response.data.city.geo[0];
    var long = response.data.city.geo[1];
    var loc = response.data.city.name;
    var aqi = response.data.aqi;
    var last_updated = response.data.time.s;
    $('#last_updated').html('Last Updated on  : '+last_updated);
    map.setView([lang, long], 13);
    //let locQ = L.marker([lang, long]);
    //loc_group.addLayer(locQ).addTo(map).bindPopup("<div><b>"+loc+"</b>"+colorizePOPUP(aqi)+"</div>").openPopup();
    var polygon = L.polygon(latlngs, {color: aqiColor(aqi),opacity:0.5,fillOpacity:.1});
    loc_group.addLayer(polygon).addTo(map).bindPopup("<div><b>"+city+"</b>"+colorizePOPUP(aqi)+"</div>").openPopup();
    map.fitBounds(polygon.getBounds());
    map.setView(center);
    var names = {
        pm25: "PM<sub>2.5</sub>",
        o3: "Ozone",
        no2: "Nitrogen Dioxide",
        so2: "Sulphur Dioxide",
        co: "Carbon Monoxyde",
        t: "Temperature"
      };
      var table = $("#poll_info");
      table.empty();
      for (var specie in response.data.iaqi) {
          var aqi = response.data.iaqi[specie].v;
          if(names[specie]){
            var tr = $("<div>").addClass("poll-row").html(names[specie]);
            tr.append(colorize(aqi,specie));
            table.append(tr);
          }

        }
        $('#resultDIV').show();
  });

 
}


function colorizePOPUP(aqi) {
  let i=0;
  for (i=0;i<spectrum.length-2;i++) {
    if (aqi=="-"||aqi<=spectrum[i].a) break;
  };
  return '<div style="font-size:120%;min-width:30px;text-align:center;background-color:'+spectrum[i].b+';color:'+spectrum[i].f+';">AQI:'+aqi+'</div>';
}
function aqiColor(aqi) {
  let i=0;
  for (i=0;i<spectrum.length-2;i++) {
    if (aqi=="-"||aqi<=spectrum[i].a) break;
  };
  return spectrum[i].b;
}

function colorize(aqi, specie ) {
  specie = specie||"aqi"
  if (["pm25","pm10","no2","so2","co","o3","aqi","t"].indexOf(specie)<0) return aqi;
  if(specie == 't') return $("<div/>").html(aqi).addClass('poll-data');
  let i=0;
  for (i=0;i<spectrum.length-2;i++) {
  if (aqi=="-"||aqi<=spectrum[i].a) break;
  };
  return $("<div/>")
  .html(aqi)
  .css("background-color",spectrum[i].b)
  .css("color",spectrum[i].f).addClass('poll-data');
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


function showCustomers(city){
  group.clearLayers();
  $.getJSON("/customers/"+city,function(customer_data){
    $.each(customer_data,function(i,customer){
        console.log(customer);
        let marker;
        if(customer.vehicleType == 'Electric'){
          marker = L.marker([customer.lat, customer.lon],{icon : eIcon});
        }
        else{
          marker = L.marker([customer.lat, customer.lon],{icon : pIcon});
        }
        group.addLayer(marker);
    });
  
 

  map.fitBounds(group.getBounds());
  group.addTo(map);
      //map.setZoom(map.getZoom() - 1);
    });
}

/* $.getJSON("/customers/Chennai",function(response){
  console.log(response);
});
var d="36 Veerappan street, Sowcarpet";
$.getJSON("https://nominatim.openstreetmap.org/search?q="+d+"&format=json&polygon=1&addressdetails=1",function(response){
  console.log(response);
}); */
//https://nominatim.openstreetmap.org/search?q=135%20pilkington%20avenue,%20birmingham&format=json&polygon=1&addressdetails=1
