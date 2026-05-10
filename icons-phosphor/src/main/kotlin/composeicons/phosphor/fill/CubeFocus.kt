package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorFillIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM72 200h-32v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 160c-4.418 0-8 3.582-8 8v32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM32 96c4.418 0 8-3.582 8-8v-32h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8ZM177.92 83.31 132 57.05c-2.46-1.406-5.48-1.406-7.94 0L78.08 83.31c-1.273 .704-2.064 2.045-2.064 3.5 0 1.455 .79 2.796 2.064 3.5L128 118.79 177.92 90.26c1.248-.712 2.019-2.038 2.019-3.475 0-1.437-.771-2.763-2.019-3.475ZM64 107.53v52.47c-.026 2.884 1.502 5.558 4 7l46 26.27c1.239 .715 2.765 .714 4.003-.001 1.238-.716 2-2.038 1.997-3.469v-57.16L70 104.06c-1.239-.715-2.765-.714-4.003 .001-1.238 .716-2 2.038-1.997 3.469ZM192 160v-52.47c.002-1.43-.759-2.753-1.997-3.469-1.238-.716-2.764-.717-4.003-.001l-50 28.58v57.11c-.002 1.43 .759 2.753 1.997 3.469 1.238 .716 2.764 .717 4.003 .001L188 167c2.498-1.442 4.026-4.116 4-7Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
