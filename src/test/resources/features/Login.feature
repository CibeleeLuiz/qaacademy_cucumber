#language:pt

  Funcionalidade: Realizar login
    Cenário: Acessar login
      Dado que o usuario esta na tela do login "https://secure.kanui.com.br/customer/account/login/"
      Quando preencher os dados do usuário "vitor.goncalves102@gmail.com"
      E preencher senha "jlsm123456789"
      E clicar no botao Entrar
      Entao permite acessar a home

      Funcionalidade: Realizar pesquisas de camisetas
        Cenário: Pesquisar camisetas masculinas
          Dado que usuario esta na tela inicial "https://www.kanui.com.br/"
          Quando pesquisa por "Camiseta masculina"
          Entao retorna a pesquisa





