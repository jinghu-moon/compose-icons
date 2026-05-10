package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlignItemHorizontalCenterFill: ImageVector
    get() {
        if (_alignItemHorizontalCenterFill != null) return _alignItemHorizontalCenterFill!!
        _alignItemHorizontalCenterFill = remixIcon(
            name = "AlignItemHorizontalCenterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 4v-2h2v2h6c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-6v2h4c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-4v2h-2v-2h-4C6.448 20 6 19.552 6 19v-5c0-.552 .448-1 1-1h4v-2h-6C4.448 11 4 10.552 4 10v-5C4 4.448 4.448 4 5 4h6Z"),
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
        return _alignItemHorizontalCenterFill!!
    }

private var _alignItemHorizontalCenterFill: ImageVector? = null
