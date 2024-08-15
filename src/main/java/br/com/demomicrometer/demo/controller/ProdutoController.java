package br.com.demomicrometer.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;

@Controller
public class ProdutoController {

    private final MeterRegistry meterRegistry;
    private final Counter myCounter;
    private final Timer myTimer;

    public ProdutoController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.myCounter = Counter.builder("minha.metrica.personalizada")
                .description("Contador de chamadas ao método processar")
                .tag("metodo", "processar")
                .register(meterRegistry);
        this.myTimer = Timer.builder("minha.metrica.timer")
                .description("Tempo de processamento do método processar")
                .tag("metodo", "processar")
                .register(meterRegistry);
    }

    /*
     * Endpoint para listar todos os produtos mockados
     */
    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> listarProdutos() {
        myCounter.increment();
        Timer.Sample sample = Timer.start(meterRegistry);
        //iniciando metrica de timer
        
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1L, "Produto 1", 10.0));
        produtos.add(new Produto(2L, "Produto 2", 20.0));
        produtos.add(new Produto(3L, "Produto 3", 30.0));
        produtos.add(new Produto(1L, "Produto 1", 10.0));
        produtos.add(new Produto(2L, "Produto 2", 20.0));
        produtos.add(new Produto(3L, "Produto 3", 30.0));
        sample.stop(myTimer);
        return ResponseEntity.ok(produtos);
    }
}
