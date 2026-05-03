package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorFillIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.180 145.510 C 38.710 128.932 31.978 108.744 32.000 88.000 C 32.000 86.590 32.000 85.190 32.090 83.790 C 32.202 81.663 33.960 79.997 36.090 80.000 L 107.000 80.000 C 108.619 79.999 110.079 80.973 110.698 82.469 C 111.318 83.964 110.975 85.686 109.830 86.830 ZM 120.000 183.660 L 120.000 99.310 L 61.830 157.490 C 77.656 172.610 98.187 181.847 120.000 183.660 ZM 204.820 145.510 C 217.290 128.932 224.022 108.744 224.000 88.000 C 224.000 86.590 224.000 85.190 223.910 83.790 C 223.798 81.663 222.040 79.997 219.910 80.000 L 149.000 80.000 C 147.381 79.999 145.921 80.973 145.302 82.469 C 144.682 83.964 145.025 85.686 146.170 86.830 ZM 248.000 80.000 L 243.920 80.000 C 242.834 79.999 241.795 80.440 241.041 81.221 C 240.287 82.001 239.882 83.055 239.920 84.140 C 239.920 85.420 239.990 86.710 239.990 88.000 C 239.409 149.440 189.438 198.942 127.995 198.942 C 66.552 198.942 16.581 149.440 16.000 88.000 C 16.000 86.710 16.000 85.420 16.070 84.140 C 16.108 83.055 15.703 82.001 14.949 81.221 C 14.195 80.440 13.156 79.999 12.070 80.000 L 8.000 80.000 C 3.582 80.000 0.000 83.582 0.000 88.000 C 0.000 158.692 57.308 216.000 128.000 216.000 C 198.692 216.000 256.000 158.692 256.000 88.000 C 256.000 83.582 252.418 80.000 248.000 80.000 ZM 136.000 99.310 L 136.000 183.660 C 157.813 181.847 178.344 172.610 194.170 157.490 Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
