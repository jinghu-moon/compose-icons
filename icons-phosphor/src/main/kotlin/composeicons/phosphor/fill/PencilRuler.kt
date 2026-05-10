package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorFillIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v160c0 8.837-7.163 16-16 16h-48c-8.837 0-16-7.163-16-16v-28c0-2.209 1.791-4 4-4h36c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.371-4.265-3.969-7.523-8.25-7.47h-35.75c-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4h36c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.371-4.265-3.969-7.523-8.25-7.47h-35.75c-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4h36c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.372-4.273-3.981-7.533-8.27-7.47h-35.73c-2.209 0-4-1.791-4-4v-28c0-8.837 7.163-16 16-16h48c8.837 0 16 7.163 16 16ZM109.66 58.34c1.5 1.502 2.342 3.538 2.34 5.66v144c0 8.837-7.163 16-16 16h-48c-8.837 0-16-7.163-16-16v-144c-.002-2.122 .84-4.158 2.34-5.66l32-32C67.841 24.838 69.877 23.994 72 23.994c2.123 0 4.159 .844 5.66 2.346ZM48 80v104h16v-104ZM80 80v104h16v-104ZM51.31 64h41.38L72 43.31Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
