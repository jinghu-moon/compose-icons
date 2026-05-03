package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorRegularIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.330 106.210 L 61.410 41.000 L 61.250 40.950 C 55.473 38.961 49.067 40.436 44.741 44.751 C 40.416 49.066 38.925 55.468 40.900 61.250 C 40.912 61.305 40.929 61.358 40.950 61.410 L 106.210 237.330 C 108.408 243.763 114.482 248.063 121.280 248.000 L 121.580 248.000 C 128.519 247.947 134.609 243.364 136.580 236.710 L 136.640 236.510 L 158.480 158.510 L 236.480 136.670 L 236.680 136.610 C 243.278 134.580 247.830 128.546 247.971 121.644 C 248.112 114.742 243.810 108.528 237.300 106.230 ZM 149.840 144.300 C 147.154 145.054 145.054 147.154 144.300 149.840 L 121.300 232.000 L 121.240 231.830 L 56.000 56.000 L 231.820 121.220 L 231.980 121.280 Z"),
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
