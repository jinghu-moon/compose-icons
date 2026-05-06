package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorThinIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 128v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM178.18 52.65c-1.197-.848-2.762-.973-4.078-.326-1.316 .647-2.173 1.963-2.231 3.429-.059 1.466 .689 2.846 1.95 3.597C198.08 75.17 212 100.2 212 128c0 46.392-37.608 84-84 84C81.608 212 44 174.392 44 128 44 100.2 57.92 75.17 82.18 59.35c1.752-1.242 2.211-3.645 1.04-5.445C82.049 52.105 79.665 51.551 77.82 52.65 51.24 70 36 97.44 36 128c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 97.44 204.76 70 178.18 52.65Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
