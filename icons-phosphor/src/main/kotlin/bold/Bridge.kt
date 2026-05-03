package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorBoldIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 156.000 L 204.000 156.000 L 204.000 111.490 C 210.844 117.888 218.806 122.973 227.490 126.490 C 233.634 128.975 240.630 126.009 243.115 119.865 C 245.600 113.721 242.634 106.725 236.490 104.240 C 216.805 96.329 203.932 77.215 204.000 56.000 C 204.000 49.373 198.627 44.000 192.000 44.000 C 185.373 44.000 180.000 49.373 180.000 56.000 C 180.000 84.719 156.719 108.000 128.000 108.000 C 99.281 108.000 76.000 84.719 76.000 56.000 C 76.000 49.373 70.627 44.000 64.000 44.000 C 57.373 44.000 52.000 49.373 52.000 56.000 C 52.059 77.211 39.182 96.315 19.500 104.220 C 13.356 106.705 10.390 113.701 12.875 119.845 C 15.360 125.989 22.356 128.955 28.500 126.470 C 37.184 122.953 45.146 117.868 51.990 111.470 L 51.990 156.000 L 24.000 156.000 C 17.373 156.000 12.000 161.373 12.000 168.000 C 12.000 174.627 17.373 180.000 24.000 180.000 L 52.000 180.000 L 52.000 200.000 C 52.000 206.627 57.373 212.000 64.000 212.000 C 70.627 212.000 76.000 206.627 76.000 200.000 L 76.000 180.000 L 180.000 180.000 L 180.000 200.000 C 180.000 206.627 185.373 212.000 192.000 212.000 C 198.627 212.000 204.000 206.627 204.000 200.000 L 204.000 180.000 L 232.000 180.000 C 238.627 180.000 244.000 174.627 244.000 168.000 C 244.000 161.373 238.627 156.000 232.000 156.000 ZM 140.000 131.050 L 140.000 156.000 L 116.000 156.000 L 116.000 131.050 C 123.950 132.317 132.050 132.317 140.000 131.050 ZM 76.000 111.380 C 80.813 115.898 86.191 119.774 92.000 122.910 L 92.000 156.000 L 76.000 156.000 ZM 164.000 156.000 L 164.000 122.910 C 169.809 119.774 175.187 115.898 180.000 111.380 L 180.000 156.000 Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
