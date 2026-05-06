package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoubanLine: ImageVector
    get() {
        if (_doubanLine != null) return _doubanLine!!
        _doubanLine = remixIcon(
            name = "DoubanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.274 15h-10.274v-8h14v8h-1.624l-1.3 4h4.923v2h-18v-2h4.612L6.8 16.5l1.902-.618L9.715 19h4.259l1.3-4ZM3.5 3h17v2h-17v-2ZM7 9v4h10v-4h-10Z"),
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
        return _doubanLine!!
    }

private var _doubanLine: ImageVector? = null
