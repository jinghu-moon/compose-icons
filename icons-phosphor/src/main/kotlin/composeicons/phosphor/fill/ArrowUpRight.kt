package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorFillIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 64v104c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737L140 127.31 69.66 197.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L128.69 116 82.34 69.66C80.049 67.372 79.364 63.929 80.603 60.938 81.842 57.947 84.762 55.997 88 56h104c4.418 0 8 3.582 8 8Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
