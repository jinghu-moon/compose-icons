package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorRegularIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.31 80.24 175.76 28.69C172.77 25.676 168.696 23.986 164.45 24h-72.9c-4.246-.014-8.32 1.676-11.31 4.69L28.69 80.24C25.676 83.23 23.986 87.304 24 91.55v72.9c-.014 4.246 1.676 8.32 4.69 11.31l51.55 51.55c2.99 3.014 7.064 4.704 11.31 4.69h72.9c4.246 .014 8.32-1.676 11.31-4.69l51.55-51.55c3.014-2.99 4.704-7.064 4.69-11.31v-72.9c.014-4.246-1.676-8.32-4.69-11.31ZM216 164.45 164.45 216h-72.9L40 164.45v-72.9L91.55 40h72.9L216 91.55Z"),
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
