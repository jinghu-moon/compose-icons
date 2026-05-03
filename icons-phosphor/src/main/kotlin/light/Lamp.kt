package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorLightIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.510 149.640 L 197.510 37.640 C 196.566 35.434 194.399 34.003 192.000 34.000 L 64.000 34.000 C 61.601 34.003 59.434 35.434 58.490 37.640 L 10.490 149.640 C 9.697 151.493 9.888 153.619 10.997 155.302 C 12.106 156.984 13.985 157.998 16.000 158.000 L 122.000 158.000 L 122.000 210.000 L 96.000 210.000 C 92.686 210.000 90.000 212.686 90.000 216.000 C 90.000 219.314 92.686 222.000 96.000 222.000 L 160.000 222.000 C 163.314 222.000 166.000 219.314 166.000 216.000 C 166.000 212.686 163.314 210.000 160.000 210.000 L 134.000 210.000 L 134.000 158.000 L 194.000 158.000 L 194.000 192.000 C 194.000 195.314 196.686 198.000 200.000 198.000 C 203.314 198.000 206.000 195.314 206.000 192.000 L 206.000 158.000 L 240.000 158.000 C 242.015 157.998 243.894 156.984 245.003 155.302 C 246.112 153.619 246.303 151.493 245.510 149.640 ZM 25.100 146.000 L 68.000 46.000 L 188.000 46.000 L 230.900 146.000 Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
