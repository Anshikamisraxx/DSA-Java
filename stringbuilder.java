class stringbuilder
{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Anshika");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0,'H');
        System.out.println(sb);

        // insert char at index 0
        sb.insert(0,'a');
        System.out.println(sb);

        // delete char at index 0
        sb.delete(1,2);
        System.out.println(sb);

        // append
        sb.append("Misra");
        System.out.println(sb);

        // length
        System.out.println(sb.length());
    }
}