package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = lucideOutlineIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.300 10.000 C 8.037 10.014 7.788 9.880 7.656 9.652 C 7.524 9.425 7.531 9.142 7.674 8.921 L 11.400 3.000 C 11.519 2.786 11.742 2.649 11.987 2.640 C 12.232 2.631 12.464 2.752 12.598 2.957 L 16.300 8.900 C 16.449 9.114 16.467 9.392 16.347 9.623 C 16.227 9.854 15.988 9.999 15.728 10.000 Z"),
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
                pathData = parseSvgPathData("M 4.000 14.000 L 9.000 14.000 C 9.552 14.000 10.000 14.448 10.000 15.000 L 10.000 20.000 C 10.000 20.552 9.552 21.000 9.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 15.000 C 3.000 14.448 3.448 14.000 4.000 14.000 Z"),
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
                pathData = parseSvgPathData("M 21.000 17.500 C 21.000 19.433 19.433 21.000 17.500 21.000 C 15.567 21.000 14.000 19.433 14.000 17.500 C 14.000 15.567 15.567 14.000 17.500 14.000 C 19.433 14.000 21.000 15.567 21.000 17.500 Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
