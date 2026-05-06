package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorFillIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 127.89c.015 5.805-3.116 11.163-8.18 14L63.9 237.9C61.49 239.266 58.77 239.989 56 240c-5.178-.028-10.023-2.56-13.002-6.796C40.019 228.968 39.275 223.553 41 218.67L68 138.72c.541-1.602 2.03-2.69 3.72-2.72h72.28c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.376-4.267-3.977-7.523-8.26-7.47h-72c-1.716 0-3.241-1.094-3.79-2.72L40.95 37.34C38.75 31.067 40.658 24.086 45.744 19.804c5.086-4.282 12.289-4.972 18.096-1.734l168 95.89c5.035 2.83 8.154 8.154 8.16 13.93Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
