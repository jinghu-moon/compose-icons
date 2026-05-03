package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorFillIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 121.580 C 247.950 128.521 243.366 134.612 236.710 136.580 L 236.510 136.640 L 158.510 158.480 L 136.670 236.480 L 136.610 236.680 C 134.639 243.334 128.549 247.917 121.610 247.970 L 121.310 247.970 C 114.512 248.033 108.438 243.733 106.240 237.300 L 41.000 61.410 C 40.979 61.358 40.962 61.305 40.950 61.250 C 38.961 55.473 40.436 49.067 44.751 44.741 C 49.066 40.416 55.468 38.925 61.250 40.900 L 61.410 40.950 L 237.330 106.210 C 243.868 108.445 248.192 114.673 248.000 121.580 Z"),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
