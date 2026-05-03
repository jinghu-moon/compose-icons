package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = lucideOutlineIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.525 2.295 C 11.614 2.114 11.798 2.000 12.000 2.000 C 12.202 2.000 12.386 2.114 12.475 2.295 L 14.785 6.974 C 15.094 7.599 15.690 8.033 16.380 8.134 L 21.546 8.890 C 21.746 8.919 21.912 9.059 21.974 9.251 C 22.036 9.442 21.984 9.653 21.840 9.794 L 18.104 13.432 C 17.604 13.919 17.375 14.622 17.493 15.310 L 18.375 20.450 C 18.410 20.650 18.329 20.852 18.165 20.971 C 18.001 21.090 17.783 21.105 17.604 21.010 L 12.986 18.582 C 12.368 18.258 11.631 18.258 11.013 18.582 L 6.396 21.010 C 6.217 21.105 6.000 21.089 5.836 20.970 C 5.673 20.851 5.591 20.649 5.626 20.450 L 6.507 15.311 C 6.625 14.622 6.397 13.920 5.896 13.432 L 2.160 9.795 C 2.014 9.654 1.962 9.443 2.024 9.250 C 2.087 9.058 2.253 8.917 2.454 8.889 L 7.619 8.134 C 8.310 8.034 8.907 7.600 9.216 6.974 Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
