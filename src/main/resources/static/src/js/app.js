import Model from "./model";

class App{
    constructor(){
        this.model = new Model();
        this.onLoad();
    }

    onLoad(){
        console.dir(this.model);
    }
}
