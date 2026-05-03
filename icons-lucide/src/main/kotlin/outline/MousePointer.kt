package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointer: ImageVector
    get() {
        if (_mousePointer != null) return _mousePointer!!
        _mousePointer = lucideOutlineIcon(
            name = "MousePointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.586 12.586 L 19.000 19.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 3.688 3.037 C 3.502 2.959 3.286 3.001 3.144 3.144 C 3.001 3.286 2.959 3.502 3.037 3.688 L 9.537 19.687 C 9.619 19.885 9.818 20.010 10.033 19.996 C 10.247 19.982 10.429 19.832 10.484 19.625 L 12.053 13.542 C 12.223 12.818 12.781 12.248 13.501 12.063 L 19.625 10.484 C 19.834 10.430 19.984 10.248 19.998 10.033 C 20.013 9.818 19.888 9.618 19.688 9.537 Z"),
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
        return _mousePointer!!
    }

private var _mousePointer: ImageVector? = null
