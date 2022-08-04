package controller;

import account.User;
import storage.ReadFile;
import storage.WriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerUser implements WriteFile, ReadFile,Serializable {
    private static final long serialVersionUID = -4333316296251054416L;
        private List<User> users = new ArrayList<>();
        public ManagerUser() {
            File file = new File("file/user.txt");
            if (file.exists()) {
                try {
                    readFile("file/user.txt");
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();

                }
            }
        }

        public void displayAll() {
            for (User user : users) {
                System.out.println(user);
            }
        }


        public void register(User user) {
            this.users.add(user);
            try {
                writeFile("file\\user.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    @Override
    public void ReadFile(String path) throws IOException, ClassNotFoundException {

    }

    @Override
        public void readFile(String path) throws IOException, ClassNotFoundException{
            InputStream is = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(is);
            this.users = (List<User>) ois.readObject();
        }

        @Override
        public void writeFile(String path) throws IOException {
            OutputStream os = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(this.users);
        }

        public boolean checkUsernameExist(String username) {
            boolean isExist = false;
            for (int i = 0; i < users.size(); i++) {
                if (username.equals(users.get(i).getAcount())) {
                    isExist = true;
                    break;
                }
            }
            return isExist;
        }

        public boolean checkUserLogin(String acount, String passwork) {
            boolean isLogin = false;
            for (int i = 0; i < users.size(); i++) {
                if (acount.equals(users.get(i).getAcount()) && passwork.equals(users.get(i).getPasswork())) {
                    isLogin = true;
                    break;
                }
            }
            return isLogin;
        }

        @Override
        public void WriteFile(String path) throws IOException {

        }

}
