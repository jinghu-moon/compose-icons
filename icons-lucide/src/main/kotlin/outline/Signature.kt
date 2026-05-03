package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = lucideOutlineIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 17.000 L 18.844 15.132 C 18.698 14.994 18.484 14.956 18.300 15.037 C 18.116 15.117 17.998 15.299 18.000 15.500 L 18.000 16.000 C 18.000 16.552 17.552 17.000 17.000 17.000 L 15.000 17.000 C 14.448 17.000 14.000 16.552 14.000 16.000 C 14.000 13.455 10.009 12.030 5.500 12.000 C 4.119 12.000 3.000 13.119 3.000 14.500 C 3.000 15.881 4.119 17.000 5.500 17.000 C 9.653 17.000 10.245 5.705 11.208 3.500 C 11.655 2.476 12.728 1.874 13.835 2.024 C 14.942 2.174 15.815 3.040 15.973 4.146 C 16.132 5.252 15.538 6.329 14.518 6.784"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 21.000 L 21.000 21.000"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
