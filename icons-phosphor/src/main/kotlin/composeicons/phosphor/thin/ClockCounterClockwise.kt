package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorThinIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 80v45.74l38.06 22.83c1.894 1.138 2.508 3.596 1.37 5.49-1.138 1.894-3.596 2.508-5.49 1.37l-40-24c-1.204-.723-1.94-2.025-1.94-3.43v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM128 36C103.574 35.946 80.142 45.669 62.93 63 53.05 73 44.66 82.47 36 92.86v-28.86c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-31.53C49.61 89 58.3 79 68.6 68.6c32.579-32.581 85.323-32.838 118.217-.575 32.894 32.263 33.66 85.002 1.717 118.206-31.944 33.205-84.673 34.48-118.184 2.859-1.607-1.519-4.141-1.447-5.66 .16-1.519 1.607-1.447 4.141 .16 5.66 30.043 28.352 75.301 33.203 110.671 11.863 35.37-21.34 52.179-63.639 41.105-103.436C205.551 63.54 169.309 36.003 128 36Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
