function runProgram(input){
    
  input=input.trim().split("\n")
  let length=+input[0]
  let array= input[1].trim().split(" ").map(Number)
  let low=0;
  let high=array.length-1;
    mergsort(array,low,high); 
    console.log(array.reverse().join(" "));
  }
  
  
  
  function mergsort(array,low,high){
      if (low == high){ 
          return;
      }
      var middle = Math.floor((low + high)/2); 
      mergsort(array,low,middle); 
      mergsort(array,middle+1,high);
      merge(array,low,high,middle);
  }
  
  
  function copyarr(array,left,right){
      var ans = [];
      for (var i = left;i<=right;i++){
          ans.push(array[i]);
      }
      return ans;
  }
  function merge(array,low,high,middle){
 var arr1 = copyarr(array,low,middle);
      var arr2 = copyarr(array,middle+1,high);
var p = 0;
      var p1 = 0;
      var l = low;
 while(p < arr1.length && p1 < arr2.length){
          if (arr1[p] <= arr2[p1]){
              array[l] = arr1[p];
              p++;
          }else{
   array[l] = arr2[p1];
         p1++;
          }
          l++;
      }
      while(p < arr1.length){
      array[l] = arr1[p];
        p++;
      l++;
      }
      while(p1 < arr2.length){
        array[l] = arr2[p1];
    p1++;
          l++;
      }
  }
  
  if (process.env.USER === "") {
      runProgram(``);
    } else {
      process.stdin.resume();
      process.stdin.setEncoding("ascii");
      let read = "";
      process.stdin.on("data", function (input) {
        read += input;
      });
      process.stdin.on("end", function () {
        read = read.replace(/\n$/, "");
        read = read.replace(/\n$/, "");
        runProgram(read);
      });
      process.on("SIGINT", function () {
        read = read.replace(/\n$/, "");
        runProgram(read);
        process.exit(0);
      });
    }