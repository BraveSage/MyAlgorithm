public class SuffixName {

    public static void main(String[] args) {
        String name = "TIM图片20200626144518.jpg";
        System.out.println(getSuffix(name));
    }

    public static String getSuffix(String name){
        int i = name.lastIndexOf('.');
        return  name.substring(i);

    }
}
