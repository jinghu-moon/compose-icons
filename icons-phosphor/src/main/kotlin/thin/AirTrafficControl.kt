package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorThinIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.830 73.110 C 223.583 69.906 219.914 67.998 216.000 68.000 L 132.000 68.000 L 132.000 28.000 L 152.000 28.000 C 154.209 28.000 156.000 26.209 156.000 24.000 C 156.000 21.791 154.209 20.000 152.000 20.000 L 104.000 20.000 C 101.791 20.000 100.000 21.791 100.000 24.000 C 100.000 26.209 101.791 28.000 104.000 28.000 L 124.000 28.000 L 124.000 68.000 L 40.000 68.000 C 36.085 67.999 32.416 69.908 30.170 73.114 C 27.924 76.321 27.382 80.421 28.720 84.100 L 54.910 156.100 C 56.633 160.840 61.136 163.997 66.180 164.000 L 100.000 164.000 L 100.000 232.000 C 100.000 234.209 101.791 236.000 104.000 236.000 C 106.209 236.000 108.000 234.209 108.000 232.000 L 108.000 164.000 L 148.000 164.000 L 148.000 232.000 C 148.000 234.209 149.791 236.000 152.000 236.000 C 154.209 236.000 156.000 234.209 156.000 232.000 L 156.000 164.000 L 189.820 164.000 C 194.864 163.997 199.367 160.840 201.090 156.100 L 227.280 84.100 C 228.619 80.420 228.078 76.317 225.830 73.110 ZM 107.340 156.000 L 92.790 76.000 L 163.210 76.000 L 148.660 156.000 ZM 62.420 153.370 L 36.240 81.370 C 35.793 80.143 35.972 78.775 36.721 77.706 C 37.470 76.636 38.694 75.999 40.000 76.000 L 84.660 76.000 L 99.200 156.000 L 66.200 156.000 C 64.511 156.009 62.998 154.957 62.420 153.370 ZM 219.760 81.370 L 193.580 153.370 C 193.004 154.950 191.502 156.001 189.820 156.000 L 156.820 156.000 L 171.370 76.000 L 216.000 76.000 C 217.306 75.999 218.530 76.636 219.279 77.706 C 220.028 78.775 220.207 80.143 219.760 81.370 Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
