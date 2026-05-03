package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorThinIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 110.000 L 59.930 44.670 C 55.576 43.164 50.745 44.284 47.497 47.551 C 44.250 50.818 43.159 55.655 44.690 60.000 L 110.000 235.930 C 111.623 240.773 116.172 244.027 121.280 244.000 L 121.500 244.000 C 126.710 243.967 131.284 240.526 132.760 235.530 L 132.760 235.430 L 155.210 155.240 L 235.400 132.800 L 235.500 132.800 C 240.463 131.292 243.896 126.767 244.009 121.581 C 244.123 116.395 240.892 111.724 236.000 110.000 ZM 233.210 125.120 L 150.910 148.120 C 149.563 148.494 148.509 149.544 148.130 150.890 L 125.130 233.190 C 124.641 234.845 123.116 235.979 121.390 235.970 C 119.628 236.002 118.052 234.877 117.510 233.200 L 52.220 57.320 C 51.712 55.863 52.103 54.244 53.220 53.180 C 53.957 52.439 54.955 52.015 56.000 52.000 C 56.425 52.001 56.848 52.072 57.250 52.210 L 233.330 117.530 C 234.958 118.093 236.042 119.635 236.021 121.357 C 236.001 123.080 234.881 124.595 233.240 125.120 Z"),
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
