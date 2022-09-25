package Controller;

import Model.Calcado;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class controllerCalcados {

    //Metodo responsavel por realizar a requisição GET na API
    public List<Calcado> listar() {
        List<Calcado> ListaCalcados = null;
        try {
            String urlGetCalcados = "http://localhost:8080/calcado";
            try {
                String output;
                URL url = new URL(urlGetCalcados);

                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestMethod("GET");
                conexao.setRequestProperty("Accept", "application/json");

                if (conexao.getResponseCode() != 200) {
                    throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                }
                BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                while ((output = br.readLine()) != null) {

                    Gson gson = new Gson();
                    Type collectionType = new TypeToken<Collection<Calcado>>() {
                    }.getType();

                    ListaCalcados = gson.fromJson(output, collectionType);
                }
                conexao.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return (ListaCalcados);
    }
    //Metodo responsavel por realizar a requisição GET Requisitando parametros na URL da API
    public List<Calcado> pesquisar(String opcao, String pesquisa) {
        List<Calcado> ListaCalcados = null;
        switch (opcao) {
            case "Tamanho":    
        try {
                String urlGetCalcados = "http://localhost:8080/calcado/buscarTamanho/?tamanho=" + pesquisa;
                try {
                    String output;
                    URL url = new URL(urlGetCalcados);

                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");
                    conexao.setRequestProperty("Accept", "application/json");

                    if (conexao.getResponseCode() != 200) {
                        throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                    while ((output = br.readLine()) != null) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Collection<Calcado>>() {
                        }.getType();

                        ListaCalcados = gson.fromJson(output, collectionType);
                    }
                    conexao.disconnect();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return (ListaCalcados);
            case "Categoria":
                try {
                String urlGetCalcados = "http://localhost:8080/calcado/buscarCategoria/?categoria=" + pesquisa;
                try {
                    String output;
                    URL url = new URL(urlGetCalcados);

                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");
                    conexao.setRequestProperty("Accept", "application/json");

                    if (conexao.getResponseCode() != 200) {
                        throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                    while ((output = br.readLine()) != null) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Collection<Calcado>>() {
                        }.getType();

                        ListaCalcados = gson.fromJson(output, collectionType);
                    }
                    conexao.disconnect();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return (ListaCalcados);
            case "Cor":
               try {
                String urlGetCalcados = "http://localhost:8080/calcado/buscarCor/?cor=" + pesquisa;
                try {
                    String output;
                    URL url = new URL(urlGetCalcados);

                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");
                    conexao.setRequestProperty("Accept", "application/json");

                    if (conexao.getResponseCode() != 200) {
                        throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                    while ((output = br.readLine()) != null) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Collection<Calcado>>() {
                        }.getType();

                        ListaCalcados = gson.fromJson(output, collectionType);
                    }
                    conexao.disconnect();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return (ListaCalcados);
            case "Preço":
                 try {
                String urlGetCalcados = "http://localhost:8080/calcado/buscarPreco/?preco=" + pesquisa.replace(",", ".");
                try {
                    String output;
                    URL url = new URL(urlGetCalcados);

                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");
                    conexao.setRequestProperty("Accept", "application/json");

                    if (conexao.getResponseCode() != 200) {
                        throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                    while ((output = br.readLine()) != null) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Collection<Calcado>>() {
                        }.getType();

                        ListaCalcados = gson.fromJson(output, collectionType);
                    }
                    conexao.disconnect();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return (ListaCalcados);
            case "Marca":
                 try {
                String urlGetCalcados = "http://localhost:8080/calcado/buscarMarca/?marca=" + pesquisa;
                try {
                    String output;
                    URL url = new URL(urlGetCalcados);

                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");
                    conexao.setRequestProperty("Accept", "application/json");

                    if (conexao.getResponseCode() != 200) {
                        throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                    while ((output = br.readLine()) != null) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Collection<Calcado>>() {
                        }.getType();

                        ListaCalcados = gson.fromJson(output, collectionType);
                    }
                    conexao.disconnect();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return (ListaCalcados);
            case "Data Cadastro":
                try {
                String urlGetCalcados = "http://localhost:8080/calcado/buscarData/?datacadastro=" + pesquisa;
                try {
                    String output;
                    URL url = new URL(urlGetCalcados);

                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");
                    conexao.setRequestProperty("Accept", "application/json");

                    if (conexao.getResponseCode() != 200) {
                        throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                    while ((output = br.readLine()) != null) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Collection<Calcado>>() {
                        }.getType();

                        ListaCalcados = gson.fromJson(output, collectionType);
                    }
                    conexao.disconnect();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return (ListaCalcados);
            case "Descrição":
              try {
                String urlGetCalcados = "http://localhost:8080/calcado/buscarDescricao/?descricao=" + pesquisa;
                try {
                    String output;
                    URL url = new URL(urlGetCalcados);

                    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    conexao.setRequestMethod("GET");
                    conexao.setRequestProperty("Accept", "application/json");

                    if (conexao.getResponseCode() != 200) {
                        throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                    while ((output = br.readLine()) != null) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Collection<Calcado>>() {
                        }.getType();

                        ListaCalcados = gson.fromJson(output, collectionType);
                    }
                    conexao.disconnect();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return (ListaCalcados);
        }
        return (null);
    }
    //Metodo responsavel por realizar a requisição DELETE Requisitando parametros na URL da API
    public void excluir(Integer id) {
        try {
            String urlGetCalcados = "http://localhost:8080/calcado/deletar/?id=" + id;
            try {

                URL url = new URL(urlGetCalcados);

                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestMethod("DELETE");
                conexao.setRequestProperty("Accept", "application/json");

                if (conexao.getResponseCode() != 200) {
                    throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                }
                conexao.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    //Metodo responsavel por realizar a requisição PUT na API
    public void salvar(Integer ID, Integer Tamanho, String Categoria, String Cor, String Preco, String Marca, Integer QtdEstoque, String Descricao){   
        try {
            String urlGetCalcados = "http://localhost:8080/calcado";
            try {
                SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
                 var PrecoFormatado = Double.parseDouble(Preco.replace(",", "."));
                String JsonInputString =  "{\"id\":"+ ID +",\"tamanho\":"+ Tamanho +",\"categoria\":\""+ Categoria +"\",\"cor\":\""+ Cor +"\",\"preco\":"+ PrecoFormatado +",\"marca\":\""+ Marca +"\",\"datacadastro\":\""+ LocalDate.now() +"\",\"qtdestoque\":"+ QtdEstoque +",\"descricao\":\""+ Descricao +"\"}";                                                                                     
                URL url = new URL(urlGetCalcados);
                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestProperty("Content-Type", "application/json; utf-8");
                conexao.setRequestProperty("Accept", "application/json");
                conexao.setRequestMethod("PUT");
                conexao.setDoOutput(true);
                try (OutputStream os = conexao.getOutputStream()) {
                    byte[] input = JsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }
                if (conexao.getResponseCode() != 200) {
                    throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                }
                conexao.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    //Metodo responsavel por realizar a requisição POST na API
    public void cadastrar(Integer Tamanho, String Categoria, String Cor, String Preco, String Marca, Integer QtdEstoque, String Descricao){   
        try {
            String urlGetCalcados = "http://localhost:8080/calcado";
            try { 
                
               var PrecoFormatado = Double.parseDouble(Preco.replace(",", "."));
               
                String JsonInputString =  "{\"tamanho\":"+ Tamanho +",\"categoria\":\""+ Categoria +"\",\"cor\":\""+ Cor +"\",\"preco\":"+ PrecoFormatado +",\"marca\":\""+ Marca +"\",\"datacadastro\":\""+ LocalDate.now() +"\",\"qtdestoque\":"+ QtdEstoque +",\"descricao\":\""+ Descricao +"\"}";                                                                                     
                URL url = new URL(urlGetCalcados);
                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestProperty("Content-Type", "application/json; utf-8");
                conexao.setRequestProperty("Accept", "application/json");
                conexao.setRequestMethod("POST");
                conexao.setDoOutput(true);
                try (OutputStream os = conexao.getOutputStream()) {
                    byte[] input = JsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }
                if (conexao.getResponseCode() != 200) {
                    throw new RuntimeException("deu erro... HTTP error code : " + conexao.getResponseCode());
                }
                conexao.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
