package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignStartVertical: ImageVector
    get() {
        if (_alignStartVertical != null) return _alignStartVertical!!
        _alignStartVertical = lucideOutlineIcon(
            name = "AlignStartVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 14.000 L 13.000 14.000 C 14.105 14.000 15.000 14.895 15.000 16.000 L 15.000 18.000 C 15.000 19.105 14.105 20.000 13.000 20.000 L 8.000 20.000 C 6.895 20.000 6.000 19.105 6.000 18.000 L 6.000 16.000 C 6.000 14.895 6.895 14.000 8.000 14.000 Z"),
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
        pathData = parseSvgPathData("M 8.000 4.000 L 20.000 4.000 C 21.105 4.000 22.000 4.895 22.000 6.000 L 22.000 8.000 C 22.000 9.105 21.105 10.000 20.000 10.000 L 8.000 10.000 C 6.895 10.000 6.000 9.105 6.000 8.000 L 6.000 6.000 C 6.000 4.895 6.895 4.000 8.000 4.000 Z"),
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
        pathData = parseSvgPathData("M 2.000 2.000 L 2.000 22.000"),
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
        return _alignStartVertical!!
    }

private var _alignStartVertical: ImageVector? = null
