public class IOService {


    public void doLogic() throws CustomExc{

      //throw new Exception("Exception from doLogic");
      //throw new RuntimeException("Exception from doLogic");
      throw new CustomExc("Exception from doLogic"); //throw - aruncam o exceptie
    }
}
