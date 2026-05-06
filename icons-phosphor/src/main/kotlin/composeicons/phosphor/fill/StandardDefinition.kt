package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorFillIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 128c0 17.673-14.327 32-32 32h-8v-64h8c17.673 0 32 14.327 32 32ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM120 148c0-19.88-19.92-25.35-34.47-29.34-12.06-3.31-20-5.84-20-10.66 0-6.73 8.1-12 18.44-12 8 0 14.85 3.13 17.42 8 2.074 3.902 6.918 5.384 10.82 3.31 3.902-2.074 5.384-6.918 3.31-10.82C110.16 86.31 98.07 80 84 80 64.36 80 49.56 92 49.56 108c0 17.38 17.6 22.21 31.74 26.09 16 4.39 22.7 7.3 22.7 13.91 0 5.68-8.21 12-20 12C72.21 160 64 153.68 64 148c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 15.7 15.81 28 36 28 20.19 0 36-12.3 36-28ZM208 128C207.972 101.502 186.498 80.028 160 80h-16c-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8h16c26.498-.028 47.972-21.502 48-48Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
