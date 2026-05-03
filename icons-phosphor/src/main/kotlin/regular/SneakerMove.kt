package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorRegularIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.160 166.630 L 202.530 152.320 C 186.228 144.236 175.939 127.587 176.000 109.390 L 176.000 80.000 C 176.000 75.582 172.418 72.000 168.000 72.000 C 141.502 71.972 120.028 50.498 120.000 24.000 C 119.997 20.964 118.277 18.192 115.558 16.842 C 112.839 15.492 109.590 15.797 107.170 17.630 L 30.130 76.000 L 29.930 76.160 C 26.406 79.014 24.259 83.230 24.022 87.759 C 23.786 92.288 25.482 96.704 28.690 99.910 L 142.400 213.660 C 143.902 215.160 145.938 216.002 148.060 216.000 L 224.000 216.000 C 232.837 216.000 240.000 208.837 240.000 200.000 L 240.000 180.940 C 240.019 174.876 236.592 169.327 231.160 166.630 ZM 224.000 200.000 L 151.370 200.000 L 40.000 88.630 L 52.870 78.870 L 91.660 117.660 C 94.786 120.791 99.859 120.796 102.990 117.670 C 106.121 114.544 106.126 109.471 103.000 106.340 L 65.740 69.110 L 105.740 38.800 C 111.947 64.733 133.550 84.122 160.000 87.500 L 160.000 109.390 C 159.919 133.654 173.640 155.853 195.380 166.630 L 224.000 180.940 ZM 70.800 184.000 L 32.000 184.000 C 27.582 184.000 24.000 180.418 24.000 176.000 C 24.000 171.582 27.582 168.000 32.000 168.000 L 70.800 168.000 C 75.218 168.000 78.800 171.582 78.800 176.000 C 78.800 180.418 75.218 184.000 70.800 184.000 ZM 110.800 208.000 C 110.800 212.418 107.218 216.000 102.800 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 C 40.000 203.582 43.582 200.000 48.000 200.000 L 102.800 200.000 C 107.218 200.000 110.800 203.582 110.800 208.000 Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
