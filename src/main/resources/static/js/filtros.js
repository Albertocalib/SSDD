function fechasAdq(){
    var fechaI = document.getElementById("fechaini").value;
    var fechaF = document.getElementById("fechafin").value;
    urlPage = "/Inicio/filtroFechaAdq/"+ fechaI + "/"+ fechaF;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function filtroCiudadAcu(){
    var ciudad = document.getElementById("ciudadInput").value;
    urlPage = "/Inicio/filtroCiudad/"+ ciudad;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function filtroAnoAcu(){
    var anoIni = document.getElementById("anoIni").value;
    var anoFin = document.getElementById("anoFin").value;
    urlPage = "/Inicio/filtroAno/"+ anoIni + "/"+ anoFin;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function filtroProveedor(){
    var proveedor = document.getElementById("proveedorInput").value;
    urlPage = "/Inicio/filtroProveedor/"+ proveedor;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function filtroValorFacial(){
    var valorFacialIni = document.getElementById("valorFacialIni").value;
    var valorFacialFin = document.getElementById("valorFacialFin").value;
    urlPage = "/Inicio/filtroValorFacial/"+ valorFacialIni + "/"+ valorFacialFin;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function filtroUnidadMonetaria(){
    var unidadMonetaria = document.getElementById("unidadMonetariaInput").value;
    urlPage = "/Inicio/filtroUnidadMonetaria/"+ unidadMonetaria;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function filtroDiametro(){
    var diametroIni = document.getElementById("diametroIni").value;
    var diametroFin = document.getElementById("diametroFin").value;
    urlPage = "/Inicio/filtroDiametro/"+ diametroIni + "/"+ diametroFin;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function filtroPeso(){
    var pesoIni = document.getElementById("pesoIni").value;
    var pesoFin = document.getElementById("pesoFin").value;
    urlPage = "/Inicio/filtroPeso/"+ pesoIni + "/"+ pesoFin;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function filtroCodigoFiscal(){
    var codigoFiscal = document.getElementById("codigoFiscalInput").value;
    urlPage = "/Inicio/filtroCodigoFiscal/"+ codigoFiscal;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}
function filtroNombreProveedorPropio(){
    var NombreProveedorPropio = document.getElementById("nombreProveedorPropioInput").value;
    urlPage = "/Inicio/filtroNombreProveedor/"+ NombreProveedorPropio;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}

function filtroDireccion(){
    var direccion = document.getElementById("direccionInput").value;
    urlPage = "/Inicio/filtroDireccion/"+ direccion;
    $.ajax({
        url:urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
    })
}