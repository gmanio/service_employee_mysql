
import MainView from "./MainView";

class App {
    constructor() {
        this.loadComponent();
    }

    loadComponent() {
        this.mainView = new MainView();
    }
}

$(document).ready(function(){
    // ** Entry Poiont **
    new App();

});

