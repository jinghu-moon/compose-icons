package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorLightIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.12 55.87C160.286 16.036 95.704 16.036 55.87 55.87c-39.834 39.834-39.834 104.416 0 144.25 39.834 39.834 104.416 39.834 144.25 0 39.834-39.834 39.834-104.416 0-144.25ZM191.64 191.64c-35.147 35.147-92.132 35.147-127.279-.001C29.214 156.492 29.214 99.508 64.361 64.361 99.508 29.213 156.493 29.213 191.64 64.36c35.093 35.17 35.093 92.11 0 127.28ZM164.24 83.76c2.34 2.343 2.34 6.137 0 8.48l-32 32c-2.343 2.34-6.137 2.34-8.48 0l-32-32c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 111.51 155.76 83.76c2.343-2.34 6.137-2.34 8.48 0ZM164.24 139.76c2.34 2.343 2.34 6.137 0 8.48l-32 32c-2.343 2.34-6.137 2.34-8.48 0l-32-32c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 167.51l27.76-27.75c2.343-2.34 6.137-2.34 8.48 0Z"),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
