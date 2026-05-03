package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandVerticalSFill: ImageVector
    get() {
        if (_expandVerticalSFill != null) return _expandVerticalSFill!!
        _expandVerticalSFill = remixIcon(
            name = "ExpandVerticalSFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.949 7.449 L 12.000 2.500 L 7.052 7.447 L 11.000 7.448 L 11.000 16.550 L 7.050 16.550 L 12.000 21.500 L 16.950 16.550 L 13.000 16.550 L 13.000 7.448 L 16.949 7.449 Z"),
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
        return _expandVerticalSFill!!
    }

private var _expandVerticalSFill: ImageVector? = null
