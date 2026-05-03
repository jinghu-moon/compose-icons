package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignEndHorizontal: ImageVector
    get() {
        if (_alignEndHorizontal != null) return _alignEndHorizontal!!
        _alignEndHorizontal = lucideOutlineIcon(
            name = "AlignEndHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 2.000 L 8.000 2.000 C 9.105 2.000 10.000 2.895 10.000 4.000 L 10.000 16.000 C 10.000 17.105 9.105 18.000 8.000 18.000 L 6.000 18.000 C 4.895 18.000 4.000 17.105 4.000 16.000 L 4.000 4.000 C 4.000 2.895 4.895 2.000 6.000 2.000 Z"),
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
        pathData = parseSvgPathData("M 16.000 9.000 L 18.000 9.000 C 19.105 9.000 20.000 9.895 20.000 11.000 L 20.000 16.000 C 20.000 17.105 19.105 18.000 18.000 18.000 L 16.000 18.000 C 14.895 18.000 14.000 17.105 14.000 16.000 L 14.000 11.000 C 14.000 9.895 14.895 9.000 16.000 9.000 Z"),
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
        pathData = parseSvgPathData("M 22.000 22.000 L 2.000 22.000"),
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
        return _alignEndHorizontal!!
    }

private var _alignEndHorizontal: ImageVector? = null
