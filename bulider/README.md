# 🧱 Padrão de Projeto: Builder

## 🧩 Contexto

Em muitos sistemas, precisamos criar **objetos complexos** (ex: carros, computadores, sanduíches) com vários detalhes e combinações possíveis.
Quando o objeto possui muitos atributos, torna-se difícil controlar a criação dele de forma organizada e legível.

---

## ❌ Problema

Construtores tradicionais exigem passar todos os parâmetros de uma vez, muitas vezes em uma ordem específica.  
Isso deixa o código confuso, difícil de entender e de manter, além de aumentar o risco de erros.

---

## ✅ Solução

O padrão **Builder** separa o processo de construção do objeto da sua representação final.
Ele permite **montar o objeto passo a passo**, configurando apenas o que for necessário, e no final “construí-lo” de maneira clara e flexível.
Isso torna o código mais legível, fácil de estender e reduz a complexidade na criação de objetos complexos.
