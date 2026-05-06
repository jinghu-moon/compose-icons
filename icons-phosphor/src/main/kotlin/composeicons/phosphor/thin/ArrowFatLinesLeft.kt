package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorThinIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 76h-28v-44c.001-1.619-.973-3.079-2.469-3.698-1.496-.62-3.217-.277-4.361 .868L21.17 125.17c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l96 96c1.144 1.145 2.866 1.488 4.361 .868 1.496-.62 2.47-2.08 2.469-3.698v-44h28c2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4ZM148 172h-28c-2.209 0-4 1.791-4 4v38.34L29.66 128 116 41.66v38.34c0 2.209 1.791 4 4 4h28ZM220 80v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM188 80v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
