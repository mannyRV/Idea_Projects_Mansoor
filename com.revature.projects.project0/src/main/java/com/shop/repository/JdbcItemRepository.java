package com.shop.repository;

import com.shop.db.MySQLConnectionFactory;
import com.shop.model.Customer;
import com.shop.model.Item;
import com.shop.model.Offer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 class JdbcItemRepository implements ItemRepository{
    List<Item> itemList = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        Connection connection = null;
        try {
            connection = MySQLConnectionFactory.getConnection();
            // step-3 :  create JDBC statements with SQL
            String sql = "insert into items(Name,price,quantity) values (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, item.getName());
            ps.setDouble(2, item.getPrice());
            ps.setInt(3,item.getMaxQuanitity());

            // step-4 :  execute JDBC-statements & process results
            int rowCount = ps.executeUpdate();
            if (rowCount == 1)
                System.out.println("New Item inserted into items table in shop database");

            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }



    }

    @Override
    //modify both name and price of item
    public void editItem(int id, String name, double price, int qty) {
        Connection connection = null;
        try {
            connection = MySQLConnectionFactory.getConnection();
            String sql = "update items set name=?, price=?, quantity = ? where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2,price);
            ps.setInt(3,qty);
            ps.setInt(4, id);


            int rowCount = ps.executeUpdate();
            if (rowCount == 1) {
                System.out.println("Item edited successfully ..");
            }

            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    //Modify name of item
    public void editItem(int id, String name) {
        Connection connection = null;
        try {
            connection = MySQLConnectionFactory.getConnection();
            String sql = "update items set name=? where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, id);


            int rowCount = ps.executeUpdate();
            if (rowCount == 1) {
                System.out.println("Item edited successfully ..");
            }

            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    //modify price of item
    public void editItem(int id, double price) {
        Connection connection = null;
        try {
            connection = MySQLConnectionFactory.getConnection();
            String sql = "update items set price=? where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDouble(1,price);
            ps.setInt(2, id);


            int rowCount = ps.executeUpdate();
            if (rowCount == 1) {
                System.out.println("Item edited successfully ..");
            }

            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

     @Override
     public void editItem(int id, int maxQuantity) {
         Connection connection = null;
         try {
             connection = MySQLConnectionFactory.getConnection();
             String sql = "update items set quantity =? where id=?";
             PreparedStatement ps = connection.prepareStatement(sql);
             ps.setDouble(1,maxQuantity);
             ps.setInt(2, id);


             int rowCount = ps.executeUpdate();
             if (rowCount == 1) {
                 System.out.println("Item edited successfully ..");
             }

             // step-5 : Handle SQL-exceptions
         } catch (SQLException e) {
             e.printStackTrace(); // print exception details in console
         } finally {
             // step-7 : close / release connection
             if (connection != null) {
                 try {
                     connection.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }

     }

     @Override
     public void addOffer(int item_id, int quantity, double amount, int customer_id) {
         Connection connection = null;
         Offer o = new Offer(amount, quantity, item_id, customer_id);
         try {
             connection = MySQLConnectionFactory.getConnection();
             // step-3 :  create JDBC statements with SQL
             String sql = "insert into offers(item_id,custmer_id, quantity,amount) values (?,?,?,?)";
             PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1,o.getItem_id());
             ps.setInt(2,o.getCustomer_id());
             ps.setInt(3,o.getQuantity());
             ps.setDouble(4,o.offerAmount);

             // step-4 :  execute JDBC-statements & process results
             int rowCount = ps.executeUpdate();
             if (rowCount == 1)
                 System.out.println("New pending offer inserted into offers table in shop database");

             // step-5 : Handle SQL-exceptions
         } catch (SQLException e) {
             e.printStackTrace(); // print exception details in console
         } finally {
             // step-7 : close / release connection
             if (connection != null) {
                 try {
                     connection.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }



     }

     @Override
    public List<Offer> viewOffers() {
        List<Offer> offersList = new ArrayList<>();

        Connection connection = null;
        try {
            connection = MySQLConnectionFactory.getConnection();
            // step-3 :  create JDBC statements with SQL
            String sql = "select * from offers";
            PreparedStatement ps = connection.prepareStatement(sql);
            // step-4 :  execute JDBC-statements & process results
            ResultSet rs = ps.executeQuery();
            // Mapping relational data to objects
            while (rs.next()) {
                Offer offer = new Offer();
                offersList.add(offer);
            }
            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return offersList;
    }

     @Override
     public void acceptOffer(Offer offer) {
         Connection connection = null;
         try {
             connection = MySQLConnectionFactory.getConnection();

             // step-3 :  create JDBC statements with SQL
             String sql = "update offers set status = 'Accepted' where item_id = ? && custmer_id = ?";
             PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1,offer.getItem_id());
             ps.setInt(2,offer.getCustomer_id());

             // Drop other offers on the same item placed by other customers
             String sql0 = "delete from offers where item_id = ? && custmer_id <> ?;";
             PreparedStatement ps0 = connection.prepareStatement(sql0);
             ps0.setInt(1,offer.getItem_id());
             ps0.setInt(2,offer.getCustomer_id());

             //add item to the ownership - payment plan table
             String sql1 = "insert into ownership_payments (custmer_id, item_id, amount, quantity) values (?,?,?,?)";
             PreparedStatement ps1 = connection.prepareStatement(sql1);
             ps1.setInt(1,offer.getCustomer_id());
             ps1.setInt(2,offer.getItem_id());
             ps1.setDouble(3, offer.getOfferAmount());
             ps1.setInt(4,offer.getQuantity());

             //Drop accepted offer from offers table
             String sql2 = "delete from offers where item_id = ? && custmer_id = ?;";
             PreparedStatement ps2 = connection.prepareStatement(sql2);
             ps2.setInt(1,offer.getItem_id());
             ps2.setInt(2,offer.getCustomer_id());

             // step-4 :  execute JDBC-statements & process results
             int rowCount = ps.executeUpdate();
             if (rowCount == 1)
                 System.out.println("offer has been accepted");

             int rowCount1 = ps1.executeUpdate();
             if (rowCount >= 1) {
                 System.out.println("other offers on this item deleted..");
             }
             // step-5 : Handle SQL-exceptions
         } catch (SQLException e) {
             e.printStackTrace(); // print exception details in console
         } finally {
             // step-7 : close / release connection
             if (connection != null) {
                 try {
                     connection.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }
     }

     @Override
     public void rejectOffer(Offer offer) {
         Connection connection = null;
         try {
             connection = MySQLConnectionFactory.getConnection();
             String sql = "Delete from offers where cutmer_id =? && item_id =? && Amount = ?";
             PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1,offer.getCustomer_id());
             ps.setInt(2, offer.getItem_id());
             ps.setDouble(3, offer.getOfferAmount());

             int rowCount = ps.executeUpdate();
             if (rowCount == 1) {
                 System.out.println("Offer rejected and delected successfully ..");
             }

             // step-5 : Handle SQL-exceptions
         } catch (SQLException e) {
             e.printStackTrace(); // print exception details in console
         } finally {
             // step-7 : close / release connection
             if (connection != null) {
                 try {
                     connection.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }


     }

     @Override
     public List<Item> viewAllItems() {

         List<Item> items = new ArrayList<>();

         Connection connection = null;
         try {
             connection = MySQLConnectionFactory.getConnection();
             // step-3 :  create JDBC statements with SQL
             String sql = "select * from items ";
             PreparedStatement ps = connection.prepareStatement(sql);
             // step-4 :  execute JDBC-statements & process results
             ResultSet rs = ps.executeQuery();

             // Mapping relational data to objects
             while (rs.next()) {
                 Item item = new Item();
                 item.setItemId(rs.getInt("item_id"));
                 item.setName(rs.getString("name"));
                 item.setPrice(rs.getDouble("price"));
                 items.add(item);
             }

             // step-5 : Handle SQL-exceptions
         } catch (SQLException e) {
             e.printStackTrace(); // print exception details in console
         } finally {
             // step-7 : close / release connection
             if (connection != null) {
                 try {
                     connection.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }
         return items;
     }
}
