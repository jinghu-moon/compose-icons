package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorRegularIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 112h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM104 96h-8v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM241.48 200.65c-6.103 8.715-15.749 14.285-26.349 15.213-10.599 .928-21.066-2.88-28.591-10.403-.12-.12-.24-.24-.35-.37L146.48 160h-37L69.81 205.09l-.35 .37C62.702 212.203 53.547 215.993 44 216 33.361 215.996 23.269 211.287 16.432 203.136 9.595 194.985 6.713 184.227 8.56 173.75c-.005-.047-.005-.093 0-.14L24.93 89.52C29.959 60.891 54.822 40.008 83.89 40h88.11c28.968 .046 53.778 20.756 59 49.25 0 .06 0 .12 0 .18l16.37 84.17c.005 .047 .005 .093 0 .14 1.711 9.397-.41 19.087-5.89 26.91ZM172 144c24.301 0 44-19.699 44-44C216 75.699 196.301 56 172 56h-88.11C62.565 56.019 44.338 71.361 40.68 92.37v.13L24.3 176.59c-1.485 8.553 2.716 17.088 10.401 21.126 7.685 4.038 17.097 2.658 23.299-3.416L99.92 146.71c1.518-1.723 3.704-2.71 6-2.71ZM231.7 176.59l-8.74-45C212.031 149.237 192.757 159.983 172 160h-4.2L198 194.31c4.619 4.493 11.112 6.497 17.46 5.39 10.853-1.916 18.112-12.251 16.23-23.11Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
