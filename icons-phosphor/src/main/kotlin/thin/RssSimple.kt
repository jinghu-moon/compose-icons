package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorThinIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 192.000 C 220.000 194.209 218.209 196.000 216.000 196.000 C 213.791 196.000 212.000 194.209 212.000 192.000 C 212.000 110.390 145.610 44.000 64.000 44.000 C 61.791 44.000 60.000 42.209 60.000 40.000 C 60.000 37.791 61.791 36.000 64.000 36.000 C 150.000 36.000 220.000 106.000 220.000 192.000 ZM 64.000 108.000 C 61.791 108.000 60.000 109.791 60.000 112.000 C 60.000 114.209 61.791 116.000 64.000 116.000 C 105.955 116.044 139.956 150.045 140.000 192.000 C 140.000 194.209 141.791 196.000 144.000 196.000 C 146.209 196.000 148.000 194.209 148.000 192.000 C 147.950 145.629 110.371 108.050 64.000 108.000 ZM 68.000 180.000 C 63.582 180.000 60.000 183.582 60.000 188.000 C 60.000 192.418 63.582 196.000 68.000 196.000 C 72.418 196.000 76.000 192.418 76.000 188.000 C 76.000 183.582 72.418 180.000 68.000 180.000 Z"),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
