import java.util.StringTokenizer;

public class Code2SubStringAndStringTokenizer {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "ZxPUWnwPaiwwgBK,kAagpudfentgYYz,MAYeUJgjJMtkrND,vvbuBkKmFvqmQZA,tEHWKmpgVadChhG,NYpJghqdyPFjKdD,wUSvuvpGFawUdPP,PdjqCdeiLdwmJdH,tBDQQmgSyzbzweC,SiXcfdCNYxDcaGq";

        // 3 Different ways of using StringTokenizer
        // 1. Passing just the string or string object
        StringTokenizer st1StringTokenizer = new StringTokenizer(s2);

        // 2. Passing string/string object with a delimiter
        StringTokenizer st2StringTokenizer = new StringTokenizer(s2, ",");
    
        // 3. Passing string/string object with a delimiter and if delimiter needs to be included or not
        StringTokenizer st3StringTokenizer = new StringTokenizer(s2, ",", true);
        

        System.out.println(s1.substring(2,9));

        
        //hasMoreTokens() return bool value if there is another token present after the current token
        //nexToken() returns the next token
        //nextElement() return same as nextToken but returned value is object rather than string
        System.out.println("Print StringTokenizer with just str obj");
        while(st1StringTokenizer.hasMoreTokens())
            System.out.println(st1StringTokenizer.nextToken());

        System.out.println("\nPrint StringTokenizer with str obj and delimiter");
            while(st2StringTokenizer.hasMoreTokens())
                System.out.println(st2StringTokenizer.nextToken());
            
        System.out.println("\nPrint StringTokenizer with str obj, delimiter and including the delimiter");
        while(st3StringTokenizer.hasMoreTokens())
            System.out.println(st3StringTokenizer.nextToken());
    }
}
