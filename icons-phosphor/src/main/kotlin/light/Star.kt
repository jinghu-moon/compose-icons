package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorLightIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.280 97.870 C 235.526 92.323 230.563 88.410 224.760 88.000 L 164.510 83.130 L 141.290 26.930 C 139.074 21.542 133.825 18.026 128.000 18.026 C 122.175 18.026 116.926 21.542 114.710 26.930 L 91.490 83.110 L 31.240 88.000 C 25.432 88.413 20.467 92.335 18.720 97.890 C 16.900 103.426 18.589 109.513 23.000 113.320 L 69.000 152.930 L 55.000 212.180 C 53.657 217.850 55.863 223.772 60.590 227.180 C 65.262 230.641 71.580 230.880 76.500 227.780 L 128.000 196.120 L 179.580 227.830 C 184.500 230.930 190.818 230.691 195.490 227.230 C 200.217 223.822 202.423 217.900 201.080 212.230 L 187.080 152.980 L 233.000 113.320 C 237.419 109.509 239.109 103.412 237.280 97.870 ZM 225.140 104.240 L 176.450 146.240 C 174.757 147.701 174.017 149.983 174.530 152.160 L 189.410 214.950 C 189.677 215.922 189.295 216.956 188.460 217.520 C 187.704 218.105 186.659 218.145 185.860 217.620 L 131.140 184.000 C 129.214 182.817 126.786 182.817 124.860 184.000 L 70.140 217.610 C 69.341 218.135 68.296 218.095 67.540 217.510 C 66.686 216.960 66.283 215.923 66.540 214.940 L 81.420 152.150 C 81.933 149.973 81.193 147.691 79.500 146.230 L 30.810 104.230 C 30.027 103.592 29.734 102.529 30.080 101.580 C 30.347 100.645 31.179 99.982 32.150 99.930 L 96.070 94.770 C 98.316 94.588 100.270 93.162 101.130 91.080 L 125.760 31.480 C 126.111 30.577 126.981 29.982 127.950 29.982 C 128.919 29.982 129.789 30.577 130.140 31.480 L 154.770 91.080 C 155.630 93.162 157.584 94.588 159.830 94.770 L 223.750 99.930 C 224.721 99.982 225.553 100.645 225.820 101.580 C 226.182 102.521 225.909 103.588 225.140 104.240 Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
