# Matrix-Calculator-over-Finite-Field

## Class
### GF256
Finite field arithmetic class based on 256.

__function:__
add, sub, mult, inverse.
### GF256Matrix
Matrix arithmetic class based on GF256.

__function:__ inverse, rightMultiply, matrixMultiply

## Example
you can see `main.java`
#### Sample arithmetic
```java
System.out.println(GF256.add(85, 95));
System.out.println(GF256.sub(85, 95));
System.out.println(GF256.mult(85, 95));
System.out.println(GF256.div(85, 95));
```
Output:
```
10
10
249
177 
```

#### Matrix arithmetic
Create new matrix
```java
GF256Matrix matrix1 = new GF256Matrix(new int[][]{
            {2, 5, 9},
            {5, 7, 6},
            {4, 8, 1}
        }); 
```
Find inverse matrix
```java
GF256Matrix matrix2 = matrix1.inverse();
//output
System.out.println("");
for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
        System.out.print(matrix2.getElement(i, j) + " ");
    }
    System.out.println("");
}
```
Output:
```
110 154 66 
 58  76 66 
104   8 62
```
Multiply two matries
```java
GF256Matrix matrix3 = GF256Matrix.matrixMultiply(matrix1, matrix2);
//output
System.out.println("");
for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
        System.out.print(matrix3.getElement(i, j) + " ");
    }
    System.out.println("");
}
```
Output
```
1 0 0 
0 1 0 
0 0 1
```
Multiply with vector
```java
int[] vector = new int[]{
    1, 2, 3
};
int[] packet = matrix1.rightMultiply(vector);
int[] ans = matrix2.rightMultiply(packet);
//output
System.out.println();
for(int i = 0; i < packet.length; i++) {
    System.out.print(packet[i] + " ");
}
System.out.println();
System.out.println();
for(int i = 0; i < ans.length; i++) {
    System.out.print(ans[i] + " ");
}
System.out.println();
```
Output:
```
19 1 23

1 2 3
```

## Support from
https://github.com/Archistar/archistar-smc