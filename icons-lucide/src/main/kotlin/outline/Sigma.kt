package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = lucideOutlineIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 7.000 L 18.000 5.000 C 18.000 4.448 17.552 4.000 17.000 4.000 L 6.500 4.000 C 6.311 4.000 6.137 4.107 6.053 4.276 C 5.968 4.446 5.986 4.648 6.100 4.800 L 10.600 10.800 C 11.133 11.511 11.133 12.489 10.600 13.200 L 6.100 19.200 C 5.986 19.352 5.968 19.554 6.053 19.724 C 6.137 19.893 6.311 20.000 6.500 20.000 L 17.000 20.000 C 17.552 20.000 18.000 19.552 18.000 19.000 L 18.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _sigma!!
    }

private var _sigma: ImageVector? = null
