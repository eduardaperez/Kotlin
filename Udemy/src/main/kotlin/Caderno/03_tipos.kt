package Caderno

/**
 * Type     Bit     What
 * Double   64      flut. //10.0
 * Float    32      flut. //10f
 * Lang     64      int. //10L
 * Int      32      int.
 * Short    16      int.
 * Byte     8       int.
 * Boolean  ?       T/F
 * String   ?       Text //aspas duplas
 * Char     ?       1 caracter //aspas simples
 */

/*
print("Type MAX ${Type.MAX_VALUE} - MIN ${Type.MIN_VALUE}")
 */

// Unsigned (para não deixar negativo. Colocar U na frente do type) = UType // apenas Long, Int, Short, Byte

fun main() {
    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}