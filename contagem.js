var qDeNumeros = parseFloat(prompt("Digite a quantidade de números que você quer conferir: "))
var inteiros = 0;

for (var i = 0; i < qDeNumeros; i++) {
  var num = parseFloat(prompt("Digite o número: "))
  if (Number.isInteger(num)) {
    inteiros++
  }
}

document.write("A quantidade de números inteiros é: " + inteiros)