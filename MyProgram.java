public class MyProgram extends ConsoleProgram
{
    char s = ' ';
    public void run()
    {
        while(true)
        {
        introMessage();
        String phrase = readLine("Please Enter a Phrase: ");
        String operation = readLine("Pleaes choose how you would like you iterate the phrase: ");
        choseOperation(operation,phrase);
        }
    }
    
    
    public void choseOperation(String o,String phrase)
    {
        switch(o)
        {
            case "BackwardsWithoutSpaces":
                BackWardsWithoutSpaces(phrase);
                break;
                case "BackwardsWithSpaces":
                BackWardsWithSpaces(phrase);
                break;
                case "ForwardsWithoutSpaces":
                ForWardsWithoutSpaces(phrase);
                break;
                case "ForwardsWithSpaces":
                ForWardswithSpaces(phrase);
                break;
        }
    }
    
    public void BackWardsWithoutSpaces(String phrase)
    {
        for(int i = phrase.length(); i > phrase.length(); i--)
        {
            char c = phrase.charAt(i);
            if(c == s )
            {
            }
            else 
            {
                System.out.println(c);
            }
            
        }
    }
    
    public void BackWardsWithSpaces(String phrase)
    {
        for(int i = phrase.length(); i > phrase.length(); i--)
        {
            char c = phrase.charAt(i);
            System.out.println(c);
        }
    }
    
    public void ForWardsWithoutSpaces(String phrase)
    {
        for(int i = 0; i < phrase.length(); i++)
        {
            char c = phrase.charAt(i);
            if(c == s )
            {
                
            }
            else 
            {
                System.out.println(c);
            }
            
        }
    }
    
    public void ForWardswithSpaces(String phrase)
    {
        for(int i = 0; i < phrase.length(); i++)
        {
            char c = phrase.charAt(i);
            System.out.println(c);
        }
    }
    
    public void introMessage()
    {
        System.out.println("Hello, this program parses through your phrase and prints them out as individual characters.");
        System.out.println("We do this by iterating through the String and setting a char to each character.");
        System.out.println("This program has multiple of operations on how to iterate through the phrase");
        System.out.println("This opeartions include: ForwardsWithoutSpaces, ForwardsithSpaces, BackwardsWithoutSpaces, BackwardsWithSpaces");
    }
}