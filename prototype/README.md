# 🧬 Padrão de Projeto: Prototype

## 🧩 Contexto

Em alguns casos, criar um novo objeto do zero pode ser custoso ou demorado, especialmente quando ele envolve cálculos, configurações ou dependências complexas.  
Muitas vezes é mais fácil aproveitar um objeto já existente como base para gerar outros semelhantes.

---

## ❌ Problema

Recriar objetos parecidos repetidamente é ineficiente e propenso a erros.  
Copiar manualmente todos os atributos aumenta o risco de inconsistências e torna o código mais difícil de manter.

---

## ✅ Solução

O padrão **Prototype** propõe criar novos objetos a partir da **cópia de um protótipo existente**.  
Assim, em vez de instanciar e configurar tudo novamente, basta **clonar** o objeto base e alterar apenas o que for necessário.  
Isso economiza tempo, melhora o desempenho e reduz a complexidade da criação de objetos semelhantes.
