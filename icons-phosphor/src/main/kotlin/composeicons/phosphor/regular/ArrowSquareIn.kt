package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorRegularIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 136v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-44.68L45.66 221.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L100.68 144h-44.68c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM208 32h-128C71.163 32 64 39.163 64 48v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h128v128h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
