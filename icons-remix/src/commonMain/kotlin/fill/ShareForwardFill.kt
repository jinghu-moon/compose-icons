package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShareForwardFill: ImageVector
    get() {
        if (_shareForwardFill != null) return _shareForwardFill!!
        _shareForwardFill = remixIcon(
            name = "ShareForwardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 14.000 L 11.000 14.000 C 7.542 14.000 4.540 15.950 3.032 18.811 C 3.011 18.543 3.000 18.273 3.000 18.000 C 3.000 12.477 7.477 8.000 13.000 8.000 L 13.000 3.000 L 23.000 11.000 L 13.000 19.000 L 13.000 14.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shareForwardFill!!
    }

private var _shareForwardFill: ImageVector? = null
