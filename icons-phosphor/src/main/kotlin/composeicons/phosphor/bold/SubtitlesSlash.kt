package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorBoldIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 128c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12ZM216.88 207.93c2.945 3.163 3.961 7.665 2.661 11.786-1.3 4.121-4.716 7.225-8.942 8.126-4.227 .901-8.611-.54-11.479-3.773L188.12 212h-156.12C20.954 212 12 203.046 12 192v-128C12 52.954 20.954 44 32 44h4.68c-1.91-5.389 .247-11.378 5.155-14.31 4.908-2.933 11.204-1.995 15.045 2.24ZM166.33 188 155.42 176h-95.42c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h73.6L122.69 140h-6.69c-4.384-.002-8.419-2.396-10.522-6.243-2.104-3.847-1.942-8.535 .422-12.227L57.24 68h-21.24v120ZM224 44h-107.4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h103.4v114.94c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-118.94C244 52.954 235.046 44 224 44ZM196 140c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-13.94c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12Z"),
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
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
