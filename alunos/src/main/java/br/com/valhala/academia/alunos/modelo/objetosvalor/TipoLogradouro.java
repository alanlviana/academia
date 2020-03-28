package br.com.valhala.academia.alunos.modelo.objetosvalor;

import java.util.Arrays;
import java.util.Optional;

public enum TipoLogradouro {

    AREA("A", "Área"),
    ACESSO("AC", "Acesso"),
    ACAMPAMENTO("ACA", "Acampamento"),
    ACESSO_LOCAL("ACL", "Acesso Local"),
    ADRO("AD", "Adro"),
    AREA_ESPECIAL("AE", "Área Especial"),
    AEROPORTO("AER", "Aeroporto"),
    ALAMEDA("AL", "Alameda"),
    AVENIDA_MARGINAL_DIREITA("AMD", "Avenida Marginal Direita"),
    AVENIDA_MARGINAL_ESQUERDA("AME", "Avenida Marginal Esquerda"),
    ANEL_VIARIO("AN", "Anel Viário"),
    ANTIGA_ESTRADA("ANT", "Antiga Estrada"),
    ARTERIA("ART", "Artéria"),
    ALTO("AT", "Alto"),
    ATALHO("ATL", "Atalho"),
    AREA_VERDE("A V", "Área Verde"),
    AVENIDA("AV", "Avenida"),
    AVENIDA_CONTORNO("AVC", "Avenida Contorno"),
    AVENIDA_MARGINAL("AVM", "Avenida Marginal"),
    AVENIDA_VELHA("AVV", "Avenida Velha"),
    BALNEARIO("BAL", "Balneário"),
    BECO("BC", "Beco"),
    BURACO("BCO", "Buraco"),
    BELVEDERE("BEL", "Belvedere"),
    BLOCO("BL", "Bloco"),
    BALAO("BLO", "Balão"),
    BLOCOS("BLS", "Blocos"),
    BULEVAR("BLV", "Bulevar"),
    BOSQUE("BSQ", "Bosque"),
    BOULEVARD("BVD", "Boulevard"),
    BAIXA("BX", "Baixa"),
    CAIS("C", "Cais"),
    CALCADA("CAL", "Calçada"),
    CAMINHO("CAM", "Caminho"),
    CANAL("CAN", "Canal"),
    CHACARA("CH", "Chácara"),
    CHAPADAO("CHA", "Chapadão"),
    CICLOVIA("CIC", "Ciclovia"),
    CIRCULAR("CIR", "Circular"),
    CONJUNTO("CJ", "Conjunto"),
    CONJUNTO_MUTIRAO("CJM", "Conjunto Mutirão"),
    COMPLEXO_VIARIO("CMP", "Complexo Viário"),
    COLONIA("COL", "Colônia"),
    COMUNIDADE("COM", "Comunidade"),
    CONDOMINIO("CON", "Condomínio"),
    CORREDOR("COR", "Corredor"),
    CAMPO("CPO", "Campo"),
    CORREGO("CRG", "Córrego"),
    CONTORNO("CTN", "Contorno"),
    DESCIDA("DSC", "Descida"),
    DESVIO("DSV", "Desvio"),
    DISTRITO("DT", "Distrito"),
    ENTRE_BLOCO("EB", "Entre Bloco"),
    ESTRADA_INTERMUNICIPAL("EIM", "Estrada Intermunicipal"),
    ENSEADA("ENS", "Enseada"),
    ENTRADA_PARTICULAR("ENT", "Estrada Particular"),
    ENTRE_QUADRA("EQ", "Entre Quadra"),
    ESCADA("ESC", "Escada"),
    ESCADARIA("ESD", "Escadaria"),
    ESTRADA_ESTADUAL("ESE", "Estrada Estadual"),
    ESTRADA_VICINAL("ESI", "Estrada Vicinal"),
    ESTRADA_LIGACAO("ESL", "Estrada de Ligação"),
    ESTRADA_MUNICIPAL("ESM", "Estrada Municipal"),
    ESPLANADA("ESP", "Esplanada"),
    ESTRADA_SERVIDAO("ESS", "Estrada de Servidão"),
    ESTRADA("EST", "Estrada"),
    ESTRADA_VELHA("ESV", "Estrada Velha"),
    ESTRADA_ANTIGA("ETA", "Estrada Antiga"),
    ESTACAO("ETC", "Estação"),
    ESTADIO("ETD", "Estádio"),
    ESTANCIA("ETN", "Estância"),
    ESTRADA_PARTICULAR("ETP", "Estrada Particular"),
    ESTACIONAMENTO("ETT", "Estacionamento"),
    EVANGELICA("EVA", "Evangélica"),
    ELEVADA("EVD", "Elevada"),
    EIXO_INDUSTRIAL("EX", "Eixo Industrial"),
    FAVELA("FAV", "Favela"),
    FAZENDA("FAZ", "Fazenda"),
    FERROVIA("FER", "Ferrovia"),
    FONTE("FNT", "Fonte"),
    FEIRA("FRA", "Feira"),
    FORTE("FTE", "Forte"),
    GALERIA("GAL", "Galeria"),
    GRANJA("GJA", "Granja"),
    NUCLEO_HABITACIONAL("HAB", "Núcleo Habitacional"),
    ILHA("IA", "Ilha"),
    INDETERMINADO("IND", "Inderteminado"),
    ILHOTA("IOA", "Ilhota"),
    JARDIM("JD", "Jardim"),
    JARDINETE("JDE", "Jardinete"),
    LADEIRA("LD", "Ladeira"),
    LAGOA("LGA", "Lagoa"),
    LAGO("LGO", "Lago"),
    LOTEAMENTO("LOT", "Loteamento"),
    LARGO("LRG", "Largo"),
    LOTE("LT", "Lote"),
    MERCADO("MER", "Mercado"),
    MARINA("MNA", "Marina"),
    MODULO("MOD", "Modulo"),
    PROJECAO("MRG", "Projeção"),
    MORRO("MRO", "Morro"),
    MONTE("MTE", "Monte"),
    NUCLEO("NUC", "Núcleo"),
    NUCLEO_RURAL("NUR", "Núcleo Rural"),
    OUTEIRO("OUT", "Outeiro"),
    PARALELA("PAR", "Paralela"),
    PASSEIO("PAS", "Passeio"),
    PATIO("PAT", "Pátio"),
    PRACA("PC", "Praça"),
    PRACA_ESPORTES("PCE", "Praça de Esportes"),
    PARADA("PDA", "Parada"),
    PARADOURO("PDO", "Paradouro"),
    PONTA("PNT", "Ponta"),
    PRAIA("PR", "Praia"),
    PROLONGAMENTO("PRL", "Prologamento"),
    PARQUE_MUNICIPAL("PRM", "Parque Municipal"),
    PARQUE("PRQ", "Parque"),
    PARQUE_RESIDENCIAL("PRR", "Parque Residencial"),
    PASSARELA("PSA", "Passarela"),
    PASSAGEM("PSG", "Passagem"),
    PASSAGEM_PEDESTRE("PSP", "Passagem de Pedestre"),
    PASSAGEM_SUBTERRANEA("PSS", "Passagem Subterrânea"),
    PONTE("PTE", "Ponte"),
    PORTO("PTO", "Porto"),
    QUADRA("Q", "Quadra"),
    QUINTA("QTA", "Quinta"),
    QUINTAS("QTS", "Quintas"),
    RUA("R", "Rua"),
    RUA_INTEGRACAO("R I", "Rua Integração"),
    RUA_LIGACAO("R L", "Rua de Ligação"),
    RUA_PARTICULAR("R P", "Rua Particular"),
    RUA_VELHA("R V", "Rua Velha"),
    RAMAL("RAM", "Ramal"),
    RECREIO("RCR", "Recreio"),
    RECANTO("REC", "Recanto"),
    RETIRO("RER", "Retiro"),
    RESIDENCIAL("RES", "Residencial"),
    RETA("RET", "Reta"),
    RUELA("RLA", "Ruela"),
    RAMPA("RMP", "Rampa"),
    RODO_ANEL("ROA", "Rodo Anel"),
    RODOVIA("ROD", "Rodovia"),
    ROTULA("ROT", "Rotula"),
    RUA_PEDESTRE("RPE", "Rua de Pedestre"),
    MARGEM("RPR", "Margem"),
    RETORNO("RTN", "Retorno"),
    ROTATORIA("RTT", "Rotatória"),
    SEGUNDA_AVENIDA("SEG", "Segunda Avenida"),
    SITIO("SIT", "Sitio"),
    SERVIDAO("SRV", "Servidão"),
    SETOR("ST", "Setor"),
    SUBIDA("SUB", "Subida"),
    TRINCHEIRA("TCH", "Trincheira"),
    TERMINAL("TER", "Terminal"),
    TRECHO("TR", "Trecho"),
    TREVO("TRV", "Trevo"),
    TUNEL("TUN", "Túnel"),
    TRAVESSA("TV", "Travessa"),
    TRAVESSA_PARTICULAR("TVP", "Travessa Particular"),
    TRAVESSA_VELHA("TVV", "Travessa Velha"),
    UNIDADE("UNI", "Unidade"),
    VIA("V", "Via"),
    VIA_COLETORA("V C", "Via Coletora"),
    VIA_LOCAL("V L", "Via Local"),
    VIA_ACESSO("VAC", "Via de Acesso"),
    VALA("VAL", "Vala"),
    VIA_COSTEIRA("VCO", "Via Costeira"),
    VIADUTO("VD", "Viaduto"),
    VIA_EXPRESSA("V-E", "Via Expressa"),
    VEREDA("VER", "Vereda"),
    VIA_ELEVADO("VEV", "Via Elevado"),
    VILA("VL", "Vila"),
    VIELA("VLA", "Viela"),
    VALE("VLE", "Vale"),
    VIA_LITORANEA("VLT", "Via Litorânea"),
    VIA_PEDESTRE("VPE", "Via de Pedestre"),
    VARIANTE("VRT", "Variante"),
    ZIGUE_ZAGUE("ZIG", "Zigue-Zague");

    private String abreviacao;
    private String descricao;

    TipoLogradouro(String abreviacao, String descricao) {
        this.abreviacao = abreviacao;
        this.descricao = descricao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Optional<TipoLogradouro> porAbreviacao(final String abreviacao) {
        if (abreviacao == null || abreviacao.isEmpty()) {
            return Optional.empty();
        }
        return Arrays.stream(TipoLogradouro.values()).filter(tl -> tl.abreviacao.equalsIgnoreCase(abreviacao)).findFirst();
    }

}