package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExitFullScreen: ImageVector
    get() {
        if (_exitFullScreen != null) return _exitFullScreen!!
        _exitFullScreen = radixIcon(
            name = "ExitFullScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 9C5.776 9 6 9.224 6 9.5v3C6 12.776 5.776 13 5.5 13 5.224 13 5 12.776 5 12.5v-2.5h-2.5C2.224 10 2 9.776 2 9.5 2 9.224 2.224 9 2.5 9h3ZM12.5 9c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-2.5v2.5c0 .276-.224 .5-.5 .5C9.224 13 9 12.776 9 12.5v-3C9 9.224 9.224 9 9.5 9h3ZM5.5 2C5.776 2 6 2.224 6 2.5v3C6 5.776 5.776 6 5.5 6h-3C2.224 6 2 5.776 2 5.5 2 5.224 2.224 5 2.5 5h2.5v-2.5C5 2.224 5.224 2 5.5 2ZM9.5 2c.276 0 .5 .224 .5 .5v2.5h2.5c.276 0 .5 .224 .5 .5C13 5.776 12.776 6 12.5 6h-3C9.224 6 9 5.776 9 5.5v-3C9 2.224 9.224 2 9.5 2Z"),
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
        return _exitFullScreen!!
    }

private var _exitFullScreen: ImageVector? = null
