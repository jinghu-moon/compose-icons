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
                pathData = parseSvgPathData("M5 5C5 4.284 5.383 3.622 6.004 3.265c.621-.357 1.386-.354 2.004 .007l11.997 6.998c.616 .358 .996 1.016 .996 1.728 .001 .712-.378 1.371-.993 1.73L8.008 20.728c-.619 .361-1.383 .364-2.004 .007C5.383 20.378 5 19.716 5 19Z"),
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
