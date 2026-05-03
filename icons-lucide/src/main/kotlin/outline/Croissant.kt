package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Croissant: ImageVector
    get() {
        if (_croissant != null) return _croissant!!
        _croissant = lucideOutlineIcon(
            name = "Croissant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.200 18.000 L 4.774 18.000 C 4.169 17.979 3.636 17.597 3.422 17.030 C 2.813 14.904 2.859 12.643 3.554 10.543"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 10.200 L 18.000 4.774 C 17.979 4.169 17.597 3.636 17.030 3.422 C 14.904 2.813 12.644 2.859 10.544 3.554"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 5.000 C 20.209 5.000 22.000 6.343 22.000 8.000 C 22.000 9.105 21.105 10.000 20.000 10.000 C 18.190 10.000 16.414 10.490 14.861 11.420"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 5.000 18.000 C 5.000 20.209 6.343 22.000 8.000 22.000 C 9.105 22.000 10.000 21.105 10.000 20.000 C 9.999 18.190 10.490 16.413 11.420 14.860"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.709 2.554 C 5.825 3.558 3.558 5.825 2.554 8.709 C 2.404 9.340 2.677 9.996 3.230 10.335 L 13.037 15.755 C 13.817 16.186 14.789 16.049 15.419 15.419 C 16.049 14.789 16.186 13.817 15.755 13.037 L 10.335 3.230 C 9.996 2.677 9.340 2.404 8.709 2.554"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _croissant!!
    }

private var _croissant: ImageVector? = null
