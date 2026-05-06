package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorThinIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h13.39c1.545-.002 2.95-.894 3.61-2.29 8.6-18.167 26.9-29.751 47-29.751 20.1 0 38.4 11.584 47 29.751 .66 1.396 2.065 2.288 3.61 2.29h61.39c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM220 200c0 2.209-1.791 4-4 4h-58.92c-7.354-13.819-19.789-24.242-34.68-29.07 13.931-8.284 20.608-24.856 16.313-40.484C134.417 118.818 120.208 107.987 104 107.987c-16.208 0-30.417 10.831-34.713 26.459-4.296 15.628 2.382 32.2 16.313 40.484C70.709 179.758 58.274 190.181 50.92 204h-10.92c-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM104 172C88.536 172 76 159.464 76 144c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM196 80v96c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-88h-120v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
