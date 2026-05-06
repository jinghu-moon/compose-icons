package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorBoldIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.14 77.41 178.59 25.86C174.85 22.095 169.757 19.985 164.45 20h-72.9c-5.307-.015-10.4 2.095-14.14 5.86L25.86 77.41C22.095 81.15 19.985 86.243 20 91.55v72.9c-.015 5.307 2.095 10.4 5.86 14.14l51.55 51.55c3.74 3.765 8.833 5.875 14.14 5.86h72.9c5.307 .015 10.4-2.095 14.14-5.86l51.55-51.55c3.765-3.74 5.875-8.833 5.86-14.14v-72.9c.015-5.307-2.095-10.4-5.86-14.14ZM212 162.79 162.79 212h-69.58L44 162.79v-69.58L93.21 44h69.58L212 93.21Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
