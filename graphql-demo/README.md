### GraphQL Spring Boot 使用
使用 SpringBoot 和 GraphQL 创建一个最简单的增删改查接口应用

#### 什么是GraphQL
https://juejin.im/post/5ac1b03bf265da237b223e82#heading-3



#### 使用方法
- 配置数据库信息
- 访问 http://localhost:8080/graphiql
    
    
###### 查询列表
    
```graphql
{
  getBookList {
    name
    pageCount
  }
}    
```

###### 条件查询

```graphql
{
  getBookById(id: 10) {
    name
    pageCount
  }
}
```

###### 新增

```graphql
mutation {
  createBook(book: {name: "返老还童", pageCount: 1, authorId: "5"})  {
    id
    name
    pageCount
    
  }
}
```

###### 编辑
```graphql
mutation {
  updateBook(id: 11, book: {name: "返老还童2", pageCount: 689, authorId: "5"})  {
    id
    name
    pageCount
    
  }
}
```

###### 删除
```graphql
mutation {
  deleteBook(id: 15)  
  
}
```