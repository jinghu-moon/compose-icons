package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorRegularIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 81.330 88.560 L 42.150 130.560 C 40.302 132.507 39.554 135.251 40.158 137.866 C 40.761 140.481 42.636 142.620 45.150 143.560 L 102.780 165.170 L 88.160 238.430 C 87.478 241.930 89.195 245.459 92.370 247.083 C 95.545 248.706 99.412 248.032 101.850 245.430 L 163.710 179.150 L 202.080 221.350 C 203.992 223.505 206.915 224.466 209.733 223.865 C 212.550 223.264 214.827 221.195 215.694 218.448 C 216.561 215.700 215.883 212.699 213.920 210.590 ZM 109.370 214.000 L 119.840 161.620 C 120.614 157.784 118.498 153.950 114.840 152.560 L 62.000 132.710 L 92.120 100.440 L 152.900 167.300 ZM 108.660 71.000 C 107.108 69.552 106.195 67.547 106.122 65.426 C 106.049 63.305 106.821 61.241 108.270 59.690 L 154.150 10.530 C 156.588 7.928 160.455 7.254 163.630 8.877 C 166.805 10.501 168.522 14.030 167.840 17.530 L 153.180 90.900 L 210.810 112.510 C 213.305 113.457 215.164 115.585 215.766 118.184 C 216.368 120.784 215.635 123.513 213.810 125.460 L 191.510 149.350 C 188.478 152.487 183.492 152.616 180.302 149.641 C 177.111 146.666 176.892 141.683 179.810 138.440 L 194.000 123.290 L 141.200 103.490 C 137.542 102.100 135.426 98.266 136.200 94.430 L 146.670 42.050 L 120.000 70.620 C 118.550 72.180 116.538 73.097 114.409 73.168 C 112.280 73.240 110.211 72.459 108.660 71.000 Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
