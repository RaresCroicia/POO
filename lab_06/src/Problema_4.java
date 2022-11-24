import java.io.File;
import java.io.FileFilter;
import java.util.Vector;

class Filtru implements FileFilter {

    private Vector<String> extensii;
    private Vector<String> words;

    Filtru(Vector<String> extensii, Vector<String> words){
        this.extensii = extensii;
        this.words = words;
    }

    public boolean accept(File pathname) {
        if(pathname == null)
            return false;
        String filename = pathname.toString();
        int index = filename.lastIndexOf('.');
        String extension = filename.substring(index);
        String name = filename.substring(0, index);
        boolean result = false;
        if(extensii.contains(extension) && words.contains(name))
            result = true;
        return result;
    }
}

public class Problema_4 {
    public static void main(String[] args){
        Vector<String> ext = new Vector<String>();
        Vector<String> words = new Vector<String>();
        ext.add(".c");
        words.add("hallo");
        Filtru filt = new Filtru(ext, words);
        System.out.println(filt.accept(new File("./hallo.c")));
    }
}
