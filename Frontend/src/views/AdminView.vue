<script setup>
import AdminMovies from '@/components/AdminMovies.vue';
</script>

<template>
  <section class="AdminView">
    <div class="container py-5">
      <h2 class="h1">This is an Admin page</h2>

      <div class="row justify-content-between py-5">
        <div class="col-3">
          <div class="nav flex-column nav-pills me-3" id="v-pills-tab" role="tablist" aria-orientation="vertical">
            <button class="nav-link active" id="v-pills-add-movie-tab" data-bs-toggle="pill"
              data-bs-target="#v-pills-add-movie" type="button" role="tab" aria-controls="v-pills-add-movie"
              aria-selected="true">Peliculas</button>
            <button class="nav-link" id="v-pills-profile-tab" data-bs-toggle="pill" data-bs-target="#v-pills-profile"
              type="button" role="tab" aria-controls="v-pills-profile" aria-selected="false">Clientes</button>
          </div>
        </div>
        <div class="col-9">
          <div class="tab-content" id="v-pills-tabContent">
            <div class="tab-pane fade show active" id="v-pills-add-movie" role="tabpanel"
              aria-labelledby="v-pills-add-movie-tab" tabindex="0">
              <AdminMovies />
            </div>
            <div class="tab-pane fade" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab"
              tabindex="0">...</div>
            <div class="tab-pane fade" id="v-pills-disabled" role="tabpanel" aria-labelledby="v-pills-disabled-tab"
              tabindex="0">...</div>
            <div class="tab-pane fade" id="v-pills-messages" role="tabpanel" aria-labelledby="v-pills-messages-tab"
              tabindex="0">...</div>
            <div class="tab-pane fade" id="v-pills-settings" role="tabpanel" aria-labelledby="v-pills-settings-tab"
              tabindex="0">...</div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<style></style>
