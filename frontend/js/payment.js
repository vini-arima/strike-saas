const form = document.querySelector(".form");

form.addEventListener("submit", function(event) {
    event.preventDefault();
    if (validarCliente() && validarValor()) {
        console.log("Cadastro realizado!");
        form.reset();
    } 
});