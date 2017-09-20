# 接口说明文档 /HairCutConnect
#### 该后端使用Restful风格URL接口
--------------

## 用户接口 /userInfo

>### 描述：登录 /login *GET*
>* 参数：String account, String password
>* 返回值范例： 
```
    {
        "id": 5,
        "nickName": "测试",
        "account": "wqz",
        "headIcon": "http://upload.jianshu.io/users/upload_avatars/3673902/3a9ed648-604b-4587-858e-de5c7c6d5d9f.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/240/h/240",
        "sex": "男",
        "hairdo": "短发",
        "sign": "我就是我，饲料不一样的骆驼=。=",
        "registerDate": 1505892684000,
        "birthday": 772473600000
    }
```

>### 描述：注册 /register *POST*
>- 参数：String account, String password
>- 返回值范例： 
```
    true
```

>### 描述：更新用户信息 /infoUpdate *POST*
>- 参数：String account, String password
>- 返回值范例： Integer userId, String nickName, MultipartFile headIcon, String sex, String birthday, String hairdo, String sign
```
    true
```

----------------------------
## 理发店信息接口 /storeInfo

>### 描述：理发店增加信息 /insertStore *POST*
>- 参数：Double lon, Double lat, Integer bossId, String shopSign, String tradeName, MultipartFile headIcon
>- 返回值范例： 
```
    true
```

>### 描述：得到理发店信息(使用经纬度) /getStore *GET*
>- 参数：Double left, Double right, Double top, Double bottom
>- 返回值范例：
```
    [
        {
            "id": 1,
            "shopSign": "专治不服",
            "lon": 120.0,
            "lat": 23.0,
            "headIcon": "http://upload.jianshu.io/users/upload_avatars/3673902/3a9ed648-604b-4587-858e-de5c7c6d5d9f.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/240/h/240",
            "tradeName": "单剪不卖",
            "bossId": 1,
            "hold": null
        }
    ]
```

>### 描述：删除理发店信息 /deleteStore *POST*
>- 参数：Integer storeId
>- 返回值范例：
```
    true
```

----------------------------
## 理发师信息接口 /barberInfo (Tony老师，来一下=。=)

>### 描述：得到某个理发店的所有"Tony老师" /selectInfo *GET*
>- 参数：Integer storeId
>- 返回值范例： 
```
    [
        {
            "id": 1,
            "nickName": "Tony老师",
            "account": "1",
            "headIcon": "http://upload.jianshu.io/users/upload_avatars/3673902/3a9ed648-604b-4587-858e-de5c7c6d5d9f.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/240/h/240",
            "sign": "我是最帅的",
            "goodAt": "什么都擅长",
            "storeId": 1,
            "hold": null
        }
    ]
```

>### 描述：更新"Tony老师"的信息 /updateBarber *POST*
>- 参数：Integer barberId, String nickName, String password, String sign, String goodAt, Integer storeId
>- 返回值范例： 
```
    true
```

>### 描述：更新"Tony老师"的头像 /updateHeadIcon *POST*
>- 参数：Integer barberId, MultipartFile headIcon
>- 返回值范例： 
```
    true
```