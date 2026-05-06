package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorDuotoneIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 64v128c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M48 136c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L189.92 208h-157.92c-8.837 0-16-7.163-16-16v-128C16 55.163 23.163 48 32 48h12.46L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM175.37 192 160.82 176h-104.82c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h90.28L131.73 144h-27.73c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h13.19L59 64h-27v128ZM200 144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-21.48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM224 48h-118.21c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h118.21v130.83c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-130.83c0-8.837-7.163-16-16-16Z"),
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
