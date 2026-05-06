package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorDuotoneIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 88l-48 48v-96Z"),
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
                pathData = parseSvgPathData("M172.94 143.39c2.989 1.24 6.431 .557 8.72-1.73l48-48c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-48-48c-2.288-2.291-5.731-2.976-8.722-1.737C169.947 33.842 167.997 36.762 168 40v40h-80C52.654 80 24 108.654 24 144c0 35.346 28.654 64 64 64h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-88C61.49 192 40 170.51 40 144 40 117.49 61.49 96 88 96h80v40c.001 3.236 1.95 6.152 4.94 7.39ZM184 59.31 212.69 88 184 116.69Z"),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
