package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorFillIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 76.000 192.000 C 69.373 192.000 64.000 186.627 64.000 180.000 C 64.000 173.373 69.373 168.000 76.000 168.000 C 82.627 168.000 88.000 173.373 88.000 180.000 C 88.000 186.627 82.627 192.000 76.000 192.000 ZM 136.000 192.000 C 131.582 192.000 128.000 188.418 128.000 184.000 C 127.967 153.086 102.914 128.033 72.000 128.000 C 67.582 128.000 64.000 124.418 64.000 120.000 C 64.000 115.582 67.582 112.000 72.000 112.000 C 111.746 112.044 143.956 144.254 144.000 184.000 C 144.000 188.418 140.418 192.000 136.000 192.000 ZM 184.000 192.000 C 179.582 192.000 176.000 188.418 176.000 184.000 C 175.939 126.588 129.412 80.061 72.000 80.000 C 67.582 80.000 64.000 76.418 64.000 72.000 C 64.000 67.582 67.582 64.000 72.000 64.000 C 138.244 64.072 191.928 117.756 192.000 184.000 C 192.000 188.418 188.418 192.000 184.000 192.000 Z"),
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
