import java.util.Scanner;
public class website {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String url;
        System.out.println("Enter the URL: ");
        url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));

        String ext = url.substring(url.lastIndexOf(".")+1);

        switch (protocol) {
            case "http":
                System.out.println("Hyper Text Transfer Protocol");
                break;
            case "ftp":
                System.out.println("File Transfer Protocol");
                break;
            case "https":
                System.out.println("Hyper Text Secure Transfer Protocol");
                break;
            default:
                System.out.println("Invalid Protocol");
                break;
        }

        switch (ext) {
            case "com":
             System.out.println("Commercial");
             break;
            case "org":
             System.out.println("Organisation");
             break;
            case "net":
             System.out.println("Network");
             break;
            case "gov":
             System.out.println("Government");
             break;
            default:
             System.out.println("Unknown Site");
             break;
        }
    }
}
