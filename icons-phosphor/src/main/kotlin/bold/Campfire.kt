package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorBoldIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.510 227.400 C 226.003 232.501 221.319 236.001 216.000 236.000 C 214.849 235.999 213.704 235.834 212.600 235.510 L 128.000 210.510 L 43.400 235.510 C 42.296 235.834 41.151 235.999 40.000 236.000 C 34.034 236.003 28.972 231.622 28.118 225.718 C 27.264 219.813 30.877 214.177 36.600 212.490 L 85.650 198.000 L 36.600 183.510 C 30.478 181.455 27.079 174.924 28.910 168.731 C 30.741 162.539 37.145 158.905 43.400 160.510 L 128.000 185.510 L 212.600 160.510 C 216.763 159.113 221.357 160.101 224.577 163.087 C 227.797 166.072 229.129 170.578 228.050 174.835 C 226.971 179.091 223.653 182.419 219.400 183.510 L 170.350 198.000 L 219.400 212.490 C 222.453 213.391 225.023 215.469 226.544 218.265 C 228.065 221.061 228.412 224.347 227.510 227.400 ZM 64.000 104.000 C 64.000 53.410 119.930 22.720 122.310 21.430 C 125.862 19.517 130.138 19.517 133.690 21.430 C 136.070 22.720 192.000 53.410 192.000 104.000 C 192.000 139.346 163.346 168.000 128.000 168.000 C 92.654 168.000 64.000 139.346 64.000 104.000 ZM 128.000 144.000 C 134.627 144.000 140.000 138.627 140.000 132.000 C 140.000 125.530 137.290 119.450 132.000 113.930 C 130.745 112.655 129.409 111.462 128.000 110.360 C 126.593 111.465 125.257 112.657 124.000 113.930 C 118.670 119.450 116.000 125.530 116.000 132.000 C 116.000 138.627 121.373 144.000 128.000 144.000 ZM 88.000 104.000 C 87.993 110.666 89.660 117.227 92.850 123.080 C 97.660 98.080 121.510 85.830 122.630 85.270 C 126.010 83.579 129.990 83.579 133.370 85.270 C 134.490 85.830 158.370 98.050 163.150 123.080 C 166.340 117.227 168.007 110.666 168.000 104.000 C 168.000 75.660 140.260 54.190 128.000 46.080 C 115.750 54.180 88.000 75.660 88.000 104.000 Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
