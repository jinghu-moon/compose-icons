package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorBoldIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51.85 148.74 173.29 104 51.85 59.26C45.631 56.968 42.448 50.069 44.74 43.85c2.292-6.219 9.191-9.402 15.41-7.11L212.15 92.74c4.717 1.738 7.851 6.233 7.851 11.26 0 5.027-3.134 9.522-7.851 11.26L60.15 171.26c-6.219 2.292-13.118-.891-15.41-7.11-2.292-6.219 .891-13.118 7.11-15.41ZM208 188h-152c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
