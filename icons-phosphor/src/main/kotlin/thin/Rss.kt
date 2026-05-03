package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorThinIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.080 151.920 C 116.878 164.641 124.051 181.955 124.000 200.000 C 124.000 202.209 122.209 204.000 120.000 204.000 C 117.791 204.000 116.000 202.209 116.000 200.000 C 116.000 166.863 89.137 140.000 56.000 140.000 C 53.791 140.000 52.000 138.209 52.000 136.000 C 52.000 133.791 53.791 132.000 56.000 132.000 C 74.045 131.949 91.359 139.122 104.080 151.920 ZM 56.000 84.000 C 53.791 84.000 52.000 85.791 52.000 88.000 C 52.000 90.209 53.791 92.000 56.000 92.000 C 115.647 92.000 164.000 140.353 164.000 200.000 C 164.000 202.209 165.791 204.000 168.000 204.000 C 170.209 204.000 172.000 202.209 172.000 200.000 C 172.000 135.935 120.065 84.000 56.000 84.000 ZM 172.000 84.000 C 141.298 53.147 99.526 35.862 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 C 52.000 42.209 53.791 44.000 56.000 44.000 C 97.396 43.889 137.117 60.341 166.310 89.690 C 195.659 118.883 212.111 158.604 212.000 200.000 C 212.000 202.209 213.791 204.000 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 C 220.138 156.474 202.853 114.702 172.000 84.000 ZM 60.000 188.000 C 55.582 188.000 52.000 191.582 52.000 196.000 C 52.000 200.418 55.582 204.000 60.000 204.000 C 64.418 204.000 68.000 200.418 68.000 196.000 C 68.000 191.582 64.418 188.000 60.000 188.000 Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
