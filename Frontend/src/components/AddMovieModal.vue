<script setup>
// import axios from 'axios';
import { reactive } from 'vue';
import { addMovie, uploadImage } from '@/services/moviesService';

const movieData = reactive({
  titleMovie: '',
  genderMovie: '',
  directorMovie: '',
  coverMovie: null,
  urlImageCloud: null
});

const handleFileUpload = (event) => {
  const file = event.target.files[0]
  if (file) {
    movieData.coverMovie = file;
  }
}

const getUrlImage = async () => {
  if (!movieData.coverMovie) {
    throw new Error('No file selected');
  }

  const formData = new FormData();
  formData.append('file', movieData.coverMovie);
  const res = await uploadImage(formData);
  movieData.urlImageCloud = res.data;
};

const btnAddMovie = async () => {
  if (movieData.titleMovie && movieData.genderMovie && movieData.coverMovie) {
    try {
      await getUrlImage();

      addMovie({
        "titulo": movieData.titleMovie,
        "genero": movieData.genderMovie,
        "director": movieData.directorMovie,
        "url_image": movieData.urlImageCloud
      }).then(response => {
        console.log('Movie added successfully:', response);
        movieData.titleMovie = '';
        movieData.genderMovie = '';
        movieData.directorMovie = '';
        movieData.coverMovie = null;
        movieData.urlImageCloud = null;
      }).catch(error => {
        console.error('Error adding movie:', error);
      });
    } catch (error) {
      console.error('Error uploading image:', error);
    }
  } else {
    throw new Error('All fields are required');
  }
};

</script>

<template>
  <div class="modal" id="addMovieModal" tabindex="-1">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title">Agregar Película</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <form action="">
            <div class="mb-3">
              <label for="movieTitle" class="form-label">Título de la película</label>
              <input v-model="movieData.titleMovie" type="text" class="form-control" id="movieTitle"
                placeholder="Ingrese el título de la película">
            </div>
            <div class="mb-3">
              <label for="directorMovie" class="form-label">Director de la película</label>
              <input v-model="movieData.directorMovie" type="text" class="form-control" id="directorMovie"
                placeholder="Ingrese el director de la película">
            </div>
            <div class="mb-3">
              <label for="movieGender" class="form-label">Genero de la película</label>
              <input v-model="movieData.genderMovie" type="text" class="form-control" id="movieGender"
                placeholder="Ingrese el genero de la película">
            </div>
            <div class="mb-3">
              <label for="movieCover" class="form-label">Portada de la película</label>
              <input type="file" @change="handleFileUpload" class="form-control" id="movieCover">
            </div>
          </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary" @click="btnAddMovie">Agregar película</button>
        </div>
      </div>
    </div>
  </div>
</template>
