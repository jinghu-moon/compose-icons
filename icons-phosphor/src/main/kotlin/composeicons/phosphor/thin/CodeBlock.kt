package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorThinIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M61.17 98.83l-32-32C28.419 66.08 27.997 65.062 27.997 64c0-1.062 .422-2.08 1.173-2.83L61.17 29.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L37.66 64 66.83 93.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0ZM101.17 98.83c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83l-32-32c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L130.34 64 101.17 93.17c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83ZM200 44h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4 1.791 4 4v144c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-64c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v64c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12Z"),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
