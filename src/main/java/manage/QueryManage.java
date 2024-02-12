package manage;

public class QueryManage {

    private String query01="SELECT user_id FROM deposits WHERE amount BETWEEN 100 AND 500;";
    private  String query02="SELECT name FROM u168183796_qaloantec.cron_schedules Limit 2";

   private String query03="SELECT firstname,lastname FROM users where country_code NOT LIKE 'TR' AND id=11";

   private String query04="select user_id , group_concat(browser,' - ', os) as browser_os from user_logins group by user_id";


   private String  updateQuery05="SELECT mobile from users  where username like '%e_'";

   private String preparedQuery05=" UPDATE users SET mobile=? WHERE username LIKE ?";





    //-----------GETTER----------------------
    public String getQuery01(){
        return query01;
    }

    public String getQuery02(){
        return query02;
    }


    public String getQuery03(){
        return query03;
    }


    public String getQuery04() {
        return query04;
    }


    public String getUpdateQuery05() {
        return updateQuery05;
    }


    public String getPreparedQuery06() {
        return preparedQuery05;
    }
}

