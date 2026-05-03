package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandHeightFill: ImageVector
    get() {
        if (_expandHeightFill != null) return _expandHeightFill!!
        _expandHeightFill = remixIcon(
            name = "ExpandHeightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 2.000 L 6.000 2.000 L 6.000 4.000 L 18.000 4.000 L 18.000 2.000 ZM 16.950 9.450 L 12.000 4.500 L 7.053 9.447 L 11.000 9.448 L 11.000 14.550 L 7.051 14.550 L 12.000 19.500 L 16.950 14.550 L 13.000 14.550 L 13.000 9.449 L 16.950 9.450 ZM 18.000 20.000 L 18.000 22.000 L 6.000 22.000 L 6.000 20.000 L 18.000 20.000 Z"),
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
        return _expandHeightFill!!
    }

private var _expandHeightFill: ImageVector? = null
