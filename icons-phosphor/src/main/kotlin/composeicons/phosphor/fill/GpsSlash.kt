package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorFillIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 136h-24.37c-1.064 11.774-4.51 23.209-10.13 33.61-.611 1.152-1.745 1.934-3.039 2.096-1.294 .161-2.586-.318-3.461-1.286L92.51 53.28c-.875-.96-1.23-2.284-.951-3.552 .278-1.268 1.155-2.323 2.351-2.828 8.306-3.516 17.107-5.719 26.09-6.53v-24.37c-.005-2.217 .91-4.336 2.527-5.853C124.144 8.631 126.318 7.853 128.53 8c4.275 .367 7.538 3.979 7.47 8.27v24.1c42.252 3.912 75.718 37.378 79.63 79.63h24.1c4.283-.058 7.883 3.202 8.25 7.47 .147 2.208-.628 4.379-2.14 5.995-1.512 1.616-3.626 2.534-5.84 2.535ZM53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L63.17 68.58C50.126 82.749 42.113 100.82 40.37 120h-24.37c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24.37c3.912 42.252 37.378 75.718 79.63 79.63v24.37c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24.37c16.337-1.478 31.93-7.517 45-17.43l21.08 23.18c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
