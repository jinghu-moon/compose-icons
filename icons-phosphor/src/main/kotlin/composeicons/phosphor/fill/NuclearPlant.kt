package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorFillIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 32h24c4.418 0 8-3.582 8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 13.255-10.745 24-24 24h-24c-4.418 0-8 3.582-8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-13.255 10.745-24 24-24ZM104 64c4.418 0 8-3.582 8-8 0-22.091 17.909-40 40-40h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8C121.086 .033 96.033 25.086 96 56c0 4.418 3.582 8 8 8ZM248 216c0 4.418-3.582 8-8 8h-224c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16.74C46.51 180.17 62.22 139.31 63.86 95.34 64.168 86.745 71.25 79.951 79.85 80h88.33c8.563-.009 15.615 6.726 16 15.28 2.1 47.84 23.84 92.37 35.29 112.72h20.53c4.418 0 8 3.582 8 8ZM168.18 96h-16c1.77 43.72 17.39 84.32 31.09 112h18C188.68 184.08 170.18 141.64 168.18 96Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
