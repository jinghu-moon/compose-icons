package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorLightIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 217.890 123.440 C 186.890 145.810 164.230 138.800 139.960 127.190 C 161.390 112.440 182.230 93.980 181.470 55.650 C 203.146 71.656 216.510 96.531 217.890 123.440 ZM 169.000 47.890 C 172.840 85.890 155.470 102.020 133.290 117.230 C 131.220 91.290 125.670 64.000 92.060 45.500 C 116.767 34.718 145.009 35.595 169.000 47.890 ZM 79.140 52.450 C 114.000 68.150 119.230 91.230 121.320 118.000 C 97.820 106.820 71.400 98.000 38.570 117.830 C 41.643 91.069 56.525 67.085 79.140 52.450 ZM 38.140 132.560 C 69.190 110.190 91.800 117.200 116.070 128.810 C 94.610 143.560 73.770 162.000 74.530 200.350 C 52.854 184.344 39.490 159.469 38.110 132.560 ZM 87.000 208.110 C 83.160 170.110 100.530 153.980 122.710 138.770 C 124.770 164.710 130.320 192.010 163.930 210.500 C 139.225 221.279 110.988 220.401 87.000 208.110 ZM 176.850 203.550 C 142.000 187.850 136.770 164.770 134.680 138.000 C 148.040 144.360 162.350 150.000 178.240 150.000 C 190.300 150.000 203.240 146.770 217.430 138.210 C 214.342 164.955 199.462 188.921 176.860 203.550 Z"),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
