package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorFillIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 24c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8ZM248 112c0 4.418-3.582 8-8 8h-8v80c0 8.837-7.163 16-16 16h-24c-8.837 0-16-7.163-16-16v-8h-96v8c0 8.837-7.163 16-16 16h-24c-8.837 0-16-7.163-16-16v-80h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h11.36L54.75 56.06C57.599 51.076 62.899 48 68.64 48h118.72c5.741 0 11.041 3.076 13.89 8.06L228.64 104h11.36c4.418 0 8 3.582 8 8ZM88 144c0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8ZM208 144c0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8ZM210.21 104 187.36 64h-118.72L45.79 104Z"),
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
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
