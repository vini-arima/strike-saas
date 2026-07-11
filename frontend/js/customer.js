
const form = document.querySelector(".form");

form.addEventListener("submit", function(event) {
    event.preventDefault();
    if (validarSenha() && validarNome() && validarEmail()) {
        return ;
    } 
    
    console.log("Cadastro realizado!");
    form.reset();

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

function validarSenha(){
    const senha = document.getElementById("senha").value;

    // A senha deve ter pelo menos 8 caracteres.
    if (senha.length < 8) {
        alert("A senha deve ter pelo menos 8 caracteres.");
        return false;
    }
    // A senha deve ter pelo menos 8 caracteres.
    if(senha.length > 20){
        alert("a senha deve ter no maximo 20 caracteres "); 
        return false ;
    }

    if(!/[A-Z]/.test(senha)){
        alert("A senha precisa ter uma letra maiúscula.");
        return false;
    }

    if (!/[a-z]/.test(senha)) {
        alert("A senha precisa ter uma letra minúscula.");
        return false;
    }

    if (!/[0-9]/.test(senha)) {
        alert("A senha precisa ter um número.");
        return false;
    }

    if (!/[!@#$%^&*(),.?\":{}|<>]/.test(senha)) {
        alert("A senha precisa ter um caractere especial.");
        return false;
    }
    return true;
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