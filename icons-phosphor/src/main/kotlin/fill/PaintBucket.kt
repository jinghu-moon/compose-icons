package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorFillIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 208.000 C 256.000 221.255 245.255 232.000 232.000 232.000 C 218.745 232.000 208.000 221.255 208.000 208.000 C 208.000 190.090 223.570 166.230 225.340 163.560 C 226.823 161.331 229.323 159.992 232.000 159.992 C 234.677 159.992 237.177 161.331 238.660 163.560 C 240.430 166.230 256.000 190.090 256.000 208.000 ZM 132.490 124.490 C 137.184 119.796 137.184 112.184 132.490 107.490 C 127.796 102.796 120.184 102.796 115.490 107.490 L 115.490 107.490 C 115.490 107.490 115.490 107.490 115.490 107.490 C 110.876 112.195 110.919 119.741 115.587 124.393 C 120.255 129.044 127.801 129.061 132.490 124.430 ZM 37.650 18.340 C 34.524 15.217 29.458 15.219 26.335 18.345 C 23.212 21.471 23.214 26.537 26.340 29.660 L 58.940 62.260 L 70.250 51.000 ZM 234.530 139.070 C 237.158 138.193 239.146 136.018 239.783 133.322 C 240.421 130.625 239.617 127.791 237.660 125.830 L 122.170 10.340 C 119.046 7.218 113.984 7.218 110.860 10.340 L 70.250 51.000 L 110.680 91.420 C 122.907 84.803 138.137 88.159 146.450 99.302 C 154.763 110.446 153.641 126.001 143.815 135.835 C 133.988 145.670 118.434 146.806 107.284 138.503 C 96.133 130.200 92.764 114.973 99.370 102.740 L 58.940 62.260 L 15.000 106.170 C 5.628 115.542 5.628 130.738 15.000 140.110 L 99.890 225.000 C 109.262 234.372 124.458 234.372 133.830 225.000 L 212.320 146.510 Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
