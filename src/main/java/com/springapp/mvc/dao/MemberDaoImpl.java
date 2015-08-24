package com.springapp.mvc.dao;

import com.springapp.mvc.vo.MemberVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by young on 2015-08-08.
 */
@Repository
public class MemberDaoImpl implements MemberDao {

        @Autowired
        private SqlSessionTemplate sqlSessionTemplate;

        public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
            this.sqlSessionTemplate = sqlSessionTemplate;
        }

        @Override
        public int register(MemberVo memberVo) {
            int test = this.sqlSessionTemplate.insert("tests.register",memberVo);
            return test;
        }

        @Override
        public List<MemberVo> memberList() {
            List<MemberVo> list = this.sqlSessionTemplate.selectList("tests.getmemberList");
            return list;
        }

}
