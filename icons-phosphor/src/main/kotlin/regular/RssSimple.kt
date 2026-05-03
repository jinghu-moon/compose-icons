package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorRegularIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 192.000 C 224.000 196.418 220.418 200.000 216.000 200.000 C 211.582 200.000 208.000 196.418 208.000 192.000 C 208.000 112.600 143.400 48.000 64.000 48.000 C 59.582 48.000 56.000 44.418 56.000 40.000 C 56.000 35.582 59.582 32.000 64.000 32.000 C 152.220 32.000 224.000 103.780 224.000 192.000 ZM 64.000 104.000 C 59.582 104.000 56.000 107.582 56.000 112.000 C 56.000 116.418 59.582 120.000 64.000 120.000 C 103.746 120.044 135.956 152.254 136.000 192.000 C 136.000 196.418 139.582 200.000 144.000 200.000 C 148.418 200.000 152.000 196.418 152.000 192.000 C 151.945 143.422 112.578 104.055 64.000 104.000 ZM 68.000 176.000 C 61.373 176.000 56.000 181.373 56.000 188.000 C 56.000 194.627 61.373 200.000 68.000 200.000 C 74.627 200.000 80.000 194.627 80.000 188.000 C 80.000 181.373 74.627 176.000 68.000 176.000 Z"),
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
