package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorLightIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 140.000 L 214.000 176.000 C 214.000 201.130 205.720 218.000 205.360 218.680 C 204.443 220.666 202.518 221.997 200.336 222.151 C 198.153 222.305 196.060 221.260 194.872 219.422 C 193.685 217.584 193.592 215.246 194.630 213.320 C 194.700 213.180 202.000 198.130 202.000 176.000 L 202.000 140.000 C 202.000 132.268 195.732 126.000 188.000 126.000 C 180.268 126.000 174.000 132.268 174.000 140.000 L 174.000 144.000 C 174.000 147.314 171.314 150.000 168.000 150.000 C 164.686 150.000 162.000 147.314 162.000 144.000 L 162.000 124.000 C 162.000 116.268 155.732 110.000 148.000 110.000 C 140.268 110.000 134.000 116.268 134.000 124.000 L 134.000 136.000 C 134.000 139.314 131.314 142.000 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 L 122.000 68.000 C 122.000 60.268 115.732 54.000 108.000 54.000 C 100.268 54.000 94.000 60.268 94.000 68.000 L 94.000 176.000 C 93.997 178.676 92.222 181.027 89.649 181.762 C 87.076 182.498 84.327 181.440 82.910 179.170 L 64.230 149.170 C 64.191 149.117 64.158 149.060 64.130 149.000 C 60.264 142.304 51.701 140.009 45.005 143.875 C 38.309 147.741 36.014 156.304 39.880 163.000 L 69.170 213.000 C 70.561 215.832 69.522 219.257 66.792 220.838 C 64.062 222.419 60.574 221.616 58.810 219.000 L 29.490 169.000 C 22.274 156.574 26.499 140.651 38.925 133.435 C 51.351 126.219 67.274 130.444 74.490 142.870 L 82.000 155.000 L 82.000 68.000 C 82.000 53.641 93.641 42.000 108.000 42.000 C 122.359 42.000 134.000 53.641 134.000 68.000 L 134.000 102.100 C 141.171 97.513 150.133 96.726 157.993 99.994 C 165.853 103.262 171.615 110.171 173.420 118.490 C 181.385 113.096 191.677 112.540 200.177 117.045 C 208.676 121.550 213.994 130.380 214.000 140.000 ZM 248.000 50.000 L 190.480 50.000 L 212.240 28.240 C 214.549 25.890 214.532 22.118 212.201 19.789 C 209.870 17.461 206.097 17.448 203.750 19.760 L 171.750 51.760 C 169.410 54.103 169.410 57.897 171.750 60.240 L 203.750 92.240 C 206.097 94.552 209.870 94.539 212.201 92.211 C 214.532 89.882 214.549 86.110 212.240 83.760 L 190.480 62.000 L 248.000 62.000 C 251.314 62.000 254.000 59.314 254.000 56.000 C 254.000 52.686 251.314 50.000 248.000 50.000 Z"),
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
