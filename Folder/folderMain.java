package Folder;

public class folderMain {

    public static void main(String[] args)
    {
        File f = new File("test");
        File s = new File("test2");
        File[] a = {f, s};

        Folder q = new Folder("testfolder");
        Folder e = new Folder("testfolder2");
        Folder[] b = {q, e};

        Folder z = new Folder("mainfolder", a, b);
        z.print();
    }
    
}
