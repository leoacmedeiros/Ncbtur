#language: pt
@IncluirRede
Funcionalidade: IncluirRede

  Contexto: Como usuário desejo incluir uma nova Rede
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Rede
    Dado que acesse o Menu Meios de Hospedagem
    E acesse o Menu Rede
    E clique no botão de Nova Rede
    Quando preencher todos os campos com dados válidos
    |Nome									|Nova Rede Hotel 1			|
    |Rede ativa?					|Clicar checkbox				|
    |CEP									|70330535								|
    |Nome-Cont. Comerc.		|Nova Rede Teste Auto 1	|
    |E-mail-Cont. Comerc. |emailTeste@gmail.com		|
    |Telefone-Cont. Comerc|61985685148						|
    E clicar no botão Salvar Rede
    Então o sistema irá incluir uma nova Rede com os dados informados