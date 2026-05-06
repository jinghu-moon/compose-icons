package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorLightIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M42 128c0-3.314 2.686-6 6-6h72c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-72c-3.314 0-6-2.686-6-6ZM48 70h56c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-56c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM184 186h-136c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h136c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM228.24 83.76l-40-40c-2.343-2.34-6.137-2.34-8.48 0l-40 40c-2.203 2.364-2.138 6.048 .147 8.333 2.285 2.285 5.969 2.35 8.333 .147L178 62.49v81.51c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-81.51l29.76 29.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333Z"),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
