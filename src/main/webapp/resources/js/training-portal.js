/**
 * Created by user on 07.03.2015.
 */
//неработает через ajax(XHR)
function sendAjax() {
    var fileName = '';
    $.ajax(
        {
            url: 'http://localhost:8080/files/file/download',
            type: 'POST',
            data: JSON.stringify({'userGuid': '124f-7fhs-34sf', 'operator': 'MTC', 'period': '11.2015'}),
            dataType: 'json',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function (data) {
                console.log(data);
                console.log(data.responseText);
                fileName = data.responseText;
            },
            error: function (data) {
                console.log(data);
            }
        }
    );
    var url = 'http://localhost:8080/files/file/download' + fileName;
    window.open(url);
}

function getFile() {
    window.open("http://localhost:8080/files/file/download/getMethod?userGuid=1243&period=11.1202&operator=MTC");
}
