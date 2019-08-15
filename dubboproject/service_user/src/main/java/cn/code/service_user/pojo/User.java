package cn.code.service_user.pojo;

/**
 * tb_user 实体类
 */
public class User {
    private int id;
    private String userName;
    private String account;
    private String mail;
    private String phone;
    private String salt;
    private String password;
    private String imageUrl;

    public User() {
    }

    public User(int id, String userName, String account, String mail, String phone, String salt, String password, String imageUrl) {
        this.id = id;
        this.userName = userName;
        this.account = account;
        this.mail = mail;
        this.phone = phone;
        this.salt = salt;
        this.password = password;
        this.imageUrl = imageUrl;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
