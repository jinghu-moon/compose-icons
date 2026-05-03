package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = lucideOutlineIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 18.338 C 11.656 18.337 11.317 18.421 11.013 18.582 L 6.396 21.010 C 6.217 21.105 6.000 21.089 5.836 20.970 C 5.673 20.851 5.591 20.649 5.626 20.450 L 6.507 15.311 C 6.625 14.622 6.397 13.919 5.896 13.432 L 2.160 9.795 C 2.014 9.654 1.962 9.443 2.024 9.250 C 2.087 9.058 2.253 8.917 2.454 8.889 L 7.619 8.134 C 8.310 8.034 8.907 7.600 9.216 6.974 L 11.525 2.295 C 11.614 2.114 11.798 2.000 12.000 2.000"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
