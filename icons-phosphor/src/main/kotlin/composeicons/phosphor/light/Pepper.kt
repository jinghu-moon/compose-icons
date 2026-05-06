package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorLightIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M165.57 42.26C162.707 23.718 146.762 10.027 128 10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 12.183-.001 22.733 8.458 25.38 20.35C121.898 45.768 98.034 72.333 98 104c0 47.75-26.23 79.68-78 94.93-6.26 1.825-10.431 7.731-10.058 14.241 .373 6.51 5.191 11.9 11.618 12.999 14.944 2.581 30.084 3.863 45.25 3.83 40.36 0 85.23-9 116.19-35 25.88-21.71 39-52.33 39-91C221.967 71.931 197.506 45.169 165.57 42.26ZM160 54c21.975 .027 41.367 14.374 47.82 35.38L192 97.28 162.68 82.62c-1.687-.842-3.673-.842-5.36 0L128 97.28 112.19 89.37C118.64 68.367 138.029 54.023 160 54ZM175.28 185.82C150.15 206.89 95.36 227 23.67 214.33c-.959-.108-1.681-.925-1.67-1.89-.119-.938 .504-1.809 1.43-2C80.06 193.73 110 156.92 110 104c0-.76 0-1.51 .06-2.26l15.26 7.63c1.687 .842 3.673 .842 5.36 0L160 94.69l29.32 14.66c1.687 .842 3.673 .842 5.36 0l15.26-7.63c0 .75 .06 1.5 .06 2.26 0 35.02-11.68 62.51-34.72 81.83Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
