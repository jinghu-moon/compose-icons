package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorLightIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 133.370 85.320 C 132.355 83.284 130.275 81.996 128.000 81.996 C 125.725 81.996 123.645 83.284 122.630 85.320 L 50.630 229.320 C 49.147 232.286 50.349 235.892 53.315 237.375 C 56.281 238.858 59.887 237.656 61.370 234.690 L 75.710 206.000 L 180.290 206.000 L 194.630 234.680 C 195.646 236.715 197.725 238.001 200.000 238.000 C 200.931 238.002 201.850 237.783 202.680 237.360 C 204.105 236.650 205.188 235.402 205.693 233.892 C 206.197 232.383 206.081 230.734 205.370 229.310 ZM 128.000 101.420 L 158.290 162.000 L 97.710 162.000 ZM 81.710 194.000 L 91.710 174.000 L 164.290 174.000 L 174.290 194.000 ZM 161.450 94.100 C 161.819 92.088 162.003 90.046 162.000 88.000 C 162.000 69.222 146.778 54.000 128.000 54.000 C 109.222 54.000 94.000 69.222 94.000 88.000 C 93.997 90.046 94.181 92.088 94.550 94.100 C 95.138 97.361 92.971 100.482 89.710 101.070 C 86.449 101.658 83.328 99.491 82.740 96.230 C 79.450 78.108 87.286 59.770 102.658 49.623 C 118.029 39.475 137.971 39.475 153.342 49.623 C 168.714 59.770 176.550 78.108 173.260 96.230 C 172.748 99.083 170.269 101.162 167.370 101.170 C 167.008 101.171 166.646 101.138 166.290 101.070 C 164.724 100.788 163.334 99.895 162.426 98.587 C 161.519 97.280 161.167 95.666 161.450 94.100 ZM 65.750 135.000 C 45.283 107.891 44.712 70.653 64.339 42.930 C 83.967 15.207 119.279 3.374 151.648 13.672 C 184.017 23.970 206.000 54.032 206.000 88.000 C 206.049 104.970 200.515 121.486 190.250 135.000 C 188.251 137.643 184.488 138.164 181.845 136.165 C 179.202 134.166 178.681 130.403 180.680 127.760 C 189.362 116.327 194.043 102.356 194.000 88.000 C 194.000 51.549 164.451 22.000 128.000 22.000 C 91.549 22.000 62.000 51.549 62.000 88.000 C 61.957 102.356 66.638 116.327 75.320 127.760 C 77.319 130.403 76.798 134.166 74.155 136.165 C 71.512 138.164 67.749 137.643 65.750 135.000 Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
