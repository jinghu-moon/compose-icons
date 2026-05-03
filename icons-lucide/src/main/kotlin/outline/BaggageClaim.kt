package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BaggageClaim: ImageVector
    get() {
        if (_baggageClaim != null) return _baggageClaim!!
        _baggageClaim = lucideOutlineIcon(
            name = "BaggageClaim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 18.000 L 6.000 18.000 C 4.895 18.000 4.000 17.105 4.000 16.000 L 4.000 7.000 C 4.000 5.895 3.105 5.000 2.000 5.000"),
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
                pathData = parseSvgPathData("M 17.000 14.000 L 17.000 4.000 C 17.000 2.895 16.105 2.000 15.000 2.000 L 14.000 2.000 C 12.895 2.000 12.000 2.895 12.000 4.000 L 12.000 14.000"),
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
                pathData = parseSvgPathData("M 9.000 6.000 L 20.000 6.000 C 20.552 6.000 21.000 6.448 21.000 7.000 L 21.000 13.000 C 21.000 13.552 20.552 14.000 20.000 14.000 L 9.000 14.000 C 8.448 14.000 8.000 13.552 8.000 13.000 L 8.000 7.000 C 8.000 6.448 8.448 6.000 9.000 6.000 Z"),
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
                pathData = parseSvgPathData("M 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 C 16.895 22.000 16.000 21.105 16.000 20.000 C 16.000 18.895 16.895 18.000 18.000 18.000 C 19.105 18.000 20.000 18.895 20.000 20.000 Z"),
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
                pathData = parseSvgPathData("M 11.000 20.000 C 11.000 21.105 10.105 22.000 9.000 22.000 C 7.895 22.000 7.000 21.105 7.000 20.000 C 7.000 18.895 7.895 18.000 9.000 18.000 C 10.105 18.000 11.000 18.895 11.000 20.000 Z"),
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
        return _baggageClaim!!
    }

private var _baggageClaim: ImageVector? = null
