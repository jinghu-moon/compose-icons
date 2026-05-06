package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorBoldIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.9 152.72l-39.7 14.44L152.46 152.86c-2.863-1.146-6.057-1.146-8.92 0L108 167.08 72.46 152.86c-2.739-1.098-5.786-1.147-8.56-.14l-44 16c-6.23 2.264-9.444 9.15-7.18 15.38 2.264 6.23 9.15 9.444 15.38 7.18l8.12-2.95C38.473 210.828 57.39 227.969 80 228h96c24.289-.028 43.972-19.711 44-44v-2.87l16.1-5.85c6.23-2.264 9.444-9.15 7.18-15.38-2.264-6.23-9.15-9.444-15.38-7.18ZM176 204h-96C68.954 204 60 195.046 60 184v-4.32l7.8-2.84 35.74 14.3c2.863 1.146 6.057 1.146 8.92 0L148 176.92l35.54 14.22c2.739 1.098 5.787 1.147 8.56 .14l2.89-1.06C192.302 198.434 184.642 203.992 176 204ZM12 128c0-6.627 5.373-12 12-12h208c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-208c-6.627 0-12-5.373-12-12ZM48.2 104h159.6c6.467-.005 12.546-3.082 16.38-8.29 3.746-5.076 4.818-11.646 2.88-17.65C216.12 43.88 175.39 20 128 20 80.61 20 39.89 43.87 28.94 78.05c-1.943 6.003-.871 12.576 2.88 17.65 3.827 5.217 9.91 8.299 16.38 8.3ZM128 44c33.7 0 63.61 14.85 74 36h-148C64.4 58.85 94.31 44 128 44Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
