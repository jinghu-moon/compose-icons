package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorFillIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 128.000 L 216.000 178.930 C 216.000 204.520 207.520 218.860 207.160 219.580 C 205.803 222.291 203.031 224.002 200.000 224.000 L 64.000 224.000 C 61.162 224.000 58.537 222.497 57.100 220.050 L 26.150 160.000 C 23.960 156.209 23.418 151.687 24.652 147.486 C 25.886 143.285 28.788 139.774 32.680 137.770 C 40.340 133.770 49.780 136.930 54.080 144.390 L 75.080 180.830 C 76.274 182.975 78.640 184.194 81.080 183.920 L 81.200 183.920 C 85.170 183.237 88.053 179.768 88.000 175.740 L 88.000 56.000 C 87.995 51.620 89.786 47.429 92.955 44.405 C 96.124 41.381 100.395 39.789 104.770 40.000 C 113.380 40.400 120.000 47.820 120.000 56.430 L 120.000 128.000 C 119.995 130.217 120.910 132.336 122.527 133.853 C 124.144 135.369 126.318 136.147 128.530 136.000 C 132.798 135.633 136.058 132.033 136.000 127.750 L 136.000 112.000 C 135.995 107.620 137.786 103.429 140.955 100.405 C 144.124 97.381 148.395 95.789 152.770 96.000 C 161.380 96.400 168.000 103.820 168.000 112.430 L 168.000 136.000 C 167.995 138.217 168.910 140.336 170.527 141.853 C 172.144 143.369 174.318 144.147 176.530 144.000 C 180.795 143.629 184.053 140.031 184.000 135.750 L 184.000 128.470 C 184.000 119.860 190.620 112.470 199.230 112.040 C 203.598 111.830 207.862 113.416 211.030 116.431 C 214.198 119.446 215.994 123.627 216.000 128.000 ZM 248.000 48.000 L 195.310 48.000 L 213.660 29.660 C 216.786 26.534 216.786 21.466 213.660 18.340 C 210.534 15.214 205.466 15.214 202.340 18.340 L 170.340 50.340 C 168.838 51.841 167.994 53.877 167.994 56.000 C 167.994 58.123 168.838 60.159 170.340 61.660 L 202.340 93.660 C 205.466 96.786 210.534 96.786 213.660 93.660 C 216.786 90.534 216.786 85.466 213.660 82.340 L 195.310 64.000 L 248.000 64.000 C 252.418 64.000 256.000 60.418 256.000 56.000 C 256.000 51.582 252.418 48.000 248.000 48.000 Z"),
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
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
