# 工廠方法模式(Factory Method Pattern)



場景：3C 商場販賣各式電腦，目前提供華碩(ASUS)、宏碁(ACER)品牌的電腦。

定義：客戶類和工廠類分開，消費者任何時候需要某種產品，只需向工廠類請求即可，消費者無須修改就可以接納新產品。

缺點：當產品增加時，工廠類也要做相應的修改，如：如何創建及如何向客戶端提供。