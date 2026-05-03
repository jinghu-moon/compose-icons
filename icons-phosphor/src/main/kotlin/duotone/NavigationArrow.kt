package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorDuotoneIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 234.350 129.000 L 152.000 152.000 L 129.000 234.350 C 127.985 237.661 124.956 239.944 121.493 240.005 C 118.030 240.067 114.921 237.893 113.790 234.620 L 48.510 58.620 C 47.530 55.740 48.269 52.554 50.416 50.398 C 52.563 48.243 55.746 47.492 58.630 48.460 L 234.630 113.740 C 237.943 114.849 240.152 117.980 240.088 121.473 C 240.024 124.966 237.701 128.013 234.350 129.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 237.330 106.210 L 61.410 41.000 L 61.250 40.950 C 55.473 38.961 49.067 40.436 44.741 44.751 C 40.416 49.066 38.925 55.468 40.900 61.250 C 40.912 61.305 40.929 61.358 40.950 61.410 L 106.210 237.330 C 108.408 243.763 114.482 248.063 121.280 248.000 L 121.580 248.000 C 128.519 247.947 134.609 243.364 136.580 236.710 L 136.640 236.510 L 158.480 158.510 L 236.480 136.670 L 236.680 136.610 C 243.278 134.580 247.830 128.546 247.971 121.644 C 248.112 114.742 243.810 108.528 237.300 106.230 ZM 149.840 144.300 C 147.154 145.054 145.054 147.154 144.300 149.840 L 121.300 232.000 L 121.240 231.830 L 56.000 56.000 L 231.820 121.220 L 231.980 121.280 Z"),
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
