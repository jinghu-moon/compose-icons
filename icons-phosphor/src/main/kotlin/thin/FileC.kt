package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorThinIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 44.000 180.000 C 44.000 193.230 53.000 204.000 64.000 204.000 C 68.996 203.922 73.738 201.787 77.110 198.100 C 78.640 196.504 81.174 196.450 82.770 197.980 C 84.366 199.510 84.420 202.044 82.890 203.640 C 78.010 208.905 71.178 211.929 64.000 212.000 C 48.560 212.000 36.000 197.640 36.000 180.000 C 36.000 162.360 48.560 148.000 64.000 148.000 C 71.178 148.071 78.010 151.095 82.890 156.360 C 84.420 157.956 84.366 160.490 82.770 162.020 C 81.174 163.550 78.640 163.496 77.110 161.900 C 73.738 158.213 68.996 156.078 64.000 156.000 C 53.000 156.000 44.000 166.770 44.000 180.000 ZM 212.000 88.000 L 212.000 216.000 C 212.000 222.627 206.627 228.000 200.000 228.000 L 120.000 228.000 C 117.791 228.000 116.000 226.209 116.000 224.000 C 116.000 221.791 117.791 220.000 120.000 220.000 L 200.000 220.000 C 202.209 220.000 204.000 218.209 204.000 216.000 L 204.000 92.000 L 152.000 92.000 C 149.791 92.000 148.000 90.209 148.000 88.000 L 148.000 36.000 L 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 L 52.000 112.000 C 52.000 114.209 50.209 116.000 48.000 116.000 C 45.791 116.000 44.000 114.209 44.000 112.000 L 44.000 40.000 C 44.000 33.373 49.373 28.000 56.000 28.000 L 152.000 28.000 C 153.061 27.999 154.079 28.420 154.830 29.170 L 210.830 85.170 C 211.580 85.921 212.001 86.939 212.000 88.000 ZM 156.000 84.000 L 198.340 84.000 L 156.000 41.650 Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
