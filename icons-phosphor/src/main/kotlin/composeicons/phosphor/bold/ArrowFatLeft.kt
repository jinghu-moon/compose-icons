package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorBoldIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 68h-76v-36c-0-4.855-2.925-9.231-7.411-11.087-4.486-1.856-9.648-.827-13.079 2.607L15.51 119.52c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l96 96c3.436 3.44 8.608 4.467 13.097 2.6 4.489-1.867 7.409-6.258 7.393-11.12v-36h76c11.046 0 20-8.954 20-20v-80C228 76.954 219.046 68 208 68ZM204 164h-84c-6.627 0-12 5.373-12 12v19L41 128 108 61v19c0 6.627 5.373 12 12 12h84Z"),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
