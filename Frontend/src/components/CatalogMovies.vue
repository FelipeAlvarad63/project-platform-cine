<script setup>
import SearchBar from './SearchBar.vue'
import CardMovie from './CardMovie.vue'

import { ref, onMounted } from 'vue'
import { getMovies } from '@/services/moviesService'

const movies = ref([])

onMounted(async () => {
  const res = await getMovies();
  movies.value = res.data;
});
</script>

<template>
  <section>
    <div class="container py-5">
      <div class="row">
        <div class="col-12">
          <SearchBar />
        </div>
      </div>
      <div class="row row-gap-4 pt-5">
        <div class="col-3" v-for="movie in movies" :key="movie.id">
          <CardMovie :movie="{ title: movie.titulo, gender: movie.genero, urlImage: movie.url_image }" />
        </div>
      </div>
    </div>
  </section>
</template>
