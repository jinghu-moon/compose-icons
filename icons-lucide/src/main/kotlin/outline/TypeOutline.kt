package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TypeOutline: ImageVector
    get() {
        if (_typeOutline != null) return _typeOutline!!
        _typeOutline = lucideOutlineIcon(
            name = "TypeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 16.500 C 14.000 16.776 14.224 17.000 14.500 17.000 L 15.000 17.000 C 16.105 17.000 17.000 17.895 17.000 19.000 C 17.000 20.105 16.105 21.000 15.000 21.000 L 9.000 21.000 C 7.895 21.000 7.000 20.105 7.000 19.000 C 7.000 17.895 7.895 17.000 9.000 17.000 L 9.500 17.000 C 9.776 17.000 10.000 16.776 10.000 16.500 L 10.000 7.500 C 10.000 7.224 9.776 7.000 9.500 7.000 L 6.500 7.000 C 6.224 7.000 6.000 7.224 6.000 7.500 L 6.000 8.000 C 6.000 9.105 5.105 10.000 4.000 10.000 C 2.895 10.000 2.000 9.105 2.000 8.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 20.000 3.000 C 21.105 3.000 22.000 3.895 22.000 5.000 L 22.000 8.000 C 22.000 9.105 21.105 10.000 20.000 10.000 C 18.895 10.000 18.000 9.105 18.000 8.000 L 18.000 7.500 C 18.000 7.224 17.776 7.000 17.500 7.000 L 14.500 7.000 C 14.224 7.000 14.000 7.224 14.000 7.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _typeOutline!!
    }

private var _typeOutline: ImageVector? = null
