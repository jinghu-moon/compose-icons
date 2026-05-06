package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorLightIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.33 123l-48-32c-1.842-1.229-4.212-1.344-6.164-.297C107.214 91.749 105.997 93.785 106 96v64c-.003 2.215 1.214 4.251 3.166 5.297 1.952 1.046 4.322 .932 6.164-.297l48-32c1.676-1.112 2.683-2.989 2.683-5 0-2.011-1.008-3.888-2.683-5ZM118 148.79v-41.58L149.18 128ZM232.4 70C230.639 63.158 225.699 57.577 219.12 55 185 41.79 130.27 42 128 42c-2.27 0-57-.21-91.16 13C30.277 57.588 25.353 63.166 23.6 70 21.05 79.89 18 98 18 128c0 30 3.05 48.11 5.6 58 1.761 6.842 6.701 12.423 13.28 15C71 214.21 125.72 214 128 214h.71c6.91 0 58-.44 90.45-13 6.579-2.577 11.519-8.158 13.28-15 2.55-9.87 5.6-27.93 5.6-58 0-30.07-3.04-48.11-5.64-58ZM220.78 183c-.781 3.118-3.014 5.671-6 6.86C182.78 202.19 128.58 202 128 202c-.58 0-54.71 .2-86.75-12.17-2.986-1.189-5.219-3.742-6-6.86C32.84 173.78 30 156.78 30 128 30 99.22 32.84 82.22 35.22 73c.781-3.118 3.014-5.671 6-6.86C72.06 54.26 123.53 54 127.76 54h.24c.54 0 54.71-.2 86.75 12.17 2.986 1.189 5.219 3.742 6 6.86 2.38 9.19 5.22 26.19 5.22 55 0 28.81-2.81 45.75-5.19 54.97Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
