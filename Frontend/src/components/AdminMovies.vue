<script setup lang="ts">
import ListMovies from './ListMovies.vue';
import AddMovieModal from './AddMovieModal.vue';
</script>

<template>
  <div class="row">
    <div class="col-12 mb-5">
      <div class="d-flex justify-content-between align-items-center">
        <h3 class="h2 fw-bold">Administración de peliculas</h3>
        <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addMovieModal">Nueva Película</button>
      </div>
    </div>
    <div class="col-12">
      <ListMovies />
    </div>
  </div>

  <AddMovieModal />
</template>
