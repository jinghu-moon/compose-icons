package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorLightIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M126 128c0 3.314-2.686 6-6 6h-72c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h72c3.314 0 6 2.686 6 6ZM48 70h136c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-136c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM104 186h-56c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h56c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM228.24 163.76c-2.343-2.34-6.137-2.34-8.48 0L190 193.51v-81.51c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v81.51L148.24 163.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l40 40c2.343 2.34 6.137 2.34 8.48 0l40-40c2.34-2.343 2.34-6.137 0-8.48Z"),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
