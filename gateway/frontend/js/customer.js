
const form = document.querySelector(".form");

form.addEventListener("submit", function(event) {
    event.preventDefault();
    if (validarNome() && validarEmail()) {
        console.log("Cadastro realizado!");
        form.reset();
    } 
});

function validarNome(){
    const nome = document.getElementById("nome").value ;

    if(nome.length < 3){
        alert("O nome deve ter pelo menos 3 caracteres.");
        return false;
    }

    const regexNome = /^[A-Za-zÀ-ÿ\s]+$/;

    if (!regexNome.test(nome)) {
        alert("O nome deve conter apenas letras.");
        return false;
    }

}

function validarEmail(){
    const email = document.getElementById("email").value.trim();

    if (email === "") {
        alert("O e-mail é obrigatório.");
        return false;
    }

    const regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!regexEmail.test(email)) {
        alert("Digite um e-mail válido.");
        return false;
    }

    return true;
}