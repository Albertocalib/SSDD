function busquedaModelos() {
    var urlPage = "/Inicio/Modelos";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
        document.getElementById("ordenarPorId").innerText = "";
        var node = document.createElement('option');
        node.selected = true;
        node.value = node.text = "Elige una opción";
        var node2 = document.createElement("option");
        node2.value = node2.text = "Valor Facial";
        var node3 = document.createElement("option");
        node3.value = node3.text = "Unidad monetaria";
        var node4 = document.createElement("option");
        node4.value = node4.text = "Diámetro";
        var node5 = document.createElement("option");
        node5.value = node5.text = "Peso";
        document.getElementById("ordenarPorId").appendChild(node);
        document.getElementById("ordenarPorId").appendChild(node2);
        document.getElementById("ordenarPorId").appendChild(node3);
        document.getElementById("ordenarPorId").appendChild(node4);
        document.getElementById("ordenarPorId").appendChild(node5);
        $("#botonCrear").replaceWith("<button id = \"botonCrear\" class=\"btn btn-fab btn-round btn-color\"\n" +
            "                data-toggle=\"modal\"\n" +
            "                data-target=\"#crearModelo\"\n" +
            "        ><i class=\"material-icons\">add</i>\n" +
            "            </button>");

    })

}

function busquedaEjemplares() {
    var urlPage = "/Inicio/Ejemplares";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
        document.getElementById("ordenarPorId").innerText = "";
        var node = document.createElement("option");
        node.selected = true;
        var textnode = document.createTextNode("Elige una opción");
        node.appendChild(textnode);
        var node2 = document.createElement("option");
        node2.addEventListener('click',function (ev) {ordenarEjemplaresFechasAdquisicion()},false);
        node2.value = node2.text = "Fecha de adquisición";
        var node3 = document.createElement("option");
        node3.value = node3.text = "Ciudad de acuñación";
        var node4 = document.createElement("option");
        node4.value = node4.text = "Año de acuñación";
        var node5 = document.createElement("option");
        node5.value = node5.text = "Proveedor";
        document.getElementById("ordenarPorId").appendChild(node);
        document.getElementById("ordenarPorId").appendChild(node2);
        document.getElementById("ordenarPorId").appendChild(node3);
        document.getElementById("ordenarPorId").appendChild(node4);
        document.getElementById("ordenarPorId").appendChild(node5);
        $("#botonCrear").replaceWith("<button id = \"botonCrear\" class=\"btn btn-fab btn-round btn-color\"\n" +
            "                data-toggle=\"modal\"\n" +
            "                data-target=\"#crearEjemplar\"\n" +
            "        ><i class=\"material-icons\">add</i>\n" +
            "            </button>");
    })
}

function busquedaProveedores() {
    var urlPage = "/Inicio/Proveedores";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
        document.getElementById("ordenarPorId").innerText = "";
        var node = document.createElement("option");
        node.selected = true;
        var textnode = document.createTextNode("Elige una opción");
        node.appendChild(textnode);
        var node2 = document.createElement("option");
        node2.value = node2.text = "Código fiscal";
        var node3 = document.createElement("option");
        node3.value = node3.text = "Nombre";
        var node4 = document.createElement("option");
        node4.value = node4.text = "Dirección postal";
        document.getElementById("ordenarPorId").appendChild(node);
        document.getElementById("ordenarPorId").appendChild(node2);
        document.getElementById("ordenarPorId").appendChild(node3);
        document.getElementById("ordenarPorId").appendChild(node4);
        $("#botonCrear").replaceWith("<button id = \"botonCrear\" class=\"btn btn-fab btn-round btn-color\"\n" +
            "                data-toggle=\"modal\"\n" +
            "                data-target=\"#crearProveedor\"\n" +
            "        ><i class=\"material-icons\">add</i>\n" +
            "            </button>");
    })

}

function buscarEjemplaresModelos(valorFacial,unidadMonetaria){

    var urlPage = "/Inicio/EjemplaresModelos/"+valorFacial+"/"+unidadMonetaria;
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function ordenarEjemplaresFechasAdquisicion(){
    var urlPage = "/Inicio/Ejemplares/FechaAdquisicion";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}