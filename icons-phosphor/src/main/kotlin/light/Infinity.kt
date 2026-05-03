package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorLightIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 128.000 C 245.997 149.839 232.840 169.526 212.664 177.882 C 192.487 186.239 169.264 181.621 153.820 166.180 C 153.732 166.098 153.648 166.011 153.570 165.920 L 93.570 98.180 C 77.133 81.877 50.602 81.949 34.254 98.342 C 17.907 114.735 17.907 141.265 34.254 157.658 C 50.602 174.051 77.133 174.123 93.570 157.820 L 102.140 148.150 C 104.349 145.665 108.155 145.441 110.640 147.650 C 113.125 149.859 113.349 153.665 111.140 156.150 L 102.450 165.960 C 102.372 166.051 102.288 166.138 102.200 166.220 C 86.757 181.666 63.530 186.288 43.350 177.931 C 23.170 169.573 10.012 149.882 10.012 128.040 C 10.012 106.198 23.170 86.507 43.350 78.149 C 63.530 69.792 86.757 74.414 102.200 89.860 C 102.288 89.942 102.372 90.029 102.450 90.120 L 162.450 157.860 C 178.887 174.163 205.418 174.091 221.766 157.698 C 238.113 141.305 238.113 114.775 221.766 98.382 C 205.418 81.989 178.887 81.917 162.450 98.220 L 153.880 107.890 C 151.671 110.375 147.865 110.599 145.380 108.390 C 142.895 106.181 142.671 102.375 144.880 99.890 L 153.570 90.080 C 153.648 89.989 153.732 89.902 153.820 89.820 C 169.264 74.379 192.487 69.761 212.664 78.118 C 232.840 86.474 245.997 106.161 246.000 128.000 Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
