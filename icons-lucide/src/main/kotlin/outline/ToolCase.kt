package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ToolCase: ImageVector
    get() {
        if (_toolCase != null) return _toolCase!!
        _toolCase = lucideOutlineIcon(
            name = "ToolCase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 15.000 L 14.000 15.000"),
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
        pathData = parseSvgPathData("M 14.817 10.995 L 13.846 9.545 L 14.880 8.313 C 15.451 7.649 15.523 6.691 15.059 5.949 C 14.595 5.207 13.702 4.853 12.855 5.075 L 11.035 5.439 L 9.910 3.885 C 9.457 3.212 8.642 2.879 7.847 3.043 C 7.052 3.207 6.435 3.835 6.285 4.633 L 6.141 6.550 L 4.416 6.976 C 3.611 7.222 3.046 7.947 3.004 8.787 C 2.961 9.628 3.450 10.406 4.226 10.732 L 4.883 11.002"),
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
        pathData = parseSvgPathData("M 18.822 10.995 L 21.082 5.615 C 21.186 5.367 21.186 5.087 21.081 4.839 C 20.976 4.591 20.776 4.395 20.525 4.297 L 16.954 2.900 C 16.453 2.704 15.887 2.940 15.673 3.433 L 14.749 5.555"),
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
        pathData = parseSvgPathData("M 4.000 12.006 C 3.998 11.741 4.102 11.486 4.289 11.297 C 4.475 11.108 4.729 11.002 4.994 11.000 L 19.000 11.000 C 19.552 11.000 20.000 11.448 20.000 12.000 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 L 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 Z"),
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
        return _toolCase!!
    }

private var _toolCase: ImageVector? = null
