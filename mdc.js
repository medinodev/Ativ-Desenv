var a = parseInt(prompt("Digite o primeiro numero para realizar o MDC: "));
var b = parseInt(prompt("Digite o segundo numero para realizar o MDC: "));

while (b !== 0) {
    var temp = a;
    a = b;
    b = temp % b;
}

document.write("O máximo divisor comum (MDC) de dois inteiros é: " + a);