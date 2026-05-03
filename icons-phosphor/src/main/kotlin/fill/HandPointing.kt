package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorFillIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 104.000 L 224.000 154.930 C 224.000 201.130 187.150 239.480 141.000 239.990 C 118.370 240.295 96.581 231.424 80.600 215.400 C 58.790 192.330 34.150 136.000 34.150 136.000 C 31.960 132.209 31.418 127.687 32.652 123.486 C 33.886 119.285 36.788 115.774 40.680 113.770 C 48.340 109.770 57.780 112.930 62.080 120.390 L 83.080 156.830 C 84.274 158.975 86.640 160.194 89.080 159.920 L 89.200 159.920 C 93.170 159.237 96.053 155.768 96.000 151.740 L 96.000 32.000 C 95.995 27.620 97.786 23.429 100.955 20.405 C 104.124 17.381 108.395 15.789 112.770 16.000 C 121.380 16.400 128.000 23.820 128.000 32.430 L 128.000 104.000 C 127.995 106.217 128.910 108.336 130.527 109.853 C 132.144 111.369 134.318 112.147 136.530 112.000 C 140.798 111.633 144.058 108.033 144.000 103.750 L 144.000 88.000 C 143.995 83.620 145.786 79.429 148.955 76.405 C 152.124 73.381 156.395 71.789 160.770 72.000 C 169.380 72.400 176.000 79.820 176.000 88.430 L 176.000 112.000 C 175.995 114.217 176.910 116.336 178.527 117.853 C 180.144 119.369 182.318 120.147 184.530 120.000 C 188.798 119.633 192.058 116.033 192.000 111.750 L 192.000 104.470 C 192.000 95.860 198.620 88.470 207.230 88.040 C 211.598 87.830 215.862 89.416 219.030 92.431 C 222.198 95.446 223.994 99.627 224.000 104.000 Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
