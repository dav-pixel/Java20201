package blog;

import blog.Impl.PostStorageImpl;
import blog.model.Post;
import blog.storage.PostStorage;

import java.util.Date;
import java.util.Scanner;

public class BlogMain implements Commands{


    private static final PostStorage POST_STORAGE = new PostStorageImpl();
    private static final Scanner SCANNER  = new Scanner(System.in);

    public static void main(String[] args) {
        boolean IsRun = true;

        while (IsRun){
            POST_STORAGE.printAllPosts();
            printCommands();
            String commandStr = SCANNER.nextLine();
            int command;
            try {
                command = Integer.parseInt(commandStr);
            }catch(NumberFormatException e){
                command = -1;
            }
            switch (command){
                case EXIT:
                    IsRun = false;
                    break;
                case ADD_POST:
                    addPost();
                    break;
                case SEARCH_POST:
                    searchPost();
                    break;
                case POSTS_BY_CATEGORY:
                    postsByCategory();
                    break;


            }
        }

    }

    private static void postsByCategory() {
        System.out.println("Please input category");
        String category = SCANNER.nextLine();
        POST_STORAGE.printPostsByCategory(category);
    }

    private static void searchPost() {
        System.out.println("Please input keyword");
        String keyword = SCANNER.nextLine();
        POST_STORAGE.searchPostsByKeyword(keyword);
    }

    private static void addPost() {

        System.out.println("Please enter title,text,category");
        String postDataStr = SCANNER.nextLine();
        String[] postData = postDataStr.split(",");
        try {
            Post post = new Post();
            post.setTitle(postData[0]);
            post.setText(postData[1]);
            post.setCategory(postData[2]);
            post.setCratedDate(new Date());
            POST_STORAGE.add(post);
            System.out.println("Post was added!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid data");
            addPost();
        }
    }

    private static void printCommands(){
        System.out.println("Please enter" + EXIT + " for EXIT");
        System.out.println("Please enter" + ADD_POST + " for ADD_POST");
        System.out.println("Please enter" + SEARCH_POST + " for SEARCH_POST");
        System.out.println("Please enter" + POSTS_BY_CATEGORY + " for POSTS_BY_CATEGORY");
    }

}
