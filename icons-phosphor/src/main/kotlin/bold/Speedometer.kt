package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorBoldIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 119.510 143.510 L 207.510 55.510 C 212.204 50.816 219.816 50.816 224.510 55.510 C 229.204 60.204 229.204 67.816 224.510 72.510 L 136.510 160.510 C 131.816 165.204 124.204 165.204 119.510 160.510 C 114.816 155.816 114.816 148.204 119.510 143.510 ZM 133.740 100.310 C 138.056 100.886 142.345 99.080 144.948 95.589 C 147.550 92.099 148.059 87.473 146.276 83.501 C 144.492 79.529 140.698 76.834 136.360 76.460 C 133.584 76.151 130.793 75.998 128.000 76.000 C 86.045 76.044 52.044 110.045 52.000 152.000 C 52.000 158.627 57.373 164.000 64.000 164.000 C 70.627 164.000 76.000 158.627 76.000 152.000 C 76.033 123.295 99.295 100.033 128.000 100.000 C 129.917 100.003 131.833 100.106 133.740 100.310 ZM 235.280 107.810 C 232.742 101.682 225.718 98.772 219.590 101.310 C 213.462 103.848 210.552 110.872 213.090 117.000 C 221.304 137.049 222.217 159.346 215.670 180.000 L 40.340 180.000 C 31.507 152.024 36.509 121.515 53.815 97.825 C 71.120 74.136 98.663 60.092 128.000 60.000 L 128.840 60.000 C 140.578 60.087 152.189 62.433 163.040 66.910 C 169.148 69.351 176.083 66.419 178.588 60.337 C 181.094 54.255 178.235 47.289 172.180 44.720 C 129.877 27.339 81.311 36.420 48.146 67.912 C 14.981 99.403 3.401 147.435 18.570 190.580 C 21.393 198.600 28.958 203.974 37.460 204.000 L 218.530 204.000 C 227.021 203.985 234.583 198.626 237.410 190.620 C 246.879 163.689 246.121 134.218 235.280 107.810 Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
