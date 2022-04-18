package service;

public interface IQuanLy<T> {
    void add();
    void display();
    void delete(String bienKiemSoat);
    void search(String bienKiemSoat);
}
