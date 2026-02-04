---
config:
  layout: dagre
id: b13ef077-f541-402e-8d52-966374ec3918
---
classDiagram
    direction TB
    class ReprodutorMusical {
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPaginas(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone {
    }

    <<Interface>> ReprodutorMusical
    <<Interface>> AparelhoTelefonico
    <<Interface>> NavegadorInternet

    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet