package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorDuotoneIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 144.000 C 208.000 188.183 172.183 224.000 128.000 224.000 C 83.817 224.000 48.000 188.183 48.000 144.000 C 48.000 72.000 128.000 16.000 128.000 16.000 C 128.000 16.000 208.000 72.000 208.000 144.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 64.720 70.290 C 48.320 95.000 40.000 119.780 40.000 144.000 C 40.002 179.333 61.136 211.238 93.669 225.023 C 126.202 238.807 163.825 231.796 189.210 207.220 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 128.000 216.000 C 88.254 215.956 56.044 183.746 56.000 144.000 C 56.000 124.070 62.680 103.430 75.860 82.540 L 178.430 195.360 C 164.983 208.596 146.868 216.009 128.000 216.000 ZM 90.000 50.510 C 86.802 47.461 86.682 42.398 89.730 39.200 C 100.032 28.284 111.305 18.326 123.410 9.450 C 126.166 7.520 129.834 7.520 132.590 9.450 C 136.000 11.830 216.000 68.700 216.000 144.000 C 216.005 151.906 214.945 159.777 212.850 167.400 C 211.896 170.872 208.740 173.278 205.140 173.280 C 204.417 173.286 203.697 173.192 203.000 173.000 C 198.743 171.827 196.241 167.428 197.410 163.170 C 199.125 156.924 199.996 150.477 200.000 144.000 C 200.000 86.760 144.520 39.000 128.000 26.000 C 118.547 33.431 109.638 41.528 101.340 50.230 C 99.876 51.776 97.857 52.675 95.728 52.727 C 93.600 52.780 91.538 51.982 90.000 50.510 Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
