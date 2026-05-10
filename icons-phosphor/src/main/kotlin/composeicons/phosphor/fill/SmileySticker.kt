package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorFillIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C87.143 24.031 50.09 47.982 33.285 85.222 16.479 122.463 23.036 166.093 50.044 196.749c27.008 30.656 69.465 42.659 108.526 30.681 1.248-.384 2.382-1.071 3.3-2l63.57-63.57c.927-.923 1.614-2.06 2-3.31 9.653-31.544 3.783-65.797-15.824-92.326C192.01 39.695 160.988 24.03 128 24ZM92 96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM174.92 156C164.63 173.79 147.53 184 128 184 108.47 184 91.37 173.8 81.08 156c-1.576-2.48-1.666-5.624-.234-8.191 1.432-2.566 4.156-4.14 7.094-4.101 2.938 .04 5.618 1.687 6.98 4.291 7.47 12.91 19.21 20 33.08 20 13.87 0 25.61-7.1 33.08-20 1.362-2.604 4.042-4.251 6.98-4.291 2.938-.04 5.662 1.535 7.094 4.101 1.432 2.566 1.342 5.711-.234 8.191ZM164 120c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
