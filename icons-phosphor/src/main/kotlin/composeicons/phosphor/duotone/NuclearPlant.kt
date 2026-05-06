package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorDuotoneIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.33 216h-140.66C51.16 189.65 70 144.55 71.86 95.64c.193-4.277 3.719-7.644 8-7.64h56.3c4.281-.004 7.807 3.363 8 7.64C146 144.55 164.84 189.65 178.33 216Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 208h-20.55C208 187.65 186.26 143.12 184.16 95.28c-.385-8.554-7.437-15.289-16-15.28h-88.31c-8.604-.054-15.692 6.742-16 15.34C62.21 139.34 46.5 180.17 32.73 208h-16.73c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM50.5 208C64.06 179.07 78.24 139.06 79.85 96l55.35-.06c.332 .042 .666 .062 1 .06 1.62 43.09 15.8 83.09 29.35 112ZM183.26 208C169.56 180.31 153.94 139.71 152.17 96h16c2 45.66 20.5 88.1 33.06 112ZM152 32h24c4.418 0 8-3.582 8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 13.255-10.745 24-24 24h-24c-4.418 0-8 3.582-8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-13.255 10.745-24 24-24ZM96 56C96.033 25.086 121.086 .033 152 0h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8c-22.091 0-40 17.909-40 40 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
