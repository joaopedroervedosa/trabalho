function isPrime(n) {
    if (n <= 1) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
      if (n % i === 0) return false;
    }
    return true;
  }
  
  console.log(isPrime(7));  // true
  console.log(isPrime(10)); // false

  function sum(numbers) {
    return numbers.reduce((acc, num) => acc + num, 0);
  }
  
  console.log(sum([1, 2, 3, 4, 5])); // 15

  function fibonacci(n) {
    let fib = [0, 1];
    for (let i = 2; i <= n; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib[n];
  }
  
  console.log(fibonacci(7));  // 13

  function mdc(a, b) {
    while (b !== 0) {
      let temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
  
  console.log(mdc(56, 98)); // 14

  function quicksort(arr) {
    if (arr.length <= 1) return arr;
    let pivot = arr[arr.length - 1];
    let left = [];
    let right = [];
    for (let i = 0; i < arr.length - 1; i++) {
      if (arr[i] < pivot) left.push(arr[i]);
      else right.push(arr[i]);
    }
    return [...quicksort(left), pivot, ...quicksort(right)];
  }
  console.log(quicksort([10, 5, 2, 3, 8]));  // [2, 3, 5, 8, 10]

  function countInRange(arr, n) {
    let count = 0;
    for (let i = 0; i < arr.length; i++) {
      if (arr[i] >= arr[0] && arr[i] <= n) {
        count++;
      }
    }
    return count;
  }
  
  console.log(countInRange([1, 2, 3, 4, 5], 4)); // 4
  
  
  
  
  