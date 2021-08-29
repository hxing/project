<template>
  <el-card>
  <div id="aaa">
    <h1>My Net Disk</h1>
    <el-row :gutter="24">
      <el-col :span="20">
        <h3 style="text-align: left;margin-left: 20px">Folder from : /Xiaobai/data/photo</h3>
      </el-col>
      <el-col :span="4">
        <el-button type="info" style="width: 130px">refresh</el-button>
      </el-col>
    </el-row>

    <el-card>
    <el-table :data="filelist">
      <el-table-column prop="FileName" label="FileName" width="500px"></el-table-column>
      <el-table-column prop="FileType" label="FileType"></el-table-column>
      <el-table-column prop="FileSize" label="FileSize"></el-table-column>
      <el-table-column prop="Operation" label="Operation">
        <template>
          <div>
          <el-button type="danger" style="width: 130px">Delete</el-button>
          <el-button type="success" style="width: 130px">Download</el-button>
          </div>
        </template>
      </el-table-column>
    </el-table>
    </el-card>
    <el-divider/>
  </div>
<el-form>
  <el-row :gutter="24">
    <el-col :span="12">
      <h3 style="text-align: left;margin-left: 20px">File review : </h3>
    </el-col>
    <el-col :span="12" style="text-align: right; ">
      <el-button type="danger" style="width: 130px">Delete</el-button>
        <el-button type="success" style="width: 130px">Download</el-button>
      <div style="width: 20px"/>
    </el-col>
  </el-row>
  <el-button style="width: 1600px;height: 600px;font-size: xxx-large">This Is A Photo !</el-button>
</el-form>

  </el-card>

<!--    <el-card>-->
<!--      <el-table>-->
<!--        <el-table-column label="Name" style="width: 60%"></el-table-column>-->
<!--        <el-table-column label="Size" style="width: 20%"></el-table-column>-->
<!--        <el-table-column label="Operation" style="width: 20%"></el-table-column>-->
<!--      </el-table>-->
<!--    </el-card>-->

<!--    <el-divider/>-->

</template>

<script>
export default {
  name: 'NetDisk',
  props: {
    name: String,
    model: String,
  },
  data (){
    return {
      filelist: [{
        FileName: "photo1.jpg",
        FileType: "JPG",
        FileSize: "10GB",}
      ],
    }
  },
  methods: {
  }
}
</script>

<style scoped>

</style>
