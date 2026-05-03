package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Chat1Fill: ImageVector
    get() {
        if (_chat1Fill != null) return _chat1Fill!!
        _chat1Fill = remixIcon(
            name = "Chat1Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 3.000 L 14.000 3.000 C 18.418 3.000 22.000 6.582 22.000 11.000 C 22.000 15.418 18.418 19.000 14.000 19.000 L 14.000 22.500 C 9.000 20.500 2.000 17.500 2.000 11.000 C 2.000 6.582 5.582 3.000 10.000 3.000 Z"),
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
        return _chat1Fill!!
    }

private var _chat1Fill: ImageVector? = null
