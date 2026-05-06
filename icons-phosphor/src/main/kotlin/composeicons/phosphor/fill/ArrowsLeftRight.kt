package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorFillIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M42.34 85.66C40.838 84.159 39.994 82.123 39.994 80c0-2.123 .844-4.159 2.346-5.66L74.34 42.34c2.288-2.291 5.731-2.976 8.722-1.737C86.053 41.842 88.003 44.762 88 48v24h120c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-120v24c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737ZM213.66 170.34l-32-32c-2.288-2.291-5.731-2.976-8.722-1.737-2.991 1.239-4.94 4.159-4.938 7.397v24h-120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h120v24c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
