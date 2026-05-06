package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorBoldIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 180h-4v-118.87l6.51-1.39c4.254-.833 7.728-3.895 9.089-8.01 1.36-4.116 .395-8.645-2.524-11.849-2.92-3.204-7.34-4.584-11.564-3.611L13.51 84.27C7.521 85.562 3.467 91.159 4.106 97.252 4.746 103.346 9.873 107.979 16 108c.85 .002 1.698-.085 2.53-.26l1.48-.32v72.58h-4.01C9.373 180 4 185.373 4 192c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 102.27l168-36v113.73h-20v-60c0-6.627-5.373-12-12-12h-104c-6.627 0-12 5.373-12 12v60h-20ZM168 144h-80v-12h80ZM88 168h80v12h-80Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
