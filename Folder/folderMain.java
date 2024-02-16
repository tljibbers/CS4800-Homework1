package Folder;

public class folderMain {

    public static void main(String[] args)
    {
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");
        File[] allFiles = {htaccess, htrouter, index};

        Folder source = new Folder("Source Files");
        Folder include = new Folder("Include Path");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder pub = new Folder("public");
        Folder remote = new Folder("Remote Files");

        Folder[] allFolders = {source, include, phalcon, app, config, controllers, library, migrations, models, views, cache, pub, remote};

        Folder php = new Folder("php_demo1", allFiles, allFolders);
        php.print();
    }
    
}
