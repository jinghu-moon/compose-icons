package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorLightIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.430 112.480 L 206.000 107.680 L 206.000 56.000 C 206.000 48.268 199.732 42.000 192.000 42.000 L 134.000 42.000 L 134.000 24.000 C 134.000 20.686 131.314 18.000 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 42.000 L 64.000 42.000 C 56.268 42.000 50.000 48.268 50.000 56.000 L 50.000 107.680 L 35.570 112.480 C 29.851 114.388 25.996 119.742 26.000 125.770 L 26.000 152.000 C 26.000 212.000 122.440 236.790 126.540 237.820 C 127.498 238.060 128.502 238.060 129.460 237.820 C 146.611 233.191 163.183 226.636 178.860 218.280 C 212.320 200.150 230.000 177.240 230.000 152.000 L 230.000 125.770 C 230.004 119.742 226.149 114.388 220.430 112.480 ZM 62.000 56.000 C 62.000 54.895 62.895 54.000 64.000 54.000 L 192.000 54.000 C 193.105 54.000 194.000 54.895 194.000 56.000 L 194.000 103.680 L 129.900 82.310 C 128.667 81.898 127.333 81.898 126.100 82.310 L 62.000 103.680 ZM 218.000 152.000 C 218.000 199.100 139.720 222.540 128.000 225.790 C 116.270 222.540 38.000 199.100 38.000 152.000 L 38.000 125.770 C 37.999 124.908 38.551 124.142 39.370 123.870 L 122.000 96.320 L 122.000 168.000 C 122.000 171.314 124.686 174.000 128.000 174.000 C 131.314 174.000 134.000 171.314 134.000 168.000 L 134.000 96.320 L 216.630 123.870 C 217.449 124.142 218.001 124.908 218.000 125.770 Z"),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
