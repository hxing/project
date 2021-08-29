<template>
  <div class="IndexPage">
    <h1>IndexPage</h1>
    <h5>UserName : {{ name }}</h5>
    <el-button type="success" icon="el-icon-plus" style="width: 120px" @click="add">Add</el-button>
    <el-button type="danger" icon="el-icon-delete" style="width: 120px" @click="clean">Clean</el-button>
    <el-divider/>
    <div>
      <li v-for="item in MESSAGE_LIST" :key="item.id">{{ item.message }} </li>
    </div>
    <div v-if="MESSAGE_LIST.length === 0">No Message</div>
    <el-divider/>
    总计 ：{{ MESSAGE_LIST.length }} 条
  </div>
</template>


<script>
export default {
  name: 'IndexPage',
  props: {
    name: String
  },
  data (){
    return {
      MESSAGE_LIST: [
        {message: 'This is a message!'}
      ]
    }
  },
  methods: {
    add (){
      this.MESSAGE_LIST.push({ message: 'This is a message!' });
    },
    clean (){
      this.MESSAGE_LIST = [];
    }

  }
}
</script>

<style scoped>

</style>
