class bitwise_operator
{
    public static void main(String args[])
    {
        int a=5; // 0101 in binary
        int b=3; // 0011 in binary
        System.out.println("a & b = " + (a & b)); // AND operator
        System.out.println("a | b = " + (a | b)); // OR operator
        System.out.println("a ^ b = " +(a ^ b)); // XOR operator
        System.out.println("~a = " + (~a)); // NOT operator
        System.out.println("a << 1 = " + (a << 1)); // Left shift operator
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift operator
    }
}