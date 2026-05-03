package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorFillIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.820 157.000 L 227.820 61.000 C 226.308 48.997 216.098 39.996 204.000 40.000 L 32.000 40.000 C 23.163 40.000 16.000 47.163 16.000 56.000 L 16.000 144.000 C 16.000 152.837 23.163 160.000 32.000 160.000 L 75.060 160.000 L 112.840 235.580 C 114.197 238.291 116.969 240.002 120.000 240.000 C 142.091 240.000 160.000 222.091 160.000 200.000 L 160.000 184.000 L 216.000 184.000 C 222.889 184.002 229.448 181.044 234.006 175.878 C 238.563 170.711 240.681 163.835 239.820 157.000 ZM 72.000 144.000 L 32.000 144.000 L 32.000 56.000 L 72.000 56.000 Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
