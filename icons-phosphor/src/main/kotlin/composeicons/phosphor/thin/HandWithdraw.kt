package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorThinIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 198.65v41.35c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-41.35c-.074-24.936-11.941-48.367-32-63.18v66.84c.002 1.771-1.161 3.332-2.858 3.838-1.697 .506-3.525-.165-4.492-1.648L170 188.19l-.12-.19c-4.393-7.668-14.172-10.323-21.84-5.93-7.668 4.393-10.323 14.172-5.93 21.84l22.2 33.9c.836 1.195 .955 2.75 .311 4.058-.644 1.308-1.949 2.163-3.405 2.229-1.457 .067-2.834-.664-3.595-1.908l-22.26-34c-.046-.06-.086-.123-.12-.19-6.544-11.452-2.619-26.039 8.788-32.662 11.407-6.623 26.021-2.799 32.722 8.562l3.27 5v-124.9c0-2.209-1.791-4-4-4h-16.02c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c6.627 0 12 5.373 12 12v61.78c24.848 15.916 39.913 43.362 40 72.87ZM80 52h-16C57.373 52 52 57.373 52 64v136c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-136c0-2.209 1.791-4 4-4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM154.83 101.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L124 126.34v-110.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v110.34L90.83 101.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l32 32c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
