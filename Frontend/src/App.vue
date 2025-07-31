<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <div class="container d-flex justify-content-between align-items-center gap-3 py-3">
      <RouterLink to="/"><img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="40" height="40" /></RouterLink>

      <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#loginModal">
        Iniciar sesión
      </button>

      <!-- Modal -->
      <div class="modal fade" id="loginModal" tabindex="-1" aria-labelledby="loginModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body px-lg-5">
              <h3 class="modal-title text-center fs-5" id="loginModal">INICIAR SESIÓN</h3>
              <input type="text" class="form-control mt-2" placeholder="Email">
              <input type="password" class="form-control mt-2" placeholder="Contraseña">

              <div class="modal-footer d-flex flex-column justify-content-center">
                <button type="button" class="h3 btn btn-primary">INICIAR SESIÓN</button>
                <RouterLink to="/admin">About</RouterLink>
                <div class="d-flex align-items-center gap-3">
                  <p class="h6 text-secondary m-0">¿No tienes cuenta?</p>
                  <button type="button" class="btn btn-link text-secondary-emphasis">Registrate aquí</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!--
      <nav class="d-flex gap-3">
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
      </nav>
      -->
    </div>
  </header>

  <RouterView />
</template>

<style scoped></style>
