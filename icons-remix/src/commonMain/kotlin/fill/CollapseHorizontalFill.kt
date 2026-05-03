package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollapseHorizontalFill: ImageVector
    get() {
        if (_collapseHorizontalFill != null) return _collapseHorizontalFill!!
        _collapseHorizontalFill = remixIcon(
            name = "CollapseHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.500 12.000 L 18.450 7.050 L 18.449 11.000 L 23.000 11.000 L 23.000 13.000 L 18.448 13.000 L 18.447 16.947 L 13.500 12.000 ZM 1.000 13.000 L 5.550 13.000 L 5.550 16.949 L 10.500 12.000 L 5.550 7.050 L 5.550 11.000 L 1.000 11.000 L 1.000 13.000 Z"),
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
        return _collapseHorizontalFill!!
    }

private var _collapseHorizontalFill: ImageVector? = null
