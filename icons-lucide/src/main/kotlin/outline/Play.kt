package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = lucideOutlineIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 5.000 C 5.000 4.284 5.383 3.622 6.004 3.265 C 6.625 2.908 7.389 2.911 8.008 3.272 L 20.005 10.270 C 20.621 10.628 21.001 11.286 21.001 11.998 C 21.002 12.710 20.624 13.369 20.008 13.728 L 8.008 20.728 C 7.389 21.089 6.625 21.092 6.004 20.735 C 5.383 20.378 5.000 19.716 5.000 19.000 Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
