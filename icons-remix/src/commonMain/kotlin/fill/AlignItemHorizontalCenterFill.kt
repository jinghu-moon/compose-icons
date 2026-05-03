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
                pathData = parseSvgPathData("M 11.000 4.000 L 11.000 2.000 L 13.000 2.000 L 13.000 4.000 L 19.000 4.000 C 19.552 4.000 20.000 4.448 20.000 5.000 L 20.000 10.000 C 20.000 10.552 19.552 11.000 19.000 11.000 L 13.000 11.000 L 13.000 13.000 L 17.000 13.000 C 17.552 13.000 18.000 13.448 18.000 14.000 L 18.000 19.000 C 18.000 19.552 17.552 20.000 17.000 20.000 L 13.000 20.000 L 13.000 22.000 L 11.000 22.000 L 11.000 20.000 L 7.000 20.000 C 6.448 20.000 6.000 19.552 6.000 19.000 L 6.000 14.000 C 6.000 13.448 6.448 13.000 7.000 13.000 L 11.000 13.000 L 11.000 11.000 L 5.000 11.000 C 4.448 11.000 4.000 10.552 4.000 10.000 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000 L 11.000 4.000 Z"),
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
