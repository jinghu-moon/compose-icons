package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorLightIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c0 3.314-2.686 6-6 6h-104c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h104c3.314 0 6 2.686 6 6ZM112 70h104c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-104c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 186h-176c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h176c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM35.76 140.24c2.343 2.34 6.137 2.34 8.48 0L84.24 100.24c2.34-2.343 2.34-6.137 0-8.48L44.24 51.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L71.51 96 35.76 131.76c-2.34 2.343-2.34 6.137 0 8.48Z"),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
