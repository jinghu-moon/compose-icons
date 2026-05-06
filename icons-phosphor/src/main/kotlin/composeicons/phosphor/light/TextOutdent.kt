package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorLightIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c0 3.314-2.686 6-6 6h-104c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h104c3.314 0 6 2.686 6 6ZM112 70h104c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-104c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 186h-176c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h176c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM72 142c2.425-.002 4.611-1.464 5.538-3.705 .928-2.241 .415-4.82-1.298-6.535L40.49 96 76.24 60.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L27.76 91.76c-2.34 2.343-2.34 6.137 0 8.48l40 40c1.124 1.126 2.649 1.759 4.24 1.76Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
