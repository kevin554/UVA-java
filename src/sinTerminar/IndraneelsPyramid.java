package sinTerminar;

/**
Indraneel's Pyramid
http://opc.iarcs.org.in/index.php/problems/PYRAMID

Indraneel would like a build a pyramid of wooden blocks. A pyramid is built by 
placing a square block, say N cms by N cms, at the base, place another square 
block N-1 cms by N-1 cms on top of that, a square block of N-2 cms by N-2 cms 
on top of that and so on, ending with a 1 cm by 1 cm block on top. The height 
of such a pyramid is N.

Indraneel has with him M rectangular blocks of wood. He is willing to shape
them into square blocks. His only cutting tool is a shaver that can be used to 
shave off the wood from any edge to reduce its length. This means that he can 
never get two square blocks from a single rectangular block.

For example, suppose the dimensions of the rectangular blocks available with
Indraneel are 8×8, 2×8, 2×1 and 2×2. Then, he can build a pyramid of height 3 
(the 2×1 block can be shaved to give a 1×1 block, and the 8×8 block can be 
shaved down to a 3×3 block.)

Given the dimensions of the blocks available, your task is determine the height 
of the tallest pyramid that Indraneel can build.

Input format
The first line of the input contains a single integer M indicating the number 
of blocks of wood available. This is followed by M lines of input 
(lines 2, 3,...,M+1) each containing the description of a block. A block is 
described by two integers i and j indicating the lengths of the two sides of 
the block. No block is longer or wider than 1000000 cms.

Output format
A single line with a single integer indicating the height of the tallest
pyramid that Indraneel can build.

Test Data:
You may assume that M ≤ 1000000. Recall that all block dimensions are bounded
by 1000000 cms.

Example:
Here is the sample input and output corresponding to the example discussed 
above.

Sample Input
4
8 8
2 8
2 1
2 2

Sample Output
3
*/
public class IndraneelsPyramid {

    public static void Main(String[] args) {
        java.util.ArrayList<Integer> bloques = new java.util.ArrayList<Integer>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cantidadBloques, anchoBloque, altoBloque, bloque;
        
        cantidadBloques = sc.nextInt();
        while (cantidadBloques-- > 0) {
            anchoBloque = sc.nextInt();
            altoBloque = sc.nextInt();
            
            bloque = Math.min(anchoBloque, altoBloque);
            
            if (!bloques.contains(bloque)) 
                bloques.add(bloque);
        }
        
        System.out.println(bloques.size());
    }
}