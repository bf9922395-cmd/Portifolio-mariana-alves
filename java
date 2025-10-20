// ===== Alternar entre tema claro e escuro =====
const toggleTheme = document.getElementById("toggle-theme");
const body = document.body;

toggleTheme.addEventListener("click", () => {
    body.classList.toggle("dark");
    toggleTheme.textContent = body.classList.contains("dark") ? "☀" : "🌙";
});

// ===== Validação do formulário =====
document.getElementById("form-contato").addEventListener("submit", function(event) {
    event.preventDefault();

    const nome = document.getElementById("nome").value.trim();
    const email = document.getElementById("email").value.trim();
    const mensagem = document.getElementById("mensagem").value.trim();

    if (!nome || !email || !mensagem) {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    const emailValido = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailValido.test(email)) {
        alert("Por favor, insira um e-mail válido.");
        return;
    }

    alert("Mensagem enviada com sucesso!");
    this.reset();
});
