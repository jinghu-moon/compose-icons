package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Volume: ImageVector
    get() {
        if (_volume != null) return _volume!!
        _volume = lucideOutlineIcon(
            name = "Volume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 4.702c-0-.285-.172-.541-.435-.65-.263-.109-.566-.049-.768 .152L6.413 7.587C6.149 7.852 5.79 8.001 5.416 8h-2.416C2.448 8 2 8.448 2 9v6c0 .552 .448 1 1 1h2.416c.374-.001 .733 .148 .997 .413l3.383 3.384c.202 .202 .505 .263 .769 .153 .264-.109 .435-.367 .435-.652Z"),
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
        return _volume!!
    }

private var _volume: ImageVector? = null
