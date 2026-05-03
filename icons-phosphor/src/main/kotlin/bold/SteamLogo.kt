package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorBoldIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 178.160 142.220 C 189.746 132.353 194.729 116.767 191.016 102.008 C 187.304 87.250 175.538 75.877 160.662 72.667 C 145.787 69.457 130.378 74.966 120.910 86.880 L 92.570 123.600 L 55.180 86.210 C 76.961 48.455 124.106 33.788 163.462 52.523 C 202.817 71.257 221.158 117.098 205.587 157.809 C 190.015 198.520 145.764 220.420 103.952 208.109 C 62.140 195.799 36.816 153.413 45.790 110.760 L 78.550 143.520 C 72.844 157.021 77.040 172.673 88.734 181.509 C 100.428 190.345 116.631 190.107 128.060 180.930 ZM 117.000 131.270 C 120.662 137.887 126.113 143.338 132.730 147.000 L 113.300 162.000 L 113.050 162.200 C 111.639 163.354 109.873 163.986 108.050 163.990 C 103.632 163.990 100.050 160.408 100.050 155.990 C 100.043 154.150 100.676 152.365 101.840 150.940 L 102.040 150.690 ZM 152.000 128.000 C 143.163 128.000 136.000 120.837 136.000 112.000 C 136.000 103.163 143.163 96.000 152.000 96.000 C 160.837 96.000 168.000 103.163 168.000 112.000 C 168.000 120.837 160.837 128.000 152.000 128.000 Z"),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
