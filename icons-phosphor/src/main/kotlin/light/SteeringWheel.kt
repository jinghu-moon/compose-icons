package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorLightIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 46.430 166.000 L 90.430 166.000 C 91.263 166.001 92.008 166.519 92.300 167.300 L 110.630 216.300 C 82.446 210.703 58.608 192.026 46.430 166.000 ZM 145.300 216.320 L 163.670 167.320 C 163.963 166.536 164.713 166.017 165.550 166.020 L 209.550 166.020 C 197.363 192.060 173.504 210.739 145.300 216.320 ZM 214.170 154.000 L 165.550 154.000 C 159.712 154.000 154.487 157.623 152.440 163.090 L 131.890 217.910 C 130.600 217.970 129.300 218.000 128.000 218.000 C 126.700 218.000 125.370 218.000 124.060 217.910 L 103.560 163.100 C 101.502 157.640 96.285 154.019 90.450 154.000 L 41.830 154.000 C 41.180 151.830 40.600 149.630 40.110 147.390 C 63.108 123.501 94.840 110.003 128.000 110.003 C 161.160 110.003 192.892 123.501 215.890 147.390 C 215.400 149.630 214.820 151.830 214.170 154.000 ZM 128.000 98.000 C 94.789 98.043 62.770 110.383 38.120 132.640 C 38.000 131.100 38.000 129.560 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 218.000 129.560 218.000 131.100 217.880 132.640 C 193.230 110.383 161.211 98.043 128.000 98.000 ZM 138.000 140.000 C 138.000 145.523 133.523 150.000 128.000 150.000 C 122.477 150.000 118.000 145.523 118.000 140.000 C 118.000 134.477 122.477 130.000 128.000 130.000 C 133.523 130.000 138.000 134.477 138.000 140.000 Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
