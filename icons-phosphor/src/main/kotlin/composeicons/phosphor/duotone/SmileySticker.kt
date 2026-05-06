package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorDuotoneIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.011 9.561-1.408 19.069-4.21 28.21l-63.57 63.58C116.604 231.974 73.642 217.357 49.676 183.541 25.71 149.726 26.152 104.347 50.773 71.005 75.394 37.663 118.633 23.887 158.003 36.84 197.374 49.794 223.986 86.553 224 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M174.92 156C164.63 173.79 147.53 184 128 184 108.47 184 91.37 173.8 81.08 156c-1.576-2.48-1.666-5.624-.234-8.191 1.432-2.566 4.156-4.14 7.094-4.101 2.938 .04 5.618 1.687 6.98 4.291 7.47 12.91 19.21 20 33.08 20 13.87 0 25.61-7.1 33.08-20 1.362-2.604 4.042-4.251 6.98-4.291 2.938-.04 5.662 1.535 7.094 4.101 1.432 2.566 1.342 5.711-.234 8.191ZM232 128c.005 10.357-1.532 20.656-4.56 30.56-.386 1.25-1.073 2.387-2 3.31l-63.57 63.57c-.918 .929-2.052 1.616-3.3 2C115.653 240.638 69.111 224.803 43.148 188.169 17.186 151.535 17.665 102.376 44.338 66.255 71.01 30.135 117.852 15.211 160.504 29.244 203.156 43.278 231.985 83.099 232 128ZM216 128C215.953 90.248 191.803 56.744 156.003 44.763 120.203 32.782 80.751 45.001 57.99 75.12 35.23 105.239 34.245 146.528 55.545 177.697c21.3 31.169 60.125 45.254 96.455 34.993L212.69 152c2.204-7.809 3.318-15.886 3.31-24ZM92 120c6.627 0 12-5.373 12-12C104 101.373 98.627 96 92 96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM164 96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
