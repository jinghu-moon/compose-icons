package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Subtitles: ImageVector
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = phosphorBoldIcon(
            name = "Subtitles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C20.954 44 12 52.954 12 64v128c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-128C244 52.954 235.046 44 224 44ZM220 188h-184v-120h184ZM48 128c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12ZM104 128c0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12ZM48 164c0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12ZM208 164c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12Z"),
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
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
