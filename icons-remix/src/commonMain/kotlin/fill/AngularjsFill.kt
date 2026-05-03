package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AngularjsFill: ImageVector
    get() {
        if (_angularjsFill != null) return _angularjsFill!!
        _angularjsFill = remixIcon(
            name = "AngularjsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 21.300 5.320 L 19.882 17.630 L 12.000 22.000 L 4.119 17.630 L 2.700 5.320 L 12.000 2.000 ZM 12.000 4.210 L 6.186 17.260 L 8.354 17.260 L 9.523 14.340 L 14.458 14.340 L 15.626 17.260 L 17.794 17.260 L 12.000 4.210 ZM 13.698 12.540 L 10.302 12.540 L 12.000 8.450 L 13.698 12.540 Z"),
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
        return _angularjsFill!!
    }

private var _angularjsFill: ImageVector? = null
