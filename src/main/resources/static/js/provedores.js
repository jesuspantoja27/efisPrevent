// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarProvedores();
  $('#provedores').DataTable();



});



async function cargarProvedores() {
  const request = await fetch('api/provedores', {
    method: 'GET',
    headers: getHeaders()
  });
  const provedores = await request.json();


  let provedorHtml = '';
  for (let provedor of provedores) {
    let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';


    let provedorHtml = '<tr><td>'+provedor.idprovedor+'</td><td>' + provedor.nombre + ' ' + provedor.producto + '</td><td>'
                    + provedor.telefono+'</td><td>'+provedor.email
                    + '</td><td>' + botonEliminar + '</td></tr>';
    provedorHtml += provedorHtml;
  }

document.querySelector('#provedores tbody').outerHTML = provedorHtml;

}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}



}