package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorThinIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.740 52.860 C 170.869 52.411 172.248 50.344 171.846 48.206 C 171.443 46.068 169.406 44.644 167.260 45.000 C 150.090 48.210 136.190 57.570 128.000 71.120 C 118.000 54.210 99.460 44.000 78.000 44.000 C 45.983 44.039 20.039 69.983 20.000 102.000 C 20.000 130.590 38.000 160.470 73.400 190.790 C 89.745 204.699 107.393 216.999 126.100 227.520 C 126.684 227.835 127.337 228.000 128.000 228.000 C 128.661 227.995 129.310 227.827 129.890 227.510 L 129.890 227.510 C 144.048 219.566 157.599 210.585 170.430 200.640 C 171.631 199.793 172.271 198.356 172.097 196.896 C 171.923 195.437 170.962 194.190 169.595 193.650 C 168.228 193.110 166.675 193.364 165.550 194.310 C 154.825 202.557 143.622 210.164 132.000 217.090 L 132.000 80.850 C 138.240 66.260 151.580 56.070 168.740 52.860 ZM 124.000 217.080 C 102.270 204.080 28.000 155.920 28.000 102.000 C 28.033 74.399 50.399 52.033 78.000 52.000 C 98.830 52.000 116.390 63.000 124.000 80.800 ZM 232.110 100.000 L 231.670 100.000 C 229.622 100.012 227.895 98.476 227.670 96.440 C 226.041 81.791 218.017 68.612 205.750 60.440 C 203.992 59.184 203.549 56.760 204.748 54.964 C 205.948 53.168 208.357 52.648 210.190 53.790 C 224.426 63.277 233.736 78.576 235.620 95.580 C 235.866 97.768 234.297 99.744 232.110 100.000 ZM 226.880 137.810 C 221.380 148.810 213.330 160.130 202.940 171.370 C 201.441 172.994 198.909 173.094 197.285 171.595 C 195.661 170.096 195.561 167.564 197.060 165.940 C 206.940 155.260 214.560 144.590 219.720 134.230 C 220.709 132.253 223.113 131.451 225.090 132.440 C 227.067 133.429 227.869 135.833 226.880 137.810 Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
