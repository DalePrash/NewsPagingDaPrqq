package com.example.newspagingdapr;


import com.example.newspagingdapr.news.activity.NewsListActivity;
import com.example.newspagingdapr.news.data.NetworkService;
import com.example.newspagingdapr.news.data.NewsDataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.disposables.CompositeDisposable;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class xTest {
   // @Mock
    //public NewsListActivity news;
    //@Mock

//@Mock
NetworkService ns;

//@Mock
CompositeDisposable cd;



    public NewsDataSource news;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        // engine = mock(Engine.class);
        //   fuelTank = mock(FuelTank.class);
//car = new Car();
        //car = new Car(engine, fuelTank);
      //  news = mock(NewsListActivity.class);
//        news = mock(NewsDataSource.class);
        cd= new CompositeDisposable();

       // cd = mock(CompositeDisposable.class);
        ns = mock(NetworkService.class);
news = new NewsDataSource(ns,cd);

    }

    @Test
    public void AX() {
        // Car n = new Car(engine,fuelTank);
news.xxx();
      //  assertTrue(false);
    }

}
