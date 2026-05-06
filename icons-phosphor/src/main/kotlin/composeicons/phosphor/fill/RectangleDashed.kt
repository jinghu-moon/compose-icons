package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorFillIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM80 192h-16c-8.837 0-16-7.163-16-16v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM80 80h-16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32C48 71.163 55.163 64 64 64h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM144 192h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM144 80h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM208 176c0 8.837-7.163 16-16 16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM208 112c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c8.837 0 16 7.163 16 16Z"),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
