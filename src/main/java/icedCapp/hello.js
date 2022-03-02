$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/addBuddy"
    }).then(function(data) {
       $('.name').append(data.name);
       $('.age').append(data.age);
       $('.phoneNumber').append(data.phoneNumber);
    });
});
