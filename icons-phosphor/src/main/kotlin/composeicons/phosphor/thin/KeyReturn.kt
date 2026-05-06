package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorThinIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 104v32c0 2.209-1.791 4-4 4h-86.34l17.17 17.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0l-24-24c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l24-24c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L89.66 132h82.34v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM228 56v144c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-144C28 49.373 33.373 44 40 44h176c6.627 0 12 5.373 12 12ZM220 56c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v144c0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4Z"),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
