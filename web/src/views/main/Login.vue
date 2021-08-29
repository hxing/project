<template>
  <div>
    <el-carousel :interval="2500" type="card" height="300px" style="margin-top: 20px">
      <el-carousel-item v-for="item in 6" :key="item">
        <h3 class="medium" style="text-align: center">{{ item }}</h3>
      </el-carousel-item>
    </el-carousel>
  <el-card style="border-radius: 30px;margin-top: 20px;text-align: center;height: 500px" >
    <div style="height: 80px"/>
    <h1 align="center">Please Login Your Account  !</h1>
    <el-form align="right">
      <span style="font-size: 15px">Have no account? Click me to </span>
      <el-button type="text" style="margin-right: 20px">SIGN UP</el-button>
    </el-form>
    <el-divider/>
    <el-form align="center" :inline="true">
      <el-form-item label="USER ID：" style="margin-left: 20px">
        <el-input v-model="LOGIN_FORM_LIST.userId" style="width: 160px"></el-input>
      </el-form-item>
      <el-form-item label="PASSWORD：" style="margin-left: 20px">
        <el-input v-model="LOGIN_FORM_LIST.password" style="width: 160px" show-password></el-input>
      </el-form-item>
      <el-button type="primary" style="width: 100px;margin-left: 20px" @click="submitLogin">Log in</el-button>
    </el-form>
  </el-card>
</div>

</template>

<script>
import axios from "axios";

export default {
  data () {
  name: "Login",
    return {
      dialogVisible: false,
      LOGIN_FORM_LIST: {
        userId:'',
        password: '',
      },
      USER_LIST: {
        userId: 'a',
        password: 'a',
      }
    }
  },
  methods: {
    submitLogin () {
      if (this.LOGIN_FORM_LIST.password === "" || this.LOGIN_FORM_LIST.userId === "" ) {
        console.log("Empty!");
        this.$message.error('Please Enter The USER ID Or Password !');
        return;
      }
      console.log("Post Reqire")
      axios.post('/project/user/login', this.LOGIN_FORM_LIST)
        .then((resp) => {
          console.log(resp.data)
          if (resp.data === 'Y') {
            console.log("Success!");
            this.$router.push({
              name: 'Home',
            });

          } else {
            console.log("Fail!");
            this.$message.error('USER ID Or Password Is Wrong !');
          }
        }
      )
    },


  }
}
</script>

<style scoped>

.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 200px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}

</style>