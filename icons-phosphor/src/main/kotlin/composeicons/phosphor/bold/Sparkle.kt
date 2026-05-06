package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorBoldIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M199 125.31 149.12 106.92 130.69 57C127.803 49.171 120.344 43.971 112 43.971c-8.344 0-15.803 5.2-18.69 13.029L74.92 106.92 25 125.31C17.171 128.197 11.971 135.656 11.971 144c0 8.344 5.2 15.803 13.029 18.69l49.88 18.39L93.31 231c2.887 7.829 10.346 13.029 18.69 13.029 8.344 0 15.803-5.2 18.69-13.029l18.39-49.88L199 162.69c7.829-2.887 13.029-10.346 13.029-18.69 0-8.344-5.2-15.803-13.029-18.69ZM135.62 160.47c-3.297 1.215-5.895 3.813-7.11 7.11L112 212.28 95.53 167.58c-1.215-3.297-3.813-5.895-7.11-7.11L43.72 144 88.42 127.53c3.297-1.215 5.895-3.813 7.11-7.11L112 75.72l16.47 44.7c1.215 3.297 3.813 5.895 7.11 7.11L180.28 144ZM140 40c0-6.627 5.373-12 12-12h12v-12C164 9.373 169.373 4 176 4c6.627 0 12 5.373 12 12v12h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12c-6.627 0-12-5.373-12-12ZM252 88c0 6.627-5.373 12-12 12h-4v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h4c6.627 0 12 5.373 12 12Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
