package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorLightIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 26.000 C 203.200 26.000 179.890 37.410 154.700 59.900 C 136.620 76.060 121.000 94.900 110.300 109.000 C 92.622 103.122 73.197 106.093 58.084 116.987 C 42.972 127.881 34.012 145.371 34.000 164.000 C 34.000 196.070 13.570 210.390 12.650 211.000 C 10.439 212.466 9.454 215.210 10.227 217.748 C 11.000 220.286 13.347 222.015 16.000 222.000 L 92.000 222.000 C 110.629 221.988 128.119 213.028 139.013 197.916 C 149.907 182.803 152.878 163.378 147.000 145.700 C 161.080 135.030 179.920 119.380 196.080 101.300 C 218.590 76.110 230.000 52.800 230.000 32.000 C 230.000 28.686 227.314 26.000 224.000 26.000 ZM 92.000 210.000 L 30.650 210.000 C 37.920 200.850 46.000 185.780 46.000 164.000 C 46.000 138.595 66.595 118.000 92.000 118.000 C 117.405 118.000 138.000 138.595 138.000 164.000 C 138.000 189.405 117.405 210.000 92.000 210.000 ZM 121.490 114.090 C 125.090 109.420 129.370 104.090 134.200 98.400 C 143.581 104.441 151.559 112.419 157.600 121.800 C 151.930 126.630 146.600 130.910 141.910 134.510 C 136.921 126.101 129.899 119.079 121.490 114.090 ZM 166.690 113.790 C 160.186 104.127 151.873 95.814 142.210 89.310 C 163.050 66.460 191.000 42.000 217.560 38.440 C 214.000 65.000 189.540 93.000 166.690 113.790 Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
