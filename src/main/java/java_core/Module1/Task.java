package java_core.Module1;

public class Task {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(" ");
        System.out.println("Java");
        String embed_description_account_info = """
                            
                ```Markdown
                Real name:\s
                > %s
                Balance:\s
                > %s
                Game balance:\s
                > %s
                Experience:\s
                > %s
                Language:\s
                > %s
                ```
                ||`UUID key: %s`||
                            
                """;
        System.out.println(embed_description_account_info);
    }
}
