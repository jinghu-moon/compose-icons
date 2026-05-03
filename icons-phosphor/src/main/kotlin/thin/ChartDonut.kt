package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorThinIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 125.791 28.000 124.000 29.791 124.000 32.000 L 124.000 88.000 C 124.000 90.209 125.791 92.000 128.000 92.000 C 144.294 92.001 158.555 102.946 162.771 118.685 C 166.987 134.423 160.107 151.032 145.996 159.178 C 131.885 167.324 114.062 164.977 102.541 153.455 C 91.020 141.934 88.673 124.111 96.820 110.000 C 97.352 109.080 97.496 107.986 97.220 106.960 C 96.944 105.934 96.271 105.059 95.350 104.530 L 46.850 76.530 C 44.936 75.429 42.492 76.087 41.390 78.000 C 18.760 117.196 25.278 166.705 57.281 198.709 C 89.284 230.714 138.792 237.233 177.989 214.604 C 217.186 191.976 236.298 145.842 224.587 102.123 C 212.875 58.405 173.260 28.003 128.000 28.000 ZM 46.380 85.500 L 88.050 109.500 C 84.306 117.596 83.120 126.642 84.650 135.430 L 38.180 147.930 C 33.502 126.803 36.404 104.703 46.380 85.500 ZM 40.250 155.650 L 86.710 143.200 C 92.601 159.116 107.101 170.241 124.000 171.810 L 124.000 219.910 C 85.367 218.181 51.922 192.518 40.250 155.650 ZM 132.000 219.910 L 132.000 171.810 C 154.643 169.727 171.969 150.734 171.969 127.995 C 171.969 105.256 154.643 86.263 132.000 84.180 L 132.000 36.090 C 181.180 38.267 219.932 78.772 219.932 128.000 C 219.932 177.228 181.180 217.733 132.000 219.910 Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
