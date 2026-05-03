package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorBoldIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 121.373 20.000 116.000 25.373 116.000 32.000 L 116.000 88.000 C 116.000 94.627 121.373 100.000 128.000 100.000 C 140.672 100.005 151.761 108.520 155.037 120.761 C 158.313 133.002 152.959 145.918 141.984 152.252 C 131.008 158.585 117.147 156.758 108.188 147.797 C 99.228 138.836 97.404 124.974 103.740 114.000 C 105.334 111.243 105.767 107.966 104.943 104.890 C 104.120 101.814 102.108 99.192 99.350 97.600 L 50.850 69.600 C 45.109 66.289 37.771 68.259 34.460 74.000 C 10.020 116.332 17.059 169.801 51.622 204.366 C 86.185 238.930 139.654 245.972 181.987 221.533 C 224.320 197.095 244.961 147.270 232.313 100.054 C 219.664 52.838 176.881 20.004 128.000 20.000 ZM 50.000 96.810 L 78.200 113.090 C 76.748 117.927 76.007 122.950 76.000 128.000 C 76.000 128.500 76.000 129.000 76.000 129.500 L 44.570 137.920 C 44.183 134.628 43.992 131.315 44.000 128.000 C 44.007 117.317 46.043 106.733 50.000 96.810 ZM 50.830 161.110 L 82.260 152.680 C 89.318 165.716 101.585 175.136 116.000 178.590 L 116.000 211.130 C 87.062 206.900 62.387 187.967 50.810 161.110 ZM 140.020 211.110 L 140.020 178.590 C 163.462 173.022 180.009 152.081 180.004 127.987 C 179.999 103.893 163.444 82.958 140.000 77.400 L 140.000 44.850 C 181.333 50.810 212.011 86.229 212.011 127.990 C 212.011 169.751 181.333 205.170 140.000 211.130 Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
