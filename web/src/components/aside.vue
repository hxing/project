<template>
  <el-aside width="220px" style="background-color: rgb(238, 241, 246);text-align: left">
    <el-menu :default-openeds="['1', '3']">
      <el-submenu index="1">
        <template slot="title"><i class="el-icon-s-order"></i>Service</template>
        <el-menu-item-group>
          <template slot="title">Operation</template>
          <el-menu-item index="1-1" style="margin-left: 20px">service 1</el-menu-item>
          <el-menu-item index="1-2" style="margin-left: 20px">service 2</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group title="Query">
          <el-menu-item index="1-3" style="margin-left: 20px">service 3</el-menu-item>
          <el-menu-item index="1-4" style="margin-left: 20px">service 4</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title"><i class="el-icon-s-order"></i>Method</template>
        <el-menu-item-group>
          <template slot="title">Operation</template>
          <el-menu-item index="2-1" style="margin-left: 20px">service 1</el-menu-item>
          <el-menu-item index="2-2" style="margin-left: 20px">service 2</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group title="Query">
          <el-menu-item index="2-3" style="margin-left: 20px">service 3</el-menu-item>
          <el-menu-item index="2-4" style="margin-left: 20px">service 4</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </el-aside>
</template>

<script>
export default {
  name: ""
}
</script>

<style scoped>

</style>