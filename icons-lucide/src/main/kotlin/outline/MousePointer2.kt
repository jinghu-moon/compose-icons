package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointer2: ImageVector
    get() {
        if (_mousePointer2 != null) return _mousePointer2!!
        _mousePointer2 = lucideOutlineIcon(
            name = "MousePointer2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.037 4.688 C 3.956 4.502 3.998 4.285 4.141 4.141 C 4.285 3.998 4.502 3.956 4.688 4.037 L 20.688 10.537 C 20.888 10.618 21.013 10.818 20.998 11.033 C 20.984 11.248 20.834 11.430 20.625 11.484 L 14.501 13.064 C 13.796 13.245 13.246 13.795 13.063 14.499 L 11.484 20.625 C 11.430 20.834 11.248 20.984 11.033 20.998 C 10.818 21.013 10.618 20.888 10.537 20.688 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _mousePointer2!!
    }

private var _mousePointer2: ImageVector? = null
