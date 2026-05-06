package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Chat3Fill: ImageVector
    get() {
        if (_chat3Fill != null) return _chat3Fill!!
        _chat3Fill = remixIcon(
            name = "Chat3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.291 20.824 2 22 3.176 16.709C2.425 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C10.297 22 8.694 21.575 7.291 20.824Z"),
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
        return _chat3Fill!!
    }

private var _chat3Fill: ImageVector? = null
