import java.io.*;


public class Apier {

    /**
     * return
     *
     * @param adress string array, first element "python", second element .py location, 3rd and 4th
     *               are the json adressess.
     * @return first line
     * @throws Exception yes is does
     */
    public static String execute(String[] address) throws Exception {
        Process process = Runtime.getRuntime().exec(address);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader er = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String line;
        while ((line = er.readLine()) != null) {
            System.out.println(line);
        }
        return br.readLine();

    }

    public static String give_maps_link() throws Exception {
        String[] a = new String[]{
                "python",
                "C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\link_giver.py",
                "derech hahoresh 55",
                "neve shaanan 20",
                "koresh 12",
                "ezra 15, efrat",
                "13:50"
        };
        System.out.println((execute(a)));
        return execute(a);
    }


    public static void main(String[] args) throws Exception {
        give_maps_link();
//        String[] a = new String[]{
//                "python",
//                "C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\matchmaker.py",
//                "C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\driver.json",
//                "C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\hitchhiker.json"};
//        System.out.println(execute(a));
//                "foo",
//                "-arg2",
//                "bar",
//                "path/on/remote/machine/iperf -arg3 hello -arg4 world"};
//        String PATH = "python C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\matchmaker.py driver.json hitchhiker.json";
//        String params = "";
//        Process process = Runtime.getRuntime().exec(a);
//        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        BufferedReader er = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//        System.out.println(doit().getInputStream());
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        while ((line = er.readLine()) != null) {
//            System.out.println(line);
//        }
    }
}

