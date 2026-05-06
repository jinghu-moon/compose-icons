package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorLightIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 131.76c2.34 2.343 2.34 6.137 0 8.48l-80 80c-2.343 2.34-6.137 2.34-8.48 0l-80-80c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 207.51l75.76-75.75c2.343-2.34 6.137-2.34 8.48 0ZM123.76 140.24c2.343 2.34 6.137 2.34 8.48 0l80-80c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L128 127.51 52.24 51.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333Z"),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
