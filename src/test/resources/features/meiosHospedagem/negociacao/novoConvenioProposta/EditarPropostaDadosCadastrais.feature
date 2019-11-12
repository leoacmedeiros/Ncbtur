#language: pt
@EditarProposta
Funcionalidade: EditarProposta

  Contexto: Como usuário desejo editar uma Nova Proposta
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Editar Proposta Dados Cadastrais
    Dado que acesse o módulo de Meios de Hospedagem
    E acesse o menu Novo convênio para realizar uma busca por Nome
    E realize uma busca pelo Nome do Meio de Hospedagem
      | Nome | HOTEL POUSADA VILLA DO CERRADO |
    E clique em Painel Meio de Hospedagem
    E clique em Dados Cadastrais
    E edite os dados Cadastrais
      | Nome                       | HOTEL POUSADA VILLA DO CERRADO - Editado teste |
      | Razão Social               | Villa do Cerrado LTDA - Editado teste          |
      | Email                      | editado.teste.villacerrado@gmail.com           |
      | Site                       | www.villacerrado-editado-teste.com.br          |
      | Telefone                   |                                    61995989344 |
      | Inscrição Municipal        |                                        1234567 |
      | Inscrição Estadual         |                                        9987654 |
      | Rede                       | Não vai ser editado							              |
      | Taxa ISS                   |                                             10 |
      | Tipo de Meio de Hospedagem | Pousada                                        |
      | Tipo de Administração      | Arrendamento                                   |
      | Nome Cont. Comercial       | Henrique Fontenelle Gonçalves - Editado teste  |
      | Email Cont Comercial       | henriquefonteleles.editadoteste@gmail.com      |
      | Telefone Cont. Comercial   |                                    61854712536 |
      | CEP Endereço               |                                       05650001 |
      | CEP Correspondência        |                                       72006290 |
    Quando clicar para Salvar os dados editados do Meio de Hospedagem
    Então o sistema irá incluir os dados editados do Meio de Hospedagem
