package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorFillIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 136c0 4.418-3.582 8-8 8h-16v64c0 8.837-7.163 16-16 16-.962-.003-1.923-.09-2.87-.26L45.13 194.65C37.526 193.264 32 186.639 32 178.91v-34.91h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h224c4.418 0 8 3.582 8 8ZM36 112h184c2.209 0 4-1.791 4-4v-59.58c.058-4.069-1.392-8.016-4.07-11.08-3.71-4.151-9.312-6.075-14.79-5.08l-160 29.09C37.532 62.732 32.001 69.357 32 77.09v30.91c0 2.209 1.791 4 4 4Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
