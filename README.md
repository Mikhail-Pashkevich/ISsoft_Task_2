# ISsoft_Task_2

CREATE CLASSES AND TESTS

// дизайн классов для доменной сущности Order: id, userId, статус, массив айтемов, дата, адрес доставки, etc.
// дизайн классов для доменной сущности OrderItem: имя, количество, стоимость
// OrderService.placeOrder (c валидацией и сохранение в базу), OrderService.loadAllByUserId,
// OrderStorage, OrderItemStorage с нужными методами (not implemented)
// тесты на OrderStorage и OrderItemStorage (красные), UserService (зеленые)
// дедлайн 7.04.21 23:59


Комментарии по коду:
1) maven surefire plugin нужно добавлять в pom.xml, что бы тесты запускались при билде
2) Order, OrderItem, User были бы намного лучше, если бы большинство полей были final
3) Status -я не думаю что использовать один и тот же enum для статусов пользователя и заказа хорошая идея
4) OrderStorage.findByOrderId по логике должен возвращать один заказ, а не список
5) OrderService: в класса Service должна быть логика. Публичным методам orderToStringForWrite, read(String path),  write(String path) там не место
6) OrderService лучше принять ссылку на OrderStorage orderStorage через конструктор чем инициализировать поле в самом классе. OrderStorage можно подменить например на storage, который работает с БД, а в твоем варианте это сделать затруднительно.  
7) нет OrderItemStorage 
8) OrderStorageTest  не покрывает все методы класса OrderStorage
9) OrderServiceTest не использует mock для OrderStorage и является по-сути интеграционым тестом.
