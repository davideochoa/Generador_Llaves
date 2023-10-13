package com.generador.application.app.data.Entity;

import com.generador.application.app.data.AbstractEntity;
import com.generador.application.app.data.Role;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "catalogo_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String nombreUsuario;

    private String password;

    @Enumerated(EnumType.STRING)
    //@ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] firma;

}
