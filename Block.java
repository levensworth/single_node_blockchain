public class Block <T>{
    //this class representes the nodes of a blockchain
    //the T parameter is the type of the stored data.
    private long index;// index of the current block
    private T data;
    private long nounce;// the magic number which keeps the hash below a certain number
    private String prevHash;// previous block hash;
    private String hash;

    public Block(int index, T data, String prevHash){
        if(index <= 0 || prevHash == null){
            throw new IllegalArgumentException("index or previous hash were incorrect");
        }


        this.data = data;
        this.index = index;
        this.prevHash = prevHash;
        nounce = 0;
        hash = null;
    }

    public long getIndex(){
        return index;
    }

    public String getHash(){
        return hash;
    }
    public T getData(){
        return data;
    }

    public String getPrevHash(){
        return prevHash;
    }

}
