package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorLightIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 250.820 90.710 L 130.820 26.710 C 129.060 25.761 126.940 25.761 125.180 26.710 L 5.180 90.710 C 3.229 91.754 2.011 93.787 2.011 96.000 C 2.011 98.213 3.229 100.246 5.180 101.290 L 34.000 116.670 L 34.000 166.290 C 33.999 169.727 35.263 173.044 37.550 175.610 C 50.420 189.940 79.290 214.000 128.000 214.000 C 145.152 214.161 162.160 210.851 178.000 204.270 L 178.000 240.000 C 178.000 243.314 180.686 246.000 184.000 246.000 C 187.314 246.000 190.000 243.314 190.000 240.000 L 190.000 198.350 C 200.649 192.353 210.257 184.670 218.450 175.600 C 220.742 173.041 222.007 169.725 222.000 166.290 L 222.000 116.670 L 250.820 101.290 C 252.771 100.246 253.989 98.213 253.989 96.000 C 253.989 93.787 252.771 91.754 250.820 90.710 ZM 128.000 202.000 C 84.000 202.000 58.000 180.440 46.480 167.590 C 46.170 167.228 46.000 166.767 46.000 166.290 L 46.000 123.070 L 125.180 165.290 C 126.943 166.229 129.057 166.229 130.820 165.290 L 178.000 140.130 L 178.000 191.130 C 165.000 197.350 148.450 202.000 128.000 202.000 ZM 210.000 166.290 C 210.000 166.767 209.830 167.228 209.520 167.590 C 203.757 173.974 197.197 179.590 190.000 184.300 L 190.000 133.730 L 210.000 123.070 ZM 187.850 121.290 C 187.541 121.021 187.206 120.783 186.850 120.580 L 130.850 90.720 C 127.951 89.328 124.470 90.468 122.958 93.306 C 121.445 96.144 122.438 99.669 125.210 101.300 L 175.250 128.000 L 128.000 153.200 L 20.750 96.000 L 128.000 38.800 L 235.250 96.000 Z"),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
