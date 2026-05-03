package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorThinIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 36.000 L 248.000 36.000 C 245.791 36.000 244.000 37.791 244.000 40.000 C 244.000 41.470 243.580 76.000 216.000 76.000 C 202.060 76.000 192.920 63.210 183.250 49.670 C 172.830 35.090 162.060 20.000 144.000 20.000 C 129.140 20.000 118.180 27.790 112.290 42.510 C 110.115 48.119 108.744 54.007 108.220 60.000 L 88.000 60.000 C 81.373 60.000 76.000 65.373 76.000 72.000 L 76.000 84.080 C 40.477 100.900 21.365 140.103 29.997 178.448 C 38.629 216.792 72.696 244.025 112.000 244.000 L 113.510 244.000 C 152.536 243.335 185.962 215.876 194.191 177.721 C 202.420 139.567 183.283 100.771 148.000 84.080 L 148.000 72.000 C 148.000 65.373 142.627 60.000 136.000 60.000 L 116.240 60.000 C 117.160 50.580 121.690 28.000 144.000 28.000 C 157.940 28.000 167.080 40.790 176.750 54.330 C 187.170 68.910 197.940 84.000 216.000 84.000 C 230.860 84.000 241.820 76.210 247.710 61.490 C 250.360 54.625 251.811 47.356 252.000 40.000 C 252.000 37.791 250.209 36.000 248.000 36.000 ZM 140.000 72.000 L 140.000 86.660 C 140.002 88.248 140.944 89.685 142.400 90.320 C 175.384 104.716 193.750 140.273 186.397 175.503 C 179.044 210.733 147.989 235.975 112.000 235.975 C 76.011 235.975 44.956 210.733 37.603 175.503 C 30.250 140.273 48.616 104.716 81.600 90.320 C 83.056 89.685 83.998 88.248 84.000 86.660 L 84.000 72.000 C 84.000 69.791 85.791 68.000 88.000 68.000 L 136.000 68.000 C 138.209 68.000 140.000 69.791 140.000 72.000 ZM 104.660 204.050 C 106.726 204.379 108.190 206.246 108.017 208.331 C 107.843 210.416 106.092 212.016 104.000 212.000 C 103.779 211.998 103.559 211.981 103.340 211.950 C 81.258 208.029 63.971 190.742 60.050 168.660 C 59.685 166.478 61.158 164.415 63.340 164.050 C 65.522 163.685 67.585 165.158 67.950 167.340 C 71.268 186.069 85.931 200.732 104.660 204.050 Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
