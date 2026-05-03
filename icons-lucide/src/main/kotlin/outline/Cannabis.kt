package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = lucideOutlineIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 L 12.000 18.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.000 12.000 C 5.500 12.000 2.500 13.500 2.000 15.000 C 5.500 16.500 8.000 16.000 8.000 16.000 C 6.500 17.500 6.000 19.500 6.000 21.000 C 8.500 21.000 10.500 19.500 12.000 18.000 C 13.500 19.500 15.500 21.000 18.000 21.000 C 18.000 19.500 17.500 17.500 16.000 16.000 C 16.000 16.000 18.500 16.500 22.000 15.000 C 21.500 13.500 18.500 12.000 17.000 12.000 C 18.500 11.000 21.000 8.000 21.000 6.000 C 18.500 6.000 15.500 7.500 14.000 9.000 C 14.000 6.500 13.500 4.000 12.000 2.000 C 10.500 4.000 10.000 6.500 10.000 9.000 C 8.500 7.500 5.500 6.000 3.000 6.000 C 3.000 8.000 5.500 11.000 7.000 12.000"),
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
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
