package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = phosphorRegularIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 136.000 40.000 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 176.000 C 24.000 184.837 31.163 192.000 40.000 192.000 L 79.360 192.000 L 57.750 219.000 C 54.989 222.452 55.548 227.489 59.000 230.250 C 62.452 233.011 67.489 232.452 70.250 229.000 L 99.840 192.000 L 156.160 192.000 L 185.750 229.000 C 188.511 232.452 193.548 233.011 197.000 230.250 C 200.452 227.489 201.011 222.452 198.250 219.000 L 176.640 192.000 L 216.000 192.000 C 224.837 192.000 232.000 184.837 232.000 176.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 176.000 L 40.000 176.000 L 40.000 56.000 L 216.000 56.000 L 216.000 176.000 Z"),
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
