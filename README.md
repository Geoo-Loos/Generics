# 🧬 Java Generics: Flexibilidade e Reutilização

Este repositório contém exemplos práticos e exercícios sobre o uso de **Generics** em Java. O objetivo é explorar como criar classes, interfaces e métodos que podem operar em diferentes tipos de dados, mantendo a segurança em tempo de compilação.

## 📋 Conceitos Explorados

O projeto aborda os tópicos fundamentais para dominar a programação genérica:

* **Classes Genéricas:** Criação de estruturas (como repositórios ou containers) que aceitam qualquer tipo de objeto.
* **Métodos Genéricos:** Implementação de lógica específica que funciona com múltiplos tipos de parâmetros.
* **Wildcards (Coringas):**
    * `?`: Wildcard desconhecido.
    * `? extends T`: Upper Bounded Wildcards (leitura).
    * `? super T`: Lower Bounded Wildcards (escrita).
* **Type Safety:** Como o Generics evita o uso excessivo de *Casting* e previne erros de `ClassCastException`.
* **Delimitação de Tipos (Bounded Types):** Restrição de tipos genéricos para que aceitem apenas subclasses de uma determinada classe ou interface (ex: `<T extends Number>`).

## 🛠️ Tecnologias

* **Linguagem:** Java (JDK 8 ou superior recomendado para suporte total a Generics).
* **Conceitos:** Programação Orientada a Objetos (POO) e Tipagem Forte.

## 🏗️ Estrutura do Projeto

* `src/services`: Contém serviços que utilizam tipos genéricos para processar diferentes tipos de dados (ex: `PrintService<T>`).
* `src/entities`: Modelos de dados utilizados nos testes de coleções genéricas.
* `src/application`: Classes de teste para demonstrar a instanciação e o comportamento dos tipos genéricos.

## 🚀 Por que usar Generics?

1. **Segurança:** Detecta erros de tipo em tempo de compilação em vez de tempo de execução.
2. **Reutilização:** Um único método ou classe pode ser usado para `Integer`, `String`, ou qualquer objeto customizado.
3. **Performance:** Elimina a necessidade de conversões (casts) manuais entre tipos.
