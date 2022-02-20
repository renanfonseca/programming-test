<div align="center">
 <img src="https://img.shields.io/github/license/renanfonseca/programming-test"/>
 <img src="https://img.shields.io/github/issues/renanfonseca/programming-test"/>
 <img src="https://img.shields.io/github/forks/renanfonseca/programming-test"/>
</div>
</br></br>


<div align="center">
<img  src="https://user-images.githubusercontent.com/23081419/154842157-eac83f65-e1e4-4011-b696-d131224cdfc2.png" />
</div>

 <h3 align="center">programming-test</h3>

<p>Aplicação desenvolvida do desafio proposto pela Capgemini. Com objetivo de testar conhecimentos de lógica de programação. foram desenvolvidos três algoritmos: primeiro a criação de um que mostre na tela uma escada de tamanho <strong>n</strong> utilizando apenas o caractere * e espaço; o segundo recebece uma senha e mostrase o número mínimo de caracteres que deveriam ser adicionados para a senha ser considerada segura; o terceiro um algoritmo que encontrase o número de pares de substrings que são anagramas.</p>
</br>

<p align="center">
 <a href="#tecnologias-usadas">Tecnologias Usadas</a> -
 <a href="#funcionalidades">Funcionalidades</a> - 
 <a href="#como-executar-o-projeto">Como executar o projeto</a>
</p>


## Tecnologias Usadas
<table>
  <tr>
    <td><img width="30" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" /><span>Java</span></td>
  </tr>
  <tr>
    <td>17.0.2</td>
  </tr>
</table>

## Funcionalidades

### Menu
![menu](https://user-images.githubusercontent.com/23081419/154766073-d0887d36-82d7-40de-a09d-fa07976bceb9.png)


### createLadder
Cria uma escada com n numero de entrada 
<br/><br/>
![escada](https://user-images.githubusercontent.com/23081419/154764281-4f1718a1-0a19-4574-9773-e221d7c3f64e.png)

### checkPassword
Verifica se a senha é segura atendendo os seguintes critérios:
1. Possui no mínimo 6 caracteres
2. Contém no mínimo 1 digito
3. Contém no mínimo 1 letra em minúsculo
4. Contém no mínimo 1 letra em maiúsculo.
5. Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ 
<br/><br/>
![senhaSegura](https://user-images.githubusercontent.com/23081419/154764962-aa9d1740-2524-4227-a7d8-4105591df4c3.png)
<br/><br/>
![senhaSegura2](https://user-images.githubusercontent.com/23081419/154765109-d0a9c737-3390-46e9-8648-1d8aafb302d7.png)
<br/><br/>
![senhaSegura3](https://user-images.githubusercontent.com/23081419/154765264-cc72cc27-d049-4497-a865-701d32a5eebf.png)

### anagramPairs
Dada uma String como entrada é criado substrings e comparadas para achar o número de pares de anagramas que essas substrings formam 
<br/><br/>
![anagramas](https://user-images.githubusercontent.com/23081419/154765809-2b5bc342-e081-432c-a7b3-1f94b3ffa4d0.png)




## Como executar o projeto
1. Fazer download do <a href="http://jdk.java.net/17/">JDK</a>
2. Configurar as variáveis de ambiente. jdk-17.0.2 e jdk-17.0.2\bin no Path.
3. Clonar o repositorio ou baixar os arquivos para sua maquina.
4. Abrir o terminal na pasta do projeto onde esta localizado o arquivo main.java.
5. Executar no terminal o comando javac main.java.
6. Executar no terminal o comando java main.
