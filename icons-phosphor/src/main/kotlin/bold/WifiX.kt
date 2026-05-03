package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorBoldIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 204.000 C 144.000 212.837 136.837 220.000 128.000 220.000 C 119.163 220.000 112.000 212.837 112.000 204.000 C 112.000 195.163 119.163 188.000 128.000 188.000 C 136.837 188.000 144.000 195.163 144.000 204.000 ZM 217.000 80.000 L 232.520 64.490 C 237.214 59.796 237.214 52.184 232.520 47.490 C 227.826 42.796 220.214 42.796 215.520 47.490 L 200.000 63.000 L 184.490 47.510 C 179.796 42.816 172.184 42.816 167.490 47.510 C 162.796 52.204 162.796 59.816 167.490 64.510 L 183.000 80.000 L 167.510 95.510 C 162.816 100.204 162.816 107.816 167.510 112.510 C 172.204 117.204 179.816 117.204 184.510 112.510 L 200.000 97.000 L 215.510 112.520 C 220.204 117.214 227.816 117.214 232.510 112.520 C 237.204 107.826 237.204 100.214 232.510 95.520 ZM 175.100 155.300 C 147.043 134.888 109.027 134.888 80.970 155.300 C 75.613 159.202 74.433 166.708 78.335 172.065 C 82.237 177.422 89.743 178.602 95.100 174.700 C 114.735 160.421 141.335 160.421 160.970 174.700 C 166.327 178.602 173.833 177.422 177.735 172.065 C 181.637 166.708 180.457 159.202 175.100 155.300 ZM 140.000 56.000 C 140.000 49.373 134.627 44.000 128.000 44.000 C 87.305 44.021 47.871 58.122 16.390 83.910 C 11.268 88.116 10.524 95.678 14.730 100.800 C 18.936 105.922 26.498 106.666 31.620 102.460 C 58.807 80.194 92.859 68.019 128.000 68.000 C 134.627 68.000 140.000 62.627 140.000 56.000 ZM 140.000 104.000 C 140.000 97.373 134.627 92.000 128.000 92.000 C 99.141 91.893 71.111 101.645 48.550 119.640 C 43.490 123.793 42.692 131.235 46.757 136.367 C 50.822 141.498 58.249 142.425 63.450 138.450 C 81.780 123.831 104.554 115.910 128.000 116.000 C 134.627 116.000 140.000 110.627 140.000 104.000 Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
