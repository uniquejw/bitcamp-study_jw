package com.eomcs.mylist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eomcs.mylist.domain.Todo;

@Mapper
public interface TodoDao {

  int countAll();

  List<Todo> findAll();

  void insert(Todo todo) throws Exception;

  Todo findByNo(int no);

  int update(int no, Todo todo) throws Exception;

  int updateDone(int no, boolean done) throws Exception;

  int delete(int no) throws Exception;
}











