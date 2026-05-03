package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorRegularIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 149.510 232.000 172.100 225.520 188.430 214.670 C 192.111 212.223 193.112 207.256 190.665 203.575 C 188.218 199.894 183.251 198.893 179.570 201.340 C 166.000 210.380 146.210 216.000 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 216.000 154.450 205.120 160.000 196.000 160.000 C 186.880 160.000 176.000 154.450 176.000 128.000 L 176.000 88.000 C 176.000 83.582 172.418 80.000 168.000 80.000 C 163.582 80.000 160.000 83.582 160.000 88.000 L 160.000 92.260 C 145.308 79.088 124.052 76.248 106.418 85.103 C 88.784 93.958 78.365 112.702 80.155 132.353 C 81.945 152.004 95.579 168.558 114.523 174.080 C 133.466 179.603 153.860 172.970 165.930 157.360 C 171.930 169.360 182.280 176.000 196.000 176.000 C 218.540 176.000 232.000 158.060 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
