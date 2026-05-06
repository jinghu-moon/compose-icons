package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorFillIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M74.34 173.66C72.838 172.159 71.994 170.123 71.994 168c0-2.123 .844-4.159 2.346-5.66L132.69 104 90.34 61.66C88.049 59.372 87.364 55.929 88.603 52.938 89.842 49.947 92.762 47.997 96 48h96c4.418 0 8 3.582 8 8v96c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737L144 115.31 85.66 173.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346ZM216 208h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
