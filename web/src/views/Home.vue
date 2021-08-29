<template>
  <el-container>
    <el-aside width="220px" style="background-color: rgb(238, 241, 246);text-align: left">
      <AsidePage/>
    </el-aside>
    <el-container>
      <el-main style="text-align: center">

        <TestPage name="XiaoBai1"/>
        <router-view/>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
// @ is an alias to /src
import TestPage from '@/views/web page/service/NetDisk'
import AsidePage from '@/components/aside'

export default {
  name: 'Home',
  components: {
    TestPage,
    AsidePage
  }
}
</script>