<script setup>
defineProps({
  movie: Object
})
</script>

<template>
  <div class="card">
    <img :src="movie.urlImage" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">{{ movie.title }}</h5>
      <p class="card-text">Genero: {{movie.gender}}</p>
      <a href="#" class="btn btn-primary">Go somewhere</a>
    </div>
  </div>
</template>

<style scoped>

.card-img-top {
  width: 100%;
  height: 100%;
  aspect-ratio: 4 / 5;
  object-fit: cover;
  object-position: top;
}
</style>
