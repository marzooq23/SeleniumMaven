package Libraries;

public class FileExtensions {

    public static String CurrentDirectory() {
        return System.getProperty("user.dir");
    }

    public static String BrowserDirectory() {
        return CurrentDirectory() + "\\src\\Browser";
    }
}
