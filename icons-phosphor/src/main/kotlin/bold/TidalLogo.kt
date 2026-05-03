package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorBoldIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.490 87.510 L 214.490 49.510 C 212.238 47.251 209.180 45.981 205.990 45.981 C 202.800 45.981 199.742 47.251 197.490 49.510 L 168.000 79.000 L 136.490 47.510 C 134.238 45.251 131.180 43.981 127.990 43.981 C 124.800 43.981 121.742 45.251 119.490 47.510 L 88.000 79.000 L 58.490 49.510 C 56.238 47.251 53.180 45.981 49.990 45.981 C 46.800 45.981 43.742 47.251 41.490 49.510 L 3.490 87.510 C 1.231 89.762 -0.039 92.820 -0.039 96.010 C -0.039 99.200 1.231 102.258 3.490 104.510 L 41.490 142.510 C 43.742 144.769 46.800 146.039 49.990 146.039 C 53.180 146.039 56.238 144.769 58.490 142.510 L 88.000 113.000 L 111.000 136.000 L 79.510 167.510 C 77.251 169.762 75.981 172.820 75.981 176.010 C 75.981 179.200 77.251 182.258 79.510 184.510 L 119.510 224.510 C 121.762 226.769 124.820 228.039 128.010 228.039 C 131.200 228.039 134.258 226.769 136.510 224.510 L 176.510 184.510 C 178.769 182.258 180.039 179.200 180.039 176.010 C 180.039 172.820 178.769 169.762 176.510 167.510 L 145.000 136.000 L 168.000 113.000 L 197.510 142.520 C 199.762 144.779 202.820 146.049 206.010 146.049 C 209.200 146.049 212.258 144.779 214.510 142.520 L 252.510 104.520 C 254.770 102.265 256.038 99.203 256.034 96.011 C 256.031 92.819 254.755 89.759 252.490 87.510 ZM 50.000 117.000 L 29.000 96.000 L 50.000 75.000 L 71.000 96.000 ZM 128.000 199.000 L 105.000 176.000 L 128.000 153.000 L 151.000 176.000 ZM 128.000 119.000 L 105.000 96.000 L 128.000 73.000 L 151.000 96.000 ZM 206.000 117.000 L 185.000 96.000 L 206.000 75.000 L 227.000 96.000 Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
