package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorLightIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 58.000 L 64.000 58.000 C 56.268 58.000 50.000 64.268 50.000 72.000 L 50.000 224.000 C 50.000 226.248 51.257 228.307 53.256 229.335 C 55.255 230.363 57.661 230.188 59.490 228.880 L 112.000 191.370 L 164.520 228.880 C 166.348 230.182 168.751 230.354 170.746 229.327 C 172.742 228.300 173.997 226.245 174.000 224.000 L 174.000 72.000 C 174.000 64.268 167.732 58.000 160.000 58.000 ZM 162.000 212.340 L 115.480 179.120 C 113.388 177.618 110.572 177.618 108.480 179.120 L 62.000 212.340 L 62.000 72.000 C 62.000 70.895 62.895 70.000 64.000 70.000 L 160.000 70.000 C 161.105 70.000 162.000 70.895 162.000 72.000 ZM 206.000 40.000 L 206.000 192.000 C 206.000 195.314 203.314 198.000 200.000 198.000 C 196.686 198.000 194.000 195.314 194.000 192.000 L 194.000 40.000 C 194.000 38.895 193.105 38.000 192.000 38.000 L 88.000 38.000 C 84.686 38.000 82.000 35.314 82.000 32.000 C 82.000 28.686 84.686 26.000 88.000 26.000 L 192.000 26.000 C 199.732 26.000 206.000 32.268 206.000 40.000 Z"),
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
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
