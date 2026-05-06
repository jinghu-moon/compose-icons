package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorThinIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 208c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v14.34l60 60L125.17 93.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L196 158.34v-30.34c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v40c-.002 .262-.029 .523-.08 .78-.027 .115-.061 .229-.1 .34-.033 .14-.076 .277-.13 .41-.057 .135-.123 .265-.2 .39-.05 .1-.1 .2-.16 .3-.297 .437-.673 .813-1.11 1.11l-.31 .16c-.122 .074-.249 .141-.38 .2-.133 .054-.27 .097-.41 .13-.111 .039-.225 .073-.34 .1-.257 .051-.518 .078-.78 .08h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h30.34L128 101.66 98.83 130.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L36 73.66v130.34h188c2.209 0 4 1.791 4 4Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
