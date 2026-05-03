package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PillBottle: ImageVector
    get() {
        if (_pillBottle != null) return _pillBottle!!
        _pillBottle = lucideOutlineIcon(
            name = "PillBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 11.000 L 14.000 11.000 C 13.448 11.000 13.000 11.448 13.000 12.000 L 13.000 17.000 C 13.000 17.552 13.448 18.000 14.000 18.000 L 18.000 18.000"),
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
                pathData = parseSvgPathData("M 6.000 7.000 L 6.000 20.000 C 6.000 21.105 6.895 22.000 8.000 22.000 L 16.000 22.000 C 17.105 22.000 18.000 21.105 18.000 20.000 L 18.000 7.000"),
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
                pathData = parseSvgPathData("M 5.000 2.000 L 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 6.000 C 20.000 6.552 19.552 7.000 19.000 7.000 L 5.000 7.000 C 4.448 7.000 4.000 6.552 4.000 6.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 Z"),
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
        return _pillBottle!!
    }

private var _pillBottle: ImageVector? = null
