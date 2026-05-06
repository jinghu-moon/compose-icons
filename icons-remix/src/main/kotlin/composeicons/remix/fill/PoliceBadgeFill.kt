package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PoliceBadgeFill: ImageVector
    get() {
        if (_policeBadgeFill != null) return _policeBadgeFill!!
        _policeBadgeFill = remixIcon(
            name = "PoliceBadgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.913 11.674C3.236 10.195 3.539 8.808 2 6.5l3.5-4C5.5 2.5 9 4 12 1.5c3 2.5 6.5 1 6.5 1l3.5 4c-1.539 2.308-1.236 3.695-.913 5.174 .306 1.404 .631 2.891-.587 5.326-1.157 2.315-3.152 3.123-5.015 3.877-1.356 .549-2.642 1.07-3.485 2.123C11.158 21.947 9.872 21.426 8.515 20.877 6.652 20.123 4.658 19.315 3.5 17 2.282 14.564 2.607 13.078 2.913 11.674ZM14.378 12.773l2.378-2.318L13.469 9.977 12 7 10.53 9.977l-3.286 .477 2.378 2.318-.561 3.273 2.939-1.545 2.939 1.545-.561-3.273Z"),
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
        return _policeBadgeFill!!
    }

private var _policeBadgeFill: ImageVector? = null
