package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorBoldIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.26 36.77c-22.369-22.365-58.631-22.365-81 0L36.77 138.26c-22.368 22.368-22.368 58.632 0 81 22.368 22.368 58.632 22.368 81 0L219.26 117.74c22.318-22.376 22.318-58.594 0-80.97ZM100.78 202.26c-8.277 8.958-20.792 12.668-32.614 9.667C56.345 208.926 47.114 199.695 44.113 187.874c-3.001-11.821 .709-24.337 9.667-32.614L96 113l47 47ZM202.28 100.77 160 143 113 96 155.27 53.74c13.116-12.118 33.462-11.716 46.089 .911 12.627 12.627 13.029 32.973 .911 46.089ZM192.51 75.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-24 24c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l24-24c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
