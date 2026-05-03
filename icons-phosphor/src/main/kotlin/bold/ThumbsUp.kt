package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorBoldIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.000 77.470 C 231.683 71.447 224.034 67.998 216.000 68.000 L 164.000 68.000 L 164.000 56.000 C 163.972 31.711 144.289 12.028 120.000 12.000 C 115.457 12.001 111.303 14.567 109.270 18.630 L 72.580 92.000 L 32.000 92.000 C 20.954 92.000 12.000 100.954 12.000 112.000 L 12.000 200.000 C 12.000 211.046 20.954 220.000 32.000 220.000 L 204.000 220.000 C 218.121 219.998 230.030 209.482 231.780 195.470 L 243.780 99.470 C 244.779 91.504 242.310 83.492 237.000 77.470 ZM 36.000 116.000 L 68.000 116.000 L 68.000 196.000 L 36.000 196.000 ZM 220.000 96.500 L 208.000 192.500 C 207.747 194.512 206.028 196.016 204.000 196.000 L 92.000 196.000 L 92.000 106.830 L 126.820 37.200 C 134.731 40.070 139.999 47.585 140.000 56.000 L 140.000 80.000 C 140.000 86.627 145.373 92.000 152.000 92.000 L 216.000 92.000 C 217.153 91.991 218.255 92.480 219.021 93.342 C 219.787 94.205 220.144 95.356 220.000 96.500 Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
