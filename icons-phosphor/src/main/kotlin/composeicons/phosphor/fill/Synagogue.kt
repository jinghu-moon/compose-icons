package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorFillIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 57.38v-25.38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v25.38C182.413 60.769 176.003 69.832 176 80v42.21L136 99.36v-27.36c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v27.36L80 122.21v-42.21C79.997 69.832 73.587 60.769 64 57.38v-25.38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v25.38C38.413 60.769 32.003 69.832 32 80v136c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-40c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v40c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-136C223.997 69.832 217.587 60.769 208 57.38ZM64 208h-16v-96h16ZM208 208h-16v-96h16Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
