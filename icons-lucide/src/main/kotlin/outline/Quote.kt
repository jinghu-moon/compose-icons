package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = lucideOutlineIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 3.000 C 14.895 3.000 14.000 3.895 14.000 5.000 L 14.000 11.000 C 14.000 12.105 14.895 13.000 16.000 13.000 C 16.552 13.000 17.000 13.448 17.000 14.000 L 17.000 15.000 C 17.000 16.105 16.105 17.000 15.000 17.000 C 14.448 17.000 14.000 17.448 14.000 18.000 L 14.000 20.000 C 14.000 20.552 14.448 21.000 15.000 21.000 C 18.314 21.000 21.000 18.314 21.000 15.000 L 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 11.000 C 3.000 12.105 3.895 13.000 5.000 13.000 C 5.552 13.000 6.000 13.448 6.000 14.000 L 6.000 15.000 C 6.000 16.105 5.105 17.000 4.000 17.000 C 3.448 17.000 3.000 17.448 3.000 18.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 C 7.314 21.000 10.000 18.314 10.000 15.000 L 10.000 5.000 C 10.000 3.895 9.105 3.000 8.000 3.000 Z"),
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
        return _quote!!
    }

private var _quote: ImageVector? = null
