package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = lucideOutlineIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 11.000 L 20.704 9.704 C 20.253 9.250 19.640 8.994 19.000 8.994 C 18.360 8.994 17.747 9.250 17.296 9.704 L 11.000 16.000"),
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
                pathData = parseSvgPathData("M 4.000 8.000 C 2.895 8.000 2.000 8.895 2.000 10.000 L 2.000 20.000 C 2.000 21.105 2.895 22.000 4.000 22.000 L 14.000 22.000 C 15.105 22.000 16.000 21.105 16.000 20.000"),
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
                pathData = parseSvgPathData("M 14.000 7.000 C 14.000 7.552 13.552 8.000 13.000 8.000 C 12.448 8.000 12.000 7.552 12.000 7.000 C 12.000 6.448 12.448 6.000 13.000 6.000 C 13.552 6.000 14.000 6.448 14.000 7.000 Z"),
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
                pathData = parseSvgPathData("M 10.000 2.000 L 20.000 2.000 C 21.105 2.000 22.000 2.895 22.000 4.000 L 22.000 14.000 C 22.000 15.105 21.105 16.000 20.000 16.000 L 10.000 16.000 C 8.895 16.000 8.000 15.105 8.000 14.000 L 8.000 4.000 C 8.000 2.895 8.895 2.000 10.000 2.000 Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
