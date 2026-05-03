package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandWidthFill: ImageVector
    get() {
        if (_expandWidthFill != null) return _expandWidthFill!!
        _expandWidthFill = remixIcon(
            name = "ExpandWidthFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 6.000 L 2.000 18.000 L 4.000 18.000 L 4.000 6.000 L 2.000 6.000 ZM 9.450 7.050 L 4.500 12.000 L 9.447 16.947 L 9.448 13.000 L 14.550 13.000 L 14.550 16.949 L 19.500 12.000 L 14.550 7.050 L 14.550 11.000 L 9.449 11.000 L 9.450 7.050 ZM 20.000 6.000 L 22.000 6.000 L 22.000 18.000 L 20.000 18.000 L 20.000 6.000 Z"),
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
        return _expandWidthFill!!
    }

private var _expandWidthFill: ImageVector? = null
