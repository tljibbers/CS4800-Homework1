package Folder;

class File {
    private String fileName;
    public File(String fileName)
    {
        this.fileName = fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public void printFile()
    {
        System.out.println(fileName);
    }


}
public class Folder {

    private File[] file;
    private Folder[] sub;
    private String folderName;

    public Folder(String folderName)
    {
        this.folderName = folderName;
    }

    public Folder(String folderName, File[] file, Folder[] sub)
    {
        this.folderName = folderName;
        this.file = new File[] {};
        this.sub = new Folder[] {};
    }

    public String getFolderName()
    {
        return this.folderName;
    }

    public void print()
    {
        for(Folder i : sub)
        {
            i.getFolderName();
        }
        for(File f : file)
        {
            f.printFile();
        }
    }

    
}
