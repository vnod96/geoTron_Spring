function closeCustomerinfo(){
    $('#popBox').empty();
}

function setValues(customer,aqi){
    $('#pop_name').html(customer.name);
    $('#pop_pn').html(customer.policy_num);
    $('#pop_address').html(customer.address);
    $('#pop_vehicle').html(customer.vehicleNumber+ '  ('+ customer.vehicleType +')');
    $('#pop_premium').html(customer.premiun);
    $('#pop_discount').html(calcRevisedPremium(customer.premiun,aqi));
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

    return (premium*((100 - percentage)/100));
}