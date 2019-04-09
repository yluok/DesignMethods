package com.yluo.prototype.bussiness;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 业务需求：
 *  1、返回某个用户的投资记录列表，返回的结果信息包括除了我们Record表中的所有字段外，
 *  还需要要Record中inAccountId/outAccountId对应的Account类中账户的name
 *
 * 业务现状：
 * 1、从数据库中查出来的投资记录列表中，单个记录只有账户id，没有账户名，展示时需要展示出账户名
 * 2、只能通过请求一次完成
 *
 * 关键点思路分析：
 * 1、我们创建一个新类RecordShow继承自Record类，然后追加2个属性inAccountName/outAccountName，分别是流入账户名和流出用户名
 * 2、遍历我们的投资记录列表，将我们的Record中的所有属性拷贝至我们的新类RecordShow中，
 * 3、遍历判断账户id与新类账户inAccountId/outAccountId的对应关系，完成新类账户名inAccountName/outAccountName的赋值，
 *   最后返回我们的新类RecordShow列表即可
 */
public class Demo {
    public static void main(String[] args) {
        //1、模拟从数据库中查出某个用户的投资记录列表
        List<Record> records = searchRecord();
        //2、模拟从数据库获得账户列表
        List<Account> accounts = searchAccount();

        //3、创建一个我们需要返回的结果列表
        List<RecordShow> recordShows = new ArrayList<>();

        //4、遍历投资记录列表
        for(Record record : records) {
            try {
                //5、将record拷贝至recordShow中
                RecordShow recordShow = RecordShow.clone(record);
                //6、遍历账户列表，将id与name对应赋值
                for(Account account:accounts) {
                    //交易类型为收入：即只有收入账户
                    if(recordShow.getInOrOut() == 1 && (recordShow.getInAccountId() == account.getId())) {
                        recordShow.setInAccountName(account.getName());
                        break;
                    }
                    //交易类型为支出：即只有支出账户
                    if(record.getInOrOut() == 2 && (recordShow.getOutAccountId() == account.getId())) {
                        recordShow.setOutAccountName(account.getName());
                        break;
                    }
                    //交易类型为转账：即同时有支出和转入账户
                    if(record.getInOrOut() == 3) {
                        if(recordShow.getInAccountId() == account.getId()) {
                            recordShow.setInAccountName(account.getName());
                        }
                        if(recordShow.getOutAccountId() == account.getId()) {
                            recordShow.setOutAccountName(account.getName());
                        }
                        if(recordShow.getInAccountName() != null && recordShow.getOutAccountName() != null) {
                            break;
                        }
                    }
                    //7、将结果添加入返回结果列表中
                    recordShows.add(recordShow);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("我们从数据库获得的记录列表为：" + records);
        System.out.println("返回的结果列表为：" + recordShows);
    }


    //模拟从数据库中获取某个用户的投资记录列表
    private static List<Record> searchRecord() {
        List<Record> records = new ArrayList<>();
        Record record = new Record();
        record.setId(1);
        record.setCashAmount(100);
        record.setContent("转账");
        record.setCreatetime(new Date());
        record.setInAccountId(1);
        record.setInOrOut((short)3);
        record.setOutAccountId(2);
        record.setUpdatetime(new Date());
        record.setUserId(1);
        records.add(record);

        Record record1 = new Record();
        record1.setId(2);
        record1.setCashAmount(200);
        record1.setContent("收入");
        record1.setCreatetime(new Date());
        record1.setInAccountId(3);
        record1.setInOrOut((short)1);
        record1.setUpdatetime(new Date());
        record1.setUserId(1);
        records.add(record1);
        return records;
    }

    //模拟获取用户账户列表
    private static List<Account> searchAccount() {
        List<Account> accounts = new ArrayList<>();
        Account account = new Account();
        account.setId(1);
        account.setName("现金账户");

        Account account2 = new Account();
        account2.setId(2);
        account2.setName("银行卡账户");

        Account account3 = new Account();
        account3.setId(3);
        account3.setName("股票账户");

        accounts.add(account);
        accounts.add(account2);
        accounts.add(account3);

        return accounts;

    }
}
