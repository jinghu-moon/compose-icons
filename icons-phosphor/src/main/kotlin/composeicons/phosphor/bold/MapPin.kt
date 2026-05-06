package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorBoldIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 60C103.699 60 84 79.699 84 104c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 79.711 152.289 60.028 128 60ZM128 124c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM128 12C77.213 12.055 36.055 53.213 36 104c0 77.36 81.64 135.4 85.12 137.83 4.131 2.891 9.629 2.891 13.76 0 15.463-11.396 29.61-24.476 42.18-39C205.15 170.57 220 136.37 220 104 219.945 53.213 178.787 12.055 128 12ZM159.3 186.71c-9.535 10.952-20.008 21.051-31.3 30.18C116.708 207.761 106.235 197.662 96.7 186.71 80 167.37 60 137.31 60 104 60 66.445 90.445 36 128 36c37.555 0 68 30.445 68 68 0 33.31-20 63.37-36.7 82.71Z"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
