package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorThinIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.7 134.47c-.62-1.496-2.08-2.472-3.7-2.47h-44v-28c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v28h-44c-1.619-.001-3.079 .973-3.698 2.469-.62 1.496-.277 3.217 .868 4.361l96 96c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l96-96c1.145-1.143 1.489-2.865 .87-4.36ZM128 226.34 41.66 140h38.34c2.209 0 4-1.791 4-4v-28h88v28c0 2.209 1.791 4 4 4h38.34ZM76 40c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4ZM76 72c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4Z"),
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
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
