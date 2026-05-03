package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorThinIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 120.000 L 132.000 176.000 C 132.000 178.209 130.209 180.000 128.000 180.000 C 125.791 180.000 124.000 178.209 124.000 176.000 L 124.000 120.000 C 124.000 117.791 125.791 116.000 128.000 116.000 C 130.209 116.000 132.000 117.791 132.000 120.000 ZM 181.200 116.000 C 180.144 115.894 179.090 116.211 178.269 116.883 C 177.447 117.554 176.926 118.524 176.820 119.580 L 171.220 175.580 C 171.103 176.642 171.415 177.707 172.087 178.537 C 172.760 179.368 173.737 179.894 174.800 180.000 L 175.210 180.000 C 177.272 180.010 179.004 178.452 179.210 176.400 L 184.810 120.400 C 184.921 119.336 184.602 118.273 183.924 117.446 C 183.246 116.619 182.265 116.098 181.200 116.000 ZM 74.800 116.000 C 73.744 116.106 72.774 116.627 72.103 117.449 C 71.431 118.270 71.114 119.324 71.220 120.380 L 76.820 176.380 C 77.026 178.432 78.758 179.990 80.820 179.980 L 81.230 179.980 C 82.286 179.874 83.256 179.353 83.927 178.531 C 84.599 177.710 84.916 176.656 84.810 175.600 L 79.210 119.600 C 79.109 118.535 78.586 117.555 77.757 116.878 C 76.929 116.202 75.864 115.886 74.800 116.000 ZM 236.000 88.530 L 220.890 201.590 C 220.094 207.548 215.011 211.998 209.000 212.000 L 47.000 212.000 C 40.989 211.998 35.906 207.548 35.110 201.590 L 20.000 88.530 C 19.861 87.382 20.225 86.229 21.000 85.370 C 21.756 84.503 22.850 84.004 24.000 84.000 L 70.180 84.000 L 125.000 21.370 C 125.759 20.509 126.852 20.016 128.000 20.016 C 129.148 20.016 130.241 20.509 131.000 21.370 L 185.820 84.000 L 232.000 84.000 C 233.150 84.004 234.244 84.503 235.000 85.370 C 235.775 86.229 236.139 87.382 236.000 88.530 ZM 80.820 84.000 L 175.180 84.000 L 128.000 30.070 ZM 227.430 92.000 L 28.570 92.000 L 43.000 200.530 C 43.267 202.530 44.982 204.018 47.000 204.000 L 209.000 204.000 C 211.018 204.018 212.733 202.530 213.000 200.530 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _basket!!
    }

private var _basket: ImageVector? = null
