package com.nuit.domain;

/**TODO--商品的实体类
 * id-商品的序列号
 * name--商品的
 * price--
 * img--
 */
public class Commodity {
    private int id;
    private String name;
    private double price;
    private String img;
    private String introduction;

    public Commodity() {
    }

    /**
     * 添加商品实体类时，id由数据库自行添加
     * @param name
     * @param price
     * @param img
     * @param introduction
     */
    public Commodity(String name, double price, String img, String introduction) {
        this.name = name;
        this.price = price;
        this.img = img;
        this.introduction = introduction;
    }

    /**
     *查找商品时，会使用的构造函数
     * @param id
     * @param name
     * @param price
     * @param img
     */
    public Commodity(int id, String name, double price, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.introduction = null;
    }

    public Commodity(int id, String name, double price, String img, String introduction) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
