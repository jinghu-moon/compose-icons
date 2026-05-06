package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorRegularIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 144h-76.7l2.35-2.35h0l20.06-20.06c8.102 4.08 17.029 6.256 26.1 6.36 9.13 .024 18.09-2.474 25.89-7.22 23.72-14.36 36.43-47.6 34-88.92-.237-4.051-3.469-7.283-7.52-7.52-41.32-2.42-74.56 10.28-88.92 34-9.36 15.45-9.6 34.11-.87 52L120 124.68 107.79 112.47c6-13.25 5.57-27-1.39-38.48C95.53 56 70.61 46.41 39.73 48.22c-4.044 .241-7.269 3.466-7.51 7.51C30.4 86.6 40 111.52 58 122.4c6.022 3.677 12.944 5.615 20 5.6 6.401-.063 12.715-1.492 18.52-4.19L108.68 136l-8 8h-44.68c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h9.59l13.21 59.47c1.596 7.34 8.108 12.565 15.62 12.53h67.17c7.512 .035 14.024-5.19 15.62-12.53L190.42 160h9.58c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM149 66.58c10.46-17.26 35.24-27 67-26.57 .41 31.81-9.31 56.58-26.57 67-11.51 7-25.4 6.54-39.28-1.18C142.42 92 142 78.09 149 66.58ZM92.11 108.11c-9.2 4.93-18.31 5.16-25.83 .6C54.78 101.74 48.15 85.31 48 64c21.31 .15 37.75 6.78 44.71 18.28 4.56 7.52 4.29 16.63-.6 25.83ZM161.59 216h-67.17L82 160h92Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
