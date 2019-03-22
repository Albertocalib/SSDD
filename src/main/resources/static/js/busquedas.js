function busquedaModelos() {
    var urlPage = "/Inicio/Modelos";
    $.ajax({
        url: urlPage
    }).done(function (data) {
        $("#listaElementos").replaceWith(data);
        document.getElementById("exampleRadios1").checked = true;
        document.getElementById("exampleRadios2").checked = false;
        document.getElementById("exampleRadios3").checked = false;
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

        document.getElementById("filtrarPorId").innerText = "";
        var nodeF = document.createElement("option");
        nodeF.selected = true;
        var textnodeF = document.createTextNode("Elige una opción");
        nodeF.appendChild(textnodeF);
        var node2F = document.createElement("option");
        node2F.addEventListener('click',function (ev) {addFiltroValorFacial()},false);
        node2F.value = node2F.text = "Valor Facial";
        var node3F = document.createElement("option");
        node3F.addEventListener('click',function (ev) {addFiltroUnidadMonetaria()},false);
        node3F.value = node3F.text = "Unidad Monetaria";

        var node4F = document.createElement("option");
        node4F.addEventListener('click',function (ev) {addFiltroDiametro()},false);
        node4F.value = node4F.text = "Diámetro";

        var node8F = document.createElement("option");
        node8F.addEventListener('click',function (ev) {addFiltroPeso()},false);
        node8F.value = node8F.text = "Peso";
        document.getElementById("filtrarPorId").appendChild(nodeF);
        document.getElementById("filtrarPorId").appendChild(node2F);
        document.getElementById("filtrarPorId").appendChild(node3F);
        document.getElementById("filtrarPorId").appendChild(node4F);
        document.getElementById("filtrarPorId").appendChild(node8F);


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

        document.getElementById("exampleRadios1").checked = false;
        document.getElementById("exampleRadios2").checked = true;
        document.getElementById("exampleRadios3").checked = false;

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

        document.getElementById("filtrarPorId").innerText = "";
        var nodeF = document.createElement("option");
        nodeF.selected = true;
        var textnodeF = document.createTextNode("Elige una opción");
        nodeF.appendChild(textnodeF);
        var node2F = document.createElement("option");
        node2F.addEventListener('click',function (ev) {addFiltroFechaAd()},false);
        node2F.value = node2F.text = "Fecha de adquisición";
        var node3F = document.createElement("option");
        node3F.addEventListener('click',function (ev) {addFiltroCiudadAcu()},false);
        node3F.value = node3F.text = "Ciudad de acuñación";

        var node4F = document.createElement("option");
        node4F.addEventListener('click',function (ev) {addFiltroFechaAcu()},false);
        node4F.value = node4F.text = "Año de acuñación";

        var node8F = document.createElement("option");
        node8F.addEventListener('click',function (ev) {addFiltroNombreProveedor()},false);
        node8F.value = node8F.text = "Nombre Proveedor";
        document.getElementById("filtrarPorId").appendChild(nodeF);
        document.getElementById("filtrarPorId").appendChild(node2F);
        document.getElementById("filtrarPorId").appendChild(node3F);
        document.getElementById("filtrarPorId").appendChild(node4F);
        document.getElementById("filtrarPorId").appendChild(node8F);





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
        document.getElementById("exampleRadios1").checked = false;
        document.getElementById("exampleRadios2").checked = false;
        document.getElementById("exampleRadios3").checked = true;
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

        document.getElementById("filtrarPorId").innerText = "";
        var nodeF = document.createElement("option");
        nodeF.selected = true;
        var textnodeF = document.createTextNode("Elige una opción");
        nodeF.appendChild(textnodeF);
        var node2F = document.createElement("option");
        node2F.addEventListener('click',function (ev) {ordenarEjemplaresFechasAdquisicion()},false);
        node2F.value = node2F.text = "Código fiscal";
        var node3F = document.createElement("option");
        node3F.addEventListener('click',function (ev) {ordenarEjemplaresCiudadAcunacion()},false);
        node3F.value = node3F.text = "Nombre";
        var node4F = document.createElement("option");
        node4F.addEventListener('click',function (ev) {ordenarEjemplaresAnoAcunacion()},false);
        node4F.value = node4F.text = "Dirección";
        document.getElementById("filtrarPorId").appendChild(nodeF);
        document.getElementById("filtrarPorId").appendChild(node2F);
        document.getElementById("filtrarPorId").appendChild(node3F);
        document.getElementById("filtrarPorId").appendChild(node4F);

        $("#botonCrear").replaceWith("<button id = \"botonCrear\" class=\"btn btn-fab btn-round btn-color\"\n" +
            "                data-toggle=\"modal\"\n" +
            "                data-target=\"#crearProveeOrdenardor\"\n" +
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
        document.getElementById("exampleRadios1").checked = false;
        document.getElementById("exampleRadios2").checked = true;
        document.getElementById("exampleRadios3").checked = false;
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

function addFiltroFechaAd() {
    $("#filtro").replaceWith("<li class=\"nav-item\" style=\"margin: 10%\" id=\"filtro\">\n" +
        "                        <label class=\"label-control\">Fecha inicial</label>\n" +
        "                        <input id=\"fechaini\" type=\"date\" class=\"form-control\"><br>\n" +
        "                        <label class=\"label-control\">Fecha inicial</label>\n" +
        "                        <input id=\"fechafin\" type=\"date\" class=\"form-control\"><br>\n" +
        "                        <button type=\"submit\" class=\"btn\" onclick=\"fechasAdq()\">Enviar</button>\n" +
        "                    </li>");
}
function addFiltroCiudadAcu() {
    $("#filtro").replaceWith("<li class=\"nav-item\" style=\"margin: 10%\" id=\"filtro\">\n" +
        "                        <div class=\"row\">\n" +
        "                            <div class=\"form-group no-border\">\n" +
        "                                <input id=\"ciudadInput\" type=\"text\" class=\"form-control\" placeholder=\"Buscar nombre ciudad\">\n" +
        "                            </div>\n" +
        "                            <button type=\"submit\" class=\"btn btn-just-icon btn-round btn-color\" onclick=\"filtroCiudadAcu()\">\n" +
        "                                <i class=\"material-icons\" style=\"color:#8d6e63\">search</i>\n" +
        "                            </button>\n" +
        "                        </div>\n" +
        "                    </li>");
}
function addFiltroFechaAcu() {
    $("#filtro").replaceWith(" <li class=\"nav-item\" style=\"margin: 10%\" id = \"filtro\">\n" +
        "                        <div class=\"row\">\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"anoIni\" type=\"number\" class=\"form-control\" required placeholder=\"Año Inicio\">\n" +
        "                            </div>\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"anoFin\" type=\"number\" class=\"form-control\" required placeholder=\"Año Fin\">\n" +
        "                            </div>\n" +
        "                        </div>\n" +
        "                        <button type=\"button\" class=\"btn\" onclick=\"filtroAnoAcu()\">Enviar</button>\n" +
        "                    </li>");
}
function addFiltroNombreProveedor() {
    $("#filtro").replaceWith("<li class=\"nav-item\" style=\"margin: 10%\" id=\"filtro\">\n" +
        "                        <div class=\"row\">\n" +
        "                            <div class=\"form-group no-border\">\n" +
        "                                <input id=\"proveedorInput\" type=\"text\" class=\"form-control\" placeholder=\"Buscar nombre proveedor\">\n" +
        "                            </div>\n" +
        "                            <button type=\"submit\" class=\"btn btn-just-icon btn-round btn-color\" onclick=\"filtroProveedor()\">\n" +
        "                                <i class=\"material-icons\" style=\"color:#8d6e63\">search</i>\n" +
        "                            </button>\n" +
        "                        </div>\n" +
        "                    </li>");
}

function addFiltroValorFacial() {
    $("#filtro").replaceWith("<li class=\"nav-item\" style=\"margin: 10%\" id = \"filtro\">\n" +
        "                        <div class=\"row\">\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"valorFacialIni\" type=\"number\" class=\"form-control\" required placeholder=\"Valor facial inicial\">\n" +
        "                            </div>\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"valorFacialFin\" type=\"number\" class=\"form-control\" required placeholder=\"Valor facial final\">\n" +
        "                            </div>\n" +
        "                        </div>\n" +
        "                        <button type=\"button\" class=\"btn\" onclick=\"filtroValorFacial()\">Enviar</button>\n" +
        "                    </li>");
}

function addFiltroUnidadMonetaria() {
    $("#filtro").replaceWith("<li class=\"nav-item\" style=\"margin: 10%\" id=\"filtro\">\n" +
        "                        <div class=\"row\">\n" +
        "                            <div class=\"form-group no-border\">\n" +
        "                                <input id=\"unidadMonetariaInput\" type=\"text\" class=\"form-control\" placeholder=\"Buscar nombre ciudad\">\n" +
        "                            </div>\n" +
        "                            <button type=\"submit\" class=\"btn btn-just-icon btn-round btn-color\" onclick=\"filtroUnidadMonetaria()\">\n" +
        "                                <i class=\"material-icons\" style=\"color:#8d6e63\">search</i>\n" +
        "                            </button>\n" +
        "                        </div>\n" +
        "                    </li>");
}

function addFiltroDiametro() {
    $("#filtro").replaceWith("<li class=\"nav-item\" style=\"margin: 10%\" id = \"filtro\">\n" +
        "                        <div class=\"row\">\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"diametroIni\" type=\"number\" class=\"form-control\" required placeholder=\"Diametro inicial\">\n" +
        "                            </div>\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"diametroFin\" type=\"number\" class=\"form-control\" required placeholder=\"Diametro final\">\n" +
        "                            </div>\n" +
        "                        </div>\n" +
        "                        <button type=\"button\" class=\"btn\" onclick=\"filtroDiametro()\">Enviar</button>\n" +
        "                    </li>");
}

function addFiltroPeso() {
    $("#filtro").replaceWith(" <li class=\"nav-item\" style=\"margin: 10%\" id = \"filtro\">\n" +
        "                        <div class=\"row\">\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"pesoIni\" type=\"number\" class=\"form-control\" required placeholder=\"Peso inicial\">\n" +
        "                            </div>\n" +
        "                            <div class=\"col\">\n" +
        "                                <input id=\"pesoFin\" type=\"number\" class=\"form-control\" required placeholder=\"Peso final\">\n" +
        "                            </div>\n" +
        "                        </div>\n" +
        "                        <button type=\"button\" class=\"btn\" onclick=\"filtroPeso()\">Enviar</button>\n" +
        "                    </li>");
}

