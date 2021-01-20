package adPortal.storage;

import adPortal.model.Ad;
import adPortal.model.Category;
import adPortal.model.User;

public interface AdStorage {

    void add(Ad ad);

    void printAllAds();

    void printMyAds(User user);

    void printByCategory(Category category);

    void deleteMyAds(User user);

    void deleteAdByTitle(String title, User currentUser);
}
