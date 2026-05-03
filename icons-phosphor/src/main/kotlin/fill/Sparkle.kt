package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorFillIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 144.000 C 208.042 150.684 203.867 156.670 197.580 158.940 L 146.000 178.000 L 127.000 229.620 C 124.695 235.881 118.732 240.041 112.060 240.041 C 105.388 240.041 99.425 235.881 97.120 229.620 L 78.000 178.000 L 26.380 159.000 C 20.119 156.695 15.959 150.732 15.959 144.060 C 15.959 137.388 20.119 131.425 26.380 129.120 L 78.000 110.000 L 97.000 58.380 C 99.305 52.119 105.268 47.959 111.940 47.959 C 118.612 47.959 124.575 52.119 126.880 58.380 L 146.000 110.000 L 197.620 129.000 C 203.912 131.291 208.073 137.304 208.000 144.000 ZM 152.000 48.000 L 168.000 48.000 L 168.000 64.000 C 168.000 68.418 171.582 72.000 176.000 72.000 C 180.418 72.000 184.000 68.418 184.000 64.000 L 184.000 48.000 L 200.000 48.000 C 204.418 48.000 208.000 44.418 208.000 40.000 C 208.000 35.582 204.418 32.000 200.000 32.000 L 184.000 32.000 L 184.000 16.000 C 184.000 11.582 180.418 8.000 176.000 8.000 C 171.582 8.000 168.000 11.582 168.000 16.000 L 168.000 32.000 L 152.000 32.000 C 147.582 32.000 144.000 35.582 144.000 40.000 C 144.000 44.418 147.582 48.000 152.000 48.000 ZM 240.000 80.000 L 232.000 80.000 L 232.000 72.000 C 232.000 67.582 228.418 64.000 224.000 64.000 C 219.582 64.000 216.000 67.582 216.000 72.000 L 216.000 80.000 L 208.000 80.000 C 203.582 80.000 200.000 83.582 200.000 88.000 C 200.000 92.418 203.582 96.000 208.000 96.000 L 216.000 96.000 L 216.000 104.000 C 216.000 108.418 219.582 112.000 224.000 112.000 C 228.418 112.000 232.000 108.418 232.000 104.000 L 232.000 96.000 L 240.000 96.000 C 244.418 96.000 248.000 92.418 248.000 88.000 C 248.000 83.582 244.418 80.000 240.000 80.000 Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
