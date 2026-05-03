package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorLightIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 162.000 L 48.000 162.000 C 44.686 162.000 42.000 164.686 42.000 168.000 L 42.000 180.000 C 42.000 198.778 57.222 214.000 76.000 214.000 C 94.778 214.000 110.000 198.778 110.000 180.000 L 110.000 168.000 C 110.000 164.686 107.314 162.000 104.000 162.000 ZM 98.000 180.000 C 98.000 192.150 88.150 202.000 76.000 202.000 C 63.850 202.000 54.000 192.150 54.000 180.000 L 54.000 174.000 L 98.000 174.000 ZM 76.000 18.000 C 65.200 18.000 54.560 27.910 46.000 45.900 C 32.340 74.720 27.710 117.430 46.000 139.800 C 47.141 141.194 48.848 142.002 50.650 142.000 L 101.180 142.000 C 102.982 142.002 104.689 141.194 105.830 139.800 C 124.150 117.430 119.520 74.720 105.830 45.900 C 97.410 27.910 86.770 18.000 76.000 18.000 ZM 98.230 130.000 L 53.740 130.000 C 43.650 114.820 42.050 82.350 56.880 51.000 C 64.240 35.510 71.770 30.000 76.000 30.000 C 80.230 30.000 87.750 35.510 95.100 51.000 C 109.920 82.350 108.320 114.820 98.230 130.000 ZM 208.000 186.000 L 152.000 186.000 C 148.686 186.000 146.000 188.686 146.000 192.000 L 146.000 204.000 C 146.000 222.778 161.222 238.000 180.000 238.000 C 198.778 238.000 214.000 222.778 214.000 204.000 L 214.000 192.000 C 214.000 188.686 211.314 186.000 208.000 186.000 ZM 202.000 204.000 C 202.000 216.150 192.150 226.000 180.000 226.000 C 167.850 226.000 158.000 216.150 158.000 204.000 L 158.000 198.000 L 202.000 198.000 ZM 154.730 166.000 L 205.260 166.000 C 207.062 166.002 208.769 165.194 209.910 163.800 C 228.230 141.430 223.600 98.720 209.910 69.900 C 201.440 51.910 190.800 42.000 180.000 42.000 C 169.200 42.000 158.570 51.910 150.000 69.900 C 136.340 98.720 131.710 141.430 150.000 163.800 C 151.163 165.222 152.913 166.032 154.750 166.000 ZM 160.900 75.000 C 168.250 59.470 175.780 54.000 180.000 54.000 C 184.220 54.000 191.740 59.510 199.100 75.000 C 213.930 106.310 212.330 138.780 202.240 154.000 L 157.770 154.000 C 147.680 138.820 146.080 106.350 160.920 75.000 Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
