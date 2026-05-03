package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollapseVerticalFill: ImageVector
    get() {
        if (_collapseVerticalFill != null) return _collapseVerticalFill!!
        _collapseVerticalFill = remixIcon(
            name = "CollapseVerticalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 13.500 L 16.949 18.449 L 13.000 18.448 L 13.000 23.000 L 11.000 23.000 L 11.000 18.448 L 7.052 18.447 L 12.000 13.500 ZM 11.000 1.000 L 11.000 5.550 L 7.050 5.550 L 12.000 10.500 L 16.950 5.550 L 13.000 5.550 L 13.000 1.000 L 11.000 1.000 Z"),
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
        return _collapseVerticalFill!!
    }

private var _collapseVerticalFill: ImageVector? = null
