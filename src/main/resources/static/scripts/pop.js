function closeCustomerinfo(){
    $('#popBox').empty();
}
function closeLegend(){
    $('#LegendpopBox').empty();
}

function setValues(customer,aqi,color){
    var curr;
    if(customer.city=="Los Angeles"){
        curr="$";
    }else{
        curr="Rs.";
    }
    $('#pop_name').html(customer.name);
    $('#pop_address').html(customer.address);
    $('#pop_phone').html(customer.phone_no);
    $('#pop_license').html(customer.license_no);
    $('#pop_vin').html(customer.vehicle.vin);
    $('#pop_vehicle').html(customer.vehicle.vehicle_type);
    $('#pop_plate').html(customer.vehicle.plate_no);
    $('#pop_odometer').html(customer.vehicle.odometer);
    $('#pop_pn').html(customer.policy.pol_no);
    $('#pop_period').html(customer.policy.pol_period);
    $('#pop_bodily').html(curr+''+customer.policy.bodily);
    $('#pop_collision').html(curr+''+customer.policy.collision);
    $('#pop_comp').html(curr+''+customer.policy.comprehensive);
    $('#pop_deductibles').html(curr+''+customer.policy.deductibles);
    $('.pop_premium').html(curr+''+customer.policy.premium);
    if(customer.vehicleType == 'Gasoline'){
        calcRevisedPremium(customer.policy.premium,aqi,curr,color);
    }else{
        $('.electricbox').hide();
        $('#custPOP').css('height','auto');
    $('.pop_premium_aqi').html(curr+''+customer.policy.premium).css('color','green');
    }
    
}

function calcRevisedPremium(premium,aqi,curr,color){
    
    var spectrum = [
        {a:0,  b:0},
        {a:50, b:5},
        {a:100,b:7.5},
        {a:150,b:10},
        {a:200,b:12.5},
        {a:300,b:15}
        ];
        var percentage;
    for(let i=0;i<spectrum.length;i++){
        if((aqi > spectrum[i].a) && (aqi < spectrum[i+1].a))
        {
            percentage = spectrum[i+1].b;
            break;
        }
        else{
            percentage = spectrum[i].b;
        }
    }
    $('#popaqi').html(aqi).css('color',color);
    $('.pop_discount').html(percentage +'%');
    $('.pop_premium_aqi').html(curr+''+(premium*((100 - percentage)/100)));
    
}