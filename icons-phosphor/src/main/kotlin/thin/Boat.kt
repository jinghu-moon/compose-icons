package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorThinIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.790 114.380 L 204.000 109.120 L 204.000 56.000 C 204.000 49.373 198.627 44.000 192.000 44.000 L 132.000 44.000 L 132.000 24.000 C 132.000 21.791 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 44.000 L 64.000 44.000 C 57.373 44.000 52.000 49.373 52.000 56.000 L 52.000 109.120 L 36.200 114.380 C 31.300 116.016 27.997 120.604 28.000 125.770 L 28.000 152.000 C 28.000 176.460 45.320 198.770 78.090 216.520 C 93.611 224.797 110.019 231.292 127.000 235.880 C 127.637 236.039 128.303 236.039 128.940 235.880 C 145.932 231.294 162.349 224.799 177.880 216.520 C 210.680 198.770 228.000 176.460 228.000 152.000 L 228.000 125.770 C 228.002 120.601 224.694 116.012 219.790 114.380 ZM 60.000 56.000 C 60.000 53.791 61.791 52.000 64.000 52.000 L 192.000 52.000 C 194.209 52.000 196.000 53.791 196.000 56.000 L 196.000 106.450 L 129.260 84.210 C 128.443 83.930 127.557 83.930 126.740 84.210 L 60.000 106.450 ZM 220.000 152.000 C 220.000 201.320 137.920 225.160 128.000 227.860 C 118.080 225.160 36.000 201.320 36.000 152.000 L 36.000 125.770 C 35.997 124.048 37.097 122.517 38.730 121.970 L 124.000 93.550 L 124.000 168.000 C 124.000 170.209 125.791 172.000 128.000 172.000 C 130.209 172.000 132.000 170.209 132.000 168.000 L 132.000 93.550 L 217.260 122.000 C 218.897 122.543 220.002 124.075 220.000 125.800 Z"),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
