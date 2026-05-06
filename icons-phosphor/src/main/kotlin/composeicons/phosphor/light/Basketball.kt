package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorLightIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM60 69.09C72.871 83.858 80.525 102.451 81.78 122h-43.58C39.492 102.455 47.148 83.872 60 69.09ZM38.2 134h43.58C80.525 153.549 72.871 172.142 60 186.91 47.148 172.128 39.492 153.545 38.2 134ZM122 217.8C102.185 216.484 83.367 208.626 68.5 195.46 83.621 178.409 92.542 156.754 93.82 134h28.18ZM122 122h-28.18C92.542 99.246 83.621 77.591 68.5 60.54 83.367 47.374 102.185 39.516 122 38.2ZM217.8 122h-43.58C175.475 102.451 183.129 83.858 196 69.09c12.852 14.782 20.508 33.365 21.8 52.91ZM134 38.2c19.815 1.316 38.633 9.174 53.5 22.34C172.379 77.591 163.458 99.246 162.18 122h-28.18ZM134 217.8v-83.8h28.18c1.278 22.754 10.199 44.409 25.32 61.46C172.633 208.626 153.815 216.484 134 217.8ZM196 186.91C183.129 172.142 175.475 153.549 174.22 134h43.58c-1.292 19.545-8.948 38.128-21.8 52.91Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
