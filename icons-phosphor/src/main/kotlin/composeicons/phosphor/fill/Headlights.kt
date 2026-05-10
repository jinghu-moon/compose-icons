package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorFillIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 80c0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72c-4.418 0-8-3.582-8-8ZM240 168h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM240 104h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM240 136h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 48h-39.1C44.62 48 8.33 83.62 8 127.39c-.163 21.323 8.194 41.828 23.215 56.963C46.235 199.488 66.677 208.001 88 208h40c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
