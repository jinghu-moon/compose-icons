package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorThinIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.070 61.440 C 226.311 60.529 225.186 60.001 224.000 60.000 L 59.340 60.000 L 52.660 23.280 C 52.313 21.382 50.660 20.002 48.730 20.000 L 24.000 20.000 C 21.791 20.000 20.000 21.791 20.000 24.000 C 20.000 26.209 21.791 28.000 24.000 28.000 L 45.390 28.000 L 52.080 64.800 L 52.080 64.800 L 71.490 171.580 C 72.385 176.460 75.061 180.833 79.000 183.850 C 70.549 189.297 66.389 199.434 68.578 209.247 C 70.766 219.061 78.840 226.469 88.804 227.809 C 98.769 229.149 108.512 224.135 113.215 215.248 C 117.918 206.361 116.582 195.485 109.870 188.000 L 170.130 188.000 C 162.579 196.442 161.958 209.014 168.640 218.159 C 175.322 227.304 187.488 230.533 197.825 225.905 C 208.162 221.277 213.857 210.052 211.487 198.977 C 209.117 187.902 199.326 179.991 188.000 180.000 L 91.170 180.000 C 85.374 179.997 80.408 175.852 79.370 170.150 L 75.370 148.000 L 196.100 148.000 C 205.766 148.001 214.050 141.090 215.780 131.580 L 227.940 64.720 C 228.151 63.552 227.832 62.350 227.070 61.440 ZM 108.000 204.000 C 108.000 212.837 100.837 220.000 92.000 220.000 C 83.163 220.000 76.000 212.837 76.000 204.000 C 76.000 195.163 83.163 188.000 92.000 188.000 C 100.837 188.000 108.000 195.163 108.000 204.000 ZM 204.000 204.000 C 204.000 212.837 196.837 220.000 188.000 220.000 C 179.163 220.000 172.000 212.837 172.000 204.000 C 172.000 195.163 179.163 188.000 188.000 188.000 C 196.837 188.000 204.000 195.163 204.000 204.000 ZM 207.910 130.150 C 206.871 135.856 201.900 140.002 196.100 140.000 L 73.880 140.000 L 60.790 68.000 L 219.210 68.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
