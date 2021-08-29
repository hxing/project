import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Index',
    component: () => import('../views/Index')
  },
  {
    path: '/index',
    name: 'Index',
    component: () => import('../views/Index')
  },
  // {
  //   path: '/about',
  //   name: 'About',
  //   component: () => import('../views/main/About')
  // },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/main/Login')
  },
  {
    path: '/home',
    name: 'Home',
    component: () => import('../views/Home')
  },
  {
    path: '/home/testpage',
    name: 'Testpage',
    component: () => import('../views/web page/testpage/TestPage')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
