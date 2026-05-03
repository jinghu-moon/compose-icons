package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BetweenHorizontalEnd: ImageVector
    get() {
        if (_betweenHorizontalEnd != null) return _betweenHorizontalEnd!!
        _betweenHorizontalEnd = lucideOutlineIcon(
            name = "BetweenHorizontalEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 3.000 L 15.000 3.000 C 15.552 3.000 16.000 3.448 16.000 4.000 L 16.000 9.000 C 16.000 9.552 15.552 10.000 15.000 10.000 L 4.000 10.000 C 3.448 10.000 3.000 9.552 3.000 9.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 22.000 15.000 L 19.000 12.000 L 22.000 9.000"),
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
                pathData = parseSvgPathData("M 4.000 14.000 L 15.000 14.000 C 15.552 14.000 16.000 14.448 16.000 15.000 L 16.000 20.000 C 16.000 20.552 15.552 21.000 15.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 15.000 C 3.000 14.448 3.448 14.000 4.000 14.000 Z"),
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
        return _betweenHorizontalEnd!!
    }

private var _betweenHorizontalEnd: ImageVector? = null
