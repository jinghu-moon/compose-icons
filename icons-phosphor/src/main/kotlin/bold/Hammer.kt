package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorBoldIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 250.180 105.170 L 186.710 41.250 C 147.631 2.252 84.359 2.252 45.280 41.250 L 45.150 41.390 L 31.370 55.610 C 26.758 60.371 26.879 67.968 31.640 72.580 C 36.401 77.192 43.998 77.071 48.610 72.310 L 62.320 58.160 C 66.859 53.623 71.956 49.681 77.490 46.430 L 119.000 88.000 L 25.850 181.160 C 22.098 184.911 19.989 189.999 19.989 195.305 C 19.989 200.611 22.098 205.699 25.850 209.450 L 46.540 230.140 C 54.350 237.948 67.010 237.948 74.820 230.140 L 168.000 137.000 L 169.510 138.510 L 169.510 138.510 L 193.160 162.170 C 196.911 165.922 201.999 168.031 207.305 168.031 C 212.611 168.031 217.699 165.922 221.450 162.170 L 250.140 133.470 C 253.901 129.724 256.018 124.636 256.026 119.328 C 256.033 114.020 253.930 108.927 250.180 105.170 ZM 60.680 210.340 L 45.680 195.340 L 108.000 133.000 L 123.000 148.000 ZM 140.000 131.000 L 125.000 116.000 L 144.510 96.490 C 146.769 94.238 148.039 91.180 148.039 87.990 C 148.039 84.800 146.769 81.742 144.510 79.490 L 102.240 37.240 C 126.807 32.700 152.035 40.534 169.710 58.190 L 201.150 89.860 L 178.000 113.000 L 176.490 111.490 C 174.238 109.231 171.180 107.961 167.990 107.961 C 164.800 107.961 161.742 109.231 159.490 111.490 ZM 207.320 142.310 L 195.000 130.000 L 218.090 106.910 L 230.390 119.300 Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
