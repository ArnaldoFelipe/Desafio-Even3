document.addEventListener('DOMContentLoaded', function() {

    const form = document.getElementById('form-inscricao');
    const nomeInput = document.getElementById('nome');
    const emailInput = document.getElementById('email');
    const listaInscritos = document.getElementById('lista-inscritos');

   
    if (form) {
        form.addEventListener('submit', function(event) {
            
            
            event.preventDefault();

           
            const nome = nomeInput.value.trim();
            const email = emailInput.value.trim();

           
            if (!nome || !email) {
                alert('Por favor, preencha todos os campos!');
                return;
            }

           
            const novoInscrito = document.createElement('li');
            novoInscrito.textContent = `${nome} - ${email}`;
            listaInscritos.appendChild(novoInscrito);

            nomeInput.value = '';
            emailInput.value = '';
        });
    }
});