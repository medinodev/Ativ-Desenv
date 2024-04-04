var num = prompt("Digite um numero para conferencia se é primo: ")
var aux = 0;

for (var i = 2; i <= num / 2; i++) {
  if (num % i == 0) {
    aux += 1;
  }
}
/*
if(aux >= 1){
    console.log('O numero não é primo')
}
else {
    console.log("O numero é primo")
}
*/

if (aux >= 1) {
  document.write('O numero não é primo' + "<br>")
}
else {
  document.write("O numero é primo" + "<br>")
}
