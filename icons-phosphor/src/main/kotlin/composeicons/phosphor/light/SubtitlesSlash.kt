package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorLightIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L49 50h-17C24.268 50 18 56.268 18 64v128c0 7.732 6.268 14 14 14h158.8l12.76 14c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM32 194c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h27.89l61.82 68h-17.71c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h28.62l18.18 20h-94.8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h105.71l18.18 20ZM50 136c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM238 64v130.83c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-130.83c0-1.105-.895-2-2-2h-118.21c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h118.21c7.732 0 14 6.268 14 14ZM178.52 142c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h21.48c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6Z"),
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
