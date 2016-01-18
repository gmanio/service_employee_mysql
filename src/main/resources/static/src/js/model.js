class Model {
    /**
     * @Constructor
     */
    constructor(){
        this.name = "model";
        this.nCount = 0;
    }

    increase(){
        this.nCount += 1;
    }

    decrease(){
        this.nCount -= 1;
    }

    getCount(){
        return this.nCount;
    }

    getName(){
        return this.name;
    }
}

export default Model;
