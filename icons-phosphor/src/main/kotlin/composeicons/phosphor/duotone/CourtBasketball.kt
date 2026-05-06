package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorDuotoneIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 88v80h-16c-22.091 0-40-17.909-40-40 0-22.091 17.909-40 40-40ZM40 88h-16v80h16c22.091 0 40-17.909 40-40C80 105.909 62.091 88 40 88Z"),
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
                pathData = parseSvgPathData("M224 48h-192C23.163 48 16 55.163 16 64v128c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM224 160h-8c-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32h8ZM32 96h8c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32h-8ZM32 176h8c26.51 0 48-21.49 48-48C88 101.49 66.51 80 40 80h-8v-16h88v128h-88ZM224 192h-88v-128h88v16h-8c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48h8v16Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
