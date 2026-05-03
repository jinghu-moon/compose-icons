package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorLightIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 26.000 L 96.000 26.000 C 88.268 26.000 82.000 32.268 82.000 40.000 L 82.000 58.000 L 64.000 58.000 C 56.268 58.000 50.000 64.268 50.000 72.000 L 50.000 224.000 C 50.000 226.248 51.257 228.307 53.256 229.335 C 55.255 230.363 57.661 230.188 59.490 228.880 L 112.000 191.370 L 164.520 228.880 C 166.348 230.182 168.751 230.354 170.746 229.327 C 172.742 228.300 173.997 226.245 174.000 224.000 L 174.000 180.800 L 196.510 196.880 C 198.339 198.188 200.745 198.363 202.744 197.335 C 204.743 196.307 206.000 194.248 206.000 192.000 L 206.000 40.000 C 206.000 32.268 199.732 26.000 192.000 26.000 ZM 162.000 212.340 L 115.480 179.120 C 113.388 177.618 110.572 177.618 108.480 179.120 L 62.000 212.340 L 62.000 72.000 C 62.000 70.895 62.895 70.000 64.000 70.000 L 160.000 70.000 C 161.105 70.000 162.000 70.895 162.000 72.000 ZM 194.000 180.340 L 174.000 166.060 L 174.000 72.000 C 174.000 64.268 167.732 58.000 160.000 58.000 L 94.000 58.000 L 94.000 40.000 C 94.000 38.895 94.895 38.000 96.000 38.000 L 192.000 38.000 C 193.105 38.000 194.000 38.895 194.000 40.000 Z"),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
