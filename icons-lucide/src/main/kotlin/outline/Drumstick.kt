package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Drumstick: ImageVector
    get() {
        if (_drumstick != null) return _drumstick!!
        _drumstick = lucideOutlineIcon(
            name = "Drumstick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.400 15.630 C 12.327 16.616 9.500 15.582 8.432 13.082 C 7.365 10.583 8.308 7.204 10.756 4.756 C 13.204 2.308 16.583 1.365 19.082 2.432 C 21.582 3.500 22.616 6.327 21.630 9.400 C 20.198 8.583 18.092 9.078 16.585 10.585 C 15.078 12.092 14.583 14.198 15.400 15.630"),
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
                pathData = parseSvgPathData("M 8.290 12.710 L 5.690 15.310 C 4.822 14.832 3.754 14.911 2.967 15.513 C 2.179 16.114 1.821 17.123 2.053 18.086 C 2.286 19.049 3.065 19.784 4.040 19.960 C 4.231 20.922 4.967 21.683 5.922 21.907 C 6.877 22.130 7.874 21.775 8.473 20.998 C 9.071 20.221 9.160 19.166 8.700 18.300 L 11.290 15.710"),
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
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
