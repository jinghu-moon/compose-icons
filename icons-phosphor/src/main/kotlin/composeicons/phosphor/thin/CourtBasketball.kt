package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorThinIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192C25.373 52 20 57.373 20 64v128c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM228 164h-12c-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36h12ZM28 92h12c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36h-12ZM28 192v-20h12c24.301 0 44-19.699 44-44C84 103.699 64.301 84 40 84h-12v-20c0-2.209 1.791-4 4-4h92v136h-92c-2.209 0-4-1.791-4-4ZM224 196h-92v-136h92c2.209 0 4 1.791 4 4v20h-12c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44h12v20c0 2.209-1.791 4-4 4Z"),
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
