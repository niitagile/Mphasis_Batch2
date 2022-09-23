class Rectangle{
  _length=0;
    _breath=0;
    
    
    public get length() : number {
        return this._length; 
    }
    public get breath() : number {
        return this._breath; 
    }
    public set length(v : number) {
        this._length = v;
    }
    
    public set breath(v : number) {
        this._breath = v;
    }
    
    
}
let rect=new Rectangle();
//call setters
rect.length=20;
rect.breath=10;
console.log("length="+rect.length);
console.log("breadth="+rect.breath);