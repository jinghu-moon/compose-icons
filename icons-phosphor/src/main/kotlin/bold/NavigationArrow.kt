package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorBoldIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.700 102.460 L 62.810 37.210 L 62.560 37.120 C 55.324 34.616 47.293 36.464 41.879 41.879 C 36.464 47.293 34.616 55.324 37.120 62.560 L 37.210 62.810 L 102.460 238.700 C 105.294 246.672 112.839 251.998 121.300 252.000 L 121.650 252.000 C 130.303 251.850 137.877 246.152 140.420 237.880 L 140.510 237.590 L 161.740 161.740 L 237.590 140.510 L 237.880 140.420 C 246.151 137.904 251.869 130.360 252.055 121.717 C 252.242 113.074 246.854 105.290 238.700 102.420 ZM 148.770 140.460 C 144.734 141.590 141.580 144.744 140.450 148.780 L 120.770 219.070 L 62.800 62.800 L 219.060 120.800 Z"),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
