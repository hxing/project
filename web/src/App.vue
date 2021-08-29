<template>
  <div class="pages">
  <el-container class="maincontainer">
    <el-header>
      <Header/>
    </el-header>
    <el-main :style="mainstyle">
      <router-view/>
    </el-main>
    <el-footer height="30px">
      <Footer/>
    </el-footer>
  </el-container>
  </div>
</template>

<script>
import Header from '@/components/header';
import Footer from '@/components/footer';

export default {
  name: "test",
  props: {
    name: String,
  },
  data (){
    return{
      // 定义一个style
      mainstyle: {
        height: '',
      },
    }
  },
  components: {
    Header,
    Footer
  },
  methods: {
    // 获取main部分的高度
    getMainStyle() {
      // 修改style中height属性
      this.mainstyle.height = document.documentElement.clientHeight-106 + 'px';
    }
  },
  mounted() {
    // 页面初始化设置main高度
    this.getMainStyle();
    // 监听浏览器的窗口缩放事件 window.onresize
    window.onresize = () => {
      if(!this.timer){ // 使用节流机制，降低函数被触发的频率
        this.timer = true;
        let that = this; // 匿名函数的执行环境具有全局性，为防止this丢失这里用that变量保存一下
        setTimeout(function(){
          that.getMainStyle();
          that.timer = false;
        },100)
      }
    }
  },
  destroyed() {
    window.onresize = null;
  }
}
</script>

<style>

.el-header {
  background-color: #B3C0D1;
  color: #333;
  text-align: center;
  line-height: 60px;
  font-size: medium;
}

.el-main {
  background-color: #E9EEF3;
  color: #333;
  /*text-align: center;*/
}

.el-footer {
  background-color: #B3C0D1;
  color: #333;
  text-align: center;
  line-height: 30px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 0;
  padding: 0;
}

.pages{
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;

}
.maincontainer{
  height: 100%;
}
</style>
