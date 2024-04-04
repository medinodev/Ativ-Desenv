let primeiro = 0
let segundo = 1
let sequenciaDeNumeros = '0 1'

let entrada = parseInt(prompt('Digite a quantidade de numeros que voce quer que apareca na sequencia: '))

for (let x = 0; x < entrada - 2; x++) {
  let soma = primeiro + segundo
  sequenciaDeNumeros += " " + soma
  let aux = soma
  primeiro = segundo
  segundo = soma

}
document.write(sequenciaDeNumeros + "<br>")