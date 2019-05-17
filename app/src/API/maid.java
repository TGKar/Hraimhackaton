import java.io.*;

public class maid {
    public static Process doit() throws Exception {
        return Runtime.getRuntime().exec("python matchmaker.py");

    }

    public static void main(String[] args) throws Exception {
        String[] a = new String[]{
                "python",
                "C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\matchmaker.py",
        "C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\driver.json",
        "C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\hitchhiker.json"};
//                "foo",
//                "-arg2",
//                "bar",
//                "path/on/remote/machine/iperf -arg3 hello -arg4 world"};
        String PATH = "python C:\\Users\\heChristoph\\IdeaProjects\\untitled\\src\\matchmaker.py driver.json hitchhiker.json";
//        String params = "";
        Process process = Runtime.getRuntime().exec(a);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader er = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//        System.out.println(doit().getInputStream());
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        while ((line = er.readLine()) != null) {
            System.out.println(line);
        }
    }

}

