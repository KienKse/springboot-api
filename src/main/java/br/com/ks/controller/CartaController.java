package br.com.ks.controller;

import br.com.ks.model.Carta;
import br.com.ks.service.CartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController    // This means that this class is a Controller
@RequestMapping("/api") // This means URL's start with /api (after Application path)
public class CartaController {

    @Autowired
    private CartaService cs;

    // Get ALL - Carta
    @GetMapping("/all")
    public List<Carta> getAll() {
        return cs.getAll();
    }

    // Add Carta
    // @RequestMapping(path = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public Carta addNewCarta(@Valid @RequestBody Carta request) {
        return cs.addNewCarta(request);
    }

    // Get - Carta
    @GetMapping("/carta/{id}")
    public @ResponseBody
    Carta getCartaById(@PathVariable(value = "id") Long carId) {
        return cs.getCartaById(carId);
    }

    // Delete - Carta
    @DeleteMapping("/carta/{id}")
    public @ResponseBody
    ResponseEntity<?> deleteCarta(@PathVariable(value = "id") Long carId) {
        Carta carta = cs.getCartaById(carId);
        cs.deleteCarta(carId);

        return ResponseEntity.ok().build();
    }

    // Get ALL PERIODO - Carta
    @GetMapping(value = "/{inicio}/{fim}")
    public List<Carta> getAllPeriodo(@PathVariable(value = "inicio") String inicio,@PathVariable(value = "fim") String fim) {
        return cs.getCartaByPeriodo(LocalDate.parse(inicio), LocalDate.parse(fim));
    }

    // Update Carta
    @PutMapping("/upd/{id}")
    public ResponseEntity<Carta> updateCarta(@RequestBody Carta carta, @PathVariable Long id){

        Optional<Carta> cartaOptional = Optional.ofNullable(cs.getCartaById(id));

        if (!cartaOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        cs.updateCarta(carta, id);

        return ResponseEntity.noContent().build();
    }

}

