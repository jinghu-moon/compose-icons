package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Podcast: ImageVector
    get() {
        if (_podcast != null) return _podcast!!
        _podcast = lucideOutlineIcon(
            name = "Podcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 17.000 C 13.000 16.448 12.552 16.000 12.000 16.000 C 11.448 16.000 11.000 16.448 11.000 17.000 L 11.500 21.500 C 11.500 21.776 11.724 22.000 12.000 22.000 C 12.276 22.000 12.500 21.776 12.500 21.500 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 16.850 18.580 C 20.217 16.426 21.760 12.309 20.638 8.472 C 19.516 4.635 15.997 1.999 12.000 1.999 C 8.003 1.999 4.484 4.635 3.362 8.472 C 2.240 12.309 3.783 16.426 7.150 18.580"),
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
                pathData = parseSvgPathData("M 8.000 14.000 C 6.453 11.937 6.728 9.036 8.636 7.301 C 10.543 5.566 13.457 5.566 15.364 7.301 C 17.272 9.036 17.547 11.937 16.000 14.000"),
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
                pathData = parseSvgPathData("M 13.000 11.000 C 13.000 11.552 12.552 12.000 12.000 12.000 C 11.448 12.000 11.000 11.552 11.000 11.000 C 11.000 10.448 11.448 10.000 12.000 10.000 C 12.552 10.000 13.000 10.448 13.000 11.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _podcast!!
    }

private var _podcast: ImageVector? = null
