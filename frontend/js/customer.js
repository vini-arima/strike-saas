
const form = document.querySelector(".form");

form.addEventListener("submit", function(event) {

    if (validarSenha() && validarNome() && validaEmail()) {
        console.log("Cadastro enviado");
        form.reset();
    } 
    
    console.log("Cadastro realizado!");

    event.preventDefault();
});

function validarNome(){

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

}