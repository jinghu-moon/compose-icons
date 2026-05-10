package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlignItemTopFill: ImageVector
    get() {
        if (_alignItemTopFill != null) return _alignItemTopFill!!
        _alignItemTopFill = remixIcon(
            name = "AlignItemTopFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3h-18v2h18v-2ZM14 7c-.552 0-1 .448-1 1v8c0 .552 .448 1 1 1h5c.552 0 1-.448 1-1v-8C20 7.448 19.552 7 19 7h-5ZM4 8C4 7.448 4.448 7 5 7h5c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-5C4.448 21 4 20.552 4 20v-12Z"),
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
        return _alignItemTopFill!!
    }

private var _alignItemTopFill: ImageVector? = null
