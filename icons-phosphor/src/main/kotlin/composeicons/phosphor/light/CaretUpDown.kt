package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorLightIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180.24 171.76c2.34 2.343 2.34 6.137 0 8.48l-48 48c-2.343 2.34-6.137 2.34-8.48 0l-48-48c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 215.51l43.76-43.75c2.343-2.34 6.137-2.34 8.48 0ZM84.24 84.24 128 40.49l43.76 43.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333l-48-48c-2.343-2.34-6.137-2.34-8.48 0l-48 48c-2.203 2.364-2.138 6.048 .147 8.333 2.285 2.285 5.969 2.35 8.333 .147Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
