package com.ll.exam;

import com.ll.exam.article.controller.ArticleController;
import com.ll.exam.home.controller.HomeController;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void junit_assertThat() {
        int rs = 10 + 20;

        assertThat(rs).isEqualTo(30);
    }
    @Test
    public void ioc__articleController() {
        ArticleController articleController = Container.getObj(ArticleController.class);

        assertThat(articleController).isNotNull();
    }

    @Test
    public void ioc__articleController__싱글톤() {
        ArticleController articleController1 = Container.getObj(ArticleController.class);
        ArticleController articleController2 = Container.getObj(ArticleController.class);
        assertThat(articleController2).isEqualTo(articleController1);
    }

    @Test
    public void ioc__homeController() {
        HomeController homeController = Container.getObj(HomeController.class);

        assertThat(homeController).isNotNull();
    }

    @Test
    public void ioc__homeController__싱글톤() {
        HomeController homeController1 = Container.getObj(HomeController.class);
        HomeController homeController2 = Container.getObj(HomeController.class);

        assertThat(homeController2).isEqualTo(homeController1);
    }

    @Test
    public void ioc__Controller들을_스캔하여_수집() {
        List<String> names = Container.getControllerNames();

        assertThat(names).contains("home");
        assertThat(names).contains("article");
    }
}