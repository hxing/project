// module.exports = {
//     devServer: {
//         '/project': {
//             target: 'http://192.168.1.3:8080',
//             // ws: true,
//             // changeOrigin: true
//         },
//     }
// }

module.exports = {
    devServer: {
        proxy: 'http://localhost:8080'
    }
}