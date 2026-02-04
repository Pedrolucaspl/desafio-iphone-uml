---
config:
  layout: dagre
---
classDiagram
direction TB
    class ReprodutorMusical {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
	    +ligar(String numero)
	    +atender()
	    iniciarCorreioVoz()
    }

    class NavegadorInternet {
	    +exibirPaginas(String url)
	    +adcionarNovaAba()
	    +atualizarPagina()
    }

    class Iphone {
    }

	<<Interface>> ReprodutorMusical
	<<Interface>> AparelhoTelefonico
	<<Interface>> NavegadorInternet

    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet---
config:
  layout: dagre
---
classDiagram
direction TB
    class ReprodutorMusical {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
	    +ligar(String numero)
	    +atender()
	    iniciarCorreioVoz()
    }

    class NavegadorInternet {
	    +exibirPaginas(String url)
	    +adcionarNovaAba()
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