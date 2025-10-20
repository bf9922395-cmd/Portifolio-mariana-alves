# Portifolio-mariana-alves
Portfólio pessoal desenvolvido na disciplina Fundamentos da Programação Web.
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portfólio - Mariana Alves</title>
    <link rel="stylesheet" href="style.css">
    <script defer src="script.js"></script>
</head>
<body>
    <header>
        <h1>Mariana Alves</h1>
        <nav>
            <ul>
                <li><a href="#sobre">Sobre mim</a></li>
                <li><a href="#formacao">Formação</a></li>
                <li><a href="#portfolio">Portfólio</a></li>
                <li><a href="#contato">Contato</a></li>
            </ul>
        </nav>
        <button id="toggle-theme">🌙</button>
    </header>
/* ===== Estilos Gerais ===== */
:root {
    --bg: #ffffff;
    --text: #222;
    --accent: #0077cc;
}

body.dark {
    --bg: #1a1a1a;
    --text: #f1f1f1;
    --accent: #66ccff;
}

body {
    margin: 0;
    font-family: Arial, sans-serif;
    background-color: var(--bg);
    color: var(--text);
    transition: background 0.3s, color 0.3s;
}

/* ===== Cabeçalho e Navegação ===== */
header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 15px 30px;
    background-color: var(--accent);
    color: white;
    position: sticky;
    top: 0;
}

nav ul {
    list-style: none;
    display: flex;
    gap: 20px;
    margin: 0;
    padding: 0;
}

nav a {
    color: white;
    text-decoration: none;
    font-weight: bold;
}

nav a:hover {
    text-decoration: underline;
}

#toggle-theme {
    background: none;
    border: none;
    color: white;
    font-size: 20px;
    cursor: pointer;
}

/* ===== Seções ===== */
main {
    padding: 40px 20px;
    max-width: 900px;
    margin: auto;
}

section {
    margin-bottom: 60px;
}

h2 {
    color: var(--accent);
    border-bottom: 2px solid var(--accent);
    padding-bottom: 5px;
}

/* ===== Projetos ===== */
.projetos {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
}

.projeto {
    background: rgba(0, 0, 0, 0.05);
    padding: 15px;
    border-radius: 8px;
    flex: 1 1 calc(33% - 20px);
}

body.dark .projeto {
    background: rgba(255, 255, 255, 0.1);
}

/* ===== Formulário ===== */
form {
    display: flex;
    flex-direction: column;
    gap: 10px;
    max-width: 500px;
}

input, textarea, button {
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
}

button {
    background-color: var(--accent);
    color: white;
    cursor: pointer;
}

button:hover {
    opacity: 0.9;
}

/* ===== Rodapé ===== */
footer {
    text-align: center;
    background-color: var(--accent);
    color: white;
    padding: 15px;
}
    <main>
        <!-- Seção Sobre mim -->
        <section id="sobre">
            <h2>Sobre mim</h2>
            <p>Olá! Sou <strong>Mariana Alves</strong>, desenvolvedora Front-End Júnior apaixonada por tecnologia e design. 
            Busco unir criatividade e lógica para desenvolver interfaces funcionais e intuitivas. 
            Gosto de aprender novas linguagens e aprimorar minhas habilidades em JavaScript e CSS.</p>
            <p>Nos momentos livres, adoro ler, desenhar e explorar novas ferramentas de programação.</p>
        </section>

        <!-- Seção Formação -->
        <section id="formacao">
            <h2>Formação</h2>
            <ul>
                <li><strong>Bacharelado em Engenharia de Software</strong> – UNINTER (em andamento)</li>
                <li><strong>Curso Técnico em Informática</strong> – SENAI</li>
                <li><strong>Idiomas:</strong> Inglês Intermediário</li>
            </ul>
        </section>

        <!-- Seção Portfólio -->
        <section id="portfolio">
            <h2>Portfólio</h2>
            <div class="projetos">
                <div class="projeto">
                    <h3>Nature Travel</h3>
                    <p>Site responsivo sobre turismo ecológico, com design moderno e navegação intuitiva.</p>
                </div>
                <div class="projeto">
                    <h3>TaskManager</h3>
                    <p>Aplicativo em JavaScript para organização de tarefas diárias com armazenamento local.</p>
                </div>
                <div class="projeto">
                    <h3>Página de Cadastro</h3>
                    <p>Página de registro de usuários com validação de campos e layout adaptável.</p>
                </div>
            </div>
        </section>

        <!-- Seção Contato -->
        <section id="contato">
            <h2>Contato</h2>
            <form id="form-contato">
                <label for="nome">Nome:</label>
                <input type="text" id="nome" required>

                <label for="email">E-mail:</label>
                <input type="email" id="email" required>

                <label for="mensagem">Mensagem:</label>
                <textarea id="mensagem" rows="5" required></textarea>

                <button type="submit">Enviar mensagem</button>
            </form>

            <div class="redes">
                <p>Ou entre em contato pelas redes:</p>
                <a href="mailto:mariana.alves@email.com">📧 E-mail</a> |
                <a href="https://linkedin.com/in/marianaalves" target="_blank">💼 LinkedIn</a> |
                <a href="https://instagram.com/mariana.codes" target="_blank">📸 Instagram</a>
            </div>
        </section>
    </main>

    <footer>
        <p>© 2025 Mariana Alves | Desenvolvido em HTML, CSS e JavaScript</p>
    </footer>
</body>
</html>
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
