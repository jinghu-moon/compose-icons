package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorBoldIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v101.28L118.51 42.22C116.403 38.386 112.375 36.002 108 36h-68C33.373 36 28 41.373 28 48c0 6.627 5.373 12 12 12h8v136h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8v-101.28l65.49 119.06c2.107 3.834 6.135 6.218 10.51 6.22h48c6.627 0 12-5.373 12-12v-148h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM80.3 60h20.6l74.8 136h-20.6Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
