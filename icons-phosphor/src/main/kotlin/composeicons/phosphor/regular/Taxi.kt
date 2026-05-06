package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Taxi: ImageVector
    get() {
        if (_taxi != null) return _taxi!!
        _taxi = phosphorRegularIcon(
            name = "Taxi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 104h-11.36L201.25 56.06C198.401 51.076 193.101 48 187.36 48h-21.94l-12-29.94C151.009 11.977 145.123 7.987 138.58 8h-21.16c-6.551-.021-12.446 3.97-14.86 10.06L90.58 48h-21.94c-5.741 0-11.041 3.076-13.89 8.06L27.36 104h-11.36c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v80c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-16h96v16c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-80h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM117.42 24h21.16l9.6 24h-40.36ZM68.64 64h118.72l22.85 40h-164.42ZM64 200h-24v-16h24ZM192 200v-16h24v16ZM216 168h-176v-48h176ZM56 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM168 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8Z"),
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
        return _taxi!!
    }

private var _taxi: ImageVector? = null
