package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorThinIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 54.000 L 100.000 40.000 C 100.000 33.373 105.373 28.000 112.000 28.000 L 144.000 28.000 C 150.627 28.000 156.000 33.373 156.000 40.000 L 156.000 72.000 C 156.000 78.627 150.627 84.000 144.000 84.000 L 127.610 84.000 C 125.401 84.000 123.610 82.209 123.610 80.000 C 123.610 77.791 125.401 76.000 127.610 76.000 L 144.000 76.000 C 146.209 76.000 148.000 74.209 148.000 72.000 L 148.000 40.000 C 148.000 37.791 146.209 36.000 144.000 36.000 L 112.000 36.000 C 109.791 36.000 108.000 37.791 108.000 40.000 L 108.000 54.000 C 108.000 56.209 106.209 58.000 104.000 58.000 C 101.791 58.000 100.000 56.209 100.000 54.000 ZM 211.000 213.310 C 211.982 214.364 212.320 215.865 211.887 217.239 C 211.454 218.613 210.315 219.647 208.906 219.948 C 207.497 220.248 206.036 219.768 205.080 218.690 L 119.000 124.000 L 68.000 124.000 L 68.000 164.000 L 80.000 164.000 C 86.627 164.000 92.000 169.373 92.000 176.000 L 92.000 208.000 C 92.000 214.627 86.627 220.000 80.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 176.000 C 36.000 169.373 41.373 164.000 48.000 164.000 L 60.000 164.000 L 60.000 124.000 L 24.000 124.000 C 21.791 124.000 20.000 122.209 20.000 120.000 C 20.000 117.791 21.791 116.000 24.000 116.000 L 111.680 116.000 L 45.000 42.690 C 43.514 41.033 43.653 38.486 45.310 37.000 C 46.967 35.514 49.514 35.653 51.000 37.310 ZM 80.000 172.000 L 48.000 172.000 C 45.791 172.000 44.000 173.791 44.000 176.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 80.000 212.000 C 82.209 212.000 84.000 210.209 84.000 208.000 L 84.000 176.000 C 84.000 173.791 82.209 172.000 80.000 172.000 ZM 232.000 116.000 L 164.000 116.000 C 161.791 116.000 160.000 117.791 160.000 120.000 C 160.000 122.209 161.791 124.000 164.000 124.000 L 188.000 124.000 L 188.000 150.830 C 188.000 153.039 189.791 154.830 192.000 154.830 C 194.209 154.830 196.000 153.039 196.000 150.830 L 196.000 124.000 L 232.000 124.000 C 234.209 124.000 236.000 122.209 236.000 120.000 C 236.000 117.791 234.209 116.000 232.000 116.000 Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
