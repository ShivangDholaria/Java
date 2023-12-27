public class Code3StringBuilder {
    public static void main(String[] args) {

        //Making StringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append("Hello").append(" StringBuilder").append(" !!!");
        System.out.println(sb);

        //Getting String obj from StringBuilder object
        String sbObj = sb.toString(); 

        System.out.println(sbObj);
    }
}
