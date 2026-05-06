package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorThinIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 144c-.039 33.121-26.879 59.961-60 60h-88c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h88c28.719 0 52-23.281 52-52C220 115.281 196.719 92 168 92h-126.34l41.17 41.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0l-48-48C28.419 90.08 27.997 89.062 27.997 88c0-1.062 .422-2.08 1.173-2.83l48-48c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L41.66 84h126.34c33.121 .039 59.961 26.879 60 60Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
