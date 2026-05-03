package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) return _numberSquareFive!!
        _numberSquareFive = phosphorThinIcon(
            name = "NumberSquareFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 115.390 84.000 L 109.520 119.210 C 114.044 117.064 118.993 115.966 124.000 116.000 C 141.673 116.000 156.000 130.327 156.000 148.000 C 156.000 165.673 141.673 180.000 124.000 180.000 C 115.449 180.151 107.202 176.832 101.140 170.800 C 99.594 169.220 99.620 166.686 101.200 165.140 C 102.780 163.594 105.314 163.620 106.860 165.200 C 111.419 169.690 117.602 172.143 124.000 172.000 C 137.255 172.000 148.000 161.255 148.000 148.000 C 148.000 134.745 137.255 124.000 124.000 124.000 C 117.602 123.857 111.419 126.310 106.860 130.800 C 105.639 132.055 103.743 132.370 102.182 131.576 C 100.620 130.783 99.757 129.066 100.050 127.340 L 108.050 79.340 C 108.373 77.411 110.044 75.998 112.000 76.000 L 152.000 76.000 C 154.209 76.000 156.000 77.791 156.000 80.000 C 156.000 82.209 154.209 84.000 152.000 84.000 Z"),
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
