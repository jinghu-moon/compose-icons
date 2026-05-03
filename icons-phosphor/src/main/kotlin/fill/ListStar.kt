package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorFillIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 64.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 196.418 88.000 192.000 88.000 L 64.000 88.000 C 59.582 88.000 56.000 84.418 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 ZM 64.000 120.000 L 96.000 120.000 C 100.418 120.000 104.000 123.582 104.000 128.000 C 104.000 132.418 100.418 136.000 96.000 136.000 L 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 C 56.000 123.582 59.582 120.000 64.000 120.000 ZM 104.000 184.000 L 64.000 184.000 C 59.582 184.000 56.000 180.418 56.000 176.000 C 56.000 171.582 59.582 168.000 64.000 168.000 L 104.000 168.000 C 108.418 168.000 112.000 171.582 112.000 176.000 C 112.000 180.418 108.418 184.000 104.000 184.000 ZM 198.550 143.290 L 180.690 158.000 L 186.130 180.000 C 186.518 181.563 185.931 183.207 184.640 184.170 C 183.947 184.681 183.110 184.957 182.250 184.960 C 181.547 184.956 180.857 184.766 180.250 184.410 L 160.000 172.540 L 139.780 184.450 C 138.392 185.266 136.651 185.170 135.360 184.208 C 134.070 183.245 133.483 181.603 133.870 180.040 L 139.310 158.040 L 121.450 143.290 C 120.194 142.251 119.694 140.554 120.187 139.000 C 120.679 137.446 122.065 136.346 123.690 136.220 L 147.270 134.400 L 156.330 113.400 C 156.964 111.937 158.406 110.991 160.000 110.991 C 161.594 110.991 163.036 111.937 163.670 113.400 L 172.730 134.400 L 196.310 136.220 C 197.935 136.346 199.321 137.446 199.813 139.000 C 200.306 140.554 199.806 142.251 198.550 143.290 Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
