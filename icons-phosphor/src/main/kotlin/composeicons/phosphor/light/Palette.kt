package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorLightIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M199.37 55.31C180.376 36.51 154.724 25.975 128 26h-1C71.058 26.548 25.997 72.055 26 128c0 42.09 26.07 77.44 68 92.26 3.246 1.152 6.665 1.741 10.11 1.74 16.512-.093 29.857-13.488 29.89-30 0-9.941 8.059-18 18-18h46.21c14.017 .07 26.19-9.631 29.25-23.31 1.754-7.736 2.607-15.648 2.54-23.58C229.797 100.045 218.766 74.187 199.37 55.31ZM215.76 148c-1.83 8.213-9.136 14.041-17.55 14h-46.21c-16.569 0-30 13.431-30 30 .01 5.849-2.823 11.337-7.596 14.718C109.632 210.098 103.514 210.95 98 209 61 195.86 38 164.85 38 128 37.997 78.655 77.728 38.51 127.07 38h.93c49.327 .182 89.389 39.897 90 89.22 .059 6.99-.693 13.963-2.24 20.78ZM138 76c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM94 100c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10C74 94.477 78.477 90 84 90c5.523 0 10 4.477 10 10ZM94 156c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM182 100c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
