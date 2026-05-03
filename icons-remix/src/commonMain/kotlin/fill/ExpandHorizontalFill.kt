package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandHorizontalFill: ImageVector
    get() {
        if (_expandHorizontalFill != null) return _expandHorizontalFill!!
        _expandHorizontalFill = remixIcon(
            name = "ExpandHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 0.500 12.000 L 5.450 7.050 L 5.449 11.000 L 10.000 11.000 L 10.000 13.000 L 5.448 13.000 L 5.447 16.947 L 0.500 12.000 ZM 14.000 13.000 L 18.550 13.000 L 18.550 16.949 L 23.500 12.000 L 18.550 7.050 L 18.550 11.000 L 14.000 11.000 L 14.000 13.000 Z"),
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
        return _expandHorizontalFill!!
    }

private var _expandHorizontalFill: ImageVector? = null
