package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Badge: ImageVector
    get() {
        if (_badge != null) return _badge!!
        _badge = lucideOutlineIcon(
            name = "Badge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.850 8.620 C 3.553 7.284 3.961 5.889 4.929 4.922 C 5.898 3.955 7.294 3.551 8.630 3.850 C 9.365 2.700 10.635 2.005 12.000 2.005 C 13.365 2.005 14.635 2.700 15.370 3.850 C 16.708 3.549 18.106 3.955 19.076 4.924 C 20.045 5.894 20.451 7.292 20.150 8.630 C 21.300 9.365 21.995 10.635 21.995 12.000 C 21.995 13.365 21.300 14.635 20.150 15.370 C 20.449 16.706 20.045 18.102 19.078 19.071 C 18.111 20.039 16.716 20.447 15.380 20.150 C 14.646 21.304 13.373 22.003 12.005 22.003 C 10.637 22.003 9.364 21.304 8.630 20.150 C 7.294 20.449 5.898 20.045 4.929 19.078 C 3.961 18.111 3.553 16.716 3.850 15.380 C 2.691 14.647 1.989 13.371 1.989 12.000 C 1.989 10.629 2.691 9.353 3.850 8.620 Z"),
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
        return _badge!!
    }

private var _badge: ImageVector? = null
