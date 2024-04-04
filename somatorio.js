var num1 = parseInt(prompt("Digite a quantidade de número que você quer somar: "))
var soma = 0;

for (var i = 0; i < num1; i++) {
  var num2 = parseFloat(prompt("Digite o número: "))
  soma += num2
}

document.write("A soma dos números é: " + soma + "<br>")