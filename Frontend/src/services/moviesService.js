import axios from 'axios'

const API = 'http://localhost:8080/api/movies';
// const API_IMAGE = 'http://localhost:8080/api/images/upload';

const getMovies = () => {
  return axios.get(API);
}

const uploadImage = (file) => {
  return axios.post('http://localhost:8080/api/images/upload', file);
}

const addMovie = (data) =>{
  return axios.post(API, data);
}

export {getMovies, uploadImage, addMovie};

