package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorRegularIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.63 96.44 58.63 32.44c-2.447-.852-5.155-.466-7.267 1.036C49.252 34.978 47.998 37.409 48 40v176c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-42.31L242.63 111.56c3.222-1.115 5.383-4.15 5.383-7.56 0-3.41-2.161-6.445-5.383-7.56ZM64 156.75v-105.5L215.65 104Z"),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
