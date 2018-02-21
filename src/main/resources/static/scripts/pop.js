function closeCustomerinfo(){
    $('#popBox').empty();
}

function setValues(customer,aqi){
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
    $('#pop_bodily').html(customer.policy.bodily);
    $('#pop_collision').html(customer.policy.collision);
    $('#pop_comp').html(customer.policy.comprehensive);
    $('#pop_deductibles').html(customer.policy.deductibles);
    $('.pop_premium').html(customer.policy.premium);
    if(customer.vehicleType == 'Gasoline'){
        calcRevisedPremium(customer.policy.premium,aqi);
    }else{

    }
    
}

function calcRevisedPremium(premium,aqi){
    
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
    $('#pop_discount').html(percentage +'%');
    $('.pop_premium_aqi').html(premium*((100 - percentage)/100));
    
}