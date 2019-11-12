#language: pt
@InlcuirCanalVendas
Funcionalidade: Incluir Canal de Vendas

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Canal de Venda - Cooperado
    Dado que acesse o modulo de Produto para visualizar Canal de Vendas
    E crie o Canal de Venda do Tipo Cooperado
    Quando preencher o formulário CANAL Dados Vendas para o tipo Cooperado
      | tipo                | Cooperado                                |
      | nome                | Talk automação                           |
      | descricao           | Descrição canal de vendas Talk automação |
      | razao social        | IMPULSO TELEFONIA E ACESSÓRIOS EIRELI-ME |
      | cnpj                | 15.210.328/0001-00                       |
      | captado por         | 003.773.021-55                           |
      | telefone            | (61) 3574-9444                           |
      | email               | maurucio.rocha.vieira@gmail.com          |
      | cep                 | 71.920-010                               |
      | taxa iss            | 2%                                       |
      | remuneracao         | Sim                                      |
      | tempo indeterminado | Sim                                      |
      | data inicio         | 07/10/2019                               |
      | situacao            | Ativo                                    |
    Então avançar
    Quando preencher o formulário RESPONSÁVEL para o tipo Cooperado
      | nome responsavel | MAURÍCIO ROCHA VIEIRA           |
      | sexo             | Masculino                       |
      | cpf              | 688.334.810-77                  |
      | rg               |                           21546 |
      | orgao expedidor  | SSP                             |
      | profissao        | ADMINISTRADOR DE EMPRESAS       |
      | cargo            | Gerente                         |
      | nacionalidade    | Brasileira                      |
      | estado civil     | Solteiro                        |
      | data nascimento  | 14/06/1974                      |
      | email            | maurucio.rocha.vieira@gmail.com |
      | telefone         | (61) 3574-9444                  |
      | cep              | 71.920-010                      |
      | temporario       |                                 |
      | ativo            |                                 |
    Então avançar
    Quando preencher o formulário VENDEDOR(A) para o tipo Cooperado
      | cpf vendedor | 003.773.021-55 |
      | promotor     | Não            |
    Então avançar
    Quando anexar DOCUMENTAÇÃO para o tipo Cooperado
      | documento | C:\\Users\\daniel\\Downloads\\Regras para Cadastro do Produto.docx |
    Então avançar
    Quando preencher o formulário BANCÁRIO par ao tipo Cooperado
      | banco             | Banco Itaú S.A. |
      | agencia           |            0479 |
      | digito da agencia |                 |
      | conta             |           27236 |
      | digito da conta   |               1 |
    E salvar os dados do Canal de Vendas
    Então será criado o Canal de Vendas

  @ignore
  Cenário: Incluir Canal de Venda - Representante
    Dado que acesse o modulo de Produto para visualizar Canal de Vendas
    E crie o Canal de Venda
    Quando preencher o formulário CANAL Dados Vendas para o tipo Representante
      | tipo                | Representante                                          |
      | nome                | ISA TOUR ADVENTURE automação                           |
      | descricao           | Descrição canal de vendas ISA TOUR ADVENTURE automação |
      | razao social        | J.H REIS VIAGENS E TURISMO ME                          |
      | cnpj                | 03.988.501/0001-16                                     |
      | captado por         | 003.773.021-55                                         |
      | core                | ISA TOUR ADVENTURE                                     |
      | telefone            | (84) 9924-4000                                         |
      | email               | isatour@isatour.com.br                                 |
      | cep                 | 71.920-010                                             |
      | remuneracao         | Sim                                                    |
      | tempo indeterminado | Sim                                                    |
      | data inicio         | 07/10/2019                                             |
      | data fim            | 31/12/2019                                             |
      | situacao            | Ativo                                                  |
    Então avançar
    Quando preencher o formulário RESPONSÁVEL para o tipo Representante
      | nome responsavel    | ISABEL CRISTINA CASTRO    |
      | sexo                | Feminino                  |
      | cpf                 | 701.278.580-24            |
      | rg                  |                    236589 |
      | orgao expedidor     | SSP                       |
      | profissao           | ADMINISTRADOR DE EMPRESAS |
      | cargo               | Gerente                   |
      | nacionalidade       | Brasileira                |
      | estado civil        | Solteiro                  |
      | data nascimento     | 14/06/1974                |
      | email               | isatour@isatour.com.br    |
      | telefone            | (37) 3321-2425            |
      | cep                 | 71.920-010                |
      | temporario          | Não                       |
      | data inicio         | 09/10/2019                |
      | data fim            | 31/12/2019                |
      | tempo indeterminado | Não                       |
      | situacao            | Ativo                     |
    Então avançar
    Quando preencher o formulário VENDEDOR(A) para o tipo Representante
      | cpf vendedor | 003.773.021-55 |
      | promotor     | Não            |
    Então avançar
    Quando anexar DOCUMENTAÇÃO para o tipo Representante
      | documento | C:\\Users\\daniel\\Downloads\\Regras para Cadastro do Produto.docx |
    Então avançar
    Quando preencher o formulário BANCÁRIO par ao tipo Representante
      | banco             | Banco Santander S.A. |
      | agencia           |                04910 |
      | digito da agencia |                      |
      | conta             |              8711139 |
      | digito da conta   |                    0 |
    E salvar os dados do Canal de Vendas
    Então será criado o Canal de Vendas

  @ignore
  Cenário: Incluir Canal de Venda - Matriz
    Dado que acesse o modulo de Produto para visualizar Canal de Vendas
    E crie o Canal de Venda
    Quando preencher o formulário CANAL Dados Vendas para o tipo Matriz
      | tipo                | Matriz                                                                       |
      | nome                | CONTACT CENTER - CENTRAL DE VENDAS (CRC)                                     |
      | descricao           | Descrição canal de vendas CONTACT CENTER - CENTRAL DE VENDAS (CRC) automação |
      | empresa             | CLUBE BANCORBRAS                                                             |
      | telefone            | (61) 3314-7422                                                               |
      | email               | central.clubedeturismo@bancorbras.com.br                                     |
      | cep                 | 70.304-913                                                                   |
      | remuneracao         | Sim                                                                          |
      | tempo indeterminado | Sim                                                                          |
      | data inicio         | 07/10/2019                                                                   |
      | data fim            | 31/12/2019                                                                   |
      | situacao            | Ativo                                                                        |
    Então avançar
    Quando preencher o formulário RESPONSÁVEL para o tipo Matriz
      | nome responsavel    | Thiago Mendes                            |
      | sexo                | Masculino                                |
      | cpf                 | 373.845.650-30                           |
      | rg                  |                                   236589 |
      | orgao expedidor     | SSP                                      |
      | profissao           | ADMINISTRADOR DE EMPRESAS                |
      | cargo               | Gerente                                  |
      | nacionalidade       | Brasileira                               |
      | estado civil        | Solteiro                                 |
      | data nascimento     | 14/06/1974                               |
      | email               | central.clubedeturismo@bancorbras.com.br |
      | telefone            | (61) 3314-7422                           |
      | temporario          | Não                                      |
      | data inicio         | 09/10/2019                               |
      | data fim            | 31/12/2019                               |
      | tempo indeterminado | Não                                      |
      | situacao            | Ativo                                    |
    Então avançar
    Quando preencher o formulário VENDEDOR(A) para o tipo Matriz
      | cpf vendedor | 003.773.021-55 |
      | promotor     | Não            |
    Então avançar
    Quando anexar DOCUMENTAÇÃO para o tipo Matriz
      | documento | C:\\Users\\daniel\\Downloads\\Regras para Cadastro do Produto.docx |
    E salvar os dados do Canal de Vendas
    Então será criado o Canal de Vendas

  @ignore
  Cenário: Incluir Canal de Venda - Filial
    Dado que acesse o modulo de Produto para visualizar Canal de Vendas
    E crie o Canal de Venda
    Quando preencher o formulário CANAL Dados Vendas para o tipo Filial
      | tipo                | Filial                                                              |
      | nome                | BANCORTUR-FILIAL BELO HORIZONTE                                     |
      | descricao           | Descrição canal de vendas BANCORTUR-FILIAL BELO HORIZONTE automação |
      | empresa             | BEP                                                                 |
      | filial              | BEP - Filial 26 (BH)                                                |
      | telefone            | (31) 4009-3400                                                      |
      | email               | central.clubedeturismo@bancorbras.com.br                            |
      | cep                 | 70.304-913                                                          |
      | remuneracao         | Sim                                                                 |
      | tempo indeterminado | Sim                                                                 |
      | data inicio         | 07/10/2019                                                          |
      | data fim            | 31/12/2019                                                          |
      | situacao            | Ativo                                                               |
    Então avançar
    Quando preencher o formulário RESPONSÁVEL para o tipo Filial
      | nome responsavel    | Thiago Mendes                            |
      | sexo                | Masculino                                |
      | cpf                 | 373.845.650-30                           |
      | rg                  |                                   236589 |
      | orgao expedidor     | SSP                                      |
      | profissao           | ADMINISTRADOR DE EMPRESAS                |
      | cargo               | Gerente                                  |
      | nacionalidade       | Brasileira                               |
      | estado civil        | Solteiro                                 |
      | data nascimento     | 14/06/1974                               |
      | email               | central.clubedeturismo@bancorbras.com.br |
      | telefone            | (61) 3314-7422                           |
      | temporario          | Não                                      |
      | data inicio         | 09/10/2019                               |
      | data fim            | 31/12/2019                               |
      | tempo indeterminado | Não                                      |
      | situacao            | Ativo                                    |
    Então avançar
    Quando preencher o formulário VENDEDOR(A) para o tipo Filial
      | cpf vendedor | 003.773.021-55 |
      | promotor     | Não            |
    Então avançar
    Quando anexar DOCUMENTAÇÃO para o tipo Filial
      | documento | C:\\Users\\daniel\\Downloads\\Regras para Cadastro do Produto.docx |
    E salvar os dados do Canal de Vendas
    Então será criado o Canal de Vendas
