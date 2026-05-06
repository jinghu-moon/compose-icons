package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) return _grainsSlash!!
        _grainsSlash = phosphorLightIcon(
            name = "GrainsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L56.66 58.41C53.782 58.128 50.892 57.991 48 58c-3.314 0-6 2.686-6 6v80c.055 47.474 38.526 85.945 86 86h0c23.045 .02 45.13-9.231 61.28-25.67L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM70.27 73.42l68.6 75.45c-4.466 6.04-8.121 12.64-10.87 19.63C115.816 137.689 87.048 116.591 54 114.23v-44c5.527 .443 10.985 1.513 16.27 3.19ZM122 217.76C83.605 214.589 54.046 182.525 54 144v-17.76c38.395 3.171 67.954 35.235 68 73.76ZM134 217.76v-17.76c.017-15.006 4.592-29.653 13.12-42l34.06 37.47C168.692 208.397 151.916 216.322 134 217.76ZM214 64v80c.003 7.727-1.033 15.419-3.08 22.87-.715 2.603-3.081 4.408-5.78 4.41-.537-.002-1.071-.072-1.59-.21-1.536-.421-2.842-1.435-3.63-2.819-.788-1.384-.993-3.025-.57-4.561 1.764-6.415 2.655-13.037 2.65-19.69v-17.76c-9.575 .753-18.907 3.39-27.46 7.76-2.955 1.502-6.568 .325-8.07-2.63-1.502-2.955-.325-6.568 2.63-8.07 10.239-5.22 21.432-8.306 32.9-9.07v-44c-21.567 1.781-41.285 12.878-54 30.39-1.192 1.885-3.331 2.953-5.553 2.774-2.223-.179-4.163-1.576-5.037-3.628-.874-2.051-.539-4.418 .87-6.146 6.975-9.613 15.861-17.682 26.1-23.7C154.73 48.33 135.12 35.15 127.97 30.92c-9.383 5.612-17.798 12.704-24.92 21-1.374 1.673-3.542 2.477-5.674 2.103-2.132-.374-3.898-1.868-4.62-3.909-.722-2.041-.289-4.313 1.134-5.944 8.808-10.352 19.454-18.987 31.4-25.47 1.687-.842 3.673-.842 5.36 0 1.33 .67 30.79 15.69 44.49 45.93C185.55 60.278 196.717 58.025 208 58c3.314 0 6 2.686 6 6Z"),
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
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
