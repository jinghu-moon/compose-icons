package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = lucideOutlineIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 3.000 L 18.000 3.000 C 18.552 3.000 19.000 3.448 19.000 4.000 L 19.000 20.000 C 19.000 20.552 18.552 21.000 18.000 21.000 L 15.000 21.000 C 14.448 21.000 14.000 20.552 14.000 20.000 L 14.000 4.000 C 14.000 3.448 14.448 3.000 15.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 6.000 3.000 L 9.000 3.000 C 9.552 3.000 10.000 3.448 10.000 4.000 L 10.000 20.000 C 10.000 20.552 9.552 21.000 9.000 21.000 L 6.000 21.000 C 5.448 21.000 5.000 20.552 5.000 20.000 L 5.000 4.000 C 5.000 3.448 5.448 3.000 6.000 3.000 Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
