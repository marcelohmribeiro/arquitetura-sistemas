public class DBConn {

    // instância única e privada da classe
    private static DBConn instance;

    // construtor privado para evitar instanciação externa
    private DBConn() {
    }

    // método público para obter a instância única
    public static DBConn getInstance() {
        if (instance == null) {
            instance = new DBConn();
        }
        return instance;
    }

    public void conecta() {
        System.out.println("Conecta com o banco de dados!");
    }
}
