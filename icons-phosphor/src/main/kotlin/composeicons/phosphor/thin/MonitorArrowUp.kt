package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorThinIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-160C36.954 44 28 52.954 28 64v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-112C228 52.954 219.046 44 208 44ZM220 176c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-112C36 57.373 41.373 52 48 52h160c6.627 0 12 5.373 12 12ZM164 224c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM154.83 109.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L132 97.66v54.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-54.34l-17.17 17.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l24-24c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173Z"),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
