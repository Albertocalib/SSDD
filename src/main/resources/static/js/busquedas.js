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
        node2.addEventListener('click',function (ev) {ordenarModelosValorFacialAsc()},false);
        node2.value = node2.text = "Valor Facial Ascendente";
        var node6 = document.createElement("option");
        node6.addEventListener('click',function (ev) {ordenarModelosValorFacialDes()},false);
        node6.value = node6.text = "Valor Facial Descendente";
        var node3 = document.createElement("option");
        node3.addEventListener('click',function (ev) {ordenarModelosUnidadMonetariaAsc()},false);
        node3.value = node3.text = "Unidad monetaria Ascendente";
        var node7 = document.createElement("option");
        node7.addEventListener('click',function (ev) {ordenarModelosUnidadMonetariaDes()},false);
        node7.value = node7.text = "Unidad monetaria Descendente";
        var node4 = document.createElement("option");
        node4.addEventListener('click',function (ev) {ordenarModelosDiametroAsc()},false);
        node4.value = node4.text = "Diámetro Ascendente";
        var node8 = document.createElement("option");
        node8.addEventListener('click',function (ev) {ordenarModelosDiametroDes()},false);
        node8.value = node8.text = "Diámetro Descendente";
        var node5 = document.createElement("option");
        node5.addEventListener('click',function (ev) {ordenarModelosPesoAsc()},false);
        node5.value = node5.text = "Peso Ascendente";
        var node9 = document.createElement("option");
        node9.addEventListener('click',function (ev) {ordenarModelosPesoDes()},false);
        node9.value = node9.text = "Peso Descendente";
        document.getElementById("ordenarPorId").appendChild(node);
        document.getElementById("ordenarPorId").appendChild(node2);
        document.getElementById("ordenarPorId").appendChild(node6);
        document.getElementById("ordenarPorId").appendChild(node3);
        document.getElementById("ordenarPorId").appendChild(node7);
        document.getElementById("ordenarPorId").appendChild(node4);
        document.getElementById("ordenarPorId").appendChild(node8);
        document.getElementById("ordenarPorId").appendChild(node5);
        document.getElementById("ordenarPorId").appendChild(node9);
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
        var node5 = document.createElement("option");
        node5.addEventListener('click',function (ev) {ordenarEjemplaresFechasAdquisicionDes()},false);
        node5.value = node5.text = "Fechas de adquisicion descendentes";
        var node3 = document.createElement("option");
        node3.addEventListener('click',function (ev) {ordenarEjemplaresCiudadAcunacion()},false);
        node3.value = node3.text = "Ciudad de acuñación";

        var node7 = document.createElement("option");
        node7.addEventListener('click',function (ev) {ordenarEjemplaresCiudadAcunacionDes()},false);
        node7.value = node7.text = "Ciudad de acuñación descente";

        var node4 = document.createElement("option");
        node4.addEventListener('click',function (ev) {ordenarEjemplaresAnoAcunacion()},false);
        node4.value = node4.text = "Año de acuñación";

        var node6 = document.createElement("option");
        node6.addEventListener('click',function (ev) {ordenarEjemplaresAnoAcunacionDes()},false);
        node6.value = node6.text = "Año de acuñación Descendente";

        var node8 = document.createElement("option");
        node8.addEventListener('click',function (ev) {ordenarEjemplaresNombreProveedor()},false);
        node8.value = node8.text = "Nombre Proveedor";

        var node9 = document.createElement("option");
        node9.addEventListener('click',function (ev) {ordenarEjemplaresNombreProveedorDes()},false);
        node9.value = node9.text = "Nombre Proveedor Descendente";

        document.getElementById("ordenarPorId").appendChild(node);
        document.getElementById("ordenarPorId").appendChild(node2);
        document.getElementById("ordenarPorId").appendChild(node5);
        document.getElementById("ordenarPorId").appendChild(node3);
        document.getElementById("ordenarPorId").appendChild(node7);
        document.getElementById("ordenarPorId").appendChild(node4);
        document.getElementById("ordenarPorId").appendChild(node6);
        document.getElementById("ordenarPorId").appendChild(node8);
        document.getElementById("ordenarPorId").appendChild(node9);

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
        node2.addEventListener('click',function (ev) {ordenarProveedoresCodigoIdFiscal()},false);
        node2.value = node2.text = "Codigo Identificacion Fiscal";

        var node3 = document.createElement("option");
        node3.addEventListener('click',function (ev) {ordenarProveedoresCodigoIdFiscalDes()},false);
        node3.value = node3.text = "Codigo Identificacion Fiscal descendente";

        var node4 = document.createElement("option");
        node4.addEventListener('click',function (ev) {ordenarProveedoresNombre()},false);
        node4.value = node4.text = "Nombre";

        var node5 = document.createElement("option");
        node5.addEventListener('click',function (ev) {ordenarProveedoresNombreDes()},false);
        node5.value = node5.text = "Nombre descendente";

        var node6 = document.createElement("option");
        node6.addEventListener('click',function (ev) {ordenarProveedoresDirPostal()},false);
        node6.value = node6.text = "Direccion Postal";

        var node7 = document.createElement("option");
        node7.addEventListener('click',function (ev) {ordenarProveedoresDirPostalDes()},false);
        node7.value = node7.text = "Direccion Postal descendente";

        document.getElementById("ordenarPorId").appendChild(node);
        document.getElementById("ordenarPorId").appendChild(node2);
        document.getElementById("ordenarPorId").appendChild(node3);
        document.getElementById("ordenarPorId").appendChild(node4);
        document.getElementById("ordenarPorId").appendChild(node5);
        document.getElementById("ordenarPorId").appendChild(node6);
        document.getElementById("ordenarPorId").appendChild(node7);

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

function buscarEjemplaresProveedor(codigoIdFiscal){

    var urlPage = "/Inicio/EjemplaresProveedor/"+codigoIdFiscal;
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}


function ordenarProveedoresCodigoIdFiscal(){
    var urlPage = "/Inicio/Proveedores/CodigoFiscal";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarProveedoresCodigoIdFiscalDes(){
    var urlPage = "/Inicio/Proveedores/CodigoFiscalDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarProveedoresNombre(){
    var urlPage = "/Inicio/Proveedores/Nombres";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarProveedoresNombreDes(){
    var urlPage = "/Inicio/Proveedores/NombresDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarProveedoresDirPostal(){
    var urlPage = "/Inicio/Proveedores/DireccionPostal";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarProveedoresDirPostalDes(){
    var urlPage = "/Inicio/Proveedores/DireccionPostalDes";
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
function ordenarEjemplaresFechasAdquisicionDes() {
    var urlPage = "/Inicio/Ejemplares/FechaAdquisicionDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarEjemplaresCiudadAcunacion() {
    var urlPage = "/Inicio/Ejemplares/CiudadAcunacion";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarEjemplaresCiudadAcunacionDes() {
    var urlPage = "/Inicio/Ejemplares/CiudadAcunacionDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarEjemplaresAnoAcunacion() {
    var urlPage = "/Inicio/Ejemplares/AnoAcunacion";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarEjemplaresAnoAcunacionDes() {
    var urlPage = "/Inicio/Ejemplares/AnoAcunacionDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarEjemplaresNombreProveedor() {
    var urlPage = "/Inicio/Ejemplares/NombreProveedor";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarEjemplaresNombreProveedorDes() {
    var urlPage = "/Inicio/Ejemplares/NombreProveedorDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosValorFacialAsc(){
    var urlPage = "/Inicio/Modelos/ValorFacialAsc";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosValorFacialDes(){
    var urlPage = "/Inicio/Modelos/ValorFacialDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosUnidadMonetariaAsc(){
    var urlPage = "/Inicio/Modelos/UnidadMonetariaAsc";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosUnidadMonetariaDes(){
    var urlPage = "/Inicio/Modelos/UnidadMonetariaDes";
    console.log(urlPage);
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosDiametroAsc(){
    var urlPage = "/Inicio/Modelos/DiametroAsc";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosDiametroDes(){
    var urlPage = "/Inicio/Modelos/DiametroDes";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosPesoAsc(){
    var urlPage = "/Inicio/Modelos/PesoAsc";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function ordenarModelosPesoDes(){
    var urlPage = "/Inicio/Modelos/PesoDes";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })


}
