package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorFillIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 138.620 128.000 C 143.037 128.001 147.437 128.548 151.720 129.630 C 151.150 137.840 148.380 144.630 143.610 149.240 C 139.161 153.565 133.204 155.989 127.000 156.000 C 115.130 156.000 112.000 148.420 112.000 143.930 C 112.000 133.000 125.800 128.000 138.620 128.000 ZM 224.000 128.000 C 224.000 193.120 188.110 232.000 128.000 232.000 C 67.890 232.000 32.000 193.120 32.000 128.000 C 32.000 62.880 67.890 24.000 128.000 24.000 C 188.110 24.000 224.000 62.880 224.000 128.000 ZM 72.000 128.000 C 72.000 84.930 90.320 64.000 128.000 64.000 C 154.340 64.000 171.000 74.080 178.810 94.830 C 180.373 98.972 184.998 101.063 189.140 99.500 C 193.282 97.937 195.373 93.312 193.810 89.170 C 180.900 55.140 150.900 48.000 128.000 48.000 C 101.900 48.000 82.480 56.700 70.280 73.860 C 60.800 87.190 56.000 105.400 56.000 128.000 C 56.000 150.600 60.800 168.810 70.280 182.140 C 82.480 199.300 101.900 208.000 128.000 208.000 C 152.450 208.000 167.820 199.200 176.410 191.820 C 187.170 182.570 193.600 169.930 193.600 158.000 C 193.600 143.700 187.010 131.210 175.040 122.830 C 172.579 121.118 169.980 119.612 167.270 118.330 C 165.180 103.680 157.270 92.580 144.930 87.260 C 130.430 81.000 112.000 83.930 101.210 94.190 C 98.001 97.228 97.862 102.291 100.900 105.500 C 103.938 108.709 109.001 108.848 112.210 105.810 C 117.640 100.670 129.000 97.810 138.610 101.960 C 143.505 104.029 147.379 107.956 149.380 112.880 C 145.821 112.316 142.223 112.031 138.620 112.030 C 113.530 112.000 96.000 125.150 96.000 143.930 C 96.000 160.200 109.000 172.000 127.000 172.000 C 137.363 171.974 147.312 167.926 154.750 160.710 C 159.450 156.120 164.860 148.510 166.920 136.710 C 173.772 141.612 177.768 149.577 177.600 158.000 C 177.600 171.710 161.840 192.000 128.000 192.000 C 90.320 192.000 72.000 171.070 72.000 128.000 Z"),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
