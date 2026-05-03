package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = lucideOutlineIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 6.000 C 12.000 5.191 12.487 4.462 13.235 4.153 C 13.982 3.843 14.842 4.014 15.414 4.586 L 21.414 10.586 C 22.195 11.367 22.195 12.633 21.414 13.414 L 15.414 19.414 C 14.842 19.986 13.982 20.157 13.235 19.847 C 12.487 19.538 12.000 18.809 12.000 18.000 Z"),
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
        pathData = parseSvgPathData("M 2.000 6.000 C 2.000 5.191 2.487 4.462 3.235 4.153 C 3.982 3.843 4.842 4.014 5.414 4.586 L 11.414 10.586 C 12.195 11.367 12.195 12.633 11.414 13.414 L 5.414 19.414 C 4.842 19.986 3.982 20.157 3.235 19.847 C 2.487 19.538 2.000 18.809 2.000 18.000 Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
