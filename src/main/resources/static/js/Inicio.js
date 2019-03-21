function cargarPagina(tipo) {

    if (tipo === 1){
        busquedaModelos();
    }else if(tipo === 2){
        busquedaEjemplares();
    }else{
        busquedaProveedores();
    }
}