package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Layout4Fill: ImageVector
    get() {
        if (_layout4Fill != null) return _layout4Fill!!
        _layout4Fill = remixIcon(
            name = "Layout4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 13v8h-7C3.448 21 3 20.552 3 20v-7h8ZM13 3h7c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-7v-18ZM3 4C3 3.448 3.448 3 4 3h7v8h-8v-7Z"),
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
        return _layout4Fill!!
    }

private var _layout4Fill: ImageVector? = null
