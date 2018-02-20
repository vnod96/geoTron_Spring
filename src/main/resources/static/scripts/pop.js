function closeCustomerinfo(){
    $('#popBox').empty();
}

function setValues(customer){
    $('#pop_name').html(customer.name);
    $('#pop_pn').html(customer.policy_num);
    $('#pop_address').html(customer.address);
    $('#pop_vehicle').html(customer.vehicleType+ ' '+ customer.vehicleNumber);
    $('#pop_premium').html(customer.premiun);
    $('#pop_discount').html();
}