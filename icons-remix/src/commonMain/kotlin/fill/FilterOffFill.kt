package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FilterOffFill: ImageVector
    get() {
        if (_filterOffFill != null) return _filterOffFill!!
        _filterOffFill = remixIcon(
            name = "FilterOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.929 0.515 L 21.071 14.657 L 19.657 16.071 L 15.834 12.249 L 14.000 15.000 L 14.000 22.000 L 10.000 22.000 L 10.000 15.000 L 4.000 6.000 L 3.000 6.000 L 3.000 4.000 L 7.585 4.000 L 5.515 1.929 L 6.929 0.515 ZM 21.000 4.000 L 21.000 6.000 L 20.000 6.000 L 18.085 8.872 L 13.213 4.000 L 21.000 4.000 Z"),
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
        return _filterOffFill!!
    }

private var _filterOffFill: ImageVector? = null
