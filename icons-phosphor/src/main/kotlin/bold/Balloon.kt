package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorBoldIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 12.000 C 77.213 12.055 36.055 53.213 36.000 104.000 C 36.000 128.530 45.550 154.130 62.190 174.220 C 72.190 186.220 83.750 195.290 96.240 200.980 L 85.000 227.270 C 83.412 230.973 83.788 235.226 86.002 238.593 C 88.215 241.959 91.971 243.990 96.000 244.000 L 160.000 244.000 C 164.029 243.990 167.785 241.959 169.998 238.593 C 172.212 235.226 172.588 230.973 171.000 227.270 L 159.760 201.000 C 172.250 195.310 183.840 186.270 193.810 174.240 C 210.450 154.130 220.000 128.530 220.000 104.000 C 219.945 53.213 178.787 12.055 128.000 12.000 ZM 141.800 220.000 L 114.200 220.000 L 119.550 207.510 C 125.164 208.163 130.836 208.163 136.450 207.510 ZM 175.330 158.910 C 161.930 175.090 145.120 184.000 128.000 184.000 C 110.880 184.000 94.070 175.090 80.670 158.910 C 67.730 143.290 60.000 122.760 60.000 104.000 C 60.000 66.445 90.445 36.000 128.000 36.000 C 165.555 36.000 196.000 66.445 196.000 104.000 C 196.000 122.760 188.270 143.290 175.330 158.910 ZM 168.990 111.910 Q 168.390 111.970 167.790 111.970 C 161.628 111.964 156.471 107.292 155.860 101.160 C 154.738 90.012 147.079 80.607 136.390 77.250 C 130.069 75.256 126.561 68.516 128.555 62.195 C 130.549 55.874 137.289 52.366 143.610 54.360 C 163.464 60.592 177.682 78.073 179.740 98.780 C 180.064 101.950 179.114 105.119 177.099 107.587 C 175.084 110.056 172.171 111.622 169.000 111.940 Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
