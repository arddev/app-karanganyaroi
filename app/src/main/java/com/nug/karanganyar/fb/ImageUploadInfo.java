package com.nug.karanganyar.fb;




public class ImageUploadInfo {

    public String imageName;

    public String imageURL;

    public String fullname;

    public String place;

    public String addres;

    public String des;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name, String places, String fullnames, String address, String dess ,String url) {

        this.imageName = name;
        this.imageURL= url;
        this.place = places;
        this.fullname = fullnames;
        this.addres = address;
        this.des = dess;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getPlace() { return place;}

    public String getFullname() { return fullname;}

    public String getAddres() { return addres;}

    public String getDes() { return des;}

}
