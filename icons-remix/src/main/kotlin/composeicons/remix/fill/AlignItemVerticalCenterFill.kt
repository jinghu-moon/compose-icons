package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlignItemVerticalCenterFill: ImageVector
    get() {
        if (_alignItemVerticalCenterFill != null) return _alignItemVerticalCenterFill!!
        _alignItemVerticalCenterFill = remixIcon(
            name = "AlignItemVerticalCenterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 19c0 .552 .448 1 1 1h5c.552 0 1-.448 1-1v-6h2v4c0 .552 .448 1 1 1h5c.552 0 1-.448 1-1v-4h2v-2h-2v-4C20 6.448 19.552 6 19 6h-5c-.552 0-1 .448-1 1v4h-2v-6C11 4.448 10.552 4 10 4h-5C4.448 4 4 4.448 4 5v6h-2v2h2v6Z"),
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
        return _alignItemVerticalCenterFill!!
    }

private var _alignItemVerticalCenterFill: ImageVector? = null
