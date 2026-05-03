package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorThinIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.000 171.470 C 225.393 171.823 224.702 172.006 224.000 172.000 C 222.569 172.002 221.246 171.239 220.530 170.000 L 199.380 133.000 C 186.808 142.165 172.574 148.798 157.470 152.530 L 164.000 191.340 C 164.361 193.519 162.888 195.578 160.710 195.940 C 160.489 195.980 160.265 196.000 160.040 196.000 C 158.088 195.997 156.422 194.586 156.100 192.660 L 149.690 154.160 C 135.368 156.613 120.732 156.613 106.410 154.160 L 100.000 192.660 C 99.674 194.608 97.975 196.027 96.000 196.000 C 95.775 195.999 95.551 195.979 95.330 195.940 C 93.152 195.578 91.679 193.519 92.040 191.340 L 98.520 152.510 C 83.421 148.783 69.190 142.157 56.620 133.000 L 35.470 170.000 C 34.754 171.239 33.431 172.002 32.000 172.000 C 31.298 172.006 30.607 171.823 30.000 171.470 C 29.079 170.941 28.406 170.066 28.130 169.040 C 27.854 168.014 27.998 166.920 28.530 166.000 L 50.210 128.060 C 42.385 121.621 35.241 114.396 28.890 106.500 C 27.874 105.402 27.555 103.830 28.063 102.423 C 28.572 101.016 29.823 100.011 31.306 99.816 C 32.789 99.622 34.256 100.272 35.110 101.500 C 52.250 122.710 82.290 148.000 128.000 148.000 C 173.710 148.000 203.750 122.710 220.890 101.490 C 221.744 100.262 223.211 99.612 224.694 99.806 C 226.177 100.001 227.428 101.006 227.937 102.413 C 228.445 103.820 228.126 105.392 227.110 106.490 C 220.759 114.386 213.615 121.611 205.790 128.050 L 227.470 166.000 C 228.002 166.920 228.146 168.014 227.870 169.040 C 227.594 170.066 226.921 170.941 226.000 171.470 Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
