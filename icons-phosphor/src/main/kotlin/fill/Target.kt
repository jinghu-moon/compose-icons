package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorFillIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.870 83.160 C 244.863 131.249 227.816 188.938 182.377 216.805 C 136.939 244.672 77.791 233.714 45.351 191.419 C 12.911 149.123 17.662 89.157 56.356 52.496 C 95.050 15.835 155.186 14.326 195.670 49.000 L 218.340 26.320 C 221.466 23.194 226.534 23.194 229.660 26.320 C 232.786 29.446 232.786 34.514 229.660 37.640 L 167.600 99.710 L 167.600 99.710 L 129.890 137.420 L 105.940 161.370 C 118.568 169.723 134.830 170.229 147.954 162.679 C 161.078 155.128 168.813 140.815 167.940 125.700 C 167.691 121.282 171.072 117.499 175.490 117.250 C 179.908 117.001 183.691 120.382 183.940 124.800 C 185.261 147.992 172.127 169.591 150.929 179.089 C 129.730 188.588 104.869 184.012 88.440 167.590 L 88.440 167.590 C 67.737 146.810 66.578 113.575 85.783 91.402 C 104.988 69.230 138.048 65.634 161.570 83.160 L 184.300 60.390 C 149.775 31.726 99.200 33.676 66.986 64.915 C 34.771 96.153 31.266 146.644 58.856 182.034 C 86.445 217.424 136.265 226.344 174.419 202.725 C 212.574 179.106 226.805 130.535 207.430 90.060 C 205.525 86.073 207.213 81.295 211.200 79.390 C 215.188 77.485 219.965 79.173 221.870 83.160 Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
