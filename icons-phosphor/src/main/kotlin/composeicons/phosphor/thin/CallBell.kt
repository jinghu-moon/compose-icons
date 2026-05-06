package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorThinIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 180h208c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-20C219.942 102.769 181.182 62.287 132 60.09v-24.09h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v24.09C74.818 62.287 36.058 102.769 36 152v20h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM44 152C44 105.608 81.608 68 128 68c46.392 0 84 37.608 84 84v20h-168ZM236 208c0 2.209-1.791 4-4 4h-208c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h208c2.209 0 4 1.791 4 4Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
