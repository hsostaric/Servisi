package com.example.food2go.DataLoaders;

import com.example.core.Korisnik;
import com.example.webservice.WebServiceCaller;
import com.example.webservice.WebServiceHandler;

public class WsDataLoader {
    private Boolean opSuccessfull;
    private DataLoadedListener dataLoadedListener;
    private WebServiceCaller webServiceCaller;
    WebServiceHandler webServiceHandler = new WebServiceHandler() {
        @Override
        public void onDataArrived(String message, String status,Object data) {
            dataLoadedListener.onDataLoaded(message,status,data);
        }
    };
    public WsDataLoader() {
        webServiceCaller = new WebServiceCaller(webServiceHandler);
    }

    public void Prijava(Korisnik korisnik,DataLoadedListener dataLoadedListener){
        this.dataLoadedListener=dataLoadedListener;
        webServiceCaller.CallForKorisnici(korisnik);

    }
}
