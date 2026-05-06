package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorBoldIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 104c-0-5.027 3.133-9.521 7.85-11.26L195.85 36.74c6.219-2.292 13.118 .891 15.41 7.11 2.292 6.219-.891 13.118-7.11 15.41L82.71 104l121.44 44.74c5.456 2.01 8.686 7.643 7.665 13.368-1.021 5.724-6 9.893-11.815 9.892-1.416 .003-2.822-.247-4.15-.74L43.85 115.26C39.133 113.521 36 109.027 36 104ZM200 188h-152c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
