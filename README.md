# Trabalho individual de API do Serratec
Sistema de biblioteca.

## 🌐 URI de base do projeto

<p>http://localhost:8080</p>

## 🚡 Endpoints

<ul>
  <li><spam>GET</spam><p>/livros</p><p>Retorna uma lista de objetos da classe Livro contendo [id, titulo, dataPublicacao, autor, editora]</p></li>
  <li><spam>GET</spam><p>/livros/:id</p><p>Retorna um objeto da classe Livro contendo [id, titulo, dataPublicacao, autor, editora]</p></li>
  <li><spam>POST</spam><p>/livros</p><p>Salva uma entidade Livro no banco H2, contendo [id, titulo, dataPublicacao, autor, editora], e espera um JSON [titulo, informacaoPublicacao] no corpo da requisição.</p></li>
  <li><spam>PUT</spam><p>/livros/:id</p><p>Atualiza uma entidade Livro no banco H2, e espera um *id* na URI da requisição, junto de um JSON [titulo, informacaoPublicacao] no corpo da requisição.</p></li>
  <li><spam>DELETE</spam><p>/livros/:id</p><p>Deleta uma entidade Livro no banco H2, e espera um *id* na URI da requisição.</p></li>
</ul>

## :fountain_pen: Autor

👦 [Arthur Mury](https://github.com/muryarth)
