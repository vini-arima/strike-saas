
const form = document.querySelector(".form");

form.addEventListener("submit", function(event) {
    event.preventDefault();

    console.log("Cadastro realizado!");

    form.reset();
});