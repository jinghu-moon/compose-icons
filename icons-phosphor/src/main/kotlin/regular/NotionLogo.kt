package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorRegularIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 168.000 40.000 C 163.582 40.000 160.000 43.582 160.000 48.000 C 160.000 52.418 163.582 56.000 168.000 56.000 L 184.000 56.000 L 184.000 176.850 L 111.000 44.140 C 109.594 41.588 106.913 40.003 104.000 40.000 L 40.000 40.000 C 35.582 40.000 32.000 43.582 32.000 48.000 C 32.000 52.418 35.582 56.000 40.000 56.000 L 56.000 56.000 L 56.000 200.000 L 40.000 200.000 C 35.582 200.000 32.000 203.582 32.000 208.000 C 32.000 212.418 35.582 216.000 40.000 216.000 L 88.000 216.000 C 92.418 216.000 96.000 212.418 96.000 208.000 C 96.000 203.582 92.418 200.000 88.000 200.000 L 72.000 200.000 L 72.000 79.150 L 145.000 211.860 C 146.406 214.412 149.087 215.997 152.000 216.000 L 192.000 216.000 C 196.418 216.000 200.000 212.418 200.000 208.000 L 200.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 52.418 224.000 48.000 C 224.000 43.582 220.418 40.000 216.000 40.000 ZM 77.530 56.000 L 99.270 56.000 L 178.470 200.000 L 156.730 200.000 Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
