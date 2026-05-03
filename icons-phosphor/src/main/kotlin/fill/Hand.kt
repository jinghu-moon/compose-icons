package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorFillIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 64.000 L 216.000 154.930 C 216.000 201.130 179.150 239.480 133.000 239.990 C 110.370 240.295 88.581 231.424 72.600 215.400 C 50.790 192.330 26.150 136.000 26.150 136.000 C 23.960 132.209 23.418 127.687 24.652 123.486 C 25.886 119.285 28.788 115.774 32.680 113.770 C 40.340 109.770 49.780 112.930 54.080 120.390 L 75.080 156.830 C 76.274 158.975 78.640 160.194 81.080 159.920 L 81.200 159.920 C 85.170 159.237 88.053 155.768 88.000 151.740 L 88.000 48.000 C 87.995 43.620 89.786 39.429 92.955 36.405 C 96.124 33.381 100.395 31.789 104.770 32.000 C 113.380 32.400 120.000 39.820 120.000 48.430 L 120.000 112.000 C 119.995 114.217 120.910 116.336 122.527 117.853 C 124.144 119.369 126.318 120.147 128.530 120.000 C 132.798 119.633 136.058 116.033 136.000 111.750 L 136.000 32.000 C 135.995 27.620 137.786 23.429 140.955 20.405 C 144.124 17.381 148.395 15.789 152.770 16.000 C 161.380 16.400 168.000 23.820 168.000 32.430 L 168.000 120.000 C 167.995 122.217 168.910 124.336 170.527 125.853 C 172.144 127.369 174.318 128.147 176.530 128.000 C 180.798 127.633 184.058 124.033 184.000 119.750 L 184.000 64.450 C 184.000 55.840 190.620 48.450 199.230 48.020 C 203.602 47.809 207.869 49.399 211.038 52.418 C 214.206 55.438 216.000 59.623 216.000 64.000 Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
