package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Chat2Fill: ImageVector
    get() {
        if (_chat2Fill != null) return _chat2Fill!!
        _chat2Fill = remixIcon(
            name = "Chat2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.45 19 12 22.5 9.55 19h-6.55C2.448 19 2 18.552 2 18v-14C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-6.55Z"),
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
        return _chat2Fill!!
    }

private var _chat2Fill: ImageVector? = null
