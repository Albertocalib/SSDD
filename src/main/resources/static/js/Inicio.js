function cargarPagina(tipo) {

    if (tipo === 1) {
        busquedaModelos();
    } else if (tipo === 2) {
        busquedaEjemplares();
    } else {
        busquedaProveedores();
    }
}

function cambiarExpandir() {
    var el = document.getElementsByClassName("col-md-3");
    for (var i = 0; i < el.length; i++) {
        el[i].classList.add("col-md-4");
    }
    var el2 = document.getElementsByClassName("col-md-4");
    for (var j = 0; j < el2.length; j++) {
        el2[j].classList.remove("col-md-3");
    }


    $("#buttonCollapse").replaceWith("<a  id=\"buttonCollapse\" type=\"button\" data-target=\"#navLateral\" onclick=\"cambiarColapsar()\">\n" +
        "                    <span class=\"navbar-toggler-icon\"></span>\n" +
        "\n" +
        "                </a>");
    document.getElementById("navLateral").style.width = "250px";
    document.getElementById("wrapper-full-page").style.marginLeft = "250px";
    $("#navLateral").show();
}

function cambiarColapsar() {

    var el = document.getElementsByClassName("col-md-4");
    for (var i = 0; i < el.length; i++) {
        el[i].classList.add("col-md-3");
    }
    var el2 = document.getElementsByClassName("col-md-3");
    for (var j = 0; j < el2.length; j++) {
        el2[j].classList.remove("col-md-4");
    }

    $("#buttonCollapse").replaceWith("<a  id=\"buttonCollapse\" type=\"button\" data-target=\"#navLateral\" onclick=\"cambiarExpandir()\">\n" +
        "                    <span class=\"navbar-toggler-icon\"></span>\n" +
        "\n" +
        "                </a>");
    $("#navLateral").hide();


    document.getElementById("wrapper-full-page").style.marginLeft = "0px";
}

