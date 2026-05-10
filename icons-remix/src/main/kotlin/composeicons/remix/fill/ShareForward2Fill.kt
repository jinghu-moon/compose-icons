package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShareForward2Fill: ImageVector
    get() {
        if (_shareForward2Fill != null) return _shareForward2Fill!!
        _shareForward2Fill = remixIcon(
            name = "ShareForward2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 19h16v-5h2v6c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-6h2v5ZM12 10h-3c-1.996 0-3.764 .974-4.854 2.473C4.858 8.785 8.104 6 12 6v-4l8 6-8 6v-4Z"),
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
        return _shareForward2Fill!!
    }

private var _shareForward2Fill: ImageVector? = null
