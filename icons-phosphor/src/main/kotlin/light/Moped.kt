package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorLightIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 130.000 C 213.461 129.998 210.928 130.253 208.440 130.760 L 173.620 37.890 C 172.740 35.549 170.501 33.999 168.000 34.000 L 136.000 34.000 C 132.686 34.000 130.000 36.686 130.000 40.000 C 130.000 43.314 132.686 46.000 136.000 46.000 L 163.840 46.000 L 197.210 135.000 C 187.205 140.705 180.319 150.631 178.480 162.000 L 135.160 162.000 L 109.620 93.890 C 108.740 91.549 106.501 89.999 104.000 90.000 L 24.000 90.000 C 20.686 90.000 18.000 92.686 18.000 96.000 C 18.000 99.314 20.686 102.000 24.000 102.000 L 34.000 102.000 L 34.000 118.670 C 14.552 127.380 2.025 146.691 2.000 168.000 C 2.000 171.314 4.686 174.000 8.000 174.000 L 18.480 174.000 C 21.490 192.370 37.365 205.856 55.980 205.856 C 74.595 205.856 90.470 192.370 93.480 174.000 L 178.480 174.000 C 181.671 193.954 199.919 207.920 220.014 205.788 C 240.108 203.655 255.019 186.169 253.950 165.990 C 252.881 145.811 236.207 129.998 216.000 130.000 ZM 42.000 128.390 C 44.398 127.542 46.001 125.274 46.000 122.730 L 46.000 102.000 L 99.840 102.000 L 122.340 162.000 L 14.430 162.000 C 16.671 146.549 27.285 133.609 42.000 128.390 ZM 56.000 194.000 C 43.955 193.996 33.490 185.720 30.710 174.000 L 81.290 174.000 C 78.510 185.720 68.045 193.996 56.000 194.000 ZM 216.000 194.000 C 204.567 193.993 194.480 186.517 191.146 175.581 C 187.813 164.644 192.015 152.814 201.500 146.430 L 210.380 170.110 C 211.545 173.214 215.006 174.785 218.110 173.620 C 221.214 172.455 222.785 168.994 221.620 165.890 L 212.740 142.210 C 213.821 142.074 214.910 142.004 216.000 142.000 C 230.359 142.000 242.000 153.641 242.000 168.000 C 242.000 182.359 230.359 194.000 216.000 194.000 Z"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
