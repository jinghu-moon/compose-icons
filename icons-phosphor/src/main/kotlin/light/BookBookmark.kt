package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorLightIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 26.000 L 72.000 26.000 C 55.431 26.000 42.000 39.431 42.000 56.000 L 42.000 224.000 C 42.000 227.314 44.686 230.000 48.000 230.000 L 192.000 230.000 C 195.314 230.000 198.000 227.314 198.000 224.000 C 198.000 220.686 195.314 218.000 192.000 218.000 L 54.000 218.000 L 54.000 216.000 C 54.000 206.059 62.059 198.000 72.000 198.000 L 208.000 198.000 C 211.314 198.000 214.000 195.314 214.000 192.000 L 214.000 32.000 C 214.000 28.686 211.314 26.000 208.000 26.000 ZM 118.000 38.000 L 170.000 38.000 L 170.000 116.000 L 147.590 99.200 C 145.457 97.600 142.523 97.600 140.390 99.200 L 118.000 116.000 ZM 202.000 186.000 L 72.000 186.000 C 65.507 185.991 59.188 188.097 54.000 192.000 L 54.000 56.000 C 54.000 46.059 62.059 38.000 72.000 38.000 L 106.000 38.000 L 106.000 128.000 C 106.000 130.273 107.284 132.350 109.317 133.367 C 111.349 134.383 113.782 134.164 115.600 132.800 L 144.000 111.500 L 172.410 132.800 C 174.228 134.158 176.656 134.374 178.686 133.358 C 180.715 132.342 181.997 130.269 182.000 128.000 L 182.000 38.000 L 202.000 38.000 Z"),
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
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
