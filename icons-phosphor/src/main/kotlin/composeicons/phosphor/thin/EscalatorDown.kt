package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorThinIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.17 82.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L196 94.34v-46.34c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v46.34L221.17 77.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66l-24 24c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173ZM236 160v40c0 6.627-5.373 12-12 12h-56c-1.117-.001-2.183-.468-2.94-1.29L70.25 108h-38.25C25.373 108 20 102.627 20 96v-40C20 49.373 25.373 44 32 44h56c1.117 .001 2.183 .468 2.94 1.29L185.75 148h38.25c6.627 0 12 5.373 12 12ZM228 160c0-2.209-1.791-4-4-4h-40c-1.117-.001-2.183-.468-2.94-1.29L86.25 52h-54.25c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h40c1.117 .001 2.183 .468 2.94 1.29L169.75 204h54.25c2.209 0 4-1.791 4-4Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
