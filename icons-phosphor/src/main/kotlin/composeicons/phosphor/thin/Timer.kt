package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorThinIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 44C77.19 44 36 85.19 36 136c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C219.945 85.213 178.787 44.055 128 44ZM128 220C81.608 220 44 182.392 44 136 44 89.608 81.608 52 128 52c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM170.83 93.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-40 40c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l40-40c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM100 16c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4Z"),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
