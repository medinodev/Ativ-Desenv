function promptArray() {

    let array = [];
    let input = prompt("Digite os números do array separados por vírgula:");
    let numbers = input.split(",");
  
    for (let number of numbers) {
      array.push(parseInt(number));
    }
  
    return array;
  }
  
  function quicksort(array) {
  
    if (array.length <= 1) {
      return array;
    }
  
    let pivot = array[array.length - 1];
  
    let menores = [];
    let maiores = [];
  
    for (let i = 0; i < array.length - 1; i++) {
      if (array[i] < pivot) {
        menores.push(array[i]);
      } else {
        maiores.push(array[i]);
      }
    }
  
    return quicksort(menores).concat([pivot], quicksort(maiores));
  }
  
  let array = promptArray();
  document.write("Array original: ", array + "<br>");
  document.write("Array ordenado: ", quicksort(array));