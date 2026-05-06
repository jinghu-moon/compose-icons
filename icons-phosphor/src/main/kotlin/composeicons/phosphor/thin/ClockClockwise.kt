package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorThinIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 80v45.74l38.06 22.83c1.894 1.138 2.508 3.596 1.37 5.49-1.138 1.894-3.596 2.508-5.49 1.37l-40-24c-1.204-.723-1.94-2.025-1.94-3.43v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM224 60c-2.209 0-4 1.791-4 4v28.85C211.33 82.46 203 73 193.05 63 157.358 27.335 99.6 27.072 63.585 62.41 27.57 97.749 26.739 155.502 61.722 191.863c34.983 36.361 92.725 37.76 129.428 3.137 1.607-1.519 1.679-4.053 .16-5.66-1.519-1.607-4.053-1.679-5.66-.16C152.142 220.803 99.416 219.534 67.469 186.335 35.522 153.136 36.279 100.399 69.166 68.131c32.887-32.268 85.628-32.023 118.214 .549C197.7 79 206.39 89 215.53 100h-31.53c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
