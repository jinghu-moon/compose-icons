package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EnterFullScreen: ImageVector
    get() {
        if (_enterFullScreen != null) return _enterFullScreen!!
        _enterFullScreen = radixIcon(
            name = "EnterFullScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 9C2.776 9 3 9.224 3 9.5v2.5h2.5c.276 0 .5 .224 .5 .5C6 12.776 5.776 13 5.5 13h-3C2.224 13 2 12.776 2 12.5v-3C2 9.224 2.224 9 2.5 9ZM12.5 9c.276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5h-3C9.224 13 9 12.776 9 12.5 9 12.224 9.224 12 9.5 12h2.5v-2.5C12 9.224 12.224 9 12.5 9ZM5.5 2C5.776 2 6 2.224 6 2.5 6 2.776 5.776 3 5.5 3h-2.5v2.5C3 5.776 2.776 6 2.5 6 2.224 6 2 5.776 2 5.5v-3l.01-.101C2.056 2.171 2.258 2 2.5 2h3ZM12.601 2.01c.228 .047 .399 .249 .399 .49v3C13 5.776 12.776 6 12.5 6 12.224 6 12 5.776 12 5.5v-2.5h-2.5C9.224 3 9 2.776 9 2.5 9 2.224 9.224 2 9.5 2h3l.101 .01Z"),
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
        return _enterFullScreen!!
    }

private var _enterFullScreen: ImageVector? = null
