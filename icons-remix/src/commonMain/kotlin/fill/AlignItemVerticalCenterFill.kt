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
                pathData = parseSvgPathData("M 4.000 19.000 C 4.000 19.552 4.448 20.000 5.000 20.000 L 10.000 20.000 C 10.552 20.000 11.000 19.552 11.000 19.000 L 11.000 13.000 L 13.000 13.000 L 13.000 17.000 C 13.000 17.552 13.448 18.000 14.000 18.000 L 19.000 18.000 C 19.552 18.000 20.000 17.552 20.000 17.000 L 20.000 13.000 L 22.000 13.000 L 22.000 11.000 L 20.000 11.000 L 20.000 7.000 C 20.000 6.448 19.552 6.000 19.000 6.000 L 14.000 6.000 C 13.448 6.000 13.000 6.448 13.000 7.000 L 13.000 11.000 L 11.000 11.000 L 11.000 5.000 C 11.000 4.448 10.552 4.000 10.000 4.000 L 5.000 4.000 C 4.448 4.000 4.000 4.448 4.000 5.000 L 4.000 11.000 L 2.000 11.000 L 2.000 13.000 L 4.000 13.000 L 4.000 19.000 Z"),
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
