package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) return _arrowFatLinesUp!!
        _arrowFatLinesUp = phosphorThinIcon(
            name = "ArrowFatLinesUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.83 117.17l-96-96c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L29.17 117.17c-1.145 1.144-1.488 2.866-.868 4.361 .62 1.496 2.08 2.47 3.698 2.469h44v28c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4v-28h44c1.619 .001 3.079-.973 3.698-2.469 .62-1.496 .277-3.217-.868-4.361ZM176 116c-2.209 0-4 1.791-4 4v28h-88v-28c0-2.209-1.791-4-4-4h-38.34L128 29.66 214.34 116ZM180 216c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4ZM180 184c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4Z"),
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
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
