<template>
  <el-header>
    <el-row :gutter = "24">
      <el-col :span="8">
        <div style="text-align: left">
          <span>XiaoBai`s Web Project</span>
        </div>
      </el-col>
      <el-col :span="8">
        [ My Logo ]
      </el-col>
      <el-col :span="8">
        <div style="text-align: right">
          <span>...</span>
          <el-dropdown>
            <i class="el-icon-menu" style="margin-left: 20px;margin-right: 15px"></i>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item style="text-align: center">User Information</el-dropdown-item>
              <el-dropdown-item style="text-align: center">Change Password</el-dropdown-item>
              <el-divider/>
              <el-dropdown-item style="text-align: center">Log Out</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </div>
      </el-col>
    </el-row>
  </el-header>
</template>

<script>
export default {
  name: "IndexPage2",
  props: {
    name: String
  },
}
</script>

<style scoped>

</style>