const form = document.querySelector(".form");

form.addEventListener("submit", function(event) {
    event.preventDefault();
    if (validarCliente() && validarValor()) {
        console.log("Cadastro realizado!");
        form.reset();
    } 
});

function validarValor(){
    const valor = parseFloat(document.getElementById("valor").value) ;

    if(isNaN(valor) || valor <= 0 ){
        alert("Valor não pode ser negativo. Selecione valores positivos") ;
        return false ;
    }
    
    return true ;
}