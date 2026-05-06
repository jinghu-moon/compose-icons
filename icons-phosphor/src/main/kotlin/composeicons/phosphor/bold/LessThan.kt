package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorBoldIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.84 205.13c-1.362 2.881-3.814 5.102-6.816 6.174-3.002 1.071-6.306 .904-9.184-.464l-152-72C38.655 136.853 35.987 132.633 35.987 128c0-4.633 2.667-8.853 6.853-10.84L194.84 45.16c3.883-1.891 8.482-1.551 12.044 .893 3.561 2.443 5.535 6.612 5.168 10.915-.367 4.303-3.018 8.077-6.942 9.882L76 128l129.1 61.15c2.881 1.357 5.105 3.803 6.182 6.8 1.077 2.997 .918 6.3-.442 9.18Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
