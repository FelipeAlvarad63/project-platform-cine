import axios from 'axios'

const API = 'http://localhost:8080/api/movies'

export function getMovies() {
  return axios.get(API);
}

export function crearPelicula(data) {
  return axios.post(API, data)
}

