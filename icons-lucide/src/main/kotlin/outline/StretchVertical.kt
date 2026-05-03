package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StretchVertical: ImageVector
    get() {
        if (_stretchVertical != null) return _stretchVertical!!
        _stretchVertical = lucideOutlineIcon(
            name = "StretchVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 2.000 L 8.000 2.000 C 9.105 2.000 10.000 2.895 10.000 4.000 L 10.000 20.000 C 10.000 21.105 9.105 22.000 8.000 22.000 L 6.000 22.000 C 4.895 22.000 4.000 21.105 4.000 20.000 L 4.000 4.000 C 4.000 2.895 4.895 2.000 6.000 2.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 2.000 L 18.000 2.000 C 19.105 2.000 20.000 2.895 20.000 4.000 L 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 L 16.000 22.000 C 14.895 22.000 14.000 21.105 14.000 20.000 L 14.000 4.000 C 14.000 2.895 14.895 2.000 16.000 2.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _stretchVertical!!
    }

private var _stretchVertical: ImageVector? = null
